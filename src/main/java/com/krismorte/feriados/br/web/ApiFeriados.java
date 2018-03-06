/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krismorte.feriados.br.web;

import com.krismorte.feriados.br.model.Events;
import com.krismorte.feriados.br.util.LocationNameUtil;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.bind.JAXBContext;

/**
 * http://www.rgagnon.com/javadetails/java-fix-certificate-problem-in-HTTPS.html
 *
 * @author krisnamourtscf
 */
public class ApiFeriados {

    private void skipSSLCert() throws Exception {
        /*
            *  fix for
            *    Exception in thread "main" javax.net.ssl.SSLHandshakeException:
            *       sun.security.validator.ValidatorException:
            *           PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException:
            *               unable to find valid certification path to requested target
         */
        TrustManager[] trustAllCerts = new TrustManager[]{
            new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }

            }
        };

        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        /*
     * end of the fix
         */
    }

    public Events listAll(int ano, String estado, String cidade) throws Exception {
        skipSSLCert();

        cidade = LocationNameUtil.validade(cidade);

        String uri = "https://api.calendario.com.br/?ano=" + ano + "&estado=" + estado + "&cidade=" + cidade + "&token=a3Jpc21vcnRlQHlhaG9vLmNvbS5iciZoYXNoPTE3MjYxNTIxMQ==";
        URL url = new URL(uri);
        HttpURLConnection connection
                = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");

        JAXBContext jc = JAXBContext.newInstance(Events.class);
        InputStream xml = connection.getInputStream();
        Events event = (Events) jc.createUnmarshaller().unmarshal(xml);
        connection.disconnect();
        return event;
    }

    public Events listAll(int ano, String estado, String cidade, String token) throws Exception {
        skipSSLCert();

        cidade = LocationNameUtil.validade(cidade);

        String uri = "https://api.calendario.com.br/?ano=" + ano + "&estado=" + estado + "&cidade=" + cidade + "&token=" + token;
        URL url = new URL(uri);
        HttpURLConnection connection
                = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "application/xml");

        JAXBContext jc = JAXBContext.newInstance(Events.class);
        InputStream xml = connection.getInputStream();
        Events event = (Events) jc.createUnmarshaller().unmarshal(xml);
        connection.disconnect();
        return event;
    }

}

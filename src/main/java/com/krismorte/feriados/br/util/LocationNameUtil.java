/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krismorte.feriados.br.util;

import java.text.Normalizer;

/**
 *
 * @author krisnamourtscf
 */
public class LocationNameUtil {

    public static String validade(String nome) {
        nome = Normalizer.normalize(nome, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        nome = nome.toUpperCase();
        nome = nome.replace(" ", "_");
        return nome;
    }

}

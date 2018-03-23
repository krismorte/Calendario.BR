
import com.krismorte.feriados.br.FeriadoBR;
import com.krismorte.feriados.br.model.Event;
import com.krismorte.feriados.br.model.Events;
import com.krismorte.feriados.br.util.LocationNameUtil;
import com.krismorte.feriados.br.web.ApiFeriados;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author krisnamourtscf
 */
public class TesteApi {

    public static void main(String[] args) {
        ApiFeriados api = new ApiFeriados();
        try {
            FeriadoBR feriadoBR = new FeriadoBR("a3Jpc21vcnRlQHlhaG9vLmNvbS5iciZoYXNoPTE3MjYxNTIxMQ==");

            Events event = feriadoBR.get(2018, "ce", "fortaleza");
            for (Event e : event.getEvent()) {
                System.out.println(e.getDescription());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

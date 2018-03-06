
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
            Events event = api.listAll(2018, "ce", "maracanau");
            for (Event e : event.getEvent()) {
                System.out.println(e.getDescription());
            }
            System.out.println(LocationNameUtil.validade("Joâo Pessõa ádída"));
        } catch (Exception ex) {
            System.out.println("" + ex.getCause());
            ex.printStackTrace();
        }
    }
}

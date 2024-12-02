package kajsBiler;

import kajsBiler.bil.Prisgruppe;
import kajsBiler.kunde.Adresse;
import kajsBiler.kunde.Erhvervskunde;
import kajsBiler.kunde.Firma;
import kajsBiler.kunde.Privatkunde;
import kajsBiler.lejekontrakt.Lejekontrakt;

public class App {
    public static void main(String[] args) {
        Adresse emilsAdresse = new Adresse("Bernhardt Jensens Boulevard", "95", "8000");
        Privatkunde emil = new Privatkunde("Emil", emilsAdresse, "131202", "25472030", "xxxxx");

        Adresse larsCompanyAdresse = new Adresse("Mellemleder Leif Allé", "0", "8000");
        Firma larsCompany = new Firma("Lars Company A/S", larsCompanyAdresse);

        Erhvervskunde lars = new Erhvervskunde("Lars", larsCompanyAdresse, "666", "62962943", "420", larsCompany);
        larsCompany.addAnsat(lars);

        System.out.println("===============================");
        System.out.println(emil.toString());
        System.out.println("===============================");
        System.out.println(lars.toString());
        System.out.println("===============================");

        // Lejekontrakt for Emil
        Lejekontrakt lejekontraktEmil1 = new Lejekontrakt();
        System.out.println(lejekontraktEmil1.getKontraktnr());
        emil.addLejekontrakt(lejekontraktEmil1);
        System.out.println("===============================");
        // Lejekontrakt for Lars
        Lejekontrakt lejekontrakt221196 = new Lejekontrakt();
        System.out.println(lejekontrakt221196.getKontraktnr());
        lars.addLejekontrakt(lejekontrakt221196);
        System.out.println("===============================");

        // Prisgruppe
        Prisgruppe prisgruppeA = new Prisgruppe('A', 595);
        Prisgruppe prisgruppeB = new Prisgruppe('B', 995);
        Prisgruppe prisgruppeC = new Prisgruppe('C', 1395);
        Prisgruppe prisgruppeD = new Prisgruppe('D', 1995);

        // Biler til prisgruppeA

    }
}

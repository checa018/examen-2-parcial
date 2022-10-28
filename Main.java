import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Solicitud solicitud=new Solicitud("mario y las consentidas",13134258,255, Calendar.getInstance().getTime());
        System.out.println(solicitud);
        Bien bien=new Bien(3254,"potosi",2,400,10000,400000);
        System.out.println(bien);

    }
}
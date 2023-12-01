package objetosc_kuli;

import java.io.*;

public class ObjetoscKuli {

    public static void main(String[] args)
            throws IOException
    {
        double r, objetosc;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("program oblicza objetosc kuli.");
        System.out.println("podaj promien kuli:");

        r = Double.parseDouble(br.readLine());

        objetosc = 4 * Math.PI * r * r * r/3;

        System.out.print("objetosc kuli o promieniu r = ");
        System.out.printf("%4.4f.", r );
        System.out.print("wynosi: ");
        System.out.printf("%2.2f.", objetosc);
    }
}

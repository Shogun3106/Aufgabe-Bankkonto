import java.util.Scanner;

public class BankkontoVerwaltung {
    public static void main(String[] arguments) {
        Scanner scanner = new Scanner(System.in);

        Bankkonto meinKonto = new Bankkonto(3000);

        boolean laufend = true;

        while (laufend) {
            System.out.println("\nWas möchtest du tun?");
            System.out.println("1. Geld einzahlen");
            System.out.println("2. Geld abheben");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Programm beenden");
            System.out.print("Wähle eine Option: ");

            int wahl = scanner.nextInt();

            if (wahl == 1) {
                System.out.print("Wie viel möchtest du einzahlen? ");
                double betrag = scanner.nextDouble();
                meinKonto.einzahlen(betrag);

            } else if (wahl == 2) {
                System.out.print("Wie viel möchtest du abheben? ");
                double betrag = scanner.nextDouble();
                meinKonto.abheben(betrag);

            } else if (wahl == 3) {
                meinKonto.kontostandAnzeigen();

            } else if (wahl == 4) {
                laufend = false;
                System.out.println("Programm beendet.");

            } else {
                System.out.println("Ungültige Auswahl. Bitte versuche es erneut.");
            }
        }

        scanner.close();
    }
}

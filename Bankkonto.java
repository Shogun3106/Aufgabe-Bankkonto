public class Bankkonto {
    private double kontostand;

    public Bankkonto(double anfangssaldo) {
        kontostand = anfangssaldo;
    }

    public void einzahlen(double betrag) {
        kontostand = kontostand + betrag;
        System.out.println(betrag + "€ wurden eingezahlt.");
    }

    public void abheben(double betrag) {
        if (betrag > kontostand) {
            System.out.println("Nicht genügend Guthaben, um " + betrag + "€ abzuheben.");
        } else {
            kontostand = kontostand - betrag;
            System.out.println(betrag + "€ wurden abgehoben.");
        }
    }

    public void kontostandAnzeigen() {
        System.out.println("Aktueller Kontostand: " + kontostand + "€");
    }
}

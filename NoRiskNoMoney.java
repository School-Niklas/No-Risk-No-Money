import java.util.Random;
/**
 * Beschreiben Sie hier die Klasse NoRiskNoMoney.
 * 
 * @author (Niklas) 
 * @version (v1.0)
 */
public class NoRiskNoMoney
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private boolean[] gewürfelteZahlen;
    private int gewinn;
    private boolean spielBeendet;

    /**
     * Konstruktor für Objekte der Klasse NoRiskNoMoney
     */
    public NoRiskNoMoney()
    {
        this.neuesSpiel();
    }
    private void neuesSpiel()
    {
        this.gewürfelteZahlen = new boolean[6];
        this.spielBeendet = false;
        this.gewinn = 0;
    }
    private void felderAusgeben()
    {
        if (this.spielBeendet == false){
            System.out.println("Bereits gewürfelte Zahlen:");
            for (int i = 0; i < gewürfelteZahlen.length; i++){
                if(gewürfelteZahlen[i] == true){
                    System.out.print("| " + (i + 1) + " |");
                }
            }
            System.out.println();
            System.out.println("================================");
            System.out.println("Dein Gewinn liegt aktuell bei " + this.gewinn);
            System.out.println("================================");
        }else{
            System.out.println("================================");
            System.out.println("Du hast leider verloren!");
            System.out.println("================================");
            neuesSpiel();
        }
    }
    public void würfeln()
    {
        Random r = new Random();
        int randomZahl = r.nextInt(6);
        if(gewürfelteZahlen[randomZahl] == false){
            gewürfelteZahlen[randomZahl] = true;
            this.gewinn++;
            this.felderAusgeben();
        } else{
            this.spielBeendet = true;
            this.felderAusgeben();
        }
    }
}

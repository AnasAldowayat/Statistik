public class Main {


 //        Abgabe 4 von(Aldowayat, Faham, Mokadam)

    //Implementieren Sie ein kurzes Programm in Java, welches das
    //Mäuseexperiment aus der Vorlesung 100-mal zufällig wiederholt und jeweils die Anzahl der
    //erkrankten Mäuse ausgibt. Die Wahrscheinlichkeit dass eine Maus erkrankt kann vom Nutzer
    //eingestellt werden.


    public static void main(String[] args) {
        int anzahlMäuse = 100;
        int anzahlErkrankteMäuse = 0;  //Anzahl der erkrankten Mäuse pro Durchlauf des Experiments
        int anzahlVersuche = 100;
        double wahrscheinlichkeit = 0.5; //Wahrscheinlichkeit dass eine Maus erkrankt (0.5 = 50%)
        for (int i = 0; i < anzahlVersuche; i++) { //100-mal zufällig wiederholen
            for (int j = 0; j < anzahlMäuse; j++) { //100 Mäuse
                if (Math.random() < wahrscheinlichkeit) { //wenn die zufällige Zahl kleiner als die Wahrscheinlichkeit ist, dann ist die Maus erkrankt
                    anzahlErkrankteMäuse++;
                }
            }
            System.out.println("Versuch " + (i + 1) + ": " + anzahlErkrankteMäuse + " Mäuse sind erkrankt.");
            anzahlErkrankteMäuse = 0; //Zurücksetzen der Anzahl der erkrankten Mäuse für den nächsten Durchlauf
        }
    }
}
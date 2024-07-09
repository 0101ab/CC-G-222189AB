package mehrdimensionaleArrays;

public class TemperaturBerechnung {

    public static void main(String[] args) {
        double[][] temperaturen = {
            {20.5, 22.3, 19.8, 21.0, 23.1, 20.4, 18.7}, // Stadt 1
            {15.5, 17.2, 16.3, 14.8, 15.7, 16.0, 14.9}, // Stadt 2
            {18.2, 19.1, 17.8, 20.3, 21.5, 19.7, 18.9}  // Stadt 3
        };

        for (int stadt = 0; stadt < temperaturen.length; stadt++) {
            double summe = 0;
            for (int tag = 0; tag < temperaturen[stadt].length; tag++) {
                summe += temperaturen[stadt][tag];
            }
            double durchschnitt = summe / temperaturen[stadt].length;
            System.out.println("Durchschnittstemperatur für Stadt " + (stadt + 1) + ": " + durchschnitt);
        }
    }
}

	
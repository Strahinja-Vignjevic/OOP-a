package Domaci3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Stovariste {
    private PolovnoVozilo[] nizVozila;

    Stovariste(String fajl) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fajl));
        int brVozila = Integer.parseInt(br.readLine().trim());
        nizVozila = new PolovnoVozilo[brVozila];

        for (int i = 0; i < brVozila; i++) {
            String linija = br.readLine().trim();
            String[] delovi = linija.split(",");

            String tipVozila = delovi[0];
            int starost = Integer.parseInt(delovi[1]);
            int treciBroj = Integer.parseInt(delovi[2]);

            if (tipVozila.equals("auto")) {
                nizVozila[i] = new PolovniAuto(starost, treciBroj);
            } else {
                nizVozila[i] = new PolovniKombi(starost, treciBroj);
            }
        }
        br.close();
    }
}

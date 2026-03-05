package services;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class MesFormateurs {
    /**
     * Formate un nombre entier de manière à ce que son affichage soit aligné à
     * droite sur 5 positions en remplissant les décimales manquantes à l'aide de
     * zéros.
     */
    public String formaterNbreEntierA(int valeur) {
        DecimalFormat df = new DecimalFormat("00000");
        return df.format(valeur);
    }

    /**
     * Formate un nombre entier de manière lisible et compréhensible pour un être
     * humain, en utilisant un séparateur de milliers et en forçant un affichage à
     * au minimum 4 positions à l'aide de zéros.
     */
    public String formaterNbreEntierB(int valeur) {
        DecimalFormat df = new DecimalFormat("0,000");
        DecimalFormatSymbols sym = df.getDecimalFormatSymbols();
        sym.setGroupingSeparator('\'');
        df.setDecimalFormatSymbols(sym);
        return df.format(valeur);
    }

    /**
     * Formate un nombre réel de manière lisible et compréhensible pour un être
     * humain, en utilisant un séparateur de milliers et en forçant un affichage à 3
     * décimales après la virgule.
     */
    public String formaterNbreReel(double valeur) {
        DecimalFormat df = new DecimalFormat("#,##0.000");
        DecimalFormatSymbols sym = df.getDecimalFormatSymbols();
        sym.setGroupingSeparator(' ');
        sym.setDecimalSeparator(',');
        df.setDecimalFormatSymbols(sym);
        return df.format(valeur);
    }
}

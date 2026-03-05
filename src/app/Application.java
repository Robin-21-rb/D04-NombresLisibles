package app;

import services.MesFormateurs;

public class Application {

        public static void main(String[] args) {

                // Affichage de quelques nombres entiers de manière alignée à droite sur 5
                // positions
                System.out.println("------------------------");
                System.out.println(MesFormateurs.formaterNbreEntierA(1));
                System.out.println(MesFormateurs.formaterNbreEntierA(22));
                System.out.println(MesFormateurs.formaterNbreEntierA(333));
                System.out.println(MesFormateurs.formaterNbreEntierA(4444));
                System.out.println(MesFormateurs.formaterNbreEntierA(55555));
                System.out.println(MesFormateurs.formaterNbreEntierA(666666));
                System.out.println(MesFormateurs.formaterNbreEntierA(123456789));

                // Affichage de quelques nombres entiers de manière lisible et compréhensible
                // par un humain
                System.out.println("------------------------");
                System.out.println(MesFormateurs.formaterNbreEntierB(-17));
                System.out.println(MesFormateurs.formaterNbreEntierB(17));
                System.out.println(MesFormateurs.formaterNbreEntierB(12345678));

                // Affichage de quelques nombres réels de manière lisible et compréhensible par
                // un humain
                System.out.println("------------------------");
                System.out.println("PI = " + MesFormateurs.formaterNbreReel(Math.PI));
                System.out.println("C = " + MesFormateurs.formaterNbreReel(299792458.0) + " [m/s]");

        }
}

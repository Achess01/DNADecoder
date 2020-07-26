package Run;

import java.util.ArrayList;

public class Decoder {

    public static String run(String secuencia1, String secuencia2){
        int size = 0;
        secuencia1 = secuencia1.trim().toUpperCase();
        secuencia2 = secuencia1.trim().toUpperCase();
        StringBuilder secuencia = new StringBuilder("");
        ArrayList<StringBuilder> secuencias = new ArrayList<>();
        for (int i = 0; i <secuencia1.length(); i++) {
            secuencia = new StringBuilder("");
            size = 0;
            for (int j = 0; j < secuencia2.length(); j++) {
                if(secuencia1.charAt(i + size) == secuencia2.charAt(j)){
                    secuencia.append(secuencia1.charAt(i));
                    size++;
                }
                else if(size > 1){
                    secuencias.add(secuencia);
                    size = 0;
                    secuencia = new StringBuilder("");
                }
            }
        }

        secuencias.forEach(System.out::println(dato));
    }
}

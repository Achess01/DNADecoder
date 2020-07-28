package Run;

import java.util.*;


public class Decoder {

    public static String run(String secuencia1, String secuencia2){
        if(secuencia1.equals(secuencia2)){
            return secuencia1.trim().toUpperCase();
        }
        else {
            int size = 0;
            secuencia1 = secuencia1.trim().toUpperCase();
            secuencia2 = secuencia2.trim().toUpperCase();
            String secuencia;
            ArrayList<String> secuencias = new ArrayList<String>();
            for (int i = 0; i < secuencia1.length(); i++) {
                size = 0;
                for (int j = 0; j < secuencia2.length(); j++) {
                    int comparador = i + size;
                    if (comparador == secuencia1.length()) {
                        secuencia = secuencia1.substring(i, i + size);
                        secuencias.add(secuencia);
                        break;
                    }

                    if (secuencia1.charAt(comparador) == secuencia2.charAt(j)) {
                        size++;
                    } else if (size > 0) {
                        secuencia = secuencia1.substring(i, i + size);
                        secuencias.add(secuencia);
                        size = 0;
                    }
                }
            }
            Collections.sort(secuencias, (s, s1) -> {
                return s.length() >= s1.length() ? 1 : -1;
            });
            if(secuencias.size() == 0 ||
                    secuencias.get(secuencias.size() - 1).length() < 2){
                return "NO HAY COINCIDENCIAS";
            }

            return secuencias.get(secuencias.size() - 1);
        }
    }

    /*
    public static void main(String[] args) {
        System.out.println(run("asdf",  "vbm"));
    }
     */

}

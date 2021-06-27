package List;

import java.util.Arrays;

public class ComposicaoDeFuncoes {
   public static void main(String[] args) {

      int [] valores = {1,2,3,4};
//
       /* FORMA FUNCIONAL*/

//        Arrays.stream(valores)
//                .filter(numero -> numero % 2 == 0) // VERIFICA PARA CADA NUMERO SE O RESTO DA DIV ==0
//                .map(numero -> numero * 2) // SE FOR MULTIPLICA POR 2
//                .forEach(numero -> System.out.println(numero)); // MOSTRA

                    /* FORMA IMPERATIVA*/
        for (int i = 0; i < valores.length ; i++) {
            int valor = 0;
            if(valores[i]  % 2 == 0) {
                valor = valores [i] * 2;

                if ( valor != 0) {

                    System.out.println(valor);
                }

            }


        }

   }
}

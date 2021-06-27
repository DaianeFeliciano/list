package List;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        /*FORMAS DE INICIAR O LIST*/

     // List notas = new ArrayList(); antes do java 5

        // List<Double> notas = new ArrayList<>(); // list que contém elementos do tipo double/ diamond operator

     //ArrayList<Double> notas = new ArrayList<>(); // outra forma de imprementação - algumas situações recomendado

    /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); adicionar e remover nao pode fazer
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); tornar imutavel a lista -adc nem remover
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as setes notas: ");

        List<Double> notas = new ArrayList<Double>();

        notas.add(7d); // pode colocar d ou . 0 tipo double
        notas.add(8d); // pode colocar d ou . 0 tipo double
        notas.add(9.3); // pode colocar d ou . 0 tipo double
        notas.add(5.0); // pode colocar d ou . 0 tipo double
        notas.add(7.0); // pode colocar d ou . 0 tipo double
        notas.add(0.0); // pode colocar d ou . 0 tipo double
        notas.add(4.0); // pode colocar d ou . 0 tipo double

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); // passa objeto e  mostra posição





    }
}

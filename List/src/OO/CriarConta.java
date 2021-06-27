package OO;

public class CriarConta {

    public static void main(String[] args) {

      Conta primeiraConta =  new Conta(); // instancia


        primeiraConta.saldo = 200;

        System.out.println( primeiraConta.saldo);

        primeiraConta.saldo += 100; // acumulando primeiraConta.saldo =  primeiraConta.saldo + 100;

        System.out.println( primeiraConta.saldo);

//        primeiraConta.saldo =  primeiraConta.saldo + 500;
//
//        System.out.println( primeiraConta.saldo);

        Conta segundaConta = new Conta(); // outra instancia diferente

        segundaConta.saldo = 300; // sempre orientado ao objeto
        System.out.println(segundaConta.saldo);

// O Java não irá comparar objetos, e sim referências.
        if (primeiraConta == segundaConta) {

            System.out.println("Sao iguais");

        } else {
            System.out.println("Sao diferentes");
        }

//        if (primeiraConta.saldo == segundaConta.saldo) {
//
//            System.out.println("saldos iguais");
//        } else {
//
//            System.out.println("saldo diferente");
//        }
        System.out.println(primeiraConta);
        System.out.println(segundaConta);




    }
}

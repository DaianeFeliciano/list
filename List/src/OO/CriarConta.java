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

        segundaConta.saldo = 50; // sempre orientado ao objeto
        System.out.println(segundaConta.saldo);



    }
}

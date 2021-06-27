package OO;

public class TesteReferencias {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 300;

        System.out.println(primeiraConta.saldo);

//        Conta segundaConta = new Conta();
//
//        segundaConta.saldo = 50;

//        Conta conta2 = new Conta();
//
//        conta2.saldo = 100;
//
//        double somadecontas = conta2.saldo + primeiraConta.saldo;

//        System.out.println(somadecontas);


        Conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;

        System.out.println(segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

    }
}

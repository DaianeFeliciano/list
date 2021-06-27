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

// refencia para o mesmo objeto

        Conta segundaConta = primeiraConta; // copia a referencia do objeto

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;

//O resultado impresso será o mesmo, pois são duas referências apontando para o mesmo objeto.

        System.out.println(segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {

            System.out.println("sao iguais");
        }

        System.out.println(segundaConta);

        System.out.println(primeiraConta);

    }
}

package OO;

public class Conta {

        double saldo;
        int agencia;
        int numero;
        String titular;

       public void deposita (double valor) {

                // this referencia para esse objeto

               this.saldo = this.saldo + valor; // altera  o valor do atributo saldo

        }

}

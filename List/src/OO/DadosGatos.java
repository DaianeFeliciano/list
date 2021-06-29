package OO;

public class DadosGatos {

//    public String gatos;
//
//   DadosGatos (String gatos) {
//
//        gatos = new String();
//        this.gatos = gatos;
//    }

//    public DadosGatos() {
//
//    }

    public static void main(String[] args) {

        Gatos gato1 = new Gatos();
        Gatos gato2 = new Gatos();


        gato1.nome =  "Joy";
        gato1.cor = "amarelo";
        gato1.idade = 8;

        System.out.println("O nome do Gato 1 é de: " + gato1.nome +
                "\n A cor do Gato 1 é: " + gato1.cor +
                "\n A idade do Gato 1 é de: " + gato1.idade);

        gato2.nome = "Ron";
        gato2.cor = "preto";
        gato2.idade = 12;

        System.out.println("O nome do Gato 2 é de: " + gato2.nome +
                "\n A cor do Gato 2 é: " + gato2.cor +
                "\n A idade do Gato 2 é de: " + gato2.idade);

        Gatos gatoDado1 = gato1;

        System.out.println(gatoDado1.nome);
        System.out.println(gato1.nome);

        if(gato2 != gato1) {

            System.out.println("Dois gatos Diferentes");

        }else {

            System.out.println("Gatos Iguais");
        }









    }
}

package OO;

public class TesetMetodoGato {



    public static void main(String[] args) {

        Gatos gataJoy = new Gatos();
        Gatos gataLay = new Gatos();

//        gataLay.nome = "Joy";
//
//        System.out.println(gataLay.nome);

        gataLay.incluirgatos("Joy");
        gataJoy.incluirgatos("Lay");

        System.out.println("Nome do Gato(a): " + gataLay.nome);
        System.out.println("Nome do Gato(a): " + gataJoy.nome);

    }
}

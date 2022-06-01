package us.code.gym.coursera;

public class Testadora {
    public static void main(String[] args) {
         compraAVista();
    }

    public static void compraAVista(){
        Compra compraAVista = new Compra(250);
        System.out.println("Qtd............parcelas: "+compraAVista.getNumeroParcelas());
        System.out.println("Valor total da compra: "+compraAVista.getValorTotal());
    }
}

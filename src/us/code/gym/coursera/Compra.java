package us.code.gym.coursera;

public class Compra {
    int valorTotal;
    int numeroParcelas;

    //a vista
    public Compra(int valor){
        valorTotal = valor;
        numeroParcelas = 1;
    }
    // parcelado
    public Compra(int qtdParcelas ,int valorPArcela){
        numeroParcelas = qtdParcelas;
        valorTotal = valorPArcela * qtdParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcelas(){
        return valorTotal/numeroParcelas;
    }
}

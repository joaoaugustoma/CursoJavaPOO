public class Filme {
    private int codigo;
    private String nome;
    private double valor;
    private boolean disponivel;
    private static int contador = 1;



    public Filme(){
        this.codigo += contador;
        contador++;
        this.disponivel = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void retirar() {
        if(disponivel) {
            disponivel = false;
        }else{
            throw new RuntimeException("Filme indisponivel para locacao!");
        }

    }

    public void devolver() {
        disponivel = true;
    }

    @Override
    public String toString() {
        String texto = "Informacoes do Filme\n";
        texto += "Codigo:" + this.codigo + "\n";
        texto += "Nome:" + this.nome + "\n";
        texto += "Valor: R$" + this.valor + "\n";
        texto += "Disponivel:" + this.disponivel + "\n";
        return texto;
    }

}

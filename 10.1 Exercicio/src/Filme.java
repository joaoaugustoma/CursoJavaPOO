public class Filme {
    int codigo;
    String nome;
    double valor;
    boolean disponibilidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    void locar(){
        if(this.disponibilidade){
            disponibilidade = false;
        } else {
            throw new RuntimeException("O filme não está disponível!");
        }
    }

    void devolver(){
        if(!disponibilidade){
            disponibilidade = true;
        } else {
            throw new RuntimeException("O filme não pode ser devolvido!");
        }
    }

    public void imprime() {
        System.out.println(this.codigo);
        System.out.println(this.nome);
        System.out.println(this.valor);
        System.out.println(this.disponibilidade);
    }
}

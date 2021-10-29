public class Filme {
    int codigo;
    String nome;
    double valor;
    boolean disponivel;

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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public boolean equals(Object object){
        if(!(object instanceof Filme)){
            return false;
        }
        Filme outroFilme = (Filme) object;
        return this.nome == outroFilme.nome;
    }

    /*public String toString() {
        String texto = "Informações do filme\n";
        texto += "Código: " + this.codigo+ ";\n";
        texto += "Nome: " + this.nome+ ";\n";
        texto += "Valor: " + this.valor+ ";\n";
        texto += "Disponível: " + this.disponivel+ ".\n";
        return texto;
    }
    */
}

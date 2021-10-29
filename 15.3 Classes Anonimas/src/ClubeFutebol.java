import java.util.Objects;

public class ClubeFutebol implements Comparable<ClubeFutebol> {
    private String nomeClube;
    private int pontos;

    public ClubeFutebol(String nome, int pontos){
        this.nomeClube = nome;
        this.pontos = pontos;
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ClubeFutebol that = (ClubeFutebol) o;
        return Objects.equals(nomeClube, that.nomeClube);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeClube);
    }

    @Override
    public String toString() {
        return "ClubeFutebol{" +
                "nomeClube='" + nomeClube + '\'' +
                ", pontos=" + pontos +
                '}';
    }

    @Override
    public int compareTo(ClubeFutebol outroClube) {
        return this.nomeClube.compareTo(outroClube.nomeClube);
    }
}

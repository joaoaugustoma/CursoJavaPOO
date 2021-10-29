import java.util.*;

public class Main {
    public static void main(String[] args) {
        ClubeFutebol saoPaulo = new ClubeFutebol("Sao Paulo", 45);
        ClubeFutebol corinthians = new ClubeFutebol("Corinthians", 40);
        ClubeFutebol palmeiras = new ClubeFutebol("Palmeiras", 42);
        ClubeFutebol santos = new ClubeFutebol("Santos", 50);

        List<ClubeFutebol> clubes = new ArrayList<>();
        clubes.add(saoPaulo);
        clubes.add(corinthians);
        clubes.add(palmeiras);
        clubes.add(santos);

        Comparator<ClubeFutebol> comparator = new Comparator<ClubeFutebol>(){
            public int compare(ClubeFutebol clube1, ClubeFutebol clube2) {
                return Integer.compare(clube2.getPontos(), clube1.getPontos());
            }
        };

        clubes.sort(comparator);

        for (ClubeFutebol clube : clubes) {
            System.out.println(clube.toString());
        }
    }
}

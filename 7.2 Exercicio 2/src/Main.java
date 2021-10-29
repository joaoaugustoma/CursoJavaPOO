import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Jogador jogador21 = new Jogador();
        jogador21.setNome("Thiago");
        jogador21.setDataNascimento("07/10/1999");
        jogador21.setPosicao("Atacante");

        Jogador jogador22 = new Jogador();
        jogador22.setNome("Clayton");
        jogador22.setDataNascimento("12/05/1998");
        jogador22.setPosicao("Atacante");

        Jogador jogador23 = new Jogador();
        jogador23.setNome("Suarez");
        jogador23.setDataNascimento("28/03/2000");
        jogador23.setPosicao("Meio Campo");

        Jogador jogador24 = new Jogador();
        jogador24.setNome("Wiliam");
        jogador24.setDataNascimento("30/12/2001");
        jogador24.setPosicao("Meio Campo");

        Jogador jogador25 = new Jogador();
        jogador25.setNome("Marcelo");
        jogador25.setDataNascimento("31/10/2001");
        jogador25.setPosicao("Volante");

        Jogador jogador26 = new Jogador();
        jogador26.setNome("Joao");
        jogador26.setDataNascimento("13/06/2000");
        jogador26.setPosicao("Volante");

        Jogador jogador27 = new Jogador();
        jogador27.setNome("Diego");
        jogador27.setDataNascimento("23/12/1998");
        jogador27.setPosicao("Lateral Dir");

        Jogador jogador28 = new Jogador();
        jogador28.setNome("Fernando");
        jogador28.setDataNascimento("20/05/2000");
        jogador28.setPosicao("Lateral Esq");

        Jogador jogador29 = new Jogador();
        jogador29.setNome("Alberto");
        jogador29.setDataNascimento("10/02/2001");
        jogador29.setPosicao("Zagueiro");

        Jogador jogador30 = new Jogador();
        jogador30.setNome("Jorge");
        jogador30.setDataNascimento("11/12/2003");
        jogador30.setPosicao("Zagueiro");

        Jogador jogador31 = new Jogador();
        jogador31.setNome("Gabriel");
        jogador31.setDataNascimento("13/08/2000");
        jogador31.setPosicao("Goleiro");

        Jogador[] jogadores1 = new Jogador[11];

        Tecnico tecnico2 = new Tecnico();
        tecnico2.setNome("Felipe");
        tecnico2.setDataNascimento("10/01/1965");
        tecnico2.setEspecialidade("Ataque");

        Equipe equipe1 = new Equipe();
        equipe1.setNome("Palmeiras");
        equipe1.setCidade("São Paulo");
        equipe1.setTecnico(tecnico2);
        equipe1.setJogadores(jogadores1);
        equipe1.addJogadores(jogador21);
        equipe1.addJogadores(jogador22);
        equipe1.addJogadores(jogador23);
        equipe1.addJogadores(jogador24);
        equipe1.addJogadores(jogador25);
        equipe1.addJogadores(jogador26);
        equipe1.addJogadores(jogador27);
        equipe1.addJogadores(jogador28);
        equipe1.addJogadores(jogador29);
        equipe1.addJogadores(jogador30);
        equipe1.addJogadores(jogador31);


        Jogador jogador1 = new Jogador();
        jogador1.setNome("Leonardo");
        jogador1.setDataNascimento("10/12/1999");
        jogador1.setPosicao("Atacante");

        Jogador jogador2 = new Jogador();
        jogador2.setNome("Matheus");
        jogador2.setDataNascimento("22/10/1998");
        jogador2.setPosicao("Atacante");

        Jogador jogador3 = new Jogador();
        jogador3.setNome("Giordan");
        jogador3.setDataNascimento("22/04/2000");
        jogador3.setPosicao("Meio Campo");

        Jogador jogador4 = new Jogador();
        jogador4.setNome("Wisley");
        jogador4.setDataNascimento("18/04/2001");
        jogador4.setPosicao("Meio Campo");

        Jogador jogador5 = new Jogador();
        jogador5.setNome("Claudio");
        jogador5.setDataNascimento("03/12/2001");
        jogador5.setPosicao("Volante");

        Jogador jogador6 = new Jogador();
        jogador6.setNome("Jhonatan");
        jogador6.setDataNascimento("07/05/2000");
        jogador6.setPosicao("Volante");

        Jogador jogador7 = new Jogador();
        jogador7.setNome("Davi");
        jogador7.setDataNascimento("15/02/1998");
        jogador7.setPosicao("Lateral Dir");

        Jogador jogador8 = new Jogador();
        jogador8.setNome("Marotinho");
        jogador8.setDataNascimento("18/08/2000");
        jogador8.setPosicao("Lateral Esq");

        Jogador jogador9 = new Jogador();
        jogador9.setNome("Augusto");
        jogador9.setDataNascimento("16/11/2001");
        jogador9.setPosicao("Zagueiro");

        Jogador jogador10 = new Jogador();
        jogador10.setNome("Renato");
        jogador10.setDataNascimento("12/06/2003");
        jogador10.setPosicao("Zagueiro");

        Jogador jogador11 = new Jogador();
        jogador11.setNome("Ryan");
        jogador11.setDataNascimento("10/01/2000");
        jogador11.setPosicao("Goleiro");

        Jogador[] jogadores2 = new Jogador[11];

        Tecnico tecnico1 = new Tecnico();
        tecnico1.setNome("Rubens");
        tecnico1.setDataNascimento("10/09/1970");
        tecnico1.setEspecialidade("Defesa");

        Equipe equipe2 = new Equipe();
        equipe2.setNome("São Paulo");
        equipe2.setCidade("São Paulo");
        equipe2.setTecnico(tecnico1);
        equipe2.setJogadores(jogadores2);
        equipe2.addJogadores(jogador1);
        equipe2.addJogadores(jogador2);
        equipe2.addJogadores(jogador3);
        equipe2.addJogadores(jogador4);
        equipe2.addJogadores(jogador5);
        equipe2.addJogadores(jogador6);
        equipe2.addJogadores(jogador7);
        equipe2.addJogadores(jogador8);
        equipe2.addJogadores(jogador9);
        equipe2.addJogadores(jogador10);
        equipe2.addJogadores(jogador11);

        Partida partida = new Partida();
        partida.setEquipe(equipe1);
        partida.setEquipe(equipe2);
        partida.setData("26/10/2021");
        partida.setEstadio("Morumbi");

        System.out.println("----------------Copa Paulista---------------");
        System.out.println("Partida: " + partida.getEquipe(equipe1).getNome() +" x " + partida.getEquipe(equipe2).getNome());
        System.out.println("Estadio: " + partida.getEstadio());
        System.out.println("Data: " + partida.getData());

        System.out.println("----------------Informacoes do time da casa---------------");
        System.out.println("Nome do clube: " + partida.getEquipe(equipe1).getNome());
        System.out.println("Tecnico: " + equipe1.getTecnico().getNome());
        System.out.println("Especialidade: " + partida.getEquipe(equipe1).getTecnico().getEspecialidade());
        System.out.println("Destaque do time: "  + jogador1.nome);
        System.out.println("Posicao: " + jogador1.getPosicao());
        System.out.println("Data de nascimento: " + jogador1.getDataNascimento());

        System.out.println("----------------Escalacao do time da casa---------------");
        for(Jogador jogador: equipe1.getJogadores()){
            System.out.println(jogador.getNome() + " - " + jogador.getPosicao());
        }


        System.out.println("----------------Informacoes do time visitante---------------");
        System.out.println("Nome do clube: " + partida.getEquipe(equipe1).getNome());
        System.out.println("Tecnico: " + equipe2.getTecnico().getNome());
        System.out.println("Especialidade: " + partida.getEquipe(equipe1).getTecnico().getEspecialidade());
        System.out.println("Destaque do time: "  + jogador1.nome);
        System.out.println("Posicao: " + jogador1.getPosicao());
        System.out.println("Data de nascimento: " + jogador1.getDataNascimento());

        System.out.println("----------------Escalacao do time visitante---------------");
        for(Jogador jogador: equipe2.getJogadores()){
            System.out.println(jogador.getNome() + " - " + jogador.getPosicao());
        }

    }
}

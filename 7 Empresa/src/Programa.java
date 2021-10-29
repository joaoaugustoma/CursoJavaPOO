public class Programa {
    public static void main(String[] args) {

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setDataEntrada("25/10/2021");
        vendedor1.setDepartamento("Vendas");
        vendedor1.setEstaEmpregado(true);
        vendedor1.setNome("Augusto");
        vendedor1.setRg("6161616");
        vendedor1.setSalario(1250.0);

        Gerente gerente1 = new Gerente();
        gerente1.departamento = "Vendas";
        gerente1.dataEntrada = "04/01/1995";
        gerente1.estaEmpregado = true;
        gerente1.nome = "Diego";
        gerente1.salario = 12000.0;
        gerente1.rg = "2931540";
        gerente1.setLogin("diego");
        gerente1.setSenha("diego123");
        gerente1.autentica("diego", "diego123");

        Supervisor supervisor = new Supervisor();
        supervisor.salario = 5000.0;

        ControleDeBonificacao controle = new ControleDeBonificacao();
        controle.calculaTotalBonus(vendedor1);
        controle.calculaTotalBonus(gerente1);
        controle.calculaTotalBonus(supervisor);

        System.out.println(vendedor1.getDataEntrada());
        System.out.println(vendedor1.getDepartamento());
        System.out.println(vendedor1.getNome());
        System.out.println(vendedor1.getRg());
        System.out.println(vendedor1.getSalario());
        System.out.println(vendedor1.calculaGanhoAnual());
        System.out.println(vendedor1.isEstaEmpregado());
        System.out.println(vendedor1.bonifica());
        //vendedor1.calculaSalario();

        System.out.println("-----------------------------------------");

        System.out.println(gerente1.getDataEntrada());
        System.out.println(gerente1.getDepartamento());
        System.out.println(gerente1.getNome());
        System.out.println(gerente1.getRg());
        System.out.println(gerente1.getSalario());
        System.out.println(gerente1.calculaGanhoAnual());
        System.out.println(gerente1.isEstaEmpregado());
        System.out.println(gerente1.bonifica());
        //gerente1.calculaSalario(2.5);

        System.out.println("-----------------------------------------");

        System.out.println(controle.getTotalBonus());

        Gerente gerente = new Gerente();
        Funcionario funcionario = gerente;
        funcionario.salario = 3500.0;

        System.out.println(funcionario.bonifica());

    }
}

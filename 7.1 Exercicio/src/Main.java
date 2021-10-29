public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.nome = "WM";
        fornecedor.endereco = "teste teste";
        fornecedor.setCnpj("10101023190");

        Cliente cliente = new Cliente();
        cliente.nome = "Augusto";
        cliente.endereco = "teste teste teste";
        cliente.setCpf("70283821");

        System.out.println("Fornecedor");
        System.out.println("Nome: " + fornecedor.nome);
        System.out.println("Endereco: " + fornecedor.endereco);
        System.out.println("CNPJ: " + fornecedor.getCnpj());

        System.out.println("----------------------------------------");

        System.out.println("Cliente");
        System.out.println("Nome: " + cliente.nome);
        System.out.println("Endereco: " + cliente.endereco);
        System.out.println("CPF: " + cliente.getCpf());

    }
}

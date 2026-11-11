package br.com.localiza.estacionamento;

public class SistemaEstacionamento {

    private static Veiculo[] veiculos = new Veiculo[10];

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- ESTACIONAMENTO ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Consultar");
            System.out.println("5 - Exibir total");
            System.out.println("0 - Sair");
            opcao = Teclado.lerInteiro("Opcao: ");

            switch (opcao) {
                case 1:
                    cadastrarVeiculo();
                    break;
                case 2:
                    alterarVeiculo();
                    break;
                case 3:
                    excluirVeiculo();
                    break;
                case 4:
                    consultarVeiculos();
                    break;
                case 5:
                    exibirTotalVeiculos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);
    }

    public static void cadastrarVeiculo() {
        int posicaoLivre = -1;
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] == null) {
                posicaoLivre = i;
                break;
            }
        }
        if (posicaoLivre == -1) {
            System.out.println("Estacionamento lotado!");
            return;
        }

        int tipo = Teclado.lerInteiro("1-Carro 2-Moto: ");
        if (tipo != 1 && tipo != 2) {
            System.out.println("Tipo invalido!");
            return;
        }

        String placa = Teclado.lerString("Placa: ");
        if (buscarVeiculoPorPlaca(placa) != null) {
            System.out.println("Placa ja cadastrada!");
            return;
        }
        String marca = Teclado.lerString("Marca: ");
        String modelo = Teclado.lerString("Modelo: ");
        int ano = Teclado.lerInteiro("Ano: ");

        Veiculo novo;
        if (tipo == 1) {
            int portas = Teclado.lerInteiro("Portas: ");
            novo = new Carro(placa, marca, modelo, ano, portas);
        } else {
            int cilindradas = Teclado.lerInteiro("Cilindradas: ");
            novo = new Moto(placa, marca, modelo, ano, cilindradas);
        }

        veiculos[posicaoLivre] = novo;
        System.out.println("Cadastrado!");
    }

    public static Veiculo buscarVeiculoPorPlaca(String placa) {
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null &&
                    veiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                return veiculos[i];
            }
        }
        return null;
    }

    public static void alterarVeiculo() {
        String placa = Teclado.lerString("Placa do veiculo: ");
        Veiculo v = buscarVeiculoPorPlaca(placa);
        if (v == null) {
            System.out.println("Nao encontrado!");
            return;
        }

        String novaPlaca = Teclado.lerString("Nova placa: ");
        Veiculo outro = buscarVeiculoPorPlaca(novaPlaca);
        if (outro != null && outro != v) {
            System.out.println("Placa ja cadastrada!");
            return;
        }

        v.setPlaca(novaPlaca);
        v.setMarca(Teclado.lerString("Nova marca: "));
        v.setModelo(Teclado.lerString("Novo modelo: "));
        v.setAnoFabricacao(Teclado.lerInteiro("Novo ano: "));

        if (v instanceof Carro) {
            int portas = Teclado.lerInteiro("Novas portas: ");
            ((Carro) v).setQuantidadePortas(portas);
        } else if (v instanceof Moto) {
            int cilindradas = Teclado.lerInteiro("Novas cilindradas: ");
            ((Moto) v).setCilindradas(cilindradas);
        }
        System.out.println("Alterado!");
    }

    public static void excluirVeiculo() {
        String placa = Teclado.lerString("Placa: ");
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null &&
                    veiculos[i].getPlaca().equalsIgnoreCase(placa)) {
                veiculos[i] = null;
                System.out.println("Excluido!");
                return;
            }
        }
        System.out.println("Nao encontrado!");
    }

    public static void consultarVeiculos() {
        boolean encontrou = false;
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null) {
                System.out.println("------------------------");
                veiculos[i].exibirInformacoes();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum veiculo cadastrado!");
        }
    }

    public static void exibirTotalVeiculos() {
        System.out.println("Total de veiculos criados: " +
                Veiculo.getNumeroVeiculos());
        int cadastrados = 0;
        for (int i = 0; i < veiculos.length; i++) {
            if (veiculos[i] != null) {
                cadastrados++;
            }
        }
        System.out.println("Veiculos cadastrados atualmente: " + cadastrados);
    }
}

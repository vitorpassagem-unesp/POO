import java.util.*;

public class EX01 {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Caminhao caminhao = new Caminhao();
        Queue<Veiculo> fila = new LinkedList<>();
        int op;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Deseja digitar um carro (1), um caminhão (2), ou sair do cadastro (0)?\t(Digite somente o numero) ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.println("Insira o nome do carro: ");
                    carro.nome = sc.nextLine();
                    System.out.println("Insira o numero de assentos do carro: ");
                    carro.nassentos = sc.nextInt();
                    carro.servico.set();
                    fila.add(carro);
                }
                case 2 -> {
                    System.out.println("Insira o nome do caminhão: ");
                    caminhao.nome = sc.nextLine();
                    System.out.println("Insira o numero de eixos do caminhao: ");
                    caminhao.neixos = sc.nextInt();
                    caminhao.servico.set();
                    fila.add(caminhao);
                }
            }
        } while (op != 0);

        Veiculo aux;
        while (!fila.isEmpty()){
            aux = fila.poll();
            aux.servico.get();
        }
    }
}

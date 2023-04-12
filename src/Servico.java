import java.util.Objects;
import java.util.Scanner;

public class Servico {
    private int a, b, c;
    public void set(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja realizar troca de óleo (sim/nao)? ");
        String indicador = sc.nextLine();
        if (Objects.equals(indicador, "sim"))
            a = 1;
        else
            a = 0;

        System.out.println("Deseja realizar troca de pneus (sim/nao)? ");
        indicador = sc.nextLine();
        if (Objects.equals(indicador, "sim"))
            b = 1;
        else
            b = 0;

        System.out.println("Deseja realizar limpeza do motor (sim/nao)? ");
        indicador = sc.nextLine();
        if (Objects.equals(indicador, "sim"))
            c = 1;
        else
            c = 0;
    }
    public void get(){
        System.out.println("\n");
        if (a == 1)
            System.out.println("Troca de óleo realizada!");
        if (b == 1)
            System.out.println("Troca de pneus realizada!");
        if (c == 1)
            System.out.println("Limpeza de motor realizada!");
    }
}

import java.util.Scanner;

public class CaixaEletronico {

  public static void calcularNotas(int valor) {
    int[] notas = { 100, 50, 20, 10, 5, 2 };
    int[] qntNotas = new int[6];

    for (int i = 0; i < 6; i++) {
      if (valor >= notas[i]) {
        qntNotas[i] = valor / notas[i];
        valor = valor - qntNotas[i] * notas[i];
      }
    }
    for (int i = 0; i < 6; i++) {
      if (qntNotas[i] != 0) {
        System.out.println(qntNotas[i] + " notas de R$ " + notas[i]);
      }
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

    System.out.println("Informe o valor que você deseja sacar: ");
    int valor = input.nextInt();

    if (valor % 2 != 0 || valor <= 0) {
      System.out.println(
        "Valor inválido. Insira um valor positivo e que seja multiplo de 2."
      );
    } else {
      calcularNotas(valor);
    }

    input.close();
  }
}

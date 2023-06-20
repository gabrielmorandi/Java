import java.util.*;

public class CaixeiroViajante {

  public static void generatePermutations(
    int n,
    int[] array,
    List<int[]> permutations
  ) {
    if (n == 1) {
      permutations.add(array.clone());
    } else {
      for (int i = 0; i < n - 1; i++) {
        generatePermutations(n - 1, array, permutations);
        if (n % 2 == 0) {
          swap(array, i, n - 1);
        } else {
          swap(array, 0, n - 1);
        }
      }
      generatePermutations(n - 1, array, permutations);
    }
  }

  public static void swap(int[] input, int a, int b) {
    int tmp = input[a];
    input[a] = input[b];
    input[b] = tmp;
  }

  public static int calculateTotalDistance(int[] route, int[][] distancias) {
    int total = 0;
    for (int i = 0; i < route.length - 1; i++) {
      total += distancias[route[i]][route[i + 1]];
    }
    total += distancias[route[route.length - 1]][route[0]];
    return total;
  }

  public static void main(String[] args) {
    Random random = new Random();
    int[][] distancias = new int[5][5];
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (i == j) {
          distancias[i][j] = 0;
        } else {
          int dist = 1 + random.nextInt(100);
          distancias[i][j] = dist;
          distancias[j][i] = dist;
        }
      }
    }

    int[] cidades = { 0, 1, 2, 3, 4 };

    List<int[]> todasRotas = new ArrayList<>();
    generatePermutations(cidades.length, cidades, todasRotas);

    int[] melhorRota = null;
    int menorDistancia = Integer.MAX_VALUE;

    for (int[] rota : todasRotas) {
      int distanciaTotal = calculateTotalDistance(rota, distancias);
      if (distanciaTotal < menorDistancia) {
        menorDistancia = distanciaTotal;
        melhorRota = rota;
      }
    }

    System.out.println("Melhor rota: " + Arrays.toString(melhorRota));
    System.out.println("Distância: " + menorDistancia);
  }
}

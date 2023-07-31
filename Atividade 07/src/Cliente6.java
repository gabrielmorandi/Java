import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente6 {

  public static void main(String[] args) {
    try {
      Registry registry = LocateRegistry.getRegistry();
      BarbeiroInterface barbeiro = (BarbeiroInterface) registry.lookup(
        "Barbeiro"
      );
      System.out.println(barbeiro.cortarCabelo(6));
      System.out.println(barbeiro.cortarBarba(6));
      System.out.println(barbeiro.cortarBigode(6));
    } catch (Exception e) {
      System.err.println("Exceção do cliente: " + e.toString());
      e.printStackTrace();
    }
  }
}
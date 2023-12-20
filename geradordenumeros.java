import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class geradordenumeros{
    public static Integer Gerador() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lnumeros = new ArrayList<>();
        Random rnd = new Random();
        int n1 = rnd.nextInt(100);
        int n2 = rnd.nextInt(100);
        int n3 = rnd.nextInt(100);
        int n4 = rnd.nextInt(100);
        System.out.println("Quer 2 ou 4 numeros sorteados?");
        String numero2 = scan.nextLine();
        if (numero2.equals("2")) {
              int[] sorte2 = {n1, n2};
              for(int numeros : sorte2){
                  System.out.println(numeros);
              }
        }
        return Gerador();
    }

}

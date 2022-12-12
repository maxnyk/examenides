import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Area triangulo\n2. Area círculo\n3. Area del cono\n4. Area del cilindro");
        int opción=sc.nextInt();
        switch (opción){
            case 1:
                System.out.println("Introduce la base del triangulo");
                int base=sc.nextInt();
                System.out.println("Introduce la altura del triangulo");
                int altura=sc.nextInt();
                System.out.println("El área del triangulo es: "+(base*altura/2));
            case 2:
                System.out.println("Introduce el radio del circulo");
                int radio=sc.nextInt();
                System.out.println("El area del circulo es: "+(3.14*radio*radio));
        }




    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Area triangulo" +
                "\n2. Area círculo" +
                "\n3. Area del cono" +
                "\n4. Area del cilindro" +
                "\n5. Volumen de la esfera" +
                "\n6. Salir");
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
            case 3:
                System.out.println("Introduce el radio del cono");
                int radioc=sc.nextInt();
                System.out.println("Introduce la generatriz");
                int g=sc.nextInt();
                System.out.println("El area del como es: "+(3.14*radioc*radioc+3.14*radioc*g));
            case 4:
                System.out.println("Introduce el radio del cilindro");
                int radiocil=sc.nextInt();
                System.out.println("Introduce la altura del cilindro");
                int hcil=sc.nextInt();
                System.out.println("El area del cilindro es: "+(3.14*3.14*radiocil*hcil+3.14*3.14*radiocil*radiocil));
            case 5:
                System.out.println("Introduce el radio de la esfera");
                int radioesf=sc.nextInt();
                System.out.println("El volumen de la esfera es: "+(4/3*3.14*radioesf*radioesf*radioesf));
            case 6:
                break;
        }




    }
}
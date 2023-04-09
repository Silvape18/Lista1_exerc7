import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        double area;
        double lado;
        double dobrodaarea;

        System.out.print("Digite o valor do lado do quadrado: ");
        lado = entrada.nextDouble();
        area = lado * lado;
        dobrodaarea = area * 2; 
        System.out.println("O dobro da area é: " + dobrodaarea); 
         

    }
}

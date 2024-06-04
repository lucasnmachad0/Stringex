import java.util.Scanner;
public class NameMaker {
    
    public static void main(String args[])
    {
        String firstName, middleName, lastName, fullName; //declarar variaveis de string
        
        try (Scanner scanner = new Scanner(System.in)) { //cria objeto scanner para ler a entrada do usuario
            System.out.println("Insira seu primeiro nome: "); //solicita o primeiro nome do usuario
            firstName = scanner.nextLine();
            
            System.out.println("Insira seu nome do meio: ");  //solicita o nome do meio do usuario
            middleName = scanner.nextLine();
            
            System.out.println("Insira seu sobrenome: ");    //solicita o sobrenome do usuario
            lastName = scanner.nextLine();
            
            fullName = " " + firstName + " " + middleName + " " + lastName; //declara o nome completo do usuario
            
            System.out.println("Nome completo: " + fullName); //imprime o nome completo do usuario com as informações que ele deu.
        }
           
    }
    
}

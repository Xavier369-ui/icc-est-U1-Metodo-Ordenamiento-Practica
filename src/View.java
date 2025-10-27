import java.util.Scanner;

public class View {

    // variable globales private para scanner
    private final Scanner scanner;

    public View() {
        System.out.println("Metodos Ordenamiento");
        scanner = new Scanner(System.in);
        
    }
    public void showMenu(){
        System.out.println("\n--- Menu Metodos de Ordenamiento---");
        System.out.println("1-> Metodo Burbuja");
        System.out.println("2-> Metodo Burbuja Mejorado");
        System.out.println("3-> Metodo Seleccion");
        System.out.println("4-> Metodo Inserccion");
        System.out.println("5-> Salir");
        System.out.println("Seleccione una opcion: ");
    }
    public int intputOption(int max){
        int option = -1;
        while(true){
            if(scanner.hasNextInt()){
                //si ingreso numero
                option = scanner.nextInt();
                if(option >=1 && option <= max){
                    break;
                }
            }else{
                scanner.next();   
            }
            System.out.println("opcion invalida, ingrese de nuevo: ");
        }
        return option;
    }
    public void showOrder(){
        System.out.println("--Seleccione el orden-- ");
        System.out.println("1-> Ascendente");
        System.out.println("2-> Descendente");
        System.out.println("Seleccione una opcion: ");
    }
    public void showPasosMenu(){
        System.out.println("--Mostrar pasos?-- ");
        System.out.println("1-> Si");
        System.out.println("2-> No");
        System.out.println("Seleccione una opcion: ");
    }

    
}

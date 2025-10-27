public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        int[] numeros = new int[]{1,2,3,9};
        MetodoBurbuja burbuja = new MetodoBurbuja();
        MetodoBurbujaMejorado burbujaMejorado = new MetodoBurbujaMejorado();
        MetodoSeleccion seleccion = new MetodoSeleccion();
        MetodoInserccion inserccion = new MetodoInserccion();
        while(true){
            view.showMenu();
            int option = view.intputOption(5);
            view.showOrder();
            int orden = view.intputOption(2);
            boolean ordenOpt = orden == 1;
            view.showPasosMenu();
            int pasos = view.intputOption(2);
            switch(option){
                case 1:
                    System.out.println("Metodo Burbuja ");
                    burbuja.sort(numeros, ordenOpt, pasos == 1);
                    break;
                case 2:
                    System.out.println("Metodo Burbuja Mejorado ");
                    burbujaMejorado.sort(numeros, ordenOpt, pasos == 1);
                    break;
                case 3:
                    System.out.println("Metodo Seleccion ");
                    seleccion.sort(numeros, ordenOpt, pasos == 1);
                    break; 
                case 4:
                    System.out.println("Metodo Inserccion ");
                    inserccion.sort(numeros, ordenOpt, pasos == 1);
                    break;
                case 5:
                    System.out.println("Saliendo... ");
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }
    }
}

public class MetodoSeleccion {

    public MetodoSeleccion() {
    }
    public void sort(int[] numeros, boolean ordenSort, boolean mostrarPasos) {
        if(ordenSort) {
            sortAscendente(numeros, mostrarPasos);
        } else {
            sortDescendente(numeros, mostrarPasos);
        }
        
    }

    public void sortAscendente(int[] numeros, boolean mostrarPasos) {
        int n = numeros.length;
        int contCambios = 0;
        int contComparaciones = 0;
        if(mostrarPasos){
            System.out.println("Original -> ");
            printArray(numeros);
            System.out.println();   
        }
        for(int i =0; i < n-1;i++){
            int indiceMenor = i;
            for(int j =i+1; j < n;j++){
                contComparaciones++;
                if(numeros[j] < numeros[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if(indiceMenor !=i){
                int temp = numeros[i];
                numeros[i] = numeros[indiceMenor];
                numeros[indiceMenor] = temp;
                contCambios++;
                if (mostrarPasos) {
                    System.out.println("Comparacion " + contCambios +  ": valor minimo encontrado " + numeros[i] + " en posicion " + indiceMenor);
                    System.out.println("Intercambio: " + numeros[indiceMenor] + " <-> " + numeros[i]);
                    System.out.print("Estado actual -> ");
                    printArray(numeros);
                }

            }
        }
        System.out.println("--Fin del Metodo Seleccion Ascendente--");
        System.out.println("Ordenado -> ");
        printArray(numeros);
        System.out.println("Comparaciones totales realizadas -> " + contComparaciones);
        System.out.println("Cambios totales realizados -> " + contCambios);

    }
    public void sortDescendente(int[] numeros, boolean mostrarPasos) {
        int n = numeros.length;
        int contCambios = 0;
        int contComparaciones = 0;
        if(mostrarPasos){
            System.out.println("Original -> ");
            printArray(numeros);
            System.out.println();   
        }
        for(int i =0; i < n-1;i++){
            int indiceMenor = i;
            for(int j =i+1; j < n;j++){
                contComparaciones++;
                if(numeros[j] > numeros[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if(indiceMenor !=i){
                int temp = numeros[i];
                numeros[i] = numeros[indiceMenor];
                numeros[indiceMenor] = temp;
                contCambios++;
                if (mostrarPasos) {
                    System.out.println("Comparacion " + contCambios +  ": valor minimo encontrado " + numeros[i] + " en posicion " + indiceMenor);
                    System.out.println("Intercambio: " + numeros[indiceMenor] + " <-> " + numeros[i]);
                    System.out.print("Estado actual -> ");
                    printArray(numeros);
                }

            }
        }
        System.out.println("--Fin del Metodo Seleccion Descendente--");
        System.out.println("Ordenado -> ");
        printArray(numeros);
        System.out.println("Comparaciones totales realizadas -> " + contComparaciones);
        System.out.println("Cambios totales realizados -> " + contCambios);

    }

    public void printArray(int[] numeros){
        System.out.print("[");
        for(int i=0; i< numeros.length;i++){
            if(i == numeros.length-1){
                System.out.print(numeros[i]);
            }else{
                System.out.print(numeros[i] + " ,  ");
            }     
        }
        System.out.println("]");
    }
    
    
}

public class MetodoInserccion {

    public MetodoInserccion() {
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
        for(int i=1;i< n;i++){
            int aux = numeros[i];
            int j = i-1;
            if (mostrarPasos) {
                System.out.println("Iteracion " + i + ": elemento a insertar -> " + aux);
            }
            while(j >=0 && numeros[j] > aux){
                contComparaciones++;
                numeros[j+1] = numeros[j];
                j--;
                contCambios++;
                if(mostrarPasos){
                    System.out.println("  Se mueve " + numeros[j + 1] + " a la posicion " + (j + 2));
                    System.out.print("  Estado actual -> ");
                    printArray(numeros);
                }
            }
            numeros[j+1] = aux;
            if (mostrarPasos) {
                System.out.println("  Inserta " + aux + " en posicion " + (j + 1));
                System.out.print("  Estado actual -> ");
                printArray(numeros);
                System.out.println();
            }
        }
        System.out.println("--Fin del Metodo Inserccion Ascendente--");
        System.out.println("Ordenado -> ");
        printArray(numeros);
        System.out.println("Comparaciones totales realizadas " + contComparaciones );
        System.out.println("Cambios totales realizados " + contCambios);


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
        for(int i=1;i< n;i++){
            int aux = numeros[i];
            int j = i-1;
            if (mostrarPasos) {
                System.out.println("Iteracion " + i + ": elemento a insertar -> " + aux);
            }
            while(j >=0 && numeros[j] < aux){
                contComparaciones++;
                numeros[j+1] = numeros[j];
                j--;
                contCambios++;
                if(mostrarPasos){
                    System.out.println("  Se mueve " + numeros[j + 1] + " a la posicion " + (j + 2));
                    System.out.print("  Estado actual -> ");
                    printArray(numeros);
                }
            }
            numeros[j+1] = aux;
            if (mostrarPasos) {
                System.out.println("  Inserta " + aux + " en posicion " + (j + 1));
                System.out.print("  Estado actual -> ");
                printArray(numeros);
                System.out.println();
            }
        }
        System.out.println("--Fin del Metodo Inserccion Descendente--");
        System.out.println("Ordenado -> ");
        printArray(numeros);
        System.out.println("Comparaciones totales realizadas " + contComparaciones );
        System.out.println("Cambios totales realizados " + contCambios);

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

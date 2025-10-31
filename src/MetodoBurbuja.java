public class MetodoBurbuja {

    public MetodoBurbuja() {
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
            System.out.println("Original-> ");
            printArray(numeros);
            System.out.println();
        }
        for(int i=0; i< n;i++){
            for(int j=i+1; j<n;j++){
                contComparaciones++;
                if(numeros[i] > numeros[j] ){
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                    contCambios++;
                    if(mostrarPasos){
                        System.out.println("Comparacion " + contComparaciones + " ; " + numeros[i] + " -> " + numeros[j] +
                        " -> se intercambian ");
                        System.out.println("Estado actual -> ");
                        printArray(numeros);
                    }
                }
            }
        }
        System.out.println("-- Fin del Metodo Burbuja Ascendente--");
        System.out.println("Ordenado -> ");
        printArray(numeros);
        System.out.println("Comparaciones totales realizadas: " + contComparaciones);
        System.out.println("Cambios totales realizados: " + contCambios);
        System.out.println();

        

    }
    public void sortDescendente(int[] numeros, boolean mostrarPasos) {
        int n = numeros.length;
        int contCambios = 0;
        int contComparaciones = 0;
        if(mostrarPasos){
            System.out.println("Original-> ");
            printArray(numeros);
            System.out.println();
        }
        for(int i=0; i< n;i++){
            for(int j=i+1; j<n;j++){
                contComparaciones++;
                if(numeros[i] < numeros[j] ){
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                    contCambios++;
                    if(mostrarPasos){
                        System.out.println("Comparacion " + contComparaciones + " ; " + numeros[i] + " <- " + numeros[j] +
                        " -> se intercambian ");
                        System.out.println("Estado actual -> ");
                        printArray(numeros);
                    }
                }
            }
        }
        System.out.println("-- Fin del Metodo Burbuja Ascendente--");
        System.out.println("Ordenado -> ");
        printArray(numeros);
        System.out.println("Comparaciones totales realizadas: " + contComparaciones);
        System.out.println("Cambios totales realizados: " + contCambios);
        System.out.println();

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

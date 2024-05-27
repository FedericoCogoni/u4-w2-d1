package Es0;

public class Main {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        int a = 10;
        int b = 100;
        int y = 0;
        int i = 0;
        int[] array = {1,2,3,4,5};

//semolice ciclo while che esce con n= 3

        while (n1 <= 3) {
            System.out.println(n1);  //DEBUG QUA
            n1++;
        }

//semplice for che deve uscire a i = 3
        for(n2 = 0; n2 <= 3 ; n2++ ){
            System.out.println(n2);  //DEBUG QUA
        }

//stampa ogni elemento dell'array
        for (i = 0; i < array.length; i++) {
            int x = array[i];
            System.out.println(x); //DEBUG QUA
        }

//controllo degli addendi prima di una somma
        int sum = a+b;  //DEBUG QUA
        System.out.println(sum);


//modifica di un array (raddoppio e stampo)
        for (y = 0; y < array.length; y++) {
            array[y] *= 2;      //DEBUG QUI
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); //DEBUG QUI
        }
    }

}

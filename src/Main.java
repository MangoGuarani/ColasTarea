import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      int opcion =0;
        Scanner entrada =  new Scanner(System.in);

        Cola nuevaCola = new Cola();



        do {
            boolean hacer = true;
            System.out.println("MENU COLA:");
            System.out.println("1-Ingresa un elemento a la cola");
            System.out.println("2-Quitar un elemento de la cola");
            System.out.println("3-La cola esta vacia ?");
            System.out.println("4-Primer elemento de la cola");
            System.out.println("5-Imprimir cola completa");
            System.out.println("6-Imprimir tamaño de la cola");
            System.out.println("7-Salir");

            do {


            try {
                opcion=entrada.nextInt();
                hacer=false;
            }catch (InputMismatchException ex){
                System.err.println("Error ingresa un numero!");
            }finally {
                entrada.nextLine();
            }
            }while (hacer);

            switch (opcion){

                case 1:{
                    int elemento=0;
                    boolean hacer1 = true;
                    do {


                    try {


                    System.out.println("Ingresa un numero:");
                     elemento = entrada.nextInt();
                     hacer1=false;
                    }catch (InputMismatchException ex){
                        System.err.println("Error: Ingresa un numero!");
                    }finally {
                        entrada.nextLine();
                    }
                    }while (hacer1);
                    nuevaCola.insertar(elemento);

                    System.out.println("Elemento ingresado Correctamente");
                    break;
                }
                case 2:{

                    System.out.println("El elemento eliminado es"+nuevaCola.quitar());

                    break;
                }
                case 3:{
                    if (nuevaCola.estaVacia()){
                        System.out.println("La cola esta vacia!");
                    }else {
                        System.out.println("La cola no esta vacia");
                    }

                    break;

                }
                case 4:{
                    if (nuevaCola.estaVacia()){
                        System.out.println("La cola esta vacia!");
                    }else {

                        System.out.println("El primer elemento de la cola es:  "+nuevaCola.inicioCola());


                    }
                    break;
                }
                case 5:{
                    if (nuevaCola.estaVacia()){
                        System.out.println("La cola esta vacia!");
                    }else {

                        nuevaCola.imprimirCola();
                    }
                    break;
                }
                case 6:{
                    if (nuevaCola.estaVacia()){
                        System.out.println("La cola esta vacia!");
                    }else {

                        System.out.println("El tamaño de la cola es :"+nuevaCola.tamanhoCola());
                    }

                }
            }


        }while (opcion!=7);



    }


}

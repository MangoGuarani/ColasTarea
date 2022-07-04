import javax.annotation.processing.SupportedSourceVersion;

public class Cola {
     NodoCola inicio,fin;
     int tamanho;


     public  Cola(){
          inicio=fin=null;
          tamanho=0;
     }


     public boolean estaVacia(){
          return inicio==null;
     }

     public void insertar(int ele){
          NodoCola nuevo = new NodoCola(ele);
          if (estaVacia()){
               inicio=nuevo;
          }else {
               fin.siguiente=nuevo;
          }
          fin=nuevo;
          tamanho++;
     }

     public int quitar (){
          int aux=inicio.dato;
          inicio=inicio.siguiente;
          tamanho--;
          return aux;
     }

     public int inicioCola(){
          return inicio.dato;
     }

     public int tamanhoCola(){
          return tamanho;
     }



     public void imprimirCola() {
          int tamanhoaux = tamanho;
          NodoCola inicioaux = inicio;
          int aux = 0;
          System.out.println(tamanhoaux);
          for (int i = 0; i < tamanhoaux; i++) {


               aux = inicioaux.dato;
               inicioaux = inicioaux.siguiente;

               System.out.print(+aux+", ");

          }


     }
}

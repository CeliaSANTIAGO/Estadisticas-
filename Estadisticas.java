import java.util.Scanner;
public class Estadisticas{

 public static void main(String[] args) {
  //definición  de variables 
  int valor [] = new int[10];
  int suma = 0;
  float media = 0;
  double varianza = 0.0;
  double desviacion= 0.0; 
   
  Scanner entrada = new Scanner(System.in);
            
  
  System.out .println("Ingrese el valor de 10 numeros"
                                     +" como muestra");
  //petición de datos y sumatoria de todos
  for (int i = 0; i < 10; i++ ){
   
   System.out.print("Ingrese el valor " + (i + 1) + ":");
   valor[i] = entrada.nextInt();
   
   suma = suma + valor[i];
    
  }
  entrada.close();
  
  media = suma / 10; //media aritmetica 
  
  //se hace la suma de las diferencias respecto a la media
  for(int i = 0 ; i < 10; i++){
   double rango;
   rango = Math.pow(valor[i] - media, 2f);
   varianza = varianza + rango;
}
  varianza = varianza / 10f;//suma de diferencias sobre "n"
  //teniendo ya la varinza sólo debemos sacarle raiz cuadrada 
  //tendremos la desviación estandar
  desviacion = Math.sqrt(varianza);

  
  
  //imprimir resultados
  System.out.println("Media: " + media);
  System.out.println("Varianza: " + varianza);
  System.out.println("Desvianción Estándar: " + desviacion);
 }

 }

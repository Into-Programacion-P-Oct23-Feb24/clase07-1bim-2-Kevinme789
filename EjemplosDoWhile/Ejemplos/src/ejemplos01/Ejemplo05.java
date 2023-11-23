/*
  Se declara variables y se les asigna un valor, dentro del ciclo repetitivo
  la variable resultado sera igual a "resultado" que comenzara con un valor de 1
  y se lo multiplicara con la variable "numero" que tiene un valor inicial de 4
  En la linea 34 el contador aumentara 1 cada vez que pase por el ciclo repetitivo
  Al final este codigo multiplicara el numero por si mismo las veces que sea 
  necesario hasta que el contador sea mayor que el valor de la potencia

 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        // 2. numero, i[0, n]
        int numero;
        // 3. potencia, i[0, n]
        int potencia;
        // 6. resultado, i[0, n]
        int resultado;
        // numero <-- 4
        numero = 4;
        // 8. potencia <-- 3
        potencia = 3;
        // 9. resultado <-- 1
        resultado = 1;

        int contador = 1;

        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}

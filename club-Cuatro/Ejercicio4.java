import java.util.Scanner;

public class Ejercicio4 {

    public static int [] reordenar (int resultado){
        int [] arreglo = new int[Integer.toString(resultado).length()];

        for (int i=0;i<arreglo.length;i++){
            arreglo[i]=Character.getNumericValue(Integer.toString(resultado).charAt(i));
        }
        int aux;
        for(int i = 1; i < arreglo.length; i++)
        {
            for(int j = 0;j < arreglo.length-i;j++)
            {
                if(arreglo[j] > arreglo[j+1])
                {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        int [] nums = new int [2];
        for (int i=0;i<arreglo.length;i++){
            nums[0] = Integer.parseInt(String.valueOf(nums[0]) + String.valueOf(arreglo[i]));
            nums[1] = Integer.parseInt(String.valueOf(nums[1]) + String.valueOf(arreglo[arreglo.length-1-i]));
        }
        return nums;
    }

    public static int calcular (int i){
        int numMenor, numMayor, contador=0, resultado=i;
        int[] arreglo;
        boolean repetir = true;
        do {

            contador++;

            arreglo = reordenar(resultado);

            numMenor=arreglo[0];
            numMayor=arreglo[1];

            if (resultado==(numMayor-numMenor))
                repetir=false;

            resultado=numMayor-numMenor;
            System.out.println(numMayor+" - "+numMenor+" = "+resultado);
        }
        while (repetir);
        return contador;

    }

    public static void main(String[] args) {
        Scanner scIn = new Scanner(System.in);
        String entrada = scIn.nextLine();

        System.out.println(calcular(Integer.parseInt(entrada)));

    }
}

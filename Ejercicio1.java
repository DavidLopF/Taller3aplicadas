import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingresar tres numeros: ");
            String numeros = entrada.nextLine();

            String[] numerosSeparados = numeros.split("#");
            if (numerosSeparados.length != 3 ){
                System.out.println("Los numeros no estan en un formato adecuado");
                return;
            }
            try{
                BigInteger e1 = new BigInteger(numerosSeparados[0]);
                BigInteger e2 = new BigInteger(numerosSeparados[1]);
                BigInteger e3 = new BigInteger(numerosSeparados[2]);
                System.out.println("Los numeros ingresados son: " + e1 + ", " + e2 + ", " + e3);
                
                if(e1.signum() < 0 || e2.signum() < 0 || e3.signum() < 0){
                    System.out.println("Los numeros no pueden ser negativos");
                    return;
                }
                
                BigInteger formula = e1.modPow(e2, e3);
                System.out.println("El resultado es: " + formula);
            
            }catch(Exception e){
                e.printStackTrace();
                System.out.println("No se ingresaron numeros");
                return;
            }
        }
    }
}

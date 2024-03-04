package practica;
/**
 * Esta clase sirve como calculadora para hacer operaciones matemáticas
 *@author  El autor es Sergio Arroyo Jiménez
 *@version 1.0
 *@since 24/10/2023
 */

public class miCalculadora {
	
	/**
	 * Representa el valor de la constante PI
	 */
    private static final double PI = 3.14159265358979;
    
   
    /**
     * Representa el valor de la constante E
     */
    private static final double E = 2.718281828459;

    /**
     * Inicia el método miCalculadora
     */
    public miCalculadora() {
    }
    
    /**
     * Este metodo suma dos números dados
     * @param a Primer sumando
     * @param b Segundo sumando
     * @return Deuvlve el resultado de la suma
     */
    
    public double sumar(double a, double b){
        return a + b;
    }
    
    
    /**
     * 
     * Este metodo resta dos números dados
     * @param a El  sustraendo
     * @param b El sustraído
     * @return La diferencia de los números
     */
    
    public double restar(double a, double b){
        return a - b;
    }
    
    
    /**
     *  Este metodo multiplica dos números dados
     * @param a El multiplicando
     * @param b El factor
     * @return Devuelve el producto de la multiplicación
     */
    public double multiplicar(double a, double b){
        return a * b;
    }
    
    
    /**
     * Este método divide dos números dados
     * @param a Dividendo
     * @param b Divisor
     * @return Cociente de la división
     * @throws ArithmeticException Se intenta dividir entre 0
     */
    public double dividir(double a, double b) throws ArithmeticException{
        if (b != 0){
            return a / b;
        } else {
            throw new ArithmeticException("Intento de división entre cero.");
        }
    }
    
    /**
     *  Este e metodo hace la potencia de un número elevado al que quieras (ambos dados)
     * @param base Número del que se quiere hacer la potencia
     * @param exponente Número de veces que se va a multiplicar la base
     * @return Devuelve el valor de la potencia
     */
    public double potencia(double base, double exponente){
        return Math.pow(base, exponente);
    }
    
    
    /**
     *  Se determina el valor absoluto del valor de un número dado
     * @param valor Numero del que se calcula el valor absoluto
     * @return Devuelve el valor absoluto del número dado
     */
    public double valorAbsoluto(double valor){
        return Math.abs(valor);
    }
}
package ejemploPorValorYReferencia;

/**
g
f
cambio sin internet
e
d
c
 * b
 * a
 * El resultado es 5
 * the following Java program that passes a primitive type to function.
 * 
 * We pass an int to the function “change()” and as a result the change in the value of that integer is not reflected in the main method.
 * 
 * Java creates a copy of the variable being passed in the method and then do the manipulations. 
 * Hence the change is not reflected in the main method.
 */ 
public class PasoPorValorYReferencia1 {
	public static void main(String[] args) { 
        int x = 5; 
        change(x); 
        System.out.println(x); 
    } 

	public static void change(int x) { 
        x = 10; 
    } 
}

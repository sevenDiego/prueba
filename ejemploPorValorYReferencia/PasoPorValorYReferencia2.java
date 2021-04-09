package ejemploPorValorYReferencia;

/**
lo subo
modif y subo solo este fichero
hay algo en el stash

 * The changes are not reflected back if we change the object itself to refer some other location or object
 * If we assign reference to some other location, then changes are not reflected back in main(). 
 */ 
public class PasoPorValorYReferencia2 {
	public static void main(String[] args) { 
        // t is a reference 
        Test t = new Test(5); 
  
        // Reference is passed and a copy of reference 
        // is created in change() 
        change(t); 
  
        // Old value of t.x is printed 
        System.out.println(t.x);
    }
    public static void change(Test t) { 
        // We changed reference to refer some other location 
    	t = new Test(6); 
        // now any changes made to reference are not reflected 
        // back in main 

        // si comento esta linea anterior entonces si funcionaria como yo espero que seria que t.x valiera 10 en el main
        // If we do not change the reference to refer some other object (or memory location), 
        // we can make changes to the members and these changes are reflected back.
        t.x = 10; 
    } 
}
class Test { 
    int x; 
    Test(int i) { 
    	x = i; 
    } 
} 
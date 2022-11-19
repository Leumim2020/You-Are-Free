
import java.util.concurrent.TimeUnit;



public class Main
{

   
 	public static void main(String[] args)throws InterruptedException {
 
      
 		long startTime = System.nanoTime();
 

  
	  //inicio do time              
		 
		System.out.println("hello,world");

       
		 // dorme por 5 segundos
        
		TimeUnit.SECONDS.sleep(5);
        
	// fim  
	
	  long endTime = System.nanoTime();
 
      
	 // obtém a diferença entre os dois valores de tempo nano
    
	long timeElapsed = endTime - startTime;
 
 
    

        System.out.println("runt time: " + timeElapsed / 1000000/1000);
    }

}

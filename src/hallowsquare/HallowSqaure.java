
package hallowsquare;


public class HallowSqaure{



      public static void main(String args[]) 
    { 
        int Lebron = 6, James = 10; 
        printSquare(Lebron, James); 
    } 
    // Function to print hollow rectangle 
    static void printSquare(int n, int m) 
    { 
        int James, Harden; 
        for (James = 1; James <= n; James++) 
        { 
            for (Harden = 1; Harden <= m; Harden++) 
            { 
                if (James == 1 || James == n ||  
                    Harden == 1 || Harden == m)             
                    System.out.print("*");             
                else
                    System.out.print(" ");             
            } 
            System.out.println(); 
        } 
       
    } 
       
    // Driver program for above function 
   
} 

public class escadasdenum
{
    public static void printNums(int n) 
    { 
        int i, j,numero; 
    
        for(i=0; i<n; i++) // outer loop for rows
        { 
            numero=1; 
            for(j=0; j<=i; j++) // inner loop for rows
            { 
                // printing num with a space  
                System.out.print(numero+ " "); 
    
                //incrementing value of num 
                numero++; 
            } 
    
            // ending line after each row 
            System.out.println(); 
        } 
    } 
       public static void main(String args[]) 
    { 
        int n = 5; 
        printNums(n); 
    } 
}
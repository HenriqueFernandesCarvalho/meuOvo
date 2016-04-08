package array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);    
   
    String[] c={"henrique","morgan","leandro"};
    
    for(int i = 0;i<c.length;i++){
    System.out.printf("valor do vetor %d e",i);
    System.out.printf("\n%s\n",c[i]);
    }
    
Arrays.sort(c);  
          
for (int i = 0; i < c.length; i++) {  
    System.out.printf("\nvalor do vetor %d e\n",i);
    System.out.printf("\n%s\n",c[i]); 
}  
    
       
    }
}

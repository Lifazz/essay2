import java.util.Arrays;
public class PenjumlahanMatriks {
    public static void main(String[] args) {
        int matriks1[]= {10,7,2,10};
        int matriks2[]= {4,3,3,12};
        
        int addResult[]=new int[matriks1.length];
        
        addResult[0] = matriks1[0]+matriks2[0];
        addResult[1] = matriks1[1]+matriks2[1];
        addResult[2] = matriks1[2]+matriks2[2];
        addResult[3] = matriks1[3]+matriks2[3];
        
        System.out.println(Arrays.toString(addResult));
    }
    
}

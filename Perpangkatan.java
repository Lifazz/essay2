
public class Perpangkatan {
    
    public static void main(String[] args) {
        
        int bil = 4;
        int pangkat = 2;
        int hasil = 1;
        
        for (int i = 1; i <=pangkat; i++) {
            hasil = hasil * bil;
            
        }
        System.out.println(bil + "pangkat" + pangkat + "," + hasil);
    }
    
}


import java.util.ArrayList;


public class tempatDuduk {
    public static void main(String[] args) {
        String tempat_duduk[][] = {
            {"Rafli","","Fazri","Tresna"},
            {"","Hawa","","Aldi"},
            {"Messi","Ronaldo","","Neymar"},
            
        };
        ArrayList<String>waiting_list = new ArrayList<>();
        waiting_list.add("Marquez");
        waiting_list.add("Rossi");
        waiting_list.add("Ervin");
        waiting_list.add("Asep");
        waiting_list.add("Pedro");
        waiting_list.add("Fredo");
        
        for (int i = 0; i <tempat_duduk.length; i++) {
            for (int j = 0; j <tempat_duduk[i].length; j++) {
                if(tempat_duduk[i][j].equals("")){
                    tempat_duduk[i][j]=waiting_list.get(0);
                    
                }
                System.out.println(tempat_duduk[i][j]+"-");                
            }
            System.out.println("");            
        }
        if(waiting_list.size()>0){
            System.out.println(waiting_list+"Tidak kebagian tempat duduk");
        }
    }
    
}

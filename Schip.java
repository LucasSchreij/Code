import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Schip {

    public synchronized BasisContainer getContainer(int i){
        return BasisContainer.get(i);
    }

    public static void InhoudSchip(){
        List<BasisContainer> ContList = new ArrayList<>();
        Random random = new Random();

        for(int i = 1; i < 101; i++){
            int type = random.nextInt(1, 3);
            switch(type){
                case 1 -> ContList.add(new Container(i));
                case 2 -> ContList.add(new KoelContainer(i));
                case 3 -> ContList.add(new WarmContainer(i)); 
            }   
            System.out.println(i + BasisContainer.getClass);
        }
    }


}








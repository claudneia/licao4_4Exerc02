import java.util.Random;
public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        int entrada = rand.nextInt(0, 3);
        
        if(entrada==0){
        System.out.println(entrada+": pedra");
        }else if(entrada==1){
            System.out.println(entrada+": papel");
        }else{
            System.out.println(entrada+": tesoura");
        }
        
        
          

    }
}

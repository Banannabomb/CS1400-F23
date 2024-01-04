import java.util.Random;
 
public class DiceRoll{
 
    public static void main(String[] args){
     	Random diceOne = new Random(); 
     	Random diceTwo = new Random();
     	int count = 0;
    		for(int i = 0; i < 100; i++){
     		int rollOne = diceOne.nextInt(6) + 1;
			int rollTwo = diceTwo.nextInt(6) + 1;
			//System.out.println(rollOne);
			//System.out.println(rollTwo);
			
    			if((rollOne == 5 && rollTwo == 6)||(rollOne == 6 && rollTwo ==5)){
        			count++;
				System.out.println("yoleven");
    			}
			System.out.println(count);
    		}
		System.out.println(count);
	}
}
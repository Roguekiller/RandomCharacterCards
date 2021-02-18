package random.character.cards;

//import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class RandomCharacterCards {
    
    public static void main(String[] args) {
        System.out.println("We will be creating character cards today. ");
        
        System.out.println("Please enter in differnt ages: ");
        
        int[] newAge = AgeSet();
        Format();
        
        System.out.println("Make up some hair as well: ");
        
        String[] newHair = HairSet();
        Format();
        
        //Calling the method of creating character cards
        CharacterCreate(newAge, newHair);
    }
    
    //User input for Age
   static int Age(){
       Scanner input = new Scanner(System.in);
       int age = input.nextInt();
       return age;
   }
   
   //User input for hair
   static String Hair(){
       Scanner input = new Scanner(System.in);
       String hair = input.nextLine();
       return hair;
   }
   
   //Creating Age range of 5
   static int[] AgeSet(){
       int[] AgeArr = new int[5];
       
       for(int i = 0; i < 5; i++){
            AgeArr[i] = Age();
            for(int j = 0; j < i; j++){
                if(AgeArr[j] == AgeArr[i]){
                    System.out.print("Please make up a new age: ");
                    AgeArr[i] = Age();
                }
            }
        }
       return AgeArr;
   }
   
   static String[] HairSet(){
       String[] HairArr = new String[5];
       
       for(int i = 0; i < 5; i++){
            HairArr[i] = Hair();
            for(int j = 0; j < i; j++){
                if(HairArr[j].equalsIgnoreCase(HairArr[i])){
                    System.out.print("Please make up a new Hairstyle: ");
                    HairArr[i] = Hair();
                }
            }
        }
       return HairArr;
   }
   
   static String Format(){
       String lines = "*----------------------------------------*";
       System.out.println(lines);
       return lines;
   }
  
   static String[][] CharacterCreate(int AgeArray[], String HairArray[]){
       String[][] Character = new String[2][2];
       
       Random rand = new Random();
       int randIndex_1 = rand.nextInt(AgeArray.length);
       int randIndex_2 = rand.nextInt(HairArray.length);
       
       //String AgeString = String.valueOf(AgeArray[randIndex_1]);
       
       Character[0][0] = String.valueOf(AgeArray[randIndex_1]);
       Character[1][0] = HairArray[randIndex_2];
       
       System.out.println("Age: " + Character[0][0] + "\n" + "Hair Style: " + Character[1][0]);
       
       return Character;
   }
 }

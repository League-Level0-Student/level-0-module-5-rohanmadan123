package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=100; i > 0; i--) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
		
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "feed", "walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task==0) {
				cuddle(pet);
			} else if(task==1) {
				feed(pet);
			} else {
				walk(pet);
			}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
        if(happinessLevel>100) {
        	JOptionPane.showMessageDialog(null, "Your pet loves you!");
        	break;
        } else {
        	JOptionPane.showMessageDialog(null, "Your pet's happiness level is " + happinessLevel + " .");
        }
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void feed(String userPet) {
		if(userPet.equalsIgnoreCase("cat")) {
			happinessLevel+=5;
		} else if(userPet.equalsIgnoreCase("dog")) {
			happinessLevel+=6;
		} else {
			happinessLevel+=1;
		}
	}
   static void cuddle(String userCuddle) {
	   if(userCuddle.equalsIgnoreCase("cat")) {
		   happinessLevel+=4;
	   } else if(userCuddle.equalsIgnoreCase("dog")) {
		   happinessLevel+=7;
	   } else {
		   happinessLevel+=1;
	   }
   }
   static void walk(String userWalk) {
	   if(userWalk.equalsIgnoreCase("cat")) {
		   happinessLevel-=2;
	   } else if(userWalk.equalsIgnoreCase("dog")) {
		   happinessLevel+=10;
	   } else {
		   happinessLevel+=1;
	   }
   }
	
}
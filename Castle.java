import java.util.Scanner;

public class Castle {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String choice;
	
	System.out.println("Hello traveler. What is your name? ");
	choice = scan.nextLine();
	
	System.out.println("Welcome " + choice + ", what you're looking at is \n "
			+ " Zork castle. up or down? \n [ up / down ]");
	choice = scan.nextLine();
		if (choice.equalsIgnoreCase("up")) {
			System.out.println("as you ascend the spiral stirs you encounter a fallen"
					+ "knight. it is clear he did not die recently. \n "
					+ "he is armed with a sword and shield. there is also "
					+ "a large battleaxe wedged  \n in his chest armor. do you take the "
					+ "sword and shield or the two-handed heavy axe? \n [ SnS / axe ]");
			choice=scan.nextLine();
			
			if (choice.equalsIgnoreCase("sns")) {
				System.out.println("you complete the long cilmb to the upper courtyard. "
					+ "the ground is littered with dead soldiers. you take a few steps foward "
					+ "before hearing footsteps behind you. you quickly turn to see "
					+ "a fencer clad in leather armor");
				System.out.println("the sword and shield was a good choice. the fencers attack fails \n "
						+ "and you are able to strike him down. you search him and \n "
						+ "find a key! at the other end of the courtyard you see two treasure"
						+ "chests side by side. \n which one will you try first? \n "
						+ " [ left / right ] "); 
				choice=scan.nextLine();
				if (choice.equalsIgnoreCase("left")); {
					System.out.println("the key fits and the lock opens. as you open the"
					+ "chest the room fills with golden light and you hear a voice \n"
					+ " 'Vincent! we happy?' \n "
					+ "GG");
					}
				}
				
					else if (choice.equalsIgnoreCase("right")); {
						System.out.println("the key fits, but the chest opens violenely"
											+ "on its own. rows of razor-like teeth line the edges of the chest, giving"
											+ "it a terrifying mouth like appeareance. before you can stumble backwards"
											+ "the chest lunges at you and everything goes pitch black. at the same time"
											+ "your senses go numb and you quickly fade into cold numbness.");
					}
				}	
				
				else if (choice.equalsIgnoreCase("axe")) {
					System.out.println("you complete the long cilmb to the upper courtyard. "
							+ "the ground is littered with dead soldiers. you take a few steps foward "
							+ "before hearing footsteps behind you. you quickly turn to see "
							+ "a fencer clad in leather armor");
					System.out.println("your axe is unwieldy and slow. you raise the weapon to attack \n "
					+ "but the fencer is too quick to hit! his blade pierces your thin armor, and you \n "
					+ "fall to your knees in pain. you are dead soon after. ");
						
			}
			
		else if (choice.equalsIgnoreCase("down")) {
			System.out.println("its dark. grab the torch? \n [ yes / no ]");
			choice=scan.nextLine();
			if (choice.equalsIgnoreCase("yes")) {
				System.out.println("its a trap! theres an arrow in your \n "
					+ " butt! you're dead!");}
				else if (choice.equalsIgnoreCase("no")) {
					System.out.println("you encounter a large knight with a two-handed battleaxe \n "
					+ "in his hands, and a sword sheathed on his waist. he raises the axe over \n "
					+ "his right shoulder. you must get out of the way!"
					+ " dodge left or right? \n "
					+ "[ left / rigt ]");
				choice=scan.nextLine();
					if (choice.equals("left")) {
				System.out.println("the knights attack misses and you are able to get \n "
						+ "behind him. you notice a key on his belt. do you go for the \n "
						+ "key, or try to launch a counter-attack? \n "
						+ "[ key / attack ]");
						choice=scan.nextLine();
						if (choice.equalsIgnoreCase("key")) {
							System.out.println("you go for the key but the knight drops \n "
							+ "his axe and grabs you! his strength is unlike any mortal man! \n "
							+ "you are quickly robbed of your ability to breathe, and soon \n "
							+ "after, your will to live"); }
							else if (choice.equalsIgnoreCase("attack")) {
								System.out.println("you kick the back of the knights knee into \n"
								+ "the stone floor, and unsheath his sword. you drive the steel into the \n "
								+ "knights heart and he falls to the ground, the key is yours. \n "
								+ "you turn the corner of the hallway and enter a large torch-lit \n "
								+ "room. in the center of the room are two treasure chests, side-by-side."
								+ "the key appears to fit both chests. which one will you try first? \n "
								+ "[ left  / right");
								choice=scan.nextLine();
									if (choice.equalsIgnoreCase("left")) {
										System.out.println("the key fits and the lock opens. as you open the"
											+ "chest the room fills with golden light and you hear a voice \n"
											+ " 'Vincent! we happy?' \n "
											+ "GG");
									}	
										else if (choice.equalsIgnoreCase("rihgt")){
												System.out.println("the key fits, but the chest opens violenely"
											+ "on its own. rows of razor-like teeth line the edges of the chest, giving"
											+ "it a terrifying mouth like appeareance. before you can stumble backwards"
											+ "the chest lunges at you and everything goes pitch black. at the same time"
											+ "your senses go numb and you quickly fade into cold numbness. "); 
										}
									}
							else if (choice.equalsIgnoreCase("right"));	{
								System.out.println("you look rigt and try to dash between the knight and the wall. \n "
														+ "you feel yourself stop abruptly and hear a loud splash. your vision blurs \n "
														+ "and your consience fades.");
							}
							}
								
					}
			}
		}
}
		
		
		
	


package Try;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	
		String characters[] = {"A","a","B","b","C","c","D","d","E","e","F","f","G","g","H","h",
								"I","i","J","j","K","k","L","l","M","m","N","n","O","o","P","p",
								"Q","q","R","r","S","s","T","t","U","u","V","v","W","w","X","x"
								,"Y","y","Z","z",
								"1","2","3","4","5","6","7","8","9","0"
							
		};
		System.out.println("Type Password: ");
		String password = scan.nextLine();
		String prediction = "";
		System.out.println("Please wait it may take a while......");
	
		
		for(int a = 0; a<characters.length; a++) {
			prediction = characters[a];
			
			if(prediction.equals(password)) {
				System.out.println();
				System.out.println("PASSWORD CRACKED SUCCESSFULLY!!");
				System.out.println("Password: " + prediction);
				break;
			}
				
				for(int b = 0; b<characters.length; b++) {
					
					
					prediction = characters[a]+characters[b];
					
						if (prediction.equals(password)) {
							System.out.println();
							System.out.println("PASSWORD CRACKED SUCCESSFULLY!!");
							System.out.println("Password: " + prediction);
							break;
						}
						
							for(int c = 0; c<characters.length; c++	) {
								prediction = characters[a]+characters[b]+characters[c];
								
								if(prediction.equals(password)) {
									System.out.println();
									System.out.println("PASSWORD CRACKED SUCCESSFULLY!!");
									System.out.println("Password: " + prediction);
									break;
								}
									for(int d = 0; d<characters.length;d++) {
										prediction = characters[a]+characters[b]+characters[c]+characters[d];
										
										if(prediction.equals(password)) {
											System.out.println();
											System.out.println("PASSWORD CRACKED SUCCESSFULLY!!");
											System.out.println("Password: " + prediction);
											break;
										}
											for(int e = 0;e<characters.length;e++) {
												prediction = characters[a]+characters[b]+characters[c]+characters[d]+characters[e];
												
												if(prediction.equals(password)) {
													System.out.println();
													System.out.println("PASSWORD CRACKED SUCCESSFULLY!!");
													System.out.println("Password: "+prediction);
													break;
												}
													
												
												if(prediction.equals(password)) {
													break;
												}
											}
										if(prediction.equals(password)) {
											break;
										}
									}
								if(prediction.equals(password)) {
									break;
								}
							}
						if (prediction.equals(password)) {
							break;
						}
				}
			if(prediction.equals(password)) {
				break;
			}
			
			
			
		}
			if(!password.equals(prediction)) {
				System.out.println("Sorry we are unable to reveal the password");	
			}
		
	}

}
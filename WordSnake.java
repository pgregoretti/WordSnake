//https://www.reddit.com/r/dailyprogrammer/comments/3bi5na/20150629_challenge_221_easy_word_snake/
public class WordSnake {

	public static void main(String[] args) {
		String test1 = "SHENANIGANS SALTY YOUNGSTER ROUND DOUBLET TERABYTE ESSENCE";
		String test2= "DELOREAN NEUTER RAMSHACKLE EAR RUMP PALINDROME EXEMPLARY YARD";
		String test3 = "CAN NINCOMPOOP PANTS SCRIMSHAW WASTELAND DIRK KOMBAT TEMP PLUNGE ESTER REGRET TOMBOY";
		String test4 = "NICKEL LEDERHOSEN NARCOTRAFFICANTE EAT TO OATS SOUP PAST TELEMARKETER RUST THINGAMAJIG GROSS SALTPETER REISSUE ELEPHANTITIS";
		
		printSnake(test1);
		printSnake(test2);
		printSnake(test3);
		printSnake(test4);

	}

	public static void printSnake(String s){
		boolean printRight = true;
		String[] words = s.split(" ");
		String space = "";
		
		for(int i=0; i<words.length; i++){
			if(printRight){
				System.out.println(space + words[i].toUpperCase()); //
				space = spaceAmt(words[i], space);
				printRight = false;
			} else {
				for(int j=1; j<words[i].length()-1; j++){
					System.out.println(space + words[i].toUpperCase().charAt(j));
					printRight = true;
				}
			}
		}
	}
	
	public static String spaceAmt(String word, String space){
		for(int i=0; i<word.length()-1; i++){
			space+=" ";
		}
		return space;
	}
}

package chess;

public class CheckInput {
	
	public static boolean checkCoordinateValidity(String input){
		if (input.length() == 2 && input.charAt(0) >= '1' && input.charAt(0) <= '8' && input.charAt(1) >= 'a' && input.charAt(1) <= 'h'){
			return true;
		} else{
			return false;
		}
		// return true;
	}
}


// return input.length() == 2 && input.charAt(0) >= '1' && input.charAt(0) <= '8' && input.charAt(1) >= 'a' && input.charAt(1) <= 'h';
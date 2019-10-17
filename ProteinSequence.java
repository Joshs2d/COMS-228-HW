package edu.iastate.cs228.hw1;

/**
 * Class made to set up a protein sequence for its superclass, and then is able to detect whether 
 * each of the letters of the protein sequence are valid letters.
 * @author Josh Stevens
 * 9/14/17
 */

public class ProteinSequence extends Sequence
{
	/**
	 * Determines if it contains all valid letters, if it does then it replaces the superclass sequence with this
	 * methods sequence.
	 * @param psarr is this methods sequence
	 */
  public ProteinSequence(char[] psarr)
  {  
	  super(psarr);
  }

  /**
   * The method returns true if the character argument is equal to one of the 20
   * English letters that are not in the set {B, b, J, j, O, o, U, u, X, x, Z, z}. Otherwise,
   * it returns false.
   * @return returns whether valid letter or not
   */
  @Override
  public boolean isValidLetter(char aa)
  {
	  boolean answer = false;
	  char[] list = new char[]{'B', 'b', 'J', 'j', 'O', 'o', 'U', 'u', 'X', 'x', 'Z', 'z'};
	  for(int i = 0; i <list.length; i++){
		  if(aa != list[i] && ((aa >= 'a' && aa <= 'z') || (aa >= 'A' && aa <= 'Z'))){
			  answer = true;
		  }else{
			  answer = false;
		  }
	  }return answer;
  }
}

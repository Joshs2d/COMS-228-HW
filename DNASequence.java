package edu.iastate.cs228.hw1;

/**
 * Uses superclass to create a dna sequence, determining if all the letters in the array are valid. Also
 * able to reverse the sequence, then reverse the complement.
 * @author Josh Stevens
 * 9/14/17
 */

public class DNASequence extends Sequence
{
	/**
	 * Addresses super class in order to 
	 * @param dnaarr - given DNA array
	 */
  public DNASequence(char[] dnaarr)
  {
	  super(dnaarr);
  }

  /**
   * Method returns true if character is equal to one of 
   * @return whether valid letter or not
   */
  @Override
  public boolean isValidLetter(char let)
  {
	  char[] list = new char[]{'a', 'A', 'c', 'C', 'g', 'G', 't', 'T'};
	  for(int i = 0; i<list.length; i++){
		  if(let == list[i]){
			  return true;
		  }
	  }return false;
  }

  /**
   * Returns the reversed copy of the sequence.
   * @return reversed sequence.
   */
  public char[] getReverseCompSeq()
  {
	  char[] second = new char[seqarr.length];
	  
	  int j=0;
	  for(int i = seqarr.length-1;i >= 0; i--){
			  second[j] = helper(seqarr[i]);
			  j++;
	  }
	  return second;
  }
  
  /**
   * Helper method for the getReverseCompSeq() method.
   * @param a number
   * @return reversed letter
   */
  private char helper(char a){
	  char b = 0;
	  if(a == 'A')
		  b = 'T';
	  if(a == 'C')
		  b = 'G';
	  if(a == 'G')
		  b = 'C';
	  if(a == 'T')
		  b = 'A';
	  
	  if(a == 'a')
		  b = 't';
	  if(a == 'c')
		  b = 'g';
	  if(a == 'g')
		  b = 'c';
	  if(a == 't')
		  b = 'a';
	  
	  return b;
  }
 
  /**
   * Uses getReverseComSeq() to get the reversed comp sequence, then saves it into the superclass.
   */
  public void reverseComplement()
  {
	  char[] temp = getReverseCompSeq();
	  super.seqarr = temp;
  }
}

package edu.iastate.cs228.hw1;

/**
 * The main superclass, used to construct the sequence from all other
 * subclasses. Determines the length and object, converts to string, 
 * and finds if each character is a valid letter.
 * 
 * @author Josh Stevens 
 * 9/14/17
 */

public class Sequence {
	/**
	 * Public character array variable for sequence.
	 */
	public char[] seqarr;

	/**
	 * Determines if the given array has all valid letters for characters, then
	 * sets them to a public array. Otherwise, throws an illegal argument
	 * exception.
	 * 
	 * @param sarr
	 * @throws IllegalArgumentException
	 */
	public Sequence(char[] sarr) {
		char[] temp = new char[sarr.length];
		for (int i = 0; i < sarr.length; i++) {
			if (isValidLetter(sarr[i])) {
				temp[i] = sarr[i];
			}else{
				throw new IllegalArgumentException("Invalid sequence letter for " + this.getClass());
		}
		}
		this.seqarr = temp;
	}

	/**
	 * Returns the length of the current sequence
	 * 
	 * @return number length of sequence
	 */
	public int seqLength() {
		return seqarr.length;
	}

	/**
	 * Return character array sequence
	 * 
	 * @return character array of sequence
	 */
	public char[] getSeq() {
		return seqarr;
	}

	/**
	 * Returns the string represenation of the character array.
	 * 
	 * @return String representation of character array
	 */
	public String toString() {
		String fin = new String(seqarr);
		return fin;
	}

	/**
	 * Determines whether the object is the same, not case sensitive, based on
	 * the string sequences.
	 * 
	 * @param Object
	 *            to be seen if equal.
	 * @return Whether the given object is of the same type.
	 */
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj.toString().toLowerCase() == seqarr.toString().toLowerCase()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * This method determines if the letter of the sequence is one of the
	 * alphabet or not. If it is an uppercase or lowercase letter then it will
	 * return true, otherwise it will return false.
	 * 
	 * @param let
	 *            - letter of sequence
	 * @return returns if it is a valid letter of the alphabet or not
	 */
	public boolean isValidLetter(char let) {
		if (Character.isUpperCase(let) || Character.isLowerCase(let)) {
			return true;
		} else {
			return false;
		}
	}
}

package edu.iastate.cs228.hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DNASequenceTest {

	@Test
	public void test() {
		String probst2 = new String("TDG");
		DNASequence dnaseqobj = new DNASequence( probst2.toCharArray() );
		//Invalid sequence letter for class edu.iastate.cs228.hw1.DNASequence
	}
	@Test
	public void test2() {
		String probst2 = new String("AcGtT");
		DNASequence dnaseqobj = new DNASequence( probst2.toCharArray() );
		for(int l=0;l<probst2.length();l++){
			System.out.println(dnaseqobj.isValidLetter(probst2.toCharArray()[l]));
			//Fine, should print true for each.
		}
	}
	@Test
	public void test3() {
		String probst2 = new String("AcGTTCa");
		DNASequence dnaseqobj = new DNASequence( probst2.toCharArray() );
		System.out.println(dnaseqobj.getReverseCompSeq());
		//Fine, should reverse sequence.
	}
}

package edu.iastate.cs228.hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CodingDNASequenceTest {

	@Test
	public void test() {
		String probst3 = new String("ATCGA");
		CodingDNASequence gdnaobj = new CodingDNASequence( probst3.toCharArray() );
		//FINE
	}
	
	@Test
	public void test2() {
		String probst3 = new String("MDAFE");
		CodingDNASequence gdnaobj = new CodingDNASequence( probst3.toCharArray() );
		//Invalid sequence letter for class edu.iastate.cs228.hw1.GenomicDNASequence
		}
	
	@Test
	public void test3() {
		String probst3 = new String("ATCGACTA");
		CodingDNASequence gdnaobj = new CodingDNASequence( probst3.toCharArray() );
		System.out.println(gdnaobj.checkStartCodon());
		//FINE, should be false
		}
	
	@Test
	public void test4() {
		String probst3 = new String("AGCGAC");
		CodingDNASequence gdnaobj = new CodingDNASequence( probst3.toCharArray() );
		System.out.println(gdnaobj.translate());
		//No start codon, BAD
	}
				
}


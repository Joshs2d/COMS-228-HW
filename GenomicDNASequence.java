package edu.iastate.cs228.hw1;

/**
 * Determines the genomic dna for the superclass sequence, being able to find the false and true parts of 
 * the markcoding, then determines the exons of the sequence, returning them.
 * @author Josh Stevens 
 * 9/14/17
 */

public class GenomicDNASequence extends DNASequence {
	/**
	 * Public boolean array for coding, determines if true or false between first/last of markcoding.
	 */
	public boolean[] iscoding;

	/**
	 *Public empty string array. 
	 */
	public String empty = "";
	
	/**
	 * Fills the iscoding array, as well as addresses super class to create a genomic DNA sequence.
	 * @param gdnaarr - given genomic DNA array
	 */
	public GenomicDNASequence(char[] gdnaarr) {
		super(gdnaarr);
		boolean[] temp = new boolean[gdnaarr.length];
		for(int i = 0; i<gdnaarr.length;i++){
			temp[i] = false;
		}iscoding = temp;
	}

	/**
	 * Inputs the beginning of the index for iscoding to record true, then puts true in until last index. Throws 
	 * @param first - first of exon sequence
	 * @param last - last of exon sequence
	 */
	public void markCoding(int first, int last) {
		int slen = seqLength();
		if ((first < 0 || last < 0) || ((first >= slen) || (last >= slen))) {
			throw new IllegalArgumentException("Coding border is out of bounds");
		}
		if (first > last) {
			reverseComplement();
			first = slen - 1 - first;
			last = slen - 1 - last;
		} else {
			for(int i = first; i <= last; i++) {
					iscoding[i] = true;
			}
		}
	}

	/**
	 * Determines whether the exons position is valid, then takes the new character array of the converted sequence.
	 * @param exonpos - position of the exons index
	 * @return array of exons
	 */
	public char[] extractExons(int[] exonpos) {
		if(exonpos.length%2!=0||exonpos.length==0){
			throw new IllegalArgumentException("Empty array or odd number of array elements");
		}
		for(int i = 0; i<exonpos.length-1;i++){
			if(exonpos[i]<0||exonpos[i]>seqLength()||exonpos[i]==seqLength()){
				throw new IllegalArgumentException("Exon position is out of bounds");
			}if(exonpos[i]>exonpos[i+1]){
				throw new IllegalArgumentException("Exon positions are not in order");
			}
		}
		for(int i = 0; i<exonpos.length;i+=2){
			for(int j= exonpos[i]; j<=exonpos[i+1]; j++){
				empty+=seqarr[j];
			}
		}
		return empty.toCharArray();
	}
}

package com.practice.dsa;


public class LowestElement {
    public static void main(String[] args) {
    	
    	/* Normal checking in arrays to find minimum value
    	 * Similarly we can check highest value as well by just changing sign
    	 */
    	int a[]= {1,232,-2,2312,0,12,312,312,313,123,12};
    	int minVal= a[0];
    	for(int i=0;i<a.length;i++) {
    		if(a[i]<minVal) {
    			minVal=a[i];
    		}
    	}
    	System.out.println(minVal);
    	
    }
}

package day12;

public class BinarySerach {
	public static void main(String[] args) {
	    BinarySerach s = new BinarySerach();
	    int[] arr = {1,3, 5, 7, 9};
	    int key = 5;
	    int result = s.binarysearch(arr, key);
	    System.out.println("Index: " + result);
	}
	
	    public int binarysearch(int[] a, int k) {
	       
	        int index = 0;
	        
	        for(int i=0; i<a.length; i++){
	             if(a[i]==k){
	                
	                index= i;
	                break;
	                
	            }
	            else{
	                
	                 index= -1;
	                 
	               }
	        }
	        return index;
	    }
	}




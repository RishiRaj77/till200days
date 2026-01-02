class Solution {
    public void sortColors(int[] a) {
        int i = 0;
        int j= a.length - 1;
        int k = 0;
        while(k<=j){
            if(a[k]==1){
                k++;
            }
            else if(a[k]==2) {
                int temp = a[j];
                a[j]= a[k];
                a[k]= temp;

                j--;
            }
            else{
                int temp = a[i];
                a[i]= a[k];
                a[k]= temp;
                k++;
                i++;

            }
        }      
    }
}
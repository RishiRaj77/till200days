package day11;

public class ReverseWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(rev(s));
    }
    
    public static String rev(String s) {
        // Split by whitespace (note: fixed the split parameter)
        String[] w = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for (int i = w.length - 1; i >= 0; i--) {
            sb.append(w[i]);
            if (i != 0) {  // Only add space if not the last word
                sb.append(" ");
            }
        }
        
        return sb.toString();  // Return the StringBuilder content, not the array
    }
}

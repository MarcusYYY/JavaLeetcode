public class reverseWords{
    public String reverse(String s){
        if(s == null || s.length() == 0)
            return s;
        StringBuilder sb = new StringBuilder();
        String[] c = s.split(" ");

        for(int i = c.length - 1 ; i >= 0 ; i--){
        //if(c[i] != "") does not work here
            if(!c[i].equals(""){
                sb.append(c[i]).append(" ");
            }
        }
        return sb.length() == 0? "" : sb.substring(0, sb.length()-1);
    }
}

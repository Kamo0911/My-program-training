import java.util.StringTokenizer;

class Add {
    public static void main(String[] args){
        StringTokenizer v = new StringTokenizer("a b c");
        String s = v.nextToken();
        while(v.hasMoreTokens()){
            s = s + " + " + (v.nextToken());
        }
        System.out.println(s);
    }    
}

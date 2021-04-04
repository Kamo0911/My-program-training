class StringClass {
    public static void main (String[] args){
        String a = "Javaの絵本";
        int len = a.length();
        String b = a.substring(len-2,len);
        int c = b.compareTo ("絵本");
        System.out.println("「"+ a +"」の最後の2文字は「"+ b +"」");
        System.out.println("絵本" + (c==0 ? "です" : "ではありません"));
    }
}

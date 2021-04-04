class FormatSample {
    public static void main(String[] args){
    int a = 10;
    double b = 3.24;
    System.out.printf("%10d\n",a);
    System.out.printf("Å~%8.5f\n",b);
    System.out.printf("----------\n");
    System.out.printf("%10f\n\n",a*b);
    }
}

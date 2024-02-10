class Example{
    public static void main(String args[]){
        int a=5;
        int i, j;
        for(i=1;i<=a;i++){
            for (j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

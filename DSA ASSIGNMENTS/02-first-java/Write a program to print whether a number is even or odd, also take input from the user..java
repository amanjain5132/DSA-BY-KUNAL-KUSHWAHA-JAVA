public class ODD_EVEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check weather its odd or even");
        int check = sc.nextInt();
        if(check % 2 == 0){
            System.out.println("even number : "  +check);
        }
        else
        {
            System.out.println("odd number");
        }
    }
}

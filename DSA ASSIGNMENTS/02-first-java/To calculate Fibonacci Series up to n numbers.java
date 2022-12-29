System.out.println("Enter a number to generate fibonacci series upto nth term");
        int c = 0;
        int n =sc.nextInt();
        int a=0;
        int b=1;

        System.out.println("Fibonacci series upto "+n+" is :-");
        while(c<=n)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
}

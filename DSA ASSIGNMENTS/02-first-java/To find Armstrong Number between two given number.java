        System.out.println("Enter then number you want to check");
        int n = sc.nextInt();
        int temp = 0;
        int rem , sum = 0;

        while(n>0) {
            rem = n % 10;
            rem = n / 10;
            sum = sum + rem * rem * rem;
        }
        if (temp == sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }

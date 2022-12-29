System.out.println("Enter the First number");
        System.out.println("Enter the Second number");
        System.out.println("Select the Operator you want to Choose : + , - , * , /");
        int F1 = sc.nextInt();
        int F2 = sc.nextInt();
        char Selected = sc.next().charAt(0);
        int result = 0;
        if (Selected == '+')
        {
            result = F1 + F2;
        }
        else if (Selected == '-')
        {
            result = F1 - F2;
        }
        else if (Selected == '*')
        {
            result = F1 * F2;
        }
        else if (Selected == '/')
        {
            result = F1 / F2;
        }
        System.out.println(result);

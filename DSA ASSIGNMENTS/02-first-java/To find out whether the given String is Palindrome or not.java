System.out.println("Enter the string you want to check : ");
        String S = sc.next();
        String rev = "";

        for (int i  = S.length()-1; i>=0;i--) {
            rev = rev+S.charAt(i);
        }
        if (S.equals(rev))
        {
            System.out.println("PALINDROME");
        }
        else
        {
            System.out.println("NOT PALINDROME");
        }

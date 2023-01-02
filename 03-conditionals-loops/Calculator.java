package DSAKK;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Select the Operation you want to Perform from ( 1 - 18 ) : ");
        System.out.println();

        System.out.println("1.) Area Of Circle ");                          //area = (radius * radius) * Math.PI;
        System.out.println("2.) Area Of Triangle ");                        // area = (h * b) / 2;
        System.out.println("3.) Area Of Rectangle ");                       //  area = W * H;
        System.out.println("4.) Area Of Isosceles Triangle ");              //Area of Isosceles Triangle = (1 * b * h) / 2
        System.out.println("5.) Area Of Parallelogram ");                   // base x height
        System.out.println("6.) Area Of Rhombus ");                         //  ( d1 * d2 ) / 2
        System.out.println("7.) Area Of Equilateral Triangle ");            //( 1.73 × a × a)/4
        System.out.println("8.) Perimeter Of Circle");                      //2 * Math.PI * r;
        System.out.println("9.) Perimeter Of Equilateral Triangle ");       // Perimeter = a + a + a = 3a
        System.out.println("10.) Perimeter Of Parallelogram");              // P = 2(a + b)
        System.out.println("11.) Perimeter Of Rectangle ");                 //  2*(a+b)
        System.out.println("12.) Perimeter Of Square ");                    // P = a + a + a + a = 4a
        System.out.println("13.) Perimeter Of Rhombus ");                   // 4 * a
        System.out.println("14.) Volume Of Cone ");                         // volume of cone= pie x r2 x h/3
        System.out.println("15.) Volume Of Prism ");                        // area=base*height
        System.out.println("16.) Volume Of Cylinder ");                     // ((22*r*r*h)/7);
        System.out.println("17.) Volume Of Sphere ");                       // ((22*r*r*h)/7);
        System.out.println("18.) Volume Of Pyramid ");
        System.out.println();
        System.out.println("Enter Your Choice ::  ");

        int operation = sc.nextInt();

        switch (operation) {
            case 1 -> {
                System.out.println("Enter the radius of the circle ::");
                int radius = sc.nextInt();
                double area = (radius * radius) * Math.PI;
                System.out.println("Area of the circle is ::" + area);
            }
            case 2 -> {
                System.out.println("Enter the Height of Triangle ::");
                double h = sc.nextDouble();
                System.out.println("Enter the Breath of Triangle ::");
                double b = sc.nextDouble();
                double area = (h * b) / 2;
                System.out.println("Area Of Triangle ::" + area);
            }
            case 3 -> {
                System.out.println("Enter the Width of Rectangle ::");
                double W = sc.nextDouble();
                System.out.println("Enter the Height of Rectangle ::");
                double H = sc.nextDouble();
                double area = W * H;
                System.out.println("Area Of Rectangle ::" + area);
            }
            case 4 -> {
                System.out.println("Enter the Breath of Rectangle ::");
                double B = sc.nextDouble();
                System.out.println("Enter the Height of Rectangle ::");
                double H = sc.nextDouble();
                double area = (1 * B * H) / 2;
                System.out.println("Area Of Isosceles Triangle  ::" + area);
            }
            case 5 -> {
                System.out.println("Enter the Base of Parallelogram ::");
                double B = sc.nextDouble();
                System.out.println("Enter the Height of Parallelogram ::");
                double H = sc.nextDouble();
                double area = B * H;
                System.out.println("Area Of Parallelogram  ::" +area);
            }
            case 6 -> {
                System.out.println("Enter the Diagonal 1 of Rhombus ::");
                double D1 = sc.nextDouble();
                System.out.println("Enter the Diagonal 2 of Rhombus ::");
                double D2 = sc.nextDouble();
                double area = ( D1 * D2 ) / 2;
                System.out.println("Area Of Rhombus is ::" + area);
            }
            case 7 -> {
                System.out.println("Enter the Area to find Equilateral Triangle ::");
                double a = sc.nextDouble();
                int area = (int) (( 1.73 * a * a )/4);
                System.out.println("Area Of Equilateral Triangle is ::" + area);
            }
            case 8 -> {
                System.out.println("Enter the Dimeater of Circle ::");
                Double r = sc.nextDouble();
                Double area = (Double) (2 * Math.PI * r);;
                System.out.println("Area Of Rhombus is ::" + area);
            }
            case 9 -> {
                System.out.println("Enter the side of the Triangle ::");
                Double a = sc.nextDouble();
                Double area = (Double) (3 * a);;
                System.out.println("perimeter of Triangle is ::" + area);
            }
            case 10 -> {
                System.out.println("Enter the height of the Parallelogram ::");
                Double h = sc.nextDouble();
                System.out.println("Enter the breadth of the Parallelogram ::");
                Double b = sc.nextDouble();
                Double area = 2*(h+b);
                System.out.println("perimeter of Parallelogram is ::" + area);
            }
            case 11 -> {
                System.out.println("Enter the height of the Rectangle ::");
                Double h = sc.nextDouble();
                System.out.println("Enter the breadth of the Rectangle ::");
                Double b = sc.nextDouble();
                Double area = 2*(h+b);
                System.out.println("perimeter of Rectangle is ::" + area);
            }
            case 12 -> {
                System.out.println("Enter the side of the Square ::");
                Double a = sc.nextDouble();
                Double area = 4 * a;
                System.out.println("perimeter of Square is ::" + area);
            }
            case 13 -> {
                System.out.println("Enter the side of the Rhombus ::");
                Double a = sc.nextDouble();
                Double area = 4 * a;
                System.out.println("perimeter of Rhombus is ::" + area);
            }
            case 14 -> {
                System.out.println("Enter the height of the Cone ::");
                Double h = sc.nextDouble();
                System.out.println("Enter the Radius of the Cone ::");
                Double r = sc.nextDouble();
                Double area = Math.PI * (r*r)*h/3;
                System.out.println(" volume of the cone is ::" + area);
            }
            case 15 -> {
                System.out.println("Enter the base of the Prism ::");
                Double b = sc.nextDouble();
                System.out.println("Enter the Height of the Prism ::");
                Double h = sc.nextDouble();
                Double area = b * h;
                System.out.println(" volume of the Prism is ::" + area);
            }
            case 16 -> {
                System.out.println("Enter the radius of the Sphere ::");
                Double r = sc.nextDouble();
                System.out.println("Enter the Height of the Sphere ::");
                Double h = sc.nextDouble();
                Double Volume = ((22*r*r*h)/7);;
                System.out.println(" volume of the Sphare is ::" + Volume);
            }
            case 17 -> {
                System.out.println("Enter the radius of the Cylender ::");
                Double r = sc.nextDouble();
                System.out.println("Enter the Height of the Cylender ::");
                Double h = sc.nextDouble();
                Double Volume = ((22*r*r*h)/7);;
                System.out.println(" volume of the Cylender is ::" + Volume);
            }
//            case 18 -> {
//                System.out.println("Enter the radius of the Cylender ::");
//                Double r = sc.nextDouble();
//                System.out.println("Enter the Height of the Cylender ::");
//                Double h = sc.nextDouble();
//                Double Volume = ((22*r*r*h)/7);;
//                System.out.println(" volume of the Cylender is ::" + Volume);
            default -> {
                System.out.println("Invalid Selection please Select Number between 1-18 THANK YOUU !!!!");
            }
        }
    }
}

import java.util.*;

public class AreaCalculator{

    public static double area_triangle (double base,double height){
        System.out.println();
        double A=1.0/2*base*height;
        System.out.println("The area of the Traingle is :" + A + ".");
        return A;
    }

    public static int area_rectagle(int length, int width){
        System.out.println();
        int A=length*width;
        System.out.println("The area of an rectangle is :" + A +".");
        return A;
    }

    public static double area_circle(int radius) {
		System.out.println();
		double A = Math.PI * radius * radius;
		System.out.println("The area is " + A + ".");
		return A;
	}
  
	public static String quit() {
		System.out.println("Good Bye");
		return null;
	}

    public static void main(String[] args){
        Scanner keyboard=new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("shape Area Calculator");

        while(true) {
    
            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-");
            System.out.println();
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Circle");
            System.out.println("4) Quit");
            System.out.println();
          
            System.out.print("Which shape:Please select 1 for Traingle, 2 for Rectangle , 3 for Circle and 4 to Exit ");

            int shape = keyboard.nextInt();
            System.out.println("You have selected :" + shape);

            //traingle
            if(shape == 1){
                System.out.print("Base :");
                double base=keyboard.nextDouble();
                System.out.print("Height :");
                double height=keyboard.nextDouble();
                area_triangle(base,height);

            } else if(shape == 2){
                System.out.println("length :");
                int length=keyboard.nextInt();
                System.out.println("width :");
                int width=keyboard.nextInt();
                area_rectagle(length,width);

            } else if (shape == 3) {
                System.out.print("Radius: ");
                    int radius = keyboard.nextInt();
                    area_circle(radius);

                } else if (shape == 4) {
                    quit();
                    break;
                }

        }


    }
}
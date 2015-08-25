public class Calculate{

    public static void main (String[] args){

        System.out.println("Calculate ...");

	int first = Integer.valueOf(args[0]);
	int second = Integer.valueOf(args[1]);

	int summ = first + second;
	int minus = first - second;
	double multiplication = first * second;
	double division = (double)first / (double)second;
	double power = Math.pow(first, second);

 
	System.out.println("first          = " + first + ", second = " + second);
	System.out.println("Summ           = " + first + " + " + second + " = " + summ);
	System.out.println("Minus          = " + first + " - " + second + " = " + minus);
	System.out.println("Division       = " + first + " / " + second + " = " + division);
	System.out.println("Multiplication = " + first + " * " + second + " = " + multiplication);
	System.out.println("Power          = " + first + " ^ " + second + " = " + power);			

    }

}
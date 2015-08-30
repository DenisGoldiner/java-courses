import java.util.Scanner;

public class InteractRunner{
	
	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		
		try{
			Calculator calc = new Calculator();
			String exit = "no";

			while(!exit.equals("yes")){
				
				String operationExist = "yes";
				
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				
				while(operationExist.equals("yes")){
					operationExist = "no";
					
				System.out.println("\nWhat operation would you like to do? \n");
				System.out.println("Write \"summ\" if operation you want is + ");
				System.out.println("Write \"minus\" if operation you want is - ");
				System.out.println("Write \"multiply\" if operation you want is * ");
				System.out.println("Write \"division\" if operation you want is / \n");
				
				String operation = reader.next();
					
					switch(operation){
						case "summ": 
							calc.summ(Integer.valueOf(first), Integer.valueOf(second));
							break;
						case "minus": 
							calc.substruct(Integer.valueOf(first), Integer.valueOf(second));
							break;
						case "multiply": 
							calc.muliply(Integer.valueOf(first), Integer.valueOf(second));
							break;
						case "division": 
							calc.division(Integer.valueOf(first), Integer.valueOf(second));
							break;
						default: 
							System.out.println("There is no such command try again yes/no ?");
							operationExist = reader.next();
					}
				}
				
				System.out.println("\nResult = " + calc.getResult());
				calc.cleanResult();							
				
				System.out.println("\nExit yes/no ? \n");
				exit = reader.next();
			}
			
		} finally {
			reader.close();
		}
		
	}
	
}
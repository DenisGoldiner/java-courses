/**
*Тесты для калькулятора
*@author Denis Goldiner
*date 30.08.2015
*/

public class CalculatorTest{
	
	/**
	*проверяем сложение двух чисел
	*/
	@Test
	public void summTest(){
		Calculator calculator = new Calculator();
		calculator.summ(2,2);
		assertEquals(4, calculator.getResult());
		calculator.cleanResult();
	}
	
	/**
	*проверяем вычитание двух чисел
	*/
	@Test
	public void substructTest(){
		Calculator calculator = new Calculator();
		calculator.substruct(5,2);
		assertEquals(3, calculator.getResult());
		calculator.cleanResult();
	}
	
	/**
	*проверяем умножение двух чисел
	*/
	@Test
	public void muliplyTest(){
		Calculator calculator = new Calculator();
		calculator.muliply(3,2);
		assertEquals(6, calculator.getResult());
		calculator.cleanResult();
	}	
	
	/**
	*проверяем деление двух чисел
	*/
	@Test
	public void divisionTest(){
		Calculator calculator = new Calculator();
		calculator.division(12,3);
		assertEquals(4, calculator.getResult());
		calculator.cleanResult();
	}			
}
	


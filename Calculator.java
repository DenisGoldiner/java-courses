public class Calculator {
	
	private double result;
	private double timeResult;
	
	public void summ (int ... entery){
		this.timeResult = 0;
		for(Integer param : entery){
			this.timeResult += param;
		}
		this.result = this.timeResult;
	}
	
	public void substruct (int ... entery){
		this.timeResult = entery[0] * 2;
		for(Integer param : entery){
			this.timeResult -= param;
		}
		this.result = this.timeResult;
	}
	
	public void muliply (int ... entery){
		this.timeResult = 1;
		for(Integer param : entery){
			this.timeResult *= param;
		}
		this.result = this.timeResult;
	}
	
	public void division (int ... entery){
		this.timeResult = (double)entery[0] * 2;
		for(Integer param : entery){
			this.timeResult /= (double)param;
		}
		this.result = this.timeResult;
	}
	
	
	public double getResult(){
		return (this.result);
	}
	
	public void cleanResult(){
		this.result = 0;
	}
}
public class Card {

	private int[] number;


	public Card(int[] number) {
		super();
		this.number = number;
	}

	public int[] getEvenNumMultipleTwo() {
		
		for(int i = number.length-2; i>=0; i-=2) {
			number[i] = number[i] *2;			
		}

		return number;
	}

	public int getSum() {
		
		int sum = 0;
		
		for(int i=0; i<number.length-1; i++) {

			sum += checkTwoDigitNumber(number[i]) ?  number[i]-9 : number[i]; 
		}
		
		return sum;
	}

	private boolean checkTwoDigitNumber(int num) {
		return num > 9;
	}
	
	public int nextTenNum(int value) {
		return 10-(value % 10);
	}

	public void setNum(int[] cardNum) {
		
		this.number = cardNum;
	}

	public int[] getNumber() {
		return number;
	}
	
}

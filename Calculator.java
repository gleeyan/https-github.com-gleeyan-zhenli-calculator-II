import java.util.ArrayList;

public class Calculator {
	private ArrayList<String> symbolList = new ArrayList<String>();
	private ArrayList<Double> numList = new ArrayList<Double>();

	public void performOperation(double number) {
		this.numList.add(number);		
	}
	public void performOperation(String str) {
		this.symbolList.add(str);		
	}
	public ArrayList<Double> getNumList() {
		System.out.println("returned ArrayList: "+ this.numList);
		return this.numList;
	}
	public ArrayList<String> getSymbolList() {
		System.out.println("returned ArrayList: "+ this.symbolList);
		return this.symbolList;
	}
	
	public Double evaluate() {
//	this would be the check if invalid entries were allowed--> modify appropriate array
		System.out.println("SymbolList has : "+ this.symbolList.size() + " NumList has : "+ this.numList.size());
		System.out.println("\nstarting first loop!\n");
		this.getSymbolList();
		this.getNumList();
		if (this.symbolList.get(this.symbolList.size()-1).equals("=") == true) {
			Double temp = 0.0;
//	multiplication & division
			for(int i = 0; i < this.symbolList.size(); i++) {
//				System.out.println("...checking index " +i);
				if(this.symbolList.get(i).equals("*")==true) {
					System.out.println("found multiplication at " + i);
					temp = this.numList.get(i)* this.numList.get(i+1);
//	numList.remove() ~= numList.remove(i+1)
					this.numList.remove(i);
					this.numList.set(i, temp); 
					this.symbolList.remove(i);
					i--;
				}
				else if(this.symbolList.get(i).equals("/")==true) {
					System.out.println("found division at " + i );
					temp = this.numList.get(i)/this.numList.get(i+1);
					this.numList.remove(i);
					this.numList.set(i, temp); 
					this.symbolList.remove(i);
					i--;
				}			
			}
System.out.println("\nstarting second loop!\n");
			this.getSymbolList();
			this.getNumList();
//	addition and subtraction
			for(int i = 0; i < this.symbolList.size(); i++) {
//				System.out.println("...checking index " +i);
				if(this.symbolList.get(i).equals("+")==true) {
					System.out.println("found addition at " + i );
					temp = this.numList.get(i)+this.numList.get(i+1);
					this.numList.remove(i);
					this.numList.set(i, temp); 
					this.symbolList.remove(i);
					i--;
				}
				else if(this.symbolList.get(i).equals("-")==true) {
					System.out.println("found subtraction at " + i );
					temp = this.numList.get(i)-this.numList.get(i+1);
					this.numList.remove(i);
					this.numList.set(i, temp); 
					this.symbolList.remove(i);
					i--;
				}
			}
			if(this.symbolList.size()==1) {
				System.out.println("returned Double " + this.numList.get(0));
				return this.numList.get(0);}
			else {
				System.out.println("Loop ran but something went wrong!");
				return null;}
		}
		System.out.println("Something went wrong, loop did not run!");
		return null;
	}
	
}
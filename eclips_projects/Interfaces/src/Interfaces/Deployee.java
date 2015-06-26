package Interfaces;

public class Deployee extends Persons implements Payable {
	//Constructor
	public Deployee(String name) {
		super(name);
	}
	public Boolean increablePay(int percent) {
		System.out.println("Повышение зарплаты: работник "+getName()+" - на "+percent+"%.");
		return true;
	}
}
package Interfaces;

public class Contractor extends Persons implements Payable {
	//Constructor
	public Contractor(String name) {
		super(name);
	}
	public Boolean increablePay(int percent) {
		if (percent <= INCREABLE_PAY) {
			System.out.println("Повышение зарплаты: работник "+getName()+" - на "+percent+"%.");
			return true;
		}else{
			System.out.println("Извините, но на "+percent+"% повысить зарплату работнику "+getName()+" мы не можем, а можем только на "+INCREABLE_PAY+"%");
			return false;
		}
	}
}
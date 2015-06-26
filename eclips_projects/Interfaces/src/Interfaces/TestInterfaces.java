package Interfaces;
import java.util.Scanner;
/**
 * Использование интерфейсов.
 * @author Juri
 * 
 */
public class TestInterfaces {

	public static void main(String[] args) {
		
		Payable[] workers = new Payable[3];
		
		workers[0] = new Deployee("Петров");
		workers[1] = new Contractor("Кришнапур");
		workers[2] = new Deployee("Сидоров");
		
		for (Payable p : workers) {
			p.increablePay(15);
		}
		
		//Для запуск из командной строки
		Scanner sc = new Scanner(System.in);
		sc.hasNext();
		
	}
}
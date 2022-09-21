package intro;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		//değişken isimleri java'da camelCase yazılır
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";
		
		System.out.println(ortaMetin);
		
		//integer
		int vade = 12;
		
		//double,float...
		double dolarDun = 18.14;
		double dolarBugun = 18.20;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //false
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		}
		else if (dolarBugun>dolarDun) { //true
			okYonu = "up.svg";
			System.out.println(okYonu);
			
		}
		else { //false
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		
		String[] krediler = {"Hızlı Kredi", "Maaşını Halkbank'tan Alanlar Kredisi", "Mutlu Emekli Kredisi"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
			
		}
	}

}

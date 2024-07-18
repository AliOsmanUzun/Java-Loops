import java.util.Scanner;

public class WorkSpace_AsalSayılarıBulma_Örneği {
	
	public static void main(String[] args) {
		
		// ASAL SAYI BULMA UYGULAMASI
		// Asal sayı 1'den büyük , 1 ve kendisinden başka böleni olmayan sayıdır.
		
		Scanner input = new Scanner(System.in);
		System.out.println("ASAL SAYI BULMA UYGULAMASI\n");
		System.out.print("Kontrol etmek istediğiniz sayıyı giriniz : ");
		int kontrol_sayi = input.nextInt();
		boolean asalMi = true ;
		for (int i = 2; i<kontrol_sayi; i++ ) { // Sayıyı kendisine kadar olan sayılara  böldürerek asal mı değil mi onu bulmaya çalışıyoruz
			if (kontrol_sayi%i==0) {
				 	asalMi = false;
				 	break;
			}
			else {
				asalMi=true;
			}
			
		}
		
		if (asalMi) { // Parantez içi true olursa çalışacağı için burada bir koşul koymadım
			System.out.println("Girdiğiniz "+kontrol_sayi+" sayısı asal bir sayıdır");
			
		} else {
			System.out.println("Girdiğiniz "+kontrol_sayi+" sayısı asal bir sayı değildir");
		}
		input.close();
		
		
		
		
	}

}

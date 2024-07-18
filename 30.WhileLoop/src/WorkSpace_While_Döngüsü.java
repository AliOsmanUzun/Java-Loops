
public class WorkSpace_While_Döngüsü {
	public static void main(String[] args) {

		// While döngüsünde while'dan sonra ki parantez içinde koşul sağlanıyorsa
		// Döngü devam eder ve içerisindeki kod bloğu çalışır
		// Ama eğer koşul sağlanmazsa döngü sonlanır

		// 1 den 10 a kadar olan çift sayıları yazdır
		int c = 1;
		while (c <= 10) { // Bir koşul belirtiyorum

			if (c % 2 == 0) {
				System.out.println(c);
			}
			c++;
		}

		// 1 den 10 a kadar olan tek sayıları yazdır
		int t = 1;
		while (t <= 10) {
			if (t % 2 == 1) {
				System.out.println(t);
			}
			t++;
		}

		// 1 den 10 a kadar olan çift sayıların toplamı

		int cıft_toplam = 0;
		int g = 1;
		while (g <= 10) {
			if (g % 2 == 0) {
				cıft_toplam += g;
			}
			g++;
		}
		System.out.println("Çift sayıların toplamı : " + cıft_toplam);

		// 1 den 10 a kadar tek olan sayıların toplamı
		int tek_toplam = 0;
		int s = 1;
		while (s <= 10) {
			if (s % 2 == 1) {
				tek_toplam += s;
			}
			s++;
		}
		System.out.println("Tek sayıların toplamı : "+tek_toplam);


		// çift sayıysa ekrana sayıyı , tek sayı ise ekrana isim yazdırsın 10 a kadar
		int tek_cift = 0;
		while (tek_cift<=10) {
			if (tek_cift%2==0) {
				System.out.println("Ali");
			}
			else {
				System.out.println(tek_cift);
			}
			tek_cift++;
		}
		
	}
}

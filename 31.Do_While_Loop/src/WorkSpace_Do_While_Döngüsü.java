
public class WorkSpace_Do_While_Döngüsü {	
		public static void main(String[] args) {
			
			
			
			int a = 1;
			do { // do döngüsündede değişkeni dışarıda tanımlıyorum
				 // İlk buradaki komut bloklarını çalıştır ondan sonra koşula bak
				System.out.println(a);
				a++;
			} while (a<=10);

			
			
			// 1 den 10 a kadar olan tek sayıları yazdır
			int b = 1;
			do {
				if (b%2==1) {
					System.out.println(b);
				}
				b++;
			} while (b<=10);
			
			// 1 den 10 a kadar olan çift sayıları yazdır
			
			int c = 1;
			do {
				if (c%2==0) {
					System.out.println(c);
				}
				c++;
			} while (c<=10);
			
			
			// 1 den 10 a kadar tek olan sayıların toplamı 

			int d = 1;
			int tek_toplam = 0;
			 do { 
				 if (d%2==1) {
					tek_toplam+=d;
				}
				d++;
			} while (d<=10);
			 System.out.println("1 den 10 a kadar tek olan sayıların toplamı "+tek_toplam);
			 
			 int f = 1;
			 int cift_toplam = 0;
			 do {
				 if (f%2==0) {
					cift_toplam+=f;
				}
				 f++;
				
			} while (f<=10);
			 System.out.println(cift_toplam);
			
				// 1 
				// Ali Osman			
				// 3 		
				// Ali Osman		
				// 5		
				// Ali Osman			
				// 7 
			 int g = 1;
			 do {
				if (g%2==1) {
					System.out.println(g);
				} else {
						System.out.println("Ali Osman");
				}
				g++;
			} while (g<=10);
			
			   
			 
			 
			 
		}

}

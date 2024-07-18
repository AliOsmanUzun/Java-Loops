
public class WorkSpace_ForDöngüsü_Örnekleri {
			public static void main(String[] args) {
				
				// 1 den 10 a kadar olan çift sayıları yazdır
				// 1 den 10 a kadar olan tek sayıları yazdır
				// 1 den 10 a kadar olan çift sayıların toplamı 
				// 1 den 10 a kadar tek olan sayıların toplamı 
				
				
				
				
				
			// 1 den 10 a kadar olan çift sayılar	
			for (int i = 1; i <=10 ; i++) {
										   // for döngüsü içerisindede if metodunu kullanabilirim
				                           // Çift sayı nedir 2'ye kalansız bölünen 
				if (i%2==0) {
					System.out.println(i);
				    }						   // Kalanı ne ile hesaplıyorduk mod eğer 2'ye modu 0 ise çift sayıdır
			
			}	
			
			
			// 1 den 10 a kadar olan tek sayılar 
			
			for (int j = 1; j <=10; j++) {
				if (j%2==1) {
					System.out.println(j);
				}
			}
				
			
			// 1 den 10 a kadar olan çift sayıların toplamı
			
			int toplam_cift = 0;
			for (int k = 1; k <=10; k++) {
				if (k%2==0) {
					toplam_cift+=k;
				}
				
			}
				System.out.println("1 den 10 a kadar olan çift sayıların toplamı : " + toplam_cift);
				
				
			int toplam_tek = 0 ; // toplanacak sayıları tutması için bir değişken tanımladım
				 for (int t = 0; t <=10; t++) {
					if (t%2==1) {
						toplam_tek+=t;
					}
				}
                  System.out.println("1 den 10 a kadar olan sayıların toplamı : " + toplam_tek);			
			
			
			// çift sayıysa ekrana sayıyı , tek sayı ise ekrana isim yazdırsın 10 a kadar
                for (int r = 0; r <= 10; r+=1) {
					if (r%2==0) {
									System.out.println(r);
					}
					else if (r%2==1) {
									System.out.println("Ali Osman");
					}
				}
			
                  
			}
}




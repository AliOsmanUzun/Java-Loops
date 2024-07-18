
public class WorkSpace_Continue_Kullanımı {
	public static void main(String[] args) {

		// Continue Kullanımı --- Döngüyü sadece 1 kereye mahsus kırar.
		// Diyelim ki 1 2 3 (4,5) 6 sayılarını ekrana yazdırıcam ama 4 ve 5 yazılsın
		// istemiyorum.
		// Bunlar yazılmasın ama döngümünde bunları yazmadan sorunsuz şekilde yola devam
		// etmesini istiyorsam.
		// Continue kullanıyorum.
		// Kısaca istemediğim bir kaç durum varsa ve döngünün bunları atlayıp
		// çalışmasını istiyorsam continue kullanıyorum

		for (int i = 1; i <= 8; i++) { // 4 ve 5 rakamlarını ekrana yazdırmak istemiyorum
			if (i == 4 || i == 5) {
				continue;// Döngüyü bu istemediğim durumlarda kır ama sonlandırma

			}
			System.out.println(i);
		}
	}
}

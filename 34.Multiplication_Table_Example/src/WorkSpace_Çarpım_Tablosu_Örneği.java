
public class WorkSpace_Çarpım_Tablosu_Örneği {
	public static void main(String[] args) {
		// Çarpım Tablosu Yapımı

		for (int i = 1; i <= 10; i++) { // İçteki for döngüsü ile baştaki for döngüsünün herhangi bir değerini 10 defa
										// çarpıyor ve ekrana yazdırıyorum aslında

			for (int j = 1; j <= 10; j++) {

				System.out.println(i + "x" + j + "=" + (i * j));
			}
			System.out.println("---------------------");
		}
	}

}

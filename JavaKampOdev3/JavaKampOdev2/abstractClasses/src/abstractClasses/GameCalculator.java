package abstractClasses;

//hesaplayı kim miras alacaksa override etmek zorunda yani kendi hesaplasını yazmak zorunda ! 
public abstract class GameCalculator {
	public abstract void hesapla();
	
	
	// gameover ben yazdım isteyen override edebilir ! // final gelirse bu hiçbir zaman değişmeyecek bir kuraldır anlamına gelir !
	public final void gameOver () {
		System.out.println("Oyun bitti");
	}
}

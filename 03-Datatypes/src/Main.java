
public class Main {

	public static void main(String[] args) {
		
		int sayi = 12; //(int -+2 Milyar) ve (byte -128 ile +127) tam sayı aralığının değerini tutabilir. 
		//sayi="ankara"; olmaz çünkü geçersizdir. Ancak sayi=5 yazarsak olur.
		
		double sayi1 = 11.5; 
		sayi1 = -129; // (float 4 byte ve double 8 byte alan ile ondalıklı sayıları tutar)
		short sayi2 = 350; //short veri tipi 4 byte alan ve -32768 ile 32767 aralık değerini tutar.
		
		//long veri tipi 8 byte alan ve -9 ile +9 arasında değer tutar
		
		String sehir = "ANKARA"; // Karakter topluluğudur.
		char karakter = 'A'; // Tek tırnak içerisinde ve tek karakter ve 2 byte'lık alan kaplayan veri tipidir.
		
		boolean dogruMu=false; // 1 byte'lık veri tutar. Doğru veya yanlış, 0 veya 1 'dir.
	
	}

}

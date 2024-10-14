package Esercizi;

public class EserciziArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String [] Animali = {"Gatto", "Cane", "Cavallo", "Leone"};
		
		String []  Versi = {"Miagola", "Abbaia", "Nitrisce","Ruggisce"};
		
		
		for(int i=0;i<Animali.length;i++)
		{
			System.out.print("Il "+ Animali[i] + " ");
			for(int y=0;y<Versi.length;y++) {
				
				if(i == y) {
					System.out.println(Versi[i] + " ");
				}
			
			}
			
		}
		
	
		
	}

}

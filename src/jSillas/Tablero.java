package jSillas;

public class Tablero {
	
	
	private Silla[][] sillas = new Silla[0][0];
	private Player[] jugador= new Player[0];
	
	public Tablero(int n){  // N VA A SER EL LARGO DEL JUEGO , PORQUE SIEMPRE VA A TENER 3 de ALTURA
		for (int i=0;i<sillas.length;i++){
			for(int j=0;j<sillas.length;j++){
				this.sillas[i][j]= new Silla(false);
				sillas[1][0]=null;
				sillas[1][n-1]=null;
				
			}
		}
		
		for (int i=0;i<jugador.length;i++){
			
			
		}
		
	}
	public Silla getSilla(int x,int y){
		return sillas[x][y];
	}

}

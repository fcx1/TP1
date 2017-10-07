package jSillas;

public class Silla {
	
	boolean disponible;
	
	public Silla(boolean disponible){
		this.disponible=disponible;
	}
	
	
	public boolean estaDisponible(){
		return disponible;
	}
	public void setDisponibilidad(boolean disponible){
		this.disponible=disponible;
	}
	/*public int getX(){
		return x;
	}
	public void setX(int x){
		this.x=x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y=y;
	}*/

}

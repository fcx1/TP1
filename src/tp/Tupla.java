package tp;

public class Tupla<T,T2> {
	private T elem;
	private T2 s;
	
	Tupla(){
	}
	T getX(){
		return this.elem;
	}
	T2 getY(){
		return this.s;
	}
	void añadirTupla(T conjunto, T2 c){
		this.elem=conjunto;
		this.s=c;
	}
	
}
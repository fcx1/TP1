package TP2;

public class Diccionario<Clave,Significado> {
	private Clave C;
	private Significado S;
	
	Diccionario(Significado s,Clave c){
		this.C=c;
		this.S=s;
		
	}
	
	Significado obtener(Clave clave){
		
	}
	void definir (Clave c,Significado s){
		
	}
	
	boolean pertenece (Clave c){
		
		
		return false;
	}
	
	void eliminar(Clave c){
		
	}
	
	Iterator<Clave> iterator();

}

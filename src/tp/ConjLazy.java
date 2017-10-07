package tp;
import java.util.*;
public class ConjLazy<T>{
	
	private ArrayList<T> conj;
	private Queue<Tupla<ConjLazy<T>,String>> cola;
	private HashSet<T> hash;
	ConjLazy(){
		conj = new ArrayList<>();
		cola= new LinkedList<>();
		hash = new HashSet<>();
	}
	void agregar(T elem){
		if(hash.add(elem)){
			hash.add(elem);
			this.conj.add(elem);
		}
	}
	void union(ConjLazy<T> c2){
		Tupla<ConjLazy<T>, String>tupla=new Tupla<>();
		tupla.a�adirTupla(c2,"u");
		cola.offer(tupla);		
		recalcular(cola);
	}
	void interseccion(ConjLazy<T> Conjunto){
		Tupla<ConjLazy<T>,String>tupla=new Tupla<>();
		tupla.a�adirTupla(Conjunto,"i");
		cola.offer(tupla);
		recalcular(cola);
	}
	//Metodos off-line
	int tama�o(){
		return this.conj.size();
	}
	Boolean pertenece(T elem){
		return this.conj.contains(elem);
	}
	void recalcular(Queue<Tupla<ConjLazy<T>,String>> cola){
		Tupla<ConjLazy<T>, String> a;
		while(cola.peek()!=null){
			a=cola.poll();
			if(a.getY().equals("u")){
				unir(a.getX());
			}
			else if(a.getY().equals("i")){
				intersec(a.getX());
			}
		}
	}
	void unir(ConjLazy<T>c2){
		for(int i=0;i<c2.tama�o();i++){
			if(!this.pertenece(c2.conj.get(i))){
				this.agregar(c2.conj.get(i));
			}
		}
	}
	void intersec(ConjLazy<T>c2){
		for(int i=0;i<this.tama�o();i++){
			if(!c2.pertenece(this.conj.get(i))){
				this.conj.remove(this.conj.get(i));
			}
		}
	}
}
package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpre ) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpre;
	}
	
	
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	public int cantidadLetras() {
		return this.getLetras().length;
	}
	
	public String interpretacion() {
		return this.getInterpretacion();
	}
	
	public String toString() {
		int i=0;
		String alfa = "";
		for(i = 0;i<this.getLetras().length;i++) {
			if(i == this.getLetras().length-1) {
				alfa+= this.letras[i];
			}
			else {
				alfa+= this.letras[i] + ", ";
			}
		}
		return alfa;
	}
}

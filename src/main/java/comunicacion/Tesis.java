package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen, String titu, String autor, int pags,String idea, String[] argumentos, String conclu,String refe ,String inter){
		super(origen,titu, autor,pags);
		this.idea=idea;
		this.argumentos= argumentos;
		this.conclusion=conclu;
		this.referencias=refe;
		this.interpretacion=inter;
	}

	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String[] getArgumentos() {
		
		return argumentos;
	}
	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencia(String referencia) {
		this.referencias = referencia;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int n) {		
		return this.getPaginas() * 5 * n;
	}
	
	public String interpretacion() {
		return this.getInterpretacion();
	}
	
	public String toString() {
		return this.getOrigen()+"\n"+
				this.getTitulo()+"\n"+
				this.getAutor()+"\n"+
				this.getPaginas()+"\n"+
				this.getIdea()+"\n"+
				this.getArgumentos().length+"\n"+
				this.getConclusion()+"\n"+
				this.getReferencias()
				;
				
	}
	
}

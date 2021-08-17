package vo;

import java.util.Objects;

public class Body {
	private String nome;
	private String aparelhopeito;
	private String aparelhocostas;
	private String aparelhoperna;
	
	
	public Body() {
		
	}
	
	public Body(String nome, String aparelhopeito, String aparelhocostas, String aparelhoperna) {
		this.nome = nome;
		this.aparelhopeito = aparelhopeito;
		this.aparelhocostas = aparelhocostas;
		this.aparelhoperna = aparelhoperna;
	}
	
	public Body(String[] csv){
		this.aparelhopeito = csv[0];
		this.aparelhocostas = csv[1];
		this.aparelhoperna = csv[2];
	}

	public String getNome() {
		return nome;
	}
	
	public String getAparelhoPeito() {
		return aparelhopeito;
	}

	public String getAparelhoCostas() {
		return aparelhocostas;
	}

	public String getAparelhoPerna() {
		return aparelhoperna;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setAparelhoPeito(String aparelhopeito) {
		this.aparelhopeito = aparelhopeito;
	}

	public void setAparelhoCostas(String aparelhocostas) {
		this.aparelhocostas = aparelhocostas;
	}

	public void setAparelhoPerna(String aparelhoperna) {
		this.aparelhoperna = aparelhoperna;
	}
	//key
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Body other = (Body) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return nome +"\t"+ aparelhopeito +"\t"+ aparelhocostas +"\t"+ aparelhoperna +"\n";
	}
	
	public String toCSV() {
		return nome +"\t"+ aparelhopeito +"\t"+ aparelhocostas +"\t"+ aparelhoperna +"\r\n";
	}
	
	public String toHTML() {
		return "<tr><td>" + nome + "<td><td>" + aparelhopeito + "<td><td>" + aparelhocostas +"<td><td>"+ aparelhoperna + "<td><td>";
	}
	
}

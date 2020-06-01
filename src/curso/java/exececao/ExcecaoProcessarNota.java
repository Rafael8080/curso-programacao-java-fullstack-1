package curso.java.exececao;

public class ExcecaoProcessarNota extends Exception{

	public ExcecaoProcessarNota(String erro) {
		
		super("VIx um no arquivo ao processar as notas" + erro);
		
	}
	
}

package cursojava.interfaces;

/*Essa interface ser� o nosso controtato de autentica��o*/
public interface PermitirAcesso {
	
	public boolean autenticar();/*Apenas declara��o do m�todo*/
	
	public boolean autenticar(String login, String senha);
	
}

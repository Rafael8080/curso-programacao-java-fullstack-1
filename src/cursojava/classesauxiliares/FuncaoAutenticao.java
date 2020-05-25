package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/* Realmente e somente receber alguem que tem o contrato da interface de PermitirAcesso e chamar o autenticar */
public class FuncaoAutenticao {
	
	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		
		return permitirAcesso.autenticar();
		
	};
	
	public FuncaoAutenticao(PermitirAcesso acesso) {
		
		this.permitirAcesso = acesso;
		
	}
	
}

package Fachadas;

import java.util.List;

import classes.Lote;
import classes.Produto;
import services.LoteService;


public class LoteFachada {


	LoteService service;

	public LoteFachada() {
		this.service = new LoteService();
	}
	
	public void adicionaLote(int qtd, String dataV, Produto prod) {
		this.service.adicionaLote( qtd, dataV,  prod);
	}
	
	public List<Lote> listaLotes(){
		return this.service.listaLotes();
	}
}

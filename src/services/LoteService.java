package services;

import java.util.List;

import classes.Lote;
import classes.Produto;
import repositories.LoteRepository;


public class LoteService {

	LoteRepository repository;

	public LoteService() {
		this.repository = new LoteRepository();
	}
	
	public void adicionaLote(int qtd, String dataV, Produto prod) {
		this.repository.adicionaLote(qtd, dataV, prod);
	}
	
	public List<Lote> listaLotes(){
		return this.repository.listaLotes();
	}
}

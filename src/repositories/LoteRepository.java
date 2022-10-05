package repositories;

import java.util.ArrayList;
import java.util.List;

import classes.Lote;
import classes.Produto;


public class LoteRepository {

	private List<Lote> lotes;

	public LoteRepository() {
		this.lotes = new ArrayList<Lote>();
	}
	
	public void adicionaLote(int qtd, String dataV, Produto prod) {
		Lote l = new Lote(qtd, dataV, prod);
		this.lotes.add(l);
	}
	public List<Lote> listaLotes(){
		return this.lotes;
	}
}

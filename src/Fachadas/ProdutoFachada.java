package Fachadas;

import java.util.List;

import classes.Produto;
import services.ProdutoService;

public class ProdutoFachada {

	ProdutoService service;

	public ProdutoFachada() {
		this.service = new ProdutoService();
	}
	
	public void adicionaProduto(String nome, String fabricante, double peso) {
		this.service.adicionaProduto(nome, fabricante, peso);
	}
	
	public List<Produto> listaProdutos(){
		return this.service.listaProdutos();
	}
}

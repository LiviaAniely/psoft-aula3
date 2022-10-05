package services;

import repositories.ProdutoRepository;
import java.util.*;
import classes.Produto;

public class ProdutoService {

	ProdutoRepository repository;

	public ProdutoService() {
		this.repository = new ProdutoRepository();
	}
	
	public void adicionaProduto(String nome, String fabricante, double peso) {
		this.repository.adicionaProduto(nome, fabricante, peso);
	}
	
	public List<Produto> listaProdutos(){
		return this.repository.listaProdutos();
	}
}

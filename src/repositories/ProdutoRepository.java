package repositories;
import java.util.*;

import classes.Produto;

public class ProdutoRepository {
	
	private List<Produto> produtos;

	public ProdutoRepository() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public void adicionaProduto(String nome, String fabricante, double peso) {
		Produto p = new Produto(nome, fabricante,peso);
		this.produtos.add(p);
	}
	public List<Produto> listaProdutos(){
		return this.produtos;
	}

}

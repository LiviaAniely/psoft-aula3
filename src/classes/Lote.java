package classes;

public class Lote {

    private int qtd;
    private String dataV;
    private Produto prod;

    public Lote(int qtd, String dataV, Produto prod) {
        this.qtd = qtd;
        this.dataV = dataV;
        this.prod = prod;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getDataV() {
        return dataV;
    }

    public void setDataV(String dataV) {
        this.dataV = dataV;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

	@Override
	public String toString() {
		return "Lote [qtd=" + qtd + ", dataV=" + dataV + ", prod=" + prod + "]";
	}
    
    
}


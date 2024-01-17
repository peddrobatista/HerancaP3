package entities;

public class ProdutoImportado extends Produto {
	
	private Double taxaAlfandegaria;
	
	public ProdutoImportado() {
		
	}
	
	public ProdutoImportado(String name, Double price, Double taxaAlfandegaria) {
		super(name, price);
		this.taxaAlfandegaria = taxaAlfandegaria;
	}

	public Double getTaxaAlfandegaria() {
		return taxaAlfandegaria;
	}

	public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
		this.taxaAlfandegaria = taxaAlfandegaria;
	}

	@Override
	public String etiqueta() {
		return getName() 
			+ " $ " 
			+ String.format("%.2f", precoTotal())
			+ " (Taxa Alfandegária: $ " 
			+ String.format("%.2f", taxaAlfandegaria)
			+ ")";
		
	}
	
	public Double precoTotal() {
		return getPrice() + taxaAlfandegaria;
	}
}

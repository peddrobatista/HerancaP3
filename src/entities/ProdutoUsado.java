package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {
	private LocalDate dataFabricacao;
	
	public ProdutoUsado() {
		
	}

	public ProdutoUsado(String name, Double price, LocalDate dataFabricacao) {
		super(name, price);
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etiqueta() {
		return getName() 
				+ " (used) $ " 
				+ String.format("%.2f", getPrice())
				+ " (Data de fabricação: "
				+ dataFabricacao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
}

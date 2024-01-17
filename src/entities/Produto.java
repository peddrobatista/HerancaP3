package entities;

public class Produto {
	
	private String name;
	private Double price;
	
	public Produto() {
		
	}

	public Produto(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String etiqueta() {
		return name + " $ " + String.format("%.2f", price);
	}

}

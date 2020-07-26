class CakeType {
		private String flavour;
		private int weight;
		private double price;
		private int quantityOrdered;
		
		public CakeType(String flavour, double price){
			this.flavour = flavour;
			this.weight = 0;
			this.price = price;
			this.quantityOrdered = 0;
		}
		
		//Getter
		public String getFlavour(){
			return this.flavour;
		}
		
		public int getWeight(){
			return this.weight;
		}
		
		public double getPrice(){
			return this.price;
		}
		
		public int getQuantityOrdered(){
			return this.quantityOrdered;
		}
		
		//Setter
		public void setFlavour(String flavour){
			this.flavour = flavour;
		}
		
		public void setWeight(int weight){
			this.weight = weight;
			if(this.weight == 1 || this.weight == 0){
				this.price = price;
			}else if(this.weight == 2){
				this.price = (price * weight) - 5.00;
			}else if(this.weight == 3){
				this.price = price * weight - 15.00;
			}
		}
		
		public void setQuantityOrdered(int quantityOrdered){
			this.quantityOrdered = quantityOrdered;
		}
		
		//toString()
		public String toString(){
			return "Flavour: " + this.flavour +
				   "\nWeight: " + this.weight + 
				   "\nPrice: RM" + this.price + 
				   "\nQuantity Ordered: " + this.quantityOrdered;	
		}
}

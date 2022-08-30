
	public class NewOrdenador {
		
		private String marca;
		private String modelo;	
		private String procesador;
		private int ram;	
		private int hd;
		
		public NewOrdenador(String marca,String modelo,String procesador,int i,int j){
			this.marca=marca;
			this.modelo=modelo;
			this.procesador=procesador;
			this.ram=i;
			this.hd=j;
		}
		public NewOrdenador(String marca,String modelo){
			this.marca=marca;
			this.modelo=modelo;	
		}
		
		public String getMarca() {
			return marca;
		}
		/*public void setMarca(String marca) {
			this.marca = marca;
		}*/
		public String getModelo() {
			return modelo;
		}
		/*public void setModelo(String modelo) {
			this.modelo = modelo;
		}*/
		public String getProcesador() {
			return procesador;
		}
		public void setProcesador(String procesador) {
			this.procesador = procesador;
		}
		public int getRam() {
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		public int getHd() {
			return hd;
		}
		public void setHd(int hd) {
			this.hd = hd;
		}
		
		public String enEjecucion (String x) {
			return "En estos momentos se está ejecutando: "+x;	
		}
		
		@Override
		public String toString() {
			return "Ordenador [marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador + ", ram=" + ram
					+ ", hd=" + hd + "]";
		}
	}

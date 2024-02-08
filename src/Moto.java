
public class Moto extends Veicolo {

	private int nruote;
	private final int tariffaG=5;
	public Moto(String t, String m, boolean dis, float cost, int nr) {
		super(t, m, dis, cost);
		nruote=nr;
		
	}
	
	public int getNRuote() {
		return nruote;
		
	}
	
	@Override
	public float getCostoG() {
		return tariffaG-costovig;/////////
		
	}
	
	public String toString() {
		String s="VEICOLO: MOTO\n";
		s+=super.toString();
		s+="Numero ruote: "+nruote+"\n";
		s+="Tariffa giornaliera: "+tariffaG+"€\n";
		s+="guadagno: "+getCostoG()+"\n";
		return s;
	}
	
	public static void main(String[] args) {
		Moto m=new Moto("AY0231AB","KTM",false,2,2);
		System.out.println(m);
		System.out.println(m.costovig);
	}

}

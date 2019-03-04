package model;

public class FormCreator {
	
	private int eightxten;
	private int fourxsix;
	private int wallet;
	private int total;
	
	public FormCreator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FormCreator(int eightx, int fourx, int w) {
		super();
		eightxten = eightx;
		fourxsix = fourx;
		wallet = w;
		
		setReceipt(eightxten, fourxsix, wallet);
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getEightxten() {
			return eightxten;
		}

	public void setEightxten(int eightxten) {
		this.eightxten = eightxten;
	}
	
	public int getFourxsix() {
		return fourxsix;
	}

	public void setFourxsix(int fourxsix) {
		this.fourxsix = fourxsix;
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	public void setReceipt (int eightx, int fourx, int w ) {
		eightxten = eightx * 15;
		fourxsix = fourx * 10;
		wallet = w * 3;
		
		total = eightxten + fourxsix + wallet;
	}
	
	public String toString() {
		return "Hello" ;
	}
}

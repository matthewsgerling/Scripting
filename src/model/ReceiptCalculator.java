package model;

public class ReceiptCalculator {
	
	private int eightxten;
	private int fourxsix;
	private int wallet;
	private int priceEight;
	private int priceFour;
	private int priceWallet;
	
	public ReceiptCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReceiptCalculator(int eightx, int fourx, int w) {
		super();
		eightx = eightxten;
		fourx = fourxsix;
		w = wallet;
		
		setReceiptint(eightxten, fourxsix, wallet);
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
	public void setReceiptint (int eightx, int fourx, int w ) {
		priceEight = eightx * 3;
		priceFour = fourx * 3;
		priceWallet = w * 3;
	}
	
	public String toString() {
		priceEight = this.priceEight;
		priceFour = this.priceFour;
		priceWallet = this.wallet;
		
		return "Full Receipt:\n" + "8x10 ---> " + priceEight;
	}
}

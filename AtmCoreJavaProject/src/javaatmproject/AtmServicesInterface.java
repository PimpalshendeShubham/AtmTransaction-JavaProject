package javaatmproject;

public interface AtmServicesInterface {
	
	public void viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void depositAmount(double depositAmount );
    public  void viewMiniStatement();
}

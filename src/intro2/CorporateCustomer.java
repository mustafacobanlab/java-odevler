package intro2;

public class CorporateCustomer extends customer {
	private String companyNameString;
	private String taxNumber;
	public String getCompanyNameString() {
		return companyNameString;
	}
	public void setCompanyNameString(String companyNameString) {
		this.companyNameString = companyNameString;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}

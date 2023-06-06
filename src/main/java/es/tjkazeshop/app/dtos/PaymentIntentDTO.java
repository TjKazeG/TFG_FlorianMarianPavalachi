package es.tjkazeshop.app.dtos;



public class PaymentIntentDTO {
	public enum Currency{
        EUR;
    }

    private String description;
    private int amount;
    private Currency currency;
    
    
    public PaymentIntentDTO(String description, int amount, Currency currency) {
		super();
		this.description = description;
		this.amount = amount;
		this.currency = currency;
	}

	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}

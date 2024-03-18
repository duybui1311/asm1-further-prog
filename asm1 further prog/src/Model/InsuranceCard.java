package Model;

import java.util.Date;

public class InsuranceCard {
    private String cardNumber;
    private String cardHolder;
    private String policyOwner;
    private Date expirationDate;

    public InsuranceCard(String cardNumber, String cardHolder, String policyOwner, Date expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.policyOwner = policyOwner;
        this.expirationDate = expirationDate;
    }

    // Getter and setter methods for attributes

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        // Validate card number format
        if (cardNumber.matches("\\d{10}")) {
            this.cardNumber = cardNumber;
        } else {
            throw new IllegalArgumentException("Card number must be 10 digits long.");
        }
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        // Check if card already has a holder
        if (this.cardHolder == null) {
            this.cardHolder = cardHolder;
        } else {
            throw new IllegalStateException("The insurance card already has a holder.");
        }
    }

    public String getPolicyOwner() {
        return policyOwner;
    }

    public void setPolicyOwner(String policyOwner) {
        // Validate policy owner information if needed
        this.policyOwner = policyOwner;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        // Additional validation for expiration date if needed
        this.expirationDate = expirationDate;
    }
}

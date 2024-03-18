package Model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String fullName;
    private InsuranceCard insuranceCard;
    private List<Claim> claims;
    private List<Customer> customers; // List of dependents

    public Customer(String id, String fullName, InsuranceCard insuranceCard) {
        if (!isValidCustomerId(id)) {
            throw new IllegalArgumentException("Invalid customer ID format.");
        }
        this.id = id;
        this.fullName = fullName;
        this.insuranceCard = insuranceCard;
        this.claims = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    // Getter and setter methods for attributes

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public InsuranceCard getInsuranceCard() {
        return insuranceCard;
    }

    public void setInsuranceCard(InsuranceCard insuranceCard) {
        this.insuranceCard = insuranceCard;
    }

    public List<Claim> getClaims() {
        return claims;
    }

    public void setClaims(List<Claim> claims) {
        this.claims = claims;
    }

    public void addClaim(Claim claim) {
        claims.add(claim);
    }

    public void removeClaim(Claim claim) {
        claims.remove(claim);
    }

    private boolean isValidCustomerId(String id) {
        return id.matches("c-[0-9]{7}$");
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void updateCustomer(Customer customer) {
        // Implement updating customer information
    }

    public Customer getCustomerById(String id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null; // Customer with the given ID not found
    }

    public void deleteCustomer(Customer customer) {
        customers.remove(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}

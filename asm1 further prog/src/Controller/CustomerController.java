/**
 * @author <Bui Cong Duy - s3978546>
 */
package Controller;

import Model.Customer;

import java.util.List;

public class CustomerController {
    private Customer customerModel;

    public CustomerController(Customer customerModel) {
        this.customerModel = customerModel;
    }

    public void addCustomer(Customer customer) {
        customerModel.addCustomer(customer);
    }

    public void updateCustomer(Customer customer) {
        customerModel.updateCustomer(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerModel.deleteCustomer(customer);
    }

    public Customer getCustomerById(String id) {
        return customerModel.getCustomerById(id);
    }

    public List<Customer> getAllCustomers() {
        return customerModel.getAllCustomers();
    }
}

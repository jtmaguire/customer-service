package customerservice.Controllers;

import customerservice.Database.CustomerRepository;
import customerservice.Models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static java.util.Objects.isNull;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;

    @PostMapping(value = "/create")
    public ResponseEntity createCustomer(@RequestBody Customer customer){
        Customer returnedCustomer = repository.save(customer);

        return ResponseEntity.ok(customer);
    }

    @GetMapping(value = "/all")
    public ResponseEntity getAllCustomers(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id){
        return ResponseEntity.ok(repository.findById(id));
    }

    @PutMapping(value = "/update")
    public ResponseEntity updateCustomer(@RequestBody Customer customer){
        if (isNull(customer.getID())) {
            return ResponseEntity.badRequest().build();
        }

        Customer returnedCustomer = repository.save(customer);
        return ResponseEntity.ok(returnedCustomer);
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity deleteCustomer(@PathVariable Long id){
        repository.deleteById(id);

        return ResponseEntity.ok().build();
    }

}

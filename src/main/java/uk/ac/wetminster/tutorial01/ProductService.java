package uk.ac.wetminster.tutorial01;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        products.add(new DigitalProduct(nextId++, "E-book", 9.99, 
                    "http://example.com/download/ebook", 5.0));
        products.add(new PhysicalProduct(nextId++, "Smartphone", 499.99, 
                    0.5, "15cm x 10cm x 5cm"));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId().equals(id));
    }

    public List<Product> findByName(String name){
        return products.stream()
                .filter(product -> product.getName().contains(name))
                .toList();
    }
}

package ro.shum.ProductManagementApp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private List<Product> productList = new ArrayList<>();
  private AtomicInteger idCounter = new AtomicInteger();

  public Product addProduct(Product newProduct) {
    int id = idCounter.incrementAndGet();
    newProduct.setId((long) id);
    productList.add(newProduct);
    return newProduct;
  }

  public List<Product> getProducts() {
    return productList;
  }
}


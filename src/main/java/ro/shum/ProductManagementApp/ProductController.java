package ro.shum.ProductManagementApp;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер, который обрабатывает HTTP-запросы к API.
 */
@RestController
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @PostMapping("/product")
  public Product addProduct(@RequestBody Product newProduct) {
    return productService.addProduct(newProduct);
  }

  @GetMapping("/product")
  public List<Product> getProducts() {
    return productService.getProducts();
  }
}

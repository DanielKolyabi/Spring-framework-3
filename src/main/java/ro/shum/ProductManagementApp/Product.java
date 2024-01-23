package ro.shum.ProductManagementApp;

import lombok.Data;

/**
 * Класс модели, который представляет продукт.
 */
@Data
public class Product {

  private Long id;
  private String name;
  private double price;

}
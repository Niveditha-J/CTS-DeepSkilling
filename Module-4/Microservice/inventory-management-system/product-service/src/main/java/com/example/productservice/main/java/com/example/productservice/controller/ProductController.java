@Entity
public class Product {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private int stock;
}

@RestController
@RequestMapping("/products")
public class ProductController {
  @Autowired
  private ProductRepository repo;

  @PostMapping
  public Product save(@RequestBody Product product) {
    return repo.save(product);
  }

  @GetMapping
  public List<Product> getAll() {
    return repo.findAll();
  }
}

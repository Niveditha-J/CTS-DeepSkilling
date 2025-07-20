@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserClient userClient;

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public Map<String, Object> getOrderWithUser(Long orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow();
        User user = userClient.getUserById(order.getUserId());

        Map<String, Object> result = new HashMap<>();
        result.put("order", order);
        result.put("user", user);
        return result;
    }
}

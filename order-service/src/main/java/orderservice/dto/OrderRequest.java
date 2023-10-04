package orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
public class OrderResponse {
    private List<OrderItems> orderItemsList;
}

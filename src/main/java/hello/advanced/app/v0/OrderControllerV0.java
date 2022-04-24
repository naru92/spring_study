package hello.advanced.app.v0;

import org.springframework.web.bind.annotation.*;

import lombok.*;

@RestController
@RequiredArgsConstructor
public class OrderControllerV0 {
	
	private final OrderServiceV0 orderService;
	
	@GetMapping("/v0/request")
	public String request(String itemId) {
		orderService.orderItem(itemId);
		return "ok";
	}
	
}

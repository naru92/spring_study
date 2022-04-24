package hello.advanced.app.v0;

import org.springframework.stereotype.*;

import lombok.*;

@Service
@RequiredArgsConstructor
public class OrderServiceV0 {
	
	//스프링에선 생성자가 하나면 @Autowired 
	
	private final OrderRepositoryV0 orderRepository;
	
	
	public void orderItem(String itemId) {
		orderRepository.save(itemId);
		
	}
	
	
}

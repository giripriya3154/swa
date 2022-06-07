package cs.miu.edu.account_service.clients;


import cs.miu.edu.account_service.dto.TransactionDto;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "TRANSACTION-SERVICE")
public interface TransactionFeignClient {
    @PostMapping("/transactions")
    public ResponseEntity<TransactionDto> saveTransaction(@RequestBody TransactionDto transactionDto);
}

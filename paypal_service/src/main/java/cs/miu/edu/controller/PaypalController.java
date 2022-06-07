package cs.miu.edu.controller;

import cs.miu.edu.domain.Paypal;
import cs.miu.edu.dto.PaypalDto;
import cs.miu.edu.service.PaypalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paypals")
public class PaypalController {

    @Autowired
    private PaypalService paypalService;

//    @PostMapping
//    public PaypalDto savePaypal(@RequestBody PaypalDto paypalDto){
//
//        return paypalService.savePaypal(paypalDto);
//    }
//
//    @GetMapping("/{id}")
//    public PaypalDto getPaypalByAccountId(@PathVariable("id") Integer id){
//       return paypalService.findPaypalByAccountId(id);
//    }

    @PutMapping("verify-purchase")
    public ResponseEntity<?> verifyPurchase(@RequestBody PaypalDto paypalDto){
        ResponseEntity<?> response= new ResponseEntity<>(paypalService.verifyPurchase(paypalDto), HttpStatus.OK);
        return response;
    }


}

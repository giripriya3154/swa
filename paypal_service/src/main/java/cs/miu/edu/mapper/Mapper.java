package cs.miu.edu.mapper;

import cs.miu.edu.domain.Paypal;
import cs.miu.edu.dto.PaypalDto;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public PaypalDto mapToDto(Paypal paypal) {
        PaypalDto paypalDto = PaypalDto.builder()
                .firstName(paypal.getFirstName())
                .lastName(paypal.getLastName())
                .balance(paypal.getBalance())
                .emailAddress(paypal.getEmailAddress())
                .secureKey(paypal.getSecureKey())
                .build();
        return paypalDto;
    }

    public Paypal mapToPaypal(PaypalDto paypalDto) {
        Paypal paypal = Paypal.builder()
                .firstName(paypalDto.getFirstName())
                .lastName(paypalDto.getLastName())
                .emailAddress(paypalDto.getEmailAddress())
                .secureKey(paypalDto.getSecureKey())
                .balance(paypalDto.getBalance())
                .build();
        return paypal;
    }
}

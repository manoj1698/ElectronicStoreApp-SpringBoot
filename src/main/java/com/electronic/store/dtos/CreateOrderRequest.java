package com.electronic.store.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CreateOrderRequest {
    @NotBlank(message = "Cart id is not blank !!")
    private String cartId;
    @NotBlank(message = "User id is not blank !!")
    private String userId;
    private String orderStatus = "PENDING";
    private String paymentStatus = "NOTPAID";
    @NotBlank(message = "Billing address is not blank !!")
    private String billingAddress;
    @NotBlank(message = "Billing phone is not blank !!")
    private String billingPhone;
    @NotBlank(message = "Billing name is not blank !!")
    private String billingName;

}

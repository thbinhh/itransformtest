package com.example.testtransfer.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class FoodOrderDTO {
    String item;
    Double amount;
}

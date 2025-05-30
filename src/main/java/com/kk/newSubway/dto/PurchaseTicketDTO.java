package com.kk.newSubway.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseTicketDTO {

    private Long userId;
    private int startStationId;
    private int endStationId;
}

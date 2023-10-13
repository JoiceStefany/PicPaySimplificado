package com.picpaysimplificado.DTOs;

import java.math.BigDecimal;

public record TransactionDto(BigDecimal value, Long senderId, Long receiverId) {
    
}

package com.agrosupport.api.profile.domain.model.commands;

import java.math.BigDecimal;

public record UpdateAdvisorCommand(Long id, BigDecimal rating) {
}

package com.sirius.koshelek.model.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data //todo getter setter manually...
@Schema
public class WalletResponse {

    @Schema(required = true)
    private final long id;

    @Schema(required = true)
    @NotBlank
    private final String name;

    @Schema(required = true)
    private final double limit;

    @Schema(required = true)
    private final double balance;

    @Schema(required = true)
    private final double income;

    @Schema(required = true)
    private final double outcome;

    @Schema(required = true)
    private final CurrencyResponse currency;

}

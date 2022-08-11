package com.sirius.koshelek.model.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Schema
@Data
public class AccountResponse {

    @Schema(required = true)
    private final long id;

    @Schema(required = true)
    private final long userId;

    @Schema(required = true)
    private final List<WalletResponse> wallets;

    @Schema(required = true)
    private final double balance;

    @Schema(required = true)
    private final double income;

    @Schema(required = true)
    private final double outcome;

}

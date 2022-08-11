package com.sirius.koshelek.model.request;

import com.sirius.koshelek.validator.ValidEmail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Schema
public class WalletRequest {

    @Schema(required = true)
    @NotBlank
    private final String name;

    @Schema(required = true)
    private final Integer currency;

    @Schema(required = true)
    @Min(value = 0, message = "Must be greater than zero")
    private final Double limit;

}

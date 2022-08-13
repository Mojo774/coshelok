package com.sirius.koshelek.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema
@Data
public class CurrencyRequest {

    @Schema(required = true)
    private final Long id;

    @Schema(required = true)
    private final String name;

    @Schema(required = true)
    private final String code;
}

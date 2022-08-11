package com.sirius.koshelek.model.response;

import com.sirius.koshelek.model.OperationType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema
public class OperationResponse {

    @Schema(required = true)
    private final long id;

    @Schema(required = true)
    private final OperationType type;

    @Schema(required = true)
    private final CategoryResponse category;

    @Schema(required = true)
    private final CurrencyResponse currency;

    @Schema(required = true)
    private final double value;

    @Schema(required = true)
    private final LocalDateTime date;

}

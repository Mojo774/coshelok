package com.sirius.koshelek.model.request;

import com.sirius.koshelek.model.OperationType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.Min;

@Data
@Schema
public class OperationRequest {

    @Schema(required = true)
    private final OperationType type;

    @Schema(required = true)
    private final Integer category;

    @Schema(required = true)
    private final Integer currency;

    @Schema(required = true)
    @Min(value = 0, message = "Must be greater than zero")
    private final Double sum;

    @Schema(required = true)
    private final String date;

}

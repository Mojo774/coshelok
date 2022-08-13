package com.sirius.koshelek.model.response;

import com.sirius.koshelek.model.OperationType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Schema
public class CategoryResponse {

    @Schema(required = true)
    @NotBlank
    private final String name;

    @Schema(required = true)
    private final OperationType type;

    @Schema(required = true)
    private final int icon;

    @Schema(required = true)
    private final int color;
}

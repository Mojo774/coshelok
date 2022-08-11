package com.sirius.koshelek.model.request;

import com.sirius.koshelek.model.OperationType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Schema
@Data
public class CategoryRequest {

    @Schema(required = true)
    private final String name;

    @Schema(required = true)
    private final OperationType type;

    @Schema(required = true)
    private final Integer icon;

    @Schema(required = true)
    private final Integer colour;

}

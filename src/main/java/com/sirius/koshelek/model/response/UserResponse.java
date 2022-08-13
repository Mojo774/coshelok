package com.sirius.koshelek.model.response;

import com.sirius.koshelek.validator.ValidEmail;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Schema
public class UserResponse {

    @Schema(required = true)
    private final long id;

    @Schema(required = true)
    @NotBlank
    private final String name;

    @Schema(required = true)
    @NotBlank
    @ValidEmail
    private final String login;
}

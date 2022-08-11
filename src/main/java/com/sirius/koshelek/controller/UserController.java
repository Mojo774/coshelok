package com.sirius.koshelek.controller;

import com.sirius.koshelek.model.request.UserRequest;
import com.sirius.koshelek.model.response.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequestMapping("/users")
@RestController()
@RequiredArgsConstructor
public class UserController {

    @Operation(summary = "Create user")
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public UserResponse getCurrencies(@Valid @RequestBody UserRequest user) {
        return null;
    }

}

package com.sirius.koshelek.controller;

import com.sirius.koshelek.model.response.AccountResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/accounts")
@RestController()
public class AccountController {

    @Operation(summary = "Get account by userId")
    @GetMapping(value = "/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountResponse getAccount(@PathVariable String userId) {
        return null;
    }

    @Operation(summary = "Get accounts")
    @GetMapping(value = "/{userId}/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountResponse getAccounts(@PathVariable String userId) {
        return null;
    }

}

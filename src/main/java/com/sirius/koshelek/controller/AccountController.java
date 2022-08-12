package com.sirius.koshelek.controller;

import com.sirius.koshelek.model.response.AccountResponse;
import com.sirius.koshelek.model.response.CurrencyResponse;
import com.sirius.koshelek.model.response.WalletResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/accounts")
@RestController()
public class AccountController {

    @Operation(summary = "Get account by userId")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public AccountResponse getAccount(@RequestHeader("login") String login) {
        return new AccountResponse(1, 2,
                List.of(
                        new WalletResponse(
                                2,
                                "ssss",
                                3,
                                4,
                                5,
                                6,
                                new CurrencyResponse(3, "рубль", "RUR")
                        )
                ),
                3, 2, 1);
    }

}

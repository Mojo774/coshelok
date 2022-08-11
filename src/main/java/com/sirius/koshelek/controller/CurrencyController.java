package com.sirius.koshelek.controller;

import com.sirius.koshelek.model.response.CurrencyResponse;
import com.sirius.koshelek.model.response.WalletResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/currencies")
@RestController()
@RequiredArgsConstructor
public class CurrencyController {

    @Operation(summary = "Get currencies")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CurrencyResponse> getCurrencies() {
        return List.of(new CurrencyResponse(1, "убль", "ub"));
    }

}

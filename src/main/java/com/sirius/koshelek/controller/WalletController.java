package com.sirius.koshelek.controller;

import com.sirius.koshelek.model.request.WalletRequest;
import com.sirius.koshelek.model.response.CurrencyResponse;
import com.sirius.koshelek.model.response.WalletResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/wallets")
@RestController()
@RequiredArgsConstructor
public class WalletController {

    @Operation(summary = "Get wallets")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<WalletResponse> getWallets(@RequestHeader("login") String login) {
        return List.of(
                new WalletResponse(1,
                        "wallet1",
                        100,
                        0,
                        0,
                        0,
                        new CurrencyResponse(1, "убль", "ub")));
    }

    @Operation(summary = "Create wallet")
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public WalletResponse createWallet(@Valid @RequestBody WalletRequest wallet) {
        return null;
    }

    @Operation(summary = "Change wallet")
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public WalletResponse changeWallet(@PathVariable String id, @Valid @RequestBody WalletRequest wallet) {
        return new WalletResponse(1,
                "wallet1",
                100,
                0,
                0,
                0,
                new CurrencyResponse(1, "убль", "ub"));
    }

    @Operation(summary = "Delete wallet")
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteWallet(@PathVariable String id) {
    }
}

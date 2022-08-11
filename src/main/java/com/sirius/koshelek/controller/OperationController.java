package com.sirius.koshelek.controller;

import com.sirius.koshelek.model.OperationType;
import com.sirius.koshelek.model.request.OperationRequest;
import com.sirius.koshelek.model.response.CategoryResponse;
import com.sirius.koshelek.model.response.CurrencyResponse;
import com.sirius.koshelek.model.response.OperationResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/operations")
@RestController()
@RequiredArgsConstructor
public class OperationController {

    @Operation(summary = "Get operations")
    @GetMapping(value = "/{walletId}/wallets", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OperationResponse> getOperations(@PathVariable String walletId) {
        return List.of(
                new OperationResponse(
                        1,
                        OperationType.INCOME,
                        new CategoryResponse("ff", OperationType.INCOME, 3, 3),
                        new CurrencyResponse(3, "рубль", "RUR"),
                        4,
                        LocalDateTime.MAX
                )
        );
    }

    @Operation(summary = "Get operation")
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public OperationResponse getOperation(@PathVariable String id) {
        return new OperationResponse(
                1,
                OperationType.INCOME,
                new CategoryResponse("ff", OperationType.INCOME, 3, 3),
                new CurrencyResponse(3, "рубль", "RUR"),
                4,
                LocalDateTime.MAX
        );
    }

    @Operation(summary = "Create operation")
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public OperationResponse createOperation(@Valid @RequestBody OperationRequest operation) {
        return new OperationResponse(
                1,
                OperationType.INCOME,
                new CategoryResponse("ff", OperationType.INCOME, 3, 3),
                new CurrencyResponse(3, "рубль", "RUR"),
                4,
                LocalDateTime.MAX
        );
    }

    @Operation(summary = "Change operation")
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public OperationResponse changeOperation(@Valid @RequestBody OperationRequest operation, @PathVariable String id) {
        return new OperationResponse(
                1,
                OperationType.INCOME,
                new CategoryResponse("ff", OperationType.INCOME, 3, 3),
                new CurrencyResponse(3, "рубль", "RUR"),
                4,
                LocalDateTime.MAX
        );
    }

    @Operation(summary = "Create operation")
    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteOperation(@PathVariable String id) {
    }

}

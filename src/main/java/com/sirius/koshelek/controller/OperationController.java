package com.sirius.koshelek.controller;

import com.sirius.koshelek.model.request.OperationRequest;
import com.sirius.koshelek.model.response.OperationResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/operations")
@RestController()
@RequiredArgsConstructor
public class OperationController {

    @Operation(summary = "Get operations")
    @GetMapping(value = "/{walletId}/wallets", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OperationResponse> getOperations(@PathVariable String walletId) {
        return null;
    }

    @Operation(summary = "Get operation")
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public OperationResponse getOperation(@PathVariable String id) {
        return null;
    }

    @Operation(summary = "Create operation")
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public OperationResponse createOperation(@Valid @RequestBody OperationRequest operation) {
        return null;
    }

    @Operation(summary = "Change operation")
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public OperationResponse changeOperation(@Valid @RequestBody OperationRequest operation, @PathVariable String id) {
        return null;
    }

    @Operation(summary = "Create operation")
    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteOperation(@PathVariable String id) {
    }

}

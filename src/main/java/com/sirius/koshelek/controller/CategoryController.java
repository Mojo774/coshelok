package com.sirius.koshelek.controller;

import com.sirius.koshelek.model.OperationType;
import com.sirius.koshelek.model.request.CategoryRequest;
import com.sirius.koshelek.model.response.CategoryResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/categories")
@RestController()
public class CategoryController {

    @Operation(summary = "Get categories")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CategoryResponse> getCurrencies(@RequestParam OperationType type) {
        return type == OperationType.INCOME ?
                List.of(new CategoryResponse("Salary", OperationType.INCOME, 1, 1)) :
                List.of(new CategoryResponse("Food", OperationType.OUTCOME, 2, 2));
    }

    @Operation(summary = "Create category")
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CategoryResponse createOperation(@Valid @RequestBody CategoryRequest category) {
        return new CategoryResponse("new Food", OperationType.OUTCOME, 2, 2);
    }

}

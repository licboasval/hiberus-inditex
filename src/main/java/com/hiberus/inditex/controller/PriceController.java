package com.hiberus.inditex.controller;

import com.hiberus.inditex.model.dto.PriceDTO;
import com.hiberus.inditex.model.dto.SearchFilterDTO;
import com.hiberus.inditex.model.h2.Price;
import com.hiberus.inditex.service.PriceService;
import com.hiberus.inditex.service.exception.InditexValidationException;
import com.hiberus.inditex.service.validators.InditexValidator;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/1.0/prices", produces = MediaType.APPLICATION_JSON_VALUE)
public class PriceController {

    private final PriceService priceService;
    private final InditexValidator inditexValidator;

    @Operation(summary = "Get product price",
            description = "Get product price by brand, product and date")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Succesfully obtained the product price"),
            @ApiResponse(responseCode = "400", description = "The filter parameters contain invalid values.", content = @Content),
            @ApiResponse(responseCode = "404", description = "The product doesn't exist.", content = @Content),
    })
    @PostMapping("/findProductPrice")
    public ResponseEntity<PriceDTO> findAllPrices(@RequestBody SearchFilterDTO searchFilterDTO) throws InditexValidationException {
        inditexValidator.assertProductPriceFilter(searchFilterDTO);
        return ResponseEntity.of(Optional.ofNullable(priceService.findProductPrice(searchFilterDTO)));
    }
}

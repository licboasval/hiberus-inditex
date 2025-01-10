package com.hiberus.inditex.service;

import com.hiberus.inditex.model.dto.PriceDTO;
import com.hiberus.inditex.model.dto.SearchFilterDTO;
import com.hiberus.inditex.model.h2.Price;
import com.hiberus.inditex.service.exception.InditexValidationException;

import java.util.List;

public interface PriceService {
    PriceDTO findProductPrice(SearchFilterDTO searchFilterDTO) throws InditexValidationException;
}

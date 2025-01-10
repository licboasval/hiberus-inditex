package com.hiberus.inditex.service;

import com.hiberus.inditex.model.dto.PriceDTO;
import com.hiberus.inditex.model.dto.SearchFilterDTO;
import com.hiberus.inditex.service.exception.InditexValidationException;


public interface PriceService {
    PriceDTO findProductPrice(SearchFilterDTO searchFilterDTO) throws InditexValidationException;
}

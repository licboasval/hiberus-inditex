package com.hiberus.inditex.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
public class SearchFilterDTO implements Serializable {

        @NotNull
        @Schema(description = "Brand identifier")
        private Long brandId;
        @NotNull
        @Schema(description = "Product identifier")
        private Long productId;
        @NotNull
        @Schema(description = "Date to search")
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
        private LocalDateTime date;
}

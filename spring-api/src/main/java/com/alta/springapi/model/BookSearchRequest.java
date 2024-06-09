package com.alta.springapi.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookSearchRequest {
    private String title;
    private String publisher;

    @NotNull
    private Integer page;

    @NotNull
    private Integer limit;
}

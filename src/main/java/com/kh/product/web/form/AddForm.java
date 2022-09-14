package com.kh.product.web.form;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data

public class AddForm {
    @NotBlank
    private String pname;
    @NotNull
    @Positive
    @Max(9999999999L)
    private Long count;
    @NotNull
    @Positive
    @Max(9999999999L)
    private Long price;
}

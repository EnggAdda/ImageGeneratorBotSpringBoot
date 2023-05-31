package com.example.imagegeneratorbotspringboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ImageRequest {

    private String prompt;
    private Integer n ;

    private String size;
}

package com.local.tom.tymeleafpractice.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
public class SampleDTO {

    private Long seq;

    private String first;

    private String last;

    private LocalDateTime regTime;


}

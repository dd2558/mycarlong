package com.mycarlong.mycarlongback.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
  public class ApiResponse {
    private boolean success;
    private String message;
}

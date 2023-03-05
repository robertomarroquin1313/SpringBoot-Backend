package com.datasoft.prueba.SpringBootBackenddatasoft.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorMessage {
    private String errorCode;
    private String message;
}

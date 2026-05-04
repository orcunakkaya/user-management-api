package com.orcunakkaya.usermanagementapi.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class ErrorResponse {

    private int status;
    private String message;
    private Map<String, String> errors;
}
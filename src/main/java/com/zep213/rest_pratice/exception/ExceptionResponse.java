package com.zep213.rest_pratice.exception;

import java.sql.Timestamp;
import java.util.Date;

public record ExceptionResponse(
        Date timestamp,
        String message,
        String details
){}

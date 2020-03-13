package com.crm.exception;

import com.crm.enums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrmException extends RuntimeException{
    private ExceptionEnums exceptionEnums;
}

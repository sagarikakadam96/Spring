package com.spring.dao;

import org.springframework.dao.DataIntegrityViolationException;


public class MyDuplicateKeyException extends DataIntegrityViolationException {
    public MyDuplicateKeyException(String msg) {
        super(msg);
    }

    public MyDuplicateKeyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

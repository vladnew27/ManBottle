package com.company.navatski.view;

import java.io.IOException;

public class InvalidInputException extends IOException {
    public InvalidInputException(String errorMessage) {
        super(errorMessage);
    }
}

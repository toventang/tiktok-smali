package com.google.i18n.phonenumbers;

import com.bytedance.covode.number.Covode;

public class NumberParseException extends Exception {
    private ErrorType errorType;
    private String message;

    static {
        Covode.recordClassIndex(34081);
    }

    public ErrorType getErrorType() {
        return this.errorType;
    }

    public String toString() {
        return "Error type: " + this.errorType + ". " + this.message;
    }

    public enum ErrorType {
        INVALID_COUNTRY_CODE,
        NOT_A_NUMBER,
        TOO_SHORT_AFTER_IDD,
        TOO_SHORT_NSN,
        TOO_LONG;

        static {
            Covode.recordClassIndex(34082);
        }
    }

    public NumberParseException(ErrorType errorType2, String str) {
        super(str);
        this.message = str;
        this.errorType = errorType2;
    }
}

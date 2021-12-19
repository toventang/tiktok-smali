package com.kakao.util.exception;

import com.bytedance.covode.number.Covode;

public class ParameterMissingException extends RuntimeException {
    private static final long serialVersionUID = -3069940750063668160L;

    static {
        Covode.recordClassIndex(34478);
    }

    public ParameterMissingException(Exception exc) {
        super(exc);
    }

    public ParameterMissingException(String str) {
        super(str);
    }
}

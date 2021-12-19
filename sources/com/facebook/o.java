package com.facebook;

import com.bytedance.covode.number.Covode;

public final class o extends j {
    private static final long serialVersionUID = 1;
    private final FacebookRequestError error;

    static {
        Covode.recordClassIndex(29523);
    }

    public final FacebookRequestError getRequestError() {
        return this.error;
    }

    @Override // com.facebook.j
    public final String toString() {
        return "{FacebookServiceException: httpResponseCode: " + this.error.f46525c + ", facebookErrorCode: " + this.error.f46526d + ", facebookErrorType: " + this.error.f46528f + ", message: " + this.error.a() + "}";
    }

    public o(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.error = facebookRequestError;
    }
}

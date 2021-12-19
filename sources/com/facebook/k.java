package com.facebook;

import com.bytedance.covode.number.Covode;

public final class k extends j {
    private final r graphResponse;

    static {
        Covode.recordClassIndex(29402);
    }

    public final r getGraphResponse() {
        return this.graphResponse;
    }

    @Override // com.facebook.j
    public final String toString() {
        FacebookRequestError facebookRequestError;
        r rVar = this.graphResponse;
        if (rVar != null) {
            facebookRequestError = rVar.f49019d;
        } else {
            facebookRequestError = null;
        }
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ").append(facebookRequestError.f46525c).append(", facebookErrorCode: ").append(facebookRequestError.f46526d).append(", facebookErrorType: ").append(facebookRequestError.f46528f).append(", message: ").append(facebookRequestError.a()).append("}");
        }
        return sb.toString();
    }

    public k(r rVar, String str) {
        super(str);
        this.graphResponse = rVar;
    }
}

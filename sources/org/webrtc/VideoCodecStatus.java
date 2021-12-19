package org.webrtc;

import com.bytedance.covode.number.Covode;

public enum VideoCodecStatus {
    NO_OUTPUT(2008),
    OK(0),
    ERROR(2004),
    LEVEL_EXCEEDED(2001),
    MEMORY(2004),
    ERR_PARAMETER(2001),
    ERR_SIZE(2001),
    TIMEOUT(2004),
    UNINITIALIZED(2003),
    FALLBACK_SOFTWARE(2009);
    
    private final int number;

    public final int getNumber() {
        return this.number;
    }

    static {
        Covode.recordClassIndex(106692);
    }

    private VideoCodecStatus(int i2) {
        this.number = i2;
    }
}

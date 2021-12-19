package com.bytedance.android.livesdkapi.h;

import com.bytedance.covode.number.Covode;

public enum d {
    UNKNOWN(0, ""),
    STRING(1, "string"),
    USER(11, "user"),
    GIFT(12, "gift"),
    HEART(13, "heart"),
    PATTERN_REF(14, "pref"),
    IMAGE(15, "image");
    
    private int pieceType;
    private String tag;

    public final int getPieceType() {
        return this.pieceType;
    }

    public final String getTag() {
        return this.tag;
    }

    static {
        Covode.recordClassIndex(13773);
    }

    private d(int i2, String str) {
        this.pieceType = i2;
        this.tag = str;
    }
}

package com.google.gson.c;

import com.bytedance.covode.number.Covode;

public enum b {
    BEGIN_ARRAY,
    END_ARRAY,
    BEGIN_OBJECT,
    END_OBJECT,
    NAME,
    STRING,
    NUMBER,
    BOOLEAN,
    NULL,
    END_DOCUMENT;

    static {
        Covode.recordClassIndex(33918);
    }
}

package com.facebook;

import com.bytedance.covode.number.Covode;

public enum s {
    GET,
    POST,
    DELETE;

    static {
        Covode.recordClassIndex(30636);
    }
}

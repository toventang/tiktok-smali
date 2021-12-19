package com.google.gson;

import com.bytedance.covode.number.Covode;

public enum u {
    DEFAULT {
        @Override // com.google.gson.u
        public final l serialize(Long l2) {
            return new r((Number) l2);
        }
    },
    STRING {
        @Override // com.google.gson.u
        public final l serialize(Long l2) {
            return new r(String.valueOf(l2));
        }
    };

    public abstract l serialize(Long l2);

    static {
        Covode.recordClassIndex(34066);
    }

    /* synthetic */ u(byte b2) {
        this();
    }
}

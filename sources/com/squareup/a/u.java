package com.squareup.a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

public enum u {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    private final String protocol;

    public final String toString() {
        return this.protocol;
    }

    static {
        Covode.recordClassIndex(36022);
    }

    public static u get(String str) {
        u uVar = HTTP_1_0;
        if (str.equals(uVar.protocol)) {
            return uVar;
        }
        u uVar2 = HTTP_1_1;
        if (str.equals(uVar2.protocol)) {
            return uVar2;
        }
        u uVar3 = HTTP_2;
        if (str.equals(uVar3.protocol)) {
            return uVar3;
        }
        u uVar4 = SPDY_3;
        if (str.equals(uVar4.protocol)) {
            return uVar4;
        }
        throw new IOException("Unexpected protocol: ".concat(String.valueOf(str)));
    }

    private u(String str) {
        this.protocol = str;
    }
}

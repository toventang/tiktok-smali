package com.ss.ugc.effectplatform.a.c;

import com.bytedance.covode.number.Covode;

public interface a {
    static {
        Covode.recordClassIndex(102312);
    }

    boolean available();

    void close();

    int read(byte[] bArr, int i2, int i3);
}

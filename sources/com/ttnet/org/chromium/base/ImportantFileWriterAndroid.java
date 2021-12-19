package com.ttnet.org.chromium.base;

import com.bytedance.covode.number.Covode;

public class ImportantFileWriterAndroid {
    static {
        Covode.recordClassIndex(103261);
    }

    private static native boolean nativeWriteFileAtomically(String str, byte[] bArr);
}

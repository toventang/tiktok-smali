package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;

public interface IRTCEncryptionHandler {
    static {
        Covode.recordClassIndex(100911);
    }

    byte[] onDecryptData(byte[] bArr);

    byte[] onEncryptData(byte[] bArr);
}

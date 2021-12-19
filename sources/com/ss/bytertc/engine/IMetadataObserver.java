package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public interface IMetadataObserver {
    static {
        Covode.recordClassIndex(100750);
    }

    void onMetadataReceived(byte[] bArr, String str, long j2);

    byte[] onReadyToSendMetadata(long j2);
}

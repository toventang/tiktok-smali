package com.ss.ttm.player;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.ss.ttm.player.MediaTransport;

public class NativeMediaTransport extends MediaTransport {
    static {
        Covode.recordClassIndex(101311);
    }

    private static boolean isNativeMediaTransport(MediaTransport mediaTransport) {
        return mediaTransport instanceof NativeMediaTransport;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.ttm.player.MediaTransport
    public void sendPacket(MediaTransport.MediaPacket mediaPacket) {
        throw new AndroidRuntimeException("Should not be here");
    }
}

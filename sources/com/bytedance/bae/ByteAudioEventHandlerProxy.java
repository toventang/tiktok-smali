package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public class ByteAudioEventHandlerProxy {
    public ByteAudioEventHandler handler;
    public long nativeHandlerPtr;

    static {
        Covode.recordClassIndex(15307);
    }

    public void setNativeHandler(long j2) {
        this.nativeHandlerPtr = j2;
    }

    public ByteAudioEventHandlerProxy(ByteAudioEventHandler byteAudioEventHandler) {
        this.handler = byteAudioEventHandler;
    }

    public void onByteAudioLogMessage(String str) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioLogMessage(str);
        }
    }

    public void onByteAudioDefaultDeviceChange(int i2, String str) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioDefaultDeviceChange(i2, str);
        }
    }

    public void onByteAudioEvent(int i2, int i3, String str) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioEvent(i2, i3, str);
        }
    }

    public void onByteAudioDeviceStateChange(String str, int i2, int i3, String str2) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioDeviceStateChange(str, i2, i3, str2);
        }
    }

    public void onByteAudioVolumeChanged(int i2, int i3, boolean z, boolean z2, String str) {
        ByteAudioEventHandler byteAudioEventHandler = this.handler;
        if (byteAudioEventHandler != null) {
            byteAudioEventHandler.onByteAudioVolumeChanged(i2, i3, z, z2, str);
        }
    }
}

package com.bytedance.bae;

import com.bytedance.covode.number.Covode;

public interface ByteAudioEventHandler {
    static {
        Covode.recordClassIndex(15306);
    }

    void onByteAudioDefaultDeviceChange(int i2, String str);

    void onByteAudioDeviceStateChange(String str, int i2, int i3, String str2);

    void onByteAudioEvent(int i2, int i3, String str);

    void onByteAudioLogMessage(String str);

    void onByteAudioVolumeChanged(int i2, int i3, boolean z, boolean z2, String str);
}

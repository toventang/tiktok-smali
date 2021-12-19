package org.libsdl.app;

import com.bytedance.covode.number.Covode;

public interface AudioRecorderInterface {
    static {
        Covode.recordClassIndex(106496);
    }

    int addPCMData(byte[] bArr, int i2, long j2);

    int closeWavFile(boolean z);

    int initWavFile(int i2, int i3, double d2);

    void lackPermission();

    void recordStatus(boolean z);
}

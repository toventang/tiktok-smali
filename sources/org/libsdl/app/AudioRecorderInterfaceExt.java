package org.libsdl.app;

import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.a.a;

public interface AudioRecorderInterfaceExt extends a.AbstractC1300a, AudioRecorderInterface {
    static {
        Covode.recordClassIndex(106497);
    }

    int initAudioConfig(int i2, int i3, int i4, int i5, int i6);

    @Override // com.ss.android.medialib.a.a.AbstractC1300a
    int onProcessData(byte[] bArr, int i2, long j2);

    void startMicError();
}

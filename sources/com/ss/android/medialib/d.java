package com.ss.android.medialib;

import com.bytedance.covode.number.Covode;

public interface d {
    static {
        Covode.recordClassIndex(36878);
    }

    void onMarkSetCodecConfig(byte[] bArr);

    void onMarkSwapGlBuffers();

    void onMarkWriteFile(byte[] bArr, int i2, int i3, int i4);

    void setColorFormatMark(int i2);
}

package com.ss.android.medialib;

import android.view.Surface;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public interface b {
    static {
        Covode.recordClassIndex(36861);
    }

    int getProfile();

    int onEncoderData(int i2, int i3, int i4, boolean z);

    void onEncoderData(byte[] bArr, int i2, boolean z);

    Surface onInitHardEncoder(int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8);

    void onSetCodecConfig(ByteBuffer byteBuffer);

    void onSwapGlBuffers();

    void onUninitHardEncoder();

    void onWriteFile(ByteBuffer byteBuffer, int i2, int i3, int i4);

    void onWriteFile(ByteBuffer byteBuffer, long j2, long j3, int i2, boolean z);

    void setColorFormat(int i2);
}

package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public interface ad {
    static {
        Covode.recordClassIndex(99263);
    }

    boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4);
}

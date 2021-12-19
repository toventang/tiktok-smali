package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public abstract class AudioProcessor extends NativeObject {
    static {
        Covode.recordClassIndex(101297);
    }

    public abstract void audioClose();

    public abstract void audioOpen(int i2, int i3, int i4, int i5);

    public abstract void audioProcess(ByteBuffer[] byteBufferArr, int i2, long j2);

    public abstract void audioRelease(int i2);
}

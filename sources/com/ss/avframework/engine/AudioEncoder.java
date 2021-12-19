package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.utils.TEBundle;
import java.nio.ByteBuffer;

public abstract class AudioEncoder extends NativeObject {
    static {
        Covode.recordClassIndex(99807);
    }

    public abstract int Encode(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2);

    public abstract boolean InitEncoder(TEBundle tEBundle);

    /* access modifiers changed from: protected */
    public native void nativeEncoded(ByteBuffer byteBuffer, int i2, int i3, long j2);

    @Override // com.ss.avframework.engine.NativeObject
    public void release() {
    }
}

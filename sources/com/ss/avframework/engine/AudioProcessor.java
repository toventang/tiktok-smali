package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import java.nio.Buffer;

public abstract class AudioProcessor extends NativeObject {
    static {
        Covode.recordClassIndex(99810);
    }

    /* access modifiers changed from: protected */
    public abstract Buffer process(Buffer buffer, int i2, int i3, int i4, long j2);
}

package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class AJMediaCodecFrame implements Cloneable {
    public ByteBuffer data;
    public int flags;
    public int index;
    public long pts = -269488145;
    public int size;

    static {
        Covode.recordClassIndex(101289);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public AJMediaCodecFrame clone() {
        try {
            return (AJMediaCodecFrame) super.clone();
        } catch (Throwable unused) {
            return null;
        }
    }
}

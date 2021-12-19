package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;

public abstract class VideoEncoderFactory extends NativeObject {
    static {
        Covode.recordClassIndex(99835);
    }

    public abstract VideoEncoder CreateVideoEncoder(String str, boolean z);

    public abstract String GetSupportedFormats();

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        super.release();
    }
}

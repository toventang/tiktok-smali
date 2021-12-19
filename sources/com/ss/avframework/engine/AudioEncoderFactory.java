package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;

public abstract class AudioEncoderFactory extends NativeObject {
    static {
        Covode.recordClassIndex(99808);
    }

    public abstract AudioEncoder CreateAudioEncoder(String str, boolean z);

    public abstract String GetSupportedFormats();
}

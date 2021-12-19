package com.bytedance.vcloud.abrmodule;

import com.bytedance.covode.number.Covode;

public interface IAudioStream extends IStream {
    static {
        Covode.recordClassIndex(28011);
    }

    int getSampleRate();
}

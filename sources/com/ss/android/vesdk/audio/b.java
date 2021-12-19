package com.ss.android.vesdk.audio;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

public interface b extends a {
    static {
        Covode.recordClassIndex(99290);
    }

    void setAudioCallback(d dVar);

    void setHandler(Handler handler);
}

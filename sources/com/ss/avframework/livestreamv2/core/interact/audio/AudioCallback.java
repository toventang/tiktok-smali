package com.ss.avframework.livestreamv2.core.interact.audio;

import com.bytedance.covode.number.Covode;
import java.nio.Buffer;

public interface AudioCallback {
    static {
        Covode.recordClassIndex(100233);
    }

    void onAudioWarning(String str);

    boolean updateAudioFrame(Buffer buffer, int i2, long j2);
}

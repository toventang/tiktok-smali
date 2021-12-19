package org.webrtc;

import com.bytedance.covode.number.Covode;

public interface NativeLibraryLoader {
    static {
        Covode.recordClassIndex(106634);
    }

    boolean load(String str);
}

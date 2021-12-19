package com.ss.avframework.mixer;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.utils.TEBundle;

public abstract class NativeMixer extends Mixer {
    static {
        Covode.recordClassIndex(100512);
    }

    private native float nativeAvgCostTimePerFrameMs(long j2);

    private native boolean nativeGetParameter(TEBundle tEBundle);

    private native boolean nativeSetParameter(TEBundle tEBundle);

    @Override // com.ss.avframework.mixer.Mixer
    public boolean isNativeMixer() {
        return true;
    }

    public float getAvgCostTimePerFrameMs() {
        return nativeAvgCostTimePerFrameMs(this.mNativeObj);
    }

    @Override // com.ss.avframework.mixer.Mixer
    public boolean getParameter(TEBundle tEBundle) {
        if (tEBundle != null) {
            return nativeGetParameter(tEBundle);
        }
        return false;
    }

    @Override // com.ss.avframework.mixer.Mixer
    public boolean setParameter(TEBundle tEBundle) {
        if (tEBundle != null) {
            return nativeSetParameter(tEBundle);
        }
        return false;
    }
}

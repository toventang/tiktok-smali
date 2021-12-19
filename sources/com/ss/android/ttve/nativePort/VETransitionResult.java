package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;

public class VETransitionResult {
    public int duration;
    public int transitionsType;

    static {
        Covode.recordClassIndex(37751);
    }

    public String toString() {
        return "TransitionResult{transitionsType=" + this.transitionsType + ", duration=" + this.duration + '}';
    }
}

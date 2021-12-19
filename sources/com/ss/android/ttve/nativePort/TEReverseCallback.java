package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;

public class TEReverseCallback {
    private VEListener.r listener;

    static {
        Covode.recordClassIndex(37729);
    }

    public void onProgressChanged(double d2) {
    }

    public void setListener(Object obj) {
        this.listener = (VEListener.r) obj;
    }
}

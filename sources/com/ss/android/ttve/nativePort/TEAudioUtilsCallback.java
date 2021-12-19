package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.aq;

public class TEAudioUtilsCallback {
    private aq listener;

    static {
        Covode.recordClassIndex(37714);
    }

    public void onProgressChanged(double d2) {
    }

    public void setListener(Object obj) {
        this.listener = (aq) obj;
    }
}

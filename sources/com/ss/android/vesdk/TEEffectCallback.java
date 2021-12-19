package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;

public class TEEffectCallback {
    private VEListener.VEEditorEffectListener listener;

    static {
        Covode.recordClassIndex(99085);
    }

    public void onDone(int i2, boolean z) {
    }

    public void setListener(Object obj) {
        this.listener = (VEListener.VEEditorEffectListener) obj;
    }
}

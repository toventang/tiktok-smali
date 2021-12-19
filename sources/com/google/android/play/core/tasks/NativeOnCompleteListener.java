package com.google.android.play.core.tasks;

import com.bytedance.covode.number.Covode;

public class NativeOnCompleteListener {
    static {
        Covode.recordClassIndex(32962);
    }

    public native void nativeOnComplete(long j2, int i2, Object obj, int i3);
}

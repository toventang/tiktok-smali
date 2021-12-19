package com.facebook.soloader;

import android.os.StrictMode;
import com.bytedance.covode.number.Covode;

public abstract class i {
    static {
        Covode.recordClassIndex(30769);
    }

    public abstract int a(String str, int i2, StrictMode.ThreadPolicy threadPolicy);

    /* access modifiers changed from: protected */
    public void a(int i2) {
    }

    public String toString() {
        return getClass().getName();
    }
}

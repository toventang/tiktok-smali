package com.ss.avframework.strategy;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.engine.NativeObject;

public class LiveAbstractStrategy extends NativeObject {
    static {
        Covode.recordClassIndex(100560);
    }

    public void onInfo(int i2, int i3, int i4) {
        throw new AndroidRuntimeException("BUG, impl it!!!");
    }
}

package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;

public abstract class MaskInfo extends NativeObject {
    static {
        Covode.recordClassIndex(101305);
    }

    /* access modifiers changed from: protected */
    public abstract void onMaskInfoCallback(int i2, int i3, String str);
}

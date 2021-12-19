package com.airbnb.epoxy;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

public abstract class AsyncEpoxyController extends n {
    static {
        Covode.recordClassIndex(2061);
    }

    public AsyncEpoxyController() {
        this(true);
    }

    public AsyncEpoxyController(boolean z) {
        this(z, z);
    }

    private static Handler getHandler(boolean z) {
        if (z) {
            return m.a();
        }
        return m.f5054a;
    }

    public AsyncEpoxyController(boolean z, boolean z2) {
        super(getHandler(z), getHandler(z2));
    }
}

package com.bytedance.ies.sdk.widgets;

import com.bytedance.covode.number.Covode;

public interface IRecyclableWidget {
    static {
        Covode.recordClassIndex(20708);
    }

    boolean isInitialized();

    void onInit(Object[] objArr);

    void onLoad(Object[] objArr);

    void onUnload();

    void resetInternal();
}

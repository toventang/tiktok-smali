package com.bytedance.ies.sdk.widgets;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

public interface NonNullObserver<T> extends u<T> {
    static {
        Covode.recordClassIndex(20721);
    }

    @Override // androidx.lifecycle.u
    void onChanged(T t);
}

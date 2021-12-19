package com.ss.android.ugc.aweme.im.sdk.common.data.a;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b<T> extends t<T> {
    static {
        Covode.recordClassIndex(65607);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final void postValue(T t) {
        if (!l.a((Object) getValue(), (Object) t)) {
            super.postValue(t);
        }
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final void setValue(T t) {
        if (!l.a((Object) getValue(), (Object) t)) {
            super.setValue(t);
        }
    }
}

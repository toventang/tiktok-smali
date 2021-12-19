package com.ss.android.ugc.aweme.arch.widgets.base;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a<T> extends c<T> {
    static {
        Covode.recordClassIndex(41300);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.c, androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final void postValue(T t) {
        if (!l.a((Object) getValue(), (Object) t)) {
            super.postValue(t);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.c, androidx.lifecycle.LiveData, androidx.lifecycle.t
    public final void setValue(T t) {
        if (!l.a((Object) getValue(), (Object) t)) {
            super.setValue(t);
        }
    }
}

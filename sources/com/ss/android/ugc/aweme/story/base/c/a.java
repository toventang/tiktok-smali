package com.ss.android.ugc.aweme.story.base.c;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(89458);
    }

    public static final <T> void b(LiveData<T> liveData, T t) {
        l.d(liveData, "");
        if ((liveData instanceof t) && liveData != null) {
            liveData.postValue(t);
        }
    }

    public static final <T> void a(LiveData<T> liveData, T t) {
        l.d(liveData, "");
        if (!(liveData instanceof t)) {
            liveData = null;
        }
        t tVar = (t) liveData;
        if (tVar != null) {
            tVar.setValue(t);
        }
    }
}

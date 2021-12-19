package com.ss.android.ugc.aweme.dependence.beauty.b;

import android.os.Looper;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(49433);
    }

    public static final <T> void a(t<T> tVar, T t) {
        l.d(tVar, "");
        if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
            tVar.setValue(t);
        } else {
            tVar.postValue(t);
        }
    }
}

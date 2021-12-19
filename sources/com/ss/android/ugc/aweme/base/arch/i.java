package com.ss.android.ugc.aweme.base.arch;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i implements ad.b {
    static {
        Covode.recordClassIndex(41877);
    }

    @Override // androidx.lifecycle.ad.b
    public final <T extends ac> T a(Class<T> cls) {
        l.d(cls, "");
        return cls.newInstance();
    }
}

package com.ss.android.ugc.aweme.commercialize.live.business.links.e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.live.business.links.d.a;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class c {
    static {
        Covode.recordClassIndex(46012);
    }

    public static final <T extends a> a a(Class<T> cls, b<? super Bundle, z> bVar) {
        l.d(cls, "");
        try {
            T newInstance = cls.newInstance();
            Bundle bundle = new Bundle();
            if (bVar != null) {
                bVar.invoke(bundle);
                newInstance.f74619a = bundle;
            }
            return newInstance;
        } catch (Throwable unused) {
            return null;
        }
    }
}

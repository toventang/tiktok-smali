package com.ss.android.ugc.aweme.commercialize.live.business.links.e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.live.business.links.d.c;
import com.ss.android.ugc.aweme.commercialize.live.business.links.d.d;
import com.ss.android.ugc.aweme.commercialize.live.business.links.d.e;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74621a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(46010);
    }

    public static com.ss.android.ugc.aweme.commercialize.live.business.links.d.a a(d dVar, b<? super Bundle, z> bVar) {
        l.d(dVar, "");
        int i2 = b.f74622a[dVar.ordinal()];
        if (i2 == 1) {
            return c.a(e.class, bVar);
        }
        if (i2 == 2) {
            return c.a(com.ss.android.ugc.aweme.commercialize.live.business.links.d.b.class, bVar);
        }
        if (i2 != 3) {
            return null;
        }
        return c.a(c.class, bVar);
    }
}

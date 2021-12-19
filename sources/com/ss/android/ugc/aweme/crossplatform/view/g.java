package com.ss.android.ugc.aweme.crossplatform.view;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    final List<f> f78974a = new ArrayList();

    public enum a {
        LOAD_START,
        LOAD_FINISH;

        static {
            Covode.recordClassIndex(49011);
        }
    }

    static {
        Covode.recordClassIndex(49010);
    }

    public final void a(f fVar) {
        l.d(fVar, "");
        this.f78974a.add(fVar);
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        int i2 = h.f78976a[aVar.ordinal()];
        if (i2 == 1) {
            Iterator<T> it = this.f78974a.iterator();
            while (it.hasNext()) {
                it.next().q();
            }
        } else if (i2 == 2) {
            Iterator<T> it2 = this.f78974a.iterator();
            while (it2.hasNext()) {
                it2.next().z();
            }
        }
    }
}

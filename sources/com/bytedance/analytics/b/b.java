package com.bytedance.analytics.b;

import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.Map;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Map f6554a;

    static {
        Covode.recordClassIndex(3152);
    }

    b(Map map) {
        this.f6554a = map;
    }

    public final void run() {
        Map map = this.f6554a;
        l.d(map, "");
        m<? super String, ? super Map<String, String>, z> mVar = a.f6553b;
        if (mVar != null) {
            mVar.invoke("btm_page_show", map);
        }
    }
}

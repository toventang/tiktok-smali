package com.bytedance.analytics.b;

import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.Map;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f6557a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f6558b;

    static {
        Covode.recordClassIndex(3154);
    }

    d(String str, Map map) {
        this.f6557a = str;
        this.f6558b = map;
    }

    public final void run() {
        String str = this.f6557a;
        Map map = this.f6558b;
        l.d(str, "");
        l.d(map, "");
        m<? super String, ? super Map<String, String>, z> mVar = a.f6553b;
        if (mVar != null) {
            mVar.invoke(str, map);
        }
    }
}

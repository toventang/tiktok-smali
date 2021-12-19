package com.bytedance.analytics.b;

import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap f6559a;

    static {
        Covode.recordClassIndex(3155);
    }

    public e(HashMap hashMap) {
        this.f6559a = hashMap;
    }

    public final void run() {
        HashMap hashMap = this.f6559a;
        l.d(hashMap, "");
        m<? super String, ? super Map<String, String>, z> mVar = a.f6553b;
        if (mVar != null) {
            mVar.invoke("activity", hashMap);
        }
    }
}

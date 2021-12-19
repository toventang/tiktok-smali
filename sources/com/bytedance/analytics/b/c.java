package com.bytedance.analytics.b;

import com.bytedance.covode.number.Covode;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f6555a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f6556b;

    static {
        Covode.recordClassIndex(3153);
    }

    public c(String str, HashMap hashMap) {
        this.f6555a = str;
        this.f6556b = hashMap;
    }

    public final void run() {
        String str = this.f6555a;
        HashMap hashMap = this.f6556b;
        l.d(str, "");
        l.d(hashMap, "");
        m<? super String, ? super Map<String, String>, z> mVar = a.f6553b;
        if (mVar != null) {
            mVar.invoke(str, hashMap);
        }
    }
}

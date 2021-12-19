package com.ss.android.newmedia.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.q;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.b.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a implements NetworkUtils.b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f59936a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f59937b = new Object();

    static {
        Covode.recordClassIndex(37043);
    }

    @Override // com.ss.android.common.util.NetworkUtils.b
    public final void a() {
        MethodCollector.i(7537);
        if (!"ActionReaper".equals(Thread.currentThread().getName())) {
            synchronized (this.f59937b) {
                try {
                    if (!this.f59936a) {
                        try {
                            Thread.sleep(1500);
                        } catch (Exception unused) {
                        }
                        this.f59936a = true;
                    }
                } finally {
                    MethodCollector.o(7537);
                }
            }
            return;
        }
        MethodCollector.o(7537);
    }

    @Override // com.ss.android.common.util.NetworkUtils.b
    public final String a(String str, boolean z) {
        return AppLog.addCommonParams(str, z);
    }

    @Override // com.ss.android.common.util.NetworkUtils.b
    public final void a(List<d> list, boolean z) {
        HashMap hashMap = new HashMap();
        q.b(hashMap, z);
        for (Map.Entry entry : hashMap.entrySet()) {
            list.add(new d((String) entry.getKey(), (String) entry.getValue()));
        }
    }
}

package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.c.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class cv {

    /* renamed from: a  reason: collision with root package name */
    final Map<BasePendingResult<?>, Boolean> f50204a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    final Map<i<?>, Boolean> f50205b = Collections.synchronizedMap(new WeakHashMap());

    static {
        Covode.recordClassIndex(31294);
    }

    public final void b() {
        a(false, f.f50222a);
    }

    public final void c() {
        a(true, bz.f50131a);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (!this.f50204a.isEmpty() || !this.f50205b.isEmpty()) {
            return true;
        }
        return false;
    }

    private final void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        MethodCollector.i(11418);
        synchronized (this.f50204a) {
            try {
                hashMap = new HashMap(this.f50204a);
            } finally {
                MethodCollector.o(11418);
            }
        }
        synchronized (this.f50205b) {
            try {
                hashMap2 = new HashMap(this.f50205b);
            } finally {
                MethodCollector.o(11418);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((i) entry2.getKey()).b((Exception) new e(status));
            }
        }
    }
}

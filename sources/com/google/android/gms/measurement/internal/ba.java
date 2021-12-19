package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

/* access modifiers changed from: package-private */
public final class ba implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f51348a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f51349b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a f51350c;

    static {
        Covode.recordClassIndex(32114);
    }

    public final void run() {
        a aVar = this.f51350c;
        String str = this.f51348a;
        long j2 = this.f51349b;
        aVar.c();
        r.a(str);
        if (aVar.f51320b.isEmpty()) {
            aVar.f51321c = j2;
        }
        Integer num = aVar.f51320b.get(str);
        if (num != null) {
            aVar.f51320b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (aVar.f51320b.size() >= 100) {
            aVar.q().f51471f.a("Too many ads visible");
        } else {
            aVar.f51320b.put(str, 1);
            aVar.f51319a.put(str, Long.valueOf(j2));
        }
    }

    ba(a aVar, String str, long j2) {
        this.f51350c = aVar;
        this.f51348a = str;
        this.f51349b = j2;
    }
}

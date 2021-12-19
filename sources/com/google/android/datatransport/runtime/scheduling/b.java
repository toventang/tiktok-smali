package com.google.android.datatransport.runtime.scheduling;

import com.a;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.h;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.k;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final a f49535a;

    /* renamed from: b  reason: collision with root package name */
    private final k f49536b;

    /* renamed from: c  reason: collision with root package name */
    private final h f49537c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.datatransport.runtime.h f49538d;

    static {
        Covode.recordClassIndex(30996);
    }

    b(a aVar, k kVar, h hVar, com.google.android.datatransport.runtime.h hVar2) {
        this.f49535a = aVar;
        this.f49536b = kVar;
        this.f49537c = hVar;
        this.f49538d = hVar2;
    }

    public final void run() {
        a aVar = this.f49535a;
        k kVar = this.f49536b;
        com.google.android.datatransport.runtime.h hVar = this.f49538d;
        try {
            m a2 = aVar.f49471c.a(kVar.a());
            if (a2 == null) {
                String a3 = a.a("Transport backend '%s' is not registered", new Object[]{kVar.a()});
                a.f49469a.warning(a3);
                new IllegalArgumentException(a3);
                return;
            }
            aVar.f49473e.a(new c(aVar, kVar, a2.a(hVar)));
        } catch (Exception e2) {
            a.f49469a.warning("Error scheduling event " + e2.getMessage());
        }
    }
}

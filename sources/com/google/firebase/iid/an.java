package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.c.c;
import com.google.android.gms.c.h;
import java.util.concurrent.ScheduledFuture;

/* access modifiers changed from: package-private */
public final /* synthetic */ class an implements c {

    /* renamed from: a  reason: collision with root package name */
    private final aj f54415a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54416b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledFuture f54417c;

    static {
        Covode.recordClassIndex(33783);
    }

    an(aj ajVar, String str, ScheduledFuture scheduledFuture) {
        this.f54415a = ajVar;
        this.f54416b = str;
        this.f54417c = scheduledFuture;
    }

    @Override // com.google.android.gms.c.c
    public final void a(h hVar) {
        MethodCollector.i(12015);
        aj ajVar = this.f54415a;
        String str = this.f54416b;
        ScheduledFuture scheduledFuture = this.f54417c;
        synchronized (ajVar.f54403a) {
            try {
                ajVar.f54403a.remove(str);
            } catch (Throwable th) {
                MethodCollector.o(12015);
                throw th;
            }
        }
        scheduledFuture.cancel(false);
        MethodCollector.o(12015);
    }
}

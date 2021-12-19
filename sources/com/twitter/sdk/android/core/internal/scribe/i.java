package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.twitter.sdk.android.core.internal.g;
import java.util.concurrent.ScheduledExecutorService;

public abstract class i<T> implements n {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f156083a;

    /* renamed from: b  reason: collision with root package name */
    protected final ScheduledExecutorService f156084b;

    /* renamed from: c  reason: collision with root package name */
    protected o<T> f156085c;

    static {
        Covode.recordClassIndex(103684);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        try {
            this.f156085c.a();
        } catch (Exception unused) {
            g.b(this.f156083a, "Failed to send events files.");
        }
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.n
    public final void a() {
        a((Runnable) new k(this));
    }

    private void a(Runnable runnable) {
        try {
            this.f156084b.submit(runnable);
        } catch (Exception unused) {
            g.b(this.f156083a, "Failed to submit events task");
        }
    }

    public final void a(T t) {
        a((Runnable) new j(this, t));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, boolean z) {
        try {
            this.f156085c.a(obj);
            if (z) {
                this.f156085c.c();
            }
        } catch (Exception unused) {
            g.b(this.f156083a, "Failed to record event.");
        }
    }

    public i(Context context, o<T> oVar, g gVar, ScheduledExecutorService scheduledExecutorService) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f156083a = applicationContext;
        this.f156084b = scheduledExecutorService;
        this.f156085c = oVar;
        gVar.a((n) this);
    }
}

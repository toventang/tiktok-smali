package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.a;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.g;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class c<T> implements o<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final Context f156055a;

    /* renamed from: b  reason: collision with root package name */
    protected final g<T> f156056b;

    /* renamed from: c  reason: collision with root package name */
    final ScheduledExecutorService f156057c;

    /* renamed from: d  reason: collision with root package name */
    final AtomicReference<ScheduledFuture<?>> f156058d;

    /* renamed from: e  reason: collision with root package name */
    public volatile int f156059e = -1;

    static {
        Covode.recordClassIndex(103676);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.p
    public final boolean c() {
        try {
            return this.f156056b.a();
        } catch (IOException unused) {
            g.b(this.f156055a, "Failed to roll file over.");
            return false;
        }
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.p
    public final void b() {
        if (this.f156058d.get() != null) {
            g.a(this.f156055a, "Cancelling time-based rollover because no events are currently being generated.");
            this.f156058d.get().cancel(false);
            this.f156058d.set(null);
        }
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.l
    public final void a() {
        q d2 = d();
        if (d2 == null) {
            g.a(this.f156055a, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        g.a(this.f156055a, "Sending all files");
        List<File> c2 = this.f156056b.c();
        int i2 = 0;
        while (c2.size() > 0) {
            try {
                g.a(this.f156055a, a.a(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(c2.size())}));
                if (!d2.a(c2)) {
                    break;
                }
                i2 += c2.size();
                this.f156056b.a(c2);
                c2 = this.f156056b.c();
            } catch (Exception e2) {
                g.b(this.f156055a, "Failed to send batch of analytics files to server: " + e2.getMessage());
            }
        }
        if (i2 == 0) {
            this.f156056b.d();
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        this.f156059e = i2;
        a(0, (long) this.f156059e);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.l
    public final void a(T t) {
        g.a(this.f156055a, t.toString());
        try {
            this.f156056b.a((Object) t);
        } catch (IOException unused) {
            g.b(this.f156055a, "Failed to write event.");
        }
        if (this.f156059e != -1) {
            a((long) this.f156059e, (long) this.f156059e);
        }
    }

    private void a(long j2, long j3) {
        if (this.f156058d.get() == null) {
            ac acVar = new ac(this.f156055a, this);
            g.a(this.f156055a, "Scheduling time based file roll over every " + j3 + " seconds");
            try {
                this.f156058d.set(this.f156057c.scheduleAtFixedRate(acVar, j2, j3, TimeUnit.SECONDS));
            } catch (RejectedExecutionException unused) {
                g.b(this.f156055a, "Failed to schedule time based file roll over");
            }
        }
    }

    public c(Context context, ScheduledExecutorService scheduledExecutorService, g<T> gVar) {
        this.f156055a = context;
        this.f156057c = scheduledExecutorService;
        this.f156056b = gVar;
        this.f156058d = new AtomicReference<>();
    }
}

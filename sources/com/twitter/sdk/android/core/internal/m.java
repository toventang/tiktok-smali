package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.twitter.sdk.android.core.i;
import com.twitter.sdk.android.core.j;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;

public final class m<T extends i> {

    /* renamed from: a  reason: collision with root package name */
    protected final a f155984a;

    /* renamed from: b  reason: collision with root package name */
    private final p f155985b;

    /* renamed from: c  reason: collision with root package name */
    private final j<T> f155986c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f155987d;

    /* renamed from: e  reason: collision with root package name */
    private final o f155988e;

    static {
        Covode.recordClassIndex(103639);
    }

    public final void a() {
        T a2 = this.f155986c.a();
        long currentTimeMillis = System.currentTimeMillis();
        if (a2 != null && this.f155984a.a(currentTimeMillis)) {
            this.f155987d.submit(new n(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        for (T t : this.f155986c.b().values()) {
            this.f155988e.a(t);
        }
        this.f155984a.b(System.currentTimeMillis());
    }

    /* access modifiers changed from: protected */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f155990a;

        /* renamed from: b  reason: collision with root package name */
        public long f155991b;

        /* renamed from: c  reason: collision with root package name */
        private final Calendar f155992c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        static {
            Covode.recordClassIndex(103641);
        }

        public final synchronized void b(long j2) {
            MethodCollector.i(13739);
            this.f155990a = false;
            this.f155991b = j2;
            MethodCollector.o(13739);
        }

        public final synchronized boolean a(long j2) {
            boolean z;
            boolean z2;
            MethodCollector.i(13738);
            long j3 = this.f155991b;
            if (j2 - j3 > 21600000) {
                z = true;
            } else {
                z = false;
            }
            this.f155992c.setTimeInMillis(j2);
            int i2 = this.f155992c.get(6);
            int i3 = this.f155992c.get(1);
            this.f155992c.setTimeInMillis(j3);
            int i4 = this.f155992c.get(6);
            int i5 = this.f155992c.get(1);
            if (i2 == i4 && i3 == i5) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.f155990a || (!z && !z2)) {
                MethodCollector.o(13738);
                return false;
            }
            this.f155990a = true;
            MethodCollector.o(13738);
            return true;
        }
    }

    public m(j<T> jVar, ExecutorService executorService, o<T> oVar) {
        this(jVar, new p(), executorService, new a(), oVar);
    }

    private m(j<T> jVar, p pVar, ExecutorService executorService, a aVar, o oVar) {
        this.f155985b = pVar;
        this.f155986c = jVar;
        this.f155987d = executorService;
        this.f155984a = aVar;
        this.f155988e = oVar;
    }
}

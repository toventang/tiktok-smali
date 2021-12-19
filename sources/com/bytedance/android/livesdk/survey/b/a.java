package com.bytedance.android.livesdk.survey.b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import h.z;
import java.util.concurrent.TimeUnit;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21514a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.a<z> f21515b;

    /* renamed from: c  reason: collision with root package name */
    private long f21516c;

    /* renamed from: d  reason: collision with root package name */
    private long f21517d;

    /* renamed from: e  reason: collision with root package name */
    private long f21518e;

    /* renamed from: f  reason: collision with root package name */
    private long f21519f;

    /* renamed from: g  reason: collision with root package name */
    private f.a.b.b f21520g;

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f21522a = new b();

        static {
            Covode.recordClassIndex(12662);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12660);
    }

    /* access modifiers changed from: package-private */
    public static final class c implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21523a;

        static {
            Covode.recordClassIndex(12663);
        }

        c(a aVar) {
            this.f21523a = aVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f21523a.f21514a = false;
        }
    }

    public final void b() {
        this.f21518e = SystemClock.uptimeMillis();
        this.f21514a = false;
        f.a.b.b bVar = this.f21520g;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final void c() {
        f.a.b.b bVar = this.f21520g;
        if (bVar != null) {
            bVar.dispose();
        }
        this.f21517d = 0;
        this.f21518e = 0;
        this.f21519f = 0;
        this.f21514a = false;
    }

    public final void a() {
        if (this.f21516c > 0) {
            if (this.f21514a) {
                c();
            }
            long j2 = this.f21518e;
            if (j2 != 0) {
                this.f21519f += j2 - this.f21517d;
                this.f21518e = 0;
            }
            this.f21517d = SystemClock.uptimeMillis();
            b(this.f21516c - this.f21519f);
            this.f21514a = true;
        }
    }

    public final long d() {
        long j2;
        long j3;
        long j4;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f21514a) {
            j2 = this.f21516c;
            j3 = uptimeMillis - this.f21517d;
            j4 = this.f21519f;
        } else {
            long j5 = this.f21518e;
            if (j5 == 0) {
                return this.f21516c - this.f21519f;
            }
            j2 = this.f21516c;
            j3 = j5 - this.f21517d;
            j4 = this.f21519f;
        }
        return j2 - (j3 + j4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.b.a$a  reason: collision with other inner class name */
    public static final class C0470a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f21521a;

        static {
            Covode.recordClassIndex(12661);
        }

        C0470a(a aVar) {
            this.f21521a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f21521a.f21515b.invoke();
        }
    }

    private final void b(long j2) {
        f.a.b.b bVar = this.f21520g;
        if (bVar != null) {
            bVar.dispose();
        }
        if (j2 > 0) {
            this.f21520g = t.b(j2, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C0470a(this), b.f21522a, new c(this));
        }
    }

    public final void a(long j2) {
        this.f21516c = TimeUnit.SECONDS.toMillis(j2);
        if (this.f21514a) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j3 = this.f21519f + (uptimeMillis - this.f21517d);
            this.f21519f = j3;
            this.f21517d = uptimeMillis;
            b(this.f21516c - j3);
        }
    }

    public a(long j2, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f21515b = aVar;
        this.f21516c = TimeUnit.SECONDS.toMillis(j2);
    }
}

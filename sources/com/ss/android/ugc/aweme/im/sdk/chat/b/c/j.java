package com.ss.android.ugc.aweme.im.sdk.chat.b.c;

import com.bytedance.covode.number.Covode;

public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f100217c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f100218a;

    /* renamed from: b  reason: collision with root package name */
    public long f100219b;

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<Long> f100220d;

    static {
        Covode.recordClassIndex(63881);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63883);
        }

        private a() {
        }

        public static j a() {
            j jVar = new j();
            jVar.a();
            return jVar;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ j() {
        this(AnonymousClass1.f100221a);
    }

    public final long c() {
        return this.f100219b - this.f100218a;
    }

    public final void a() {
        this.f100218a = this.f100220d.invoke().longValue();
    }

    public final void b() {
        this.f100219b = this.f100220d.invoke().longValue();
    }

    public final boolean d() {
        if (this.f100218a <= 0 || this.f100219b != 0) {
            return false;
        }
        return true;
    }

    private j(h.f.a.a<Long> aVar) {
        this.f100220d = aVar;
    }
}

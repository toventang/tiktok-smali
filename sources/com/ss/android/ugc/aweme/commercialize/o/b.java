package com.ss.android.ugc.aweme.commercialize.o;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f74920a;

    /* renamed from: b  reason: collision with root package name */
    public int f74921b;

    /* renamed from: c  reason: collision with root package name */
    public long f74922c;

    /* renamed from: d  reason: collision with root package name */
    public final int f74923d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f74924e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f74925f;

    static {
        Covode.recordClassIndex(46199);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f74926a = 1;

        /* renamed from: b  reason: collision with root package name */
        private int f74927b;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f74928c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f74929d;

        static {
            Covode.recordClassIndex(46200);
        }

        public final b a() {
            long j2 = this.f74926a;
            int i2 = this.f74927b;
            Runnable runnable = this.f74928c;
            if (runnable == null) {
                l.a("callback");
            }
            return new b(j2, i2, runnable, this.f74929d, (byte) 0);
        }

        public final a a(int i2) {
            this.f74927b = i2;
            return this;
        }

        public final a a(boolean z) {
            this.f74929d = z;
            return this;
        }

        public final a a(Runnable runnable) {
            l.d(runnable, "");
            this.f74928c = runnable;
            return this;
        }

        public final a a(long j2) {
            if (j2 > 0) {
                if (j2 <= 0) {
                    j2 = 1;
                }
                this.f74926a = j2;
                return this;
            }
            throw new IllegalArgumentException("Invalid video duration ".concat(String.valueOf(j2)));
        }
    }

    private b(long j2, int i2, Runnable runnable, boolean z) {
        this.f74922c = j2;
        this.f74923d = i2;
        this.f74924e = runnable;
        this.f74925f = z;
        this.f74920a = (int) (((long) i2) / j2);
        this.f74921b = (int) (((long) i2) % j2);
    }

    public /* synthetic */ b(long j2, int i2, Runnable runnable, boolean z, byte b2) {
        this(j2, i2, runnable, z);
    }
}

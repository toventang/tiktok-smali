package com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2125a f87822a = new C2125a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private long f87823b;

    /* renamed from: c  reason: collision with root package name */
    private long f87824c;

    /* renamed from: d  reason: collision with root package name */
    private int f87825d;

    static {
        Covode.recordClassIndex(55228);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.a$a  reason: collision with other inner class name */
    public static final class C2125a {
        static {
            Covode.recordClassIndex(55229);
        }

        private C2125a() {
        }

        public /* synthetic */ C2125a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f87826a = new b();

        static {
            Covode.recordClassIndex(55230);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    public final boolean a() {
        if (this.f87825d == 1) {
            return true;
        }
        return false;
    }

    public final long c() {
        return this.f87824c - SystemClock.elapsedRealtime();
    }

    public final boolean b() {
        if (this.f87825d == 2) {
            return true;
        }
        return false;
    }

    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f87823b;
        if (elapsedRealtime >= j2) {
            long j3 = this.f87824c;
            if (j2 <= elapsedRealtime && j3 > elapsedRealtime) {
                if (this.f87825d != 2) {
                    this.f87825d = 2;
                    aVar.invoke();
                }
            } else if (elapsedRealtime >= j3 && this.f87825d != 3) {
                this.f87825d = 3;
                aVar.invoke();
            }
        } else if (this.f87825d != 1) {
            this.f87825d = 1;
            aVar.invoke();
        }
    }

    public a(long j2, long j3, long j4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f87823b = (j3 - j2) + elapsedRealtime;
        this.f87824c = (j4 - j2) + elapsedRealtime;
        a(b.f87826a);
    }
}

package com.ss.ugc.live.a.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.a.a.a.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final b f154025a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.ugc.live.a.a.d.a f154026b;

    /* renamed from: c  reason: collision with root package name */
    public final int f154027c;

    /* renamed from: d  reason: collision with root package name */
    public final int f154028d;

    /* renamed from: e  reason: collision with root package name */
    public final int f154029e;

    /* renamed from: f  reason: collision with root package name */
    public final long f154030f;

    /* renamed from: g  reason: collision with root package name */
    private final int f154031g;

    static {
        Covode.recordClassIndex(102717);
    }

    public final int a() {
        return this.f154031g * 1000;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b f154033a;

        /* renamed from: b  reason: collision with root package name */
        public com.ss.ugc.live.a.a.d.a f154034b;

        /* renamed from: c  reason: collision with root package name */
        public int f154035c = 2;

        /* renamed from: d  reason: collision with root package name */
        public int f154036d = 5;

        /* renamed from: e  reason: collision with root package name */
        public int f154037e = 3;

        /* renamed from: f  reason: collision with root package name */
        public int f154038f;

        /* renamed from: g  reason: collision with root package name */
        public long f154039g = 600000;

        /* renamed from: h  reason: collision with root package name */
        private final Context f154040h;

        static {
            Covode.recordClassIndex(102718);
        }

        public final e a() {
            if (this.f154033a == null) {
                this.f154033a = new com.ss.ugc.live.a.a.a.a(this.f154040h);
            }
            if (this.f154034b == null) {
                this.f154034b = new com.ss.ugc.live.a.a.d.e();
            }
            return new e(this, (byte) 0);
        }

        public a(Context context) {
            this.f154040h = context;
        }
    }

    private e(a aVar) {
        this.f154025a = aVar.f154033a;
        this.f154026b = aVar.f154034b;
        this.f154027c = aVar.f154035c;
        this.f154031g = aVar.f154036d;
        this.f154028d = aVar.f154037e;
        this.f154030f = aVar.f154039g;
        this.f154029e = aVar.f154038f;
    }

    /* synthetic */ e(a aVar, byte b2) {
        this(aVar);
    }
}

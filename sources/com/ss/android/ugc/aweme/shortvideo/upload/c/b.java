package com.ss.android.ugc.aweme.shortvideo.upload.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.o;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.upload.ac;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.hn;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.TimeUnit;

public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final a f132095h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final o f132096a = o.a(hn.f143067b);

    /* renamed from: b  reason: collision with root package name */
    public long f132097b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f132098c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f132099d;

    /* renamed from: e  reason: collision with root package name */
    public long f132100e = -1;

    /* renamed from: f  reason: collision with root package name */
    public long f132101f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f132102g;

    /* renamed from: i  reason: collision with root package name */
    private final h f132103i = i.a((h.f.a.a) C3429b.f132105a);

    /* renamed from: j  reason: collision with root package name */
    private final h f132104j = i.a((h.f.a.a) c.f132106a);

    static {
        Covode.recordClassIndex(86528);
    }

    public final o a() {
        return (o) this.f132103i.getValue();
    }

    public final ac b() {
        return (ac) this.f132104j.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86529);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.b$b  reason: collision with other inner class name */
    static final class C3429b extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3429b f132105a = new C3429b();

        static {
            Covode.recordClassIndex(86530);
        }

        C3429b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return o.a(hn.f143067b);
        }
    }

    static final class c extends m implements h.f.a.a<ac> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f132106a = new c();

        static {
            Covode.recordClassIndex(86531);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ac invoke() {
            return new ac();
        }
    }

    public final boolean c() {
        if (this.f132098c != -1) {
            return true;
        }
        return false;
    }

    public final long d() {
        return a().a(TimeUnit.MILLISECONDS);
    }

    public static void a(String str) {
        String concat = "PublishPerformanceRecorder : ".concat(String.valueOf(str));
        g.a();
        bj.b(concat);
    }

    public final void a(int i2) {
        if (!a().f53699a) {
            a("repeat endSynthetic");
            return;
        }
        a().c();
        this.f132098c = System.currentTimeMillis();
        this.f132099d = i2;
    }
}

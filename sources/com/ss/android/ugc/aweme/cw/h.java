package com.ss.android.ugc.aweme.cw;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f79151a;

    /* renamed from: b  reason: collision with root package name */
    public final List<o> f79152b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f79153c;

    /* renamed from: d  reason: collision with root package name */
    public final long f79154d;

    /* renamed from: e  reason: collision with root package name */
    public final long f79155e;

    /* renamed from: f  reason: collision with root package name */
    public final long f79156f;

    static {
        Covode.recordClassIndex(49126);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f79157a;

        /* renamed from: b  reason: collision with root package name */
        public List<o> f79158b;

        /* renamed from: c  reason: collision with root package name */
        public List<String> f79159c;

        /* renamed from: d  reason: collision with root package name */
        public long f79160d;

        /* renamed from: e  reason: collision with root package name */
        public long f79161e;

        /* renamed from: f  reason: collision with root package name */
        public long f79162f;

        static {
            Covode.recordClassIndex(49127);
        }

        public final h a() {
            return new h(this, (byte) 0);
        }

        private a() {
            this.f79158b = (List) h.a(Collections.emptyList());
            this.f79159c = (List) h.a(Collections.emptyList());
            this.f79160d = TimeUnit.MINUTES.toMillis(5);
            this.f79161e = TimeUnit.MINUTES.toMillis(5);
            this.f79162f = TimeUnit.MINUTES.toMillis(15);
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static a a() {
        return new a((byte) 0);
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        IllegalStateException illegalStateException = new IllegalStateException("should not be null!");
        illegalStateException.printStackTrace();
        throw illegalStateException;
    }

    public static long a(long j2) {
        if (j2 != 0) {
            return j2;
        }
        IllegalStateException illegalStateException = new IllegalStateException("should not be zero!");
        illegalStateException.printStackTrace();
        throw illegalStateException;
    }

    private h(a aVar) {
        this.f79151a = aVar.f79157a;
        this.f79152b = (List) a(aVar.f79158b);
        this.f79153c = (List) a(aVar.f79159c);
        this.f79154d = a(aVar.f79160d);
        this.f79155e = a(aVar.f79161e);
        this.f79156f = a(aVar.f79162f);
    }

    /* synthetic */ h(a aVar, byte b2) {
        this(aVar);
    }
}

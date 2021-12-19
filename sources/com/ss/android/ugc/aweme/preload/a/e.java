package com.ss.android.ugc.aweme.preload.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class e {

    /* renamed from: f  reason: collision with root package name */
    public static final b f115754f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f115755a;

    /* renamed from: b  reason: collision with root package name */
    public int f115756b;

    /* renamed from: c  reason: collision with root package name */
    public int f115757c;

    /* renamed from: d  reason: collision with root package name */
    public long f115758d;

    /* renamed from: e  reason: collision with root package name */
    public Aweme f115759e;

    static {
        Covode.recordClassIndex(74684);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(74686);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        public static e a(String str) {
            a aVar = new a();
            aVar.f115760a = str;
            aVar.f115761b = -1;
            aVar.f115762c = 7;
            aVar.f115763d = System.currentTimeMillis();
            return aVar.a();
        }

        public static e a(String str, int i2) {
            a aVar = new a();
            aVar.f115760a = str;
            aVar.f115761b = i2;
            aVar.f115762c = 5;
            aVar.f115763d = System.currentTimeMillis();
            return aVar.a();
        }
    }

    public e() {
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f115760a;

        /* renamed from: b  reason: collision with root package name */
        public int f115761b;

        /* renamed from: c  reason: collision with root package name */
        public int f115762c;

        /* renamed from: d  reason: collision with root package name */
        public long f115763d;

        /* renamed from: e  reason: collision with root package name */
        public Aweme f115764e;

        static {
            Covode.recordClassIndex(74685);
        }

        public final e a() {
            return new e(this);
        }
    }

    public final int hashCode() {
        int i2;
        String str = this.f115755a;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return (i2 * 31) + this.f115757c;
    }

    public final String toString() {
        return "RxTaskInfo{name=" + this.f115755a + ", strategy=" + this.f115756b + ", priority=" + this.f115757c + ", time=" + this.f115758d + "}";
    }

    public e(a aVar) {
        l.d(aVar, "");
        this.f115755a = aVar.f115760a;
        this.f115756b = aVar.f115761b;
        this.f115757c = aVar.f115762c;
        this.f115758d = aVar.f115763d;
        this.f115759e = aVar.f115764e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (true ^ l.a(getClass(), obj.getClass()))) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f115757c != eVar.f115757c) {
            return false;
        }
        return l.a((Object) this.f115755a, (Object) eVar.f115755a);
    }
}

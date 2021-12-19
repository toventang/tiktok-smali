package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final String f132140a;

    /* renamed from: b  reason: collision with root package name */
    public final t f132141b;

    /* renamed from: c  reason: collision with root package name */
    public float f132142c;

    /* renamed from: d  reason: collision with root package name */
    public float f132143d;

    /* renamed from: e  reason: collision with root package name */
    public float f132144e;

    /* renamed from: f  reason: collision with root package name */
    public float f132145f;

    /* renamed from: g  reason: collision with root package name */
    public String f132146g;

    /* renamed from: h  reason: collision with root package name */
    public String f132147h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f132148i;

    static {
        Covode.recordClassIndex(86554);
    }

    public final a a() {
        if (!this.f132148i) {
            return null;
        }
        float f2 = this.f132142c;
        return new a(f2, f2 - this.f132144e, toString());
    }

    public final String toString() {
        return "Record(creationId='" + this.f132140a + "', type=" + this.f132141b + ", initMB=" + this.f132142c + ", beforeCompileMB=" + this.f132143d + ", afterCompileMB=" + this.f132144e + ", compileFileMB=" + this.f132145f + ')';
    }

    public final void a(String str) {
        l.d(str, "");
        this.f132146g = str;
    }

    public final void b(String str) {
        l.d(str, "");
        this.f132147h = str;
    }

    public /* synthetic */ u(String str, t tVar) {
        this(str, tVar, "", "");
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final float f132149a;

        /* renamed from: b  reason: collision with root package name */
        public final float f132150b;

        /* renamed from: c  reason: collision with root package name */
        public final String f132151c;

        static {
            Covode.recordClassIndex(86555);
        }

        public a(float f2, float f3, String str) {
            l.d(str, "");
            this.f132149a = f2;
            this.f132150b = f3;
            this.f132151c = str;
        }
    }

    private u(String str, t tVar, String str2, String str3) {
        l.d(str, "");
        l.d(tVar, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f132140a = str;
        this.f132141b = tVar;
        this.f132142c = 0.0f;
        this.f132143d = 0.0f;
        this.f132144e = 0.0f;
        this.f132145f = 0.0f;
        this.f132146g = str2;
        this.f132147h = str3;
        this.f132148i = true;
    }
}

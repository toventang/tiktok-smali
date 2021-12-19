package com.bytedance.android.livesdkapi.depend.model;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class a {
    public static final C0504a H = new C0504a((byte) 0);
    @com.google.gson.a.c(a = "extra")
    public String A;
    public String B;
    public boolean C;
    public boolean D;
    public String E;
    public d F;
    public c G = new c();
    private String I = "";
    @com.google.gson.a.c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public long f22995a;

    /* renamed from: b  reason: collision with root package name */
    public String f22996b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f22997c = "";
    @com.google.gson.a.c(a = "icon_url")

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.base.model.b f22998d;
    @com.google.gson.a.c(a = StringSet.name)

    /* renamed from: e  reason: collision with root package name */
    public String f22999e;

    /* renamed from: f  reason: collision with root package name */
    public String f23000f;

    /* renamed from: g  reason: collision with root package name */
    public String f23001g = "";

    /* renamed from: h  reason: collision with root package name */
    public int f23002h;
    @com.google.gson.a.c(a = "tags")

    /* renamed from: i  reason: collision with root package name */
    public List<String> f23003i;
    @com.google.gson.a.c(a = "types")

    /* renamed from: j  reason: collision with root package name */
    public List<String> f23004j;

    /* renamed from: k  reason: collision with root package name */
    public String f23005k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f23006l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f23007m;
    public List<b> n = new ArrayList();
    public List<a> o;
    public ArrayList<String> p = new ArrayList<>();
    public Effect q;
    public ArrayList<Integer> r = new ArrayList<>();
    public Boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public String x;
    public String y;
    public Integer z;

    public static final class b {
        @com.google.gson.a.c(a = StringSet.name)

        /* renamed from: a  reason: collision with root package name */
        public String f23008a = "";
        @com.google.gson.a.c(a = "value")

        /* renamed from: b  reason: collision with root package name */
        public int f23009b;
        @com.google.gson.a.c(a = "tag")

        /* renamed from: c  reason: collision with root package name */
        public String f23010c = "";
        @com.google.gson.a.c(a = "max")

        /* renamed from: d  reason: collision with root package name */
        public int f23011d = 100;
        @com.google.gson.a.c(a = "min")

        /* renamed from: e  reason: collision with root package name */
        public int f23012e = 100;
        @com.google.gson.a.c(a = "doubleDirection")

        /* renamed from: f  reason: collision with root package name */
        public boolean f23013f;

        /* renamed from: g  reason: collision with root package name */
        public int f23014g;

        static {
            Covode.recordClassIndex(13627);
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public String f23015a = "";

        /* renamed from: b  reason: collision with root package name */
        public String f23016b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f23017c = "";

        static {
            Covode.recordClassIndex(13628);
        }
    }

    public static final class d {
        @com.google.gson.a.c(a = "audio_effect")

        /* renamed from: a  reason: collision with root package name */
        public boolean f23018a;

        static {
            Covode.recordClassIndex(13629);
        }
    }

    static {
        Covode.recordClassIndex(13625);
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.a$a  reason: collision with other inner class name */
    public static final class C0504a {
        static {
            Covode.recordClassIndex(13626);
        }

        private C0504a() {
        }

        public /* synthetic */ C0504a(byte b2) {
            this();
        }
    }

    public final b a() {
        return (b) n.h((List) this.n);
    }

    public final boolean b() {
        if (this.x != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f22995a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final void a(String str) {
        l.d(str, "");
        this.f22996b = str;
    }

    public final void b(String str) {
        l.d(str, "");
        this.f22997c = str;
    }

    public final void c(String str) {
        l.d(str, "");
        this.f23001g = str;
    }

    public final void d(String str) {
        l.d(str, "");
        this.I = str;
    }

    public final void a(List<b> list) {
        l.d(list, "");
        this.n = list;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.LiveEffect");
        if (this.f22995a != ((a) obj).f22995a) {
            return false;
        }
        return true;
    }
}

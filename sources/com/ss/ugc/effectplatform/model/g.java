package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.util.n;
import d.a.d.a.d;
import h.f.b.l;
import h.m.p;
import h.w;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    public static final a f153660e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f153661a;

    /* renamed from: b  reason: collision with root package name */
    public int f153662b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f153663c;

    /* renamed from: d  reason: collision with root package name */
    public final String f153664d;

    /* renamed from: f  reason: collision with root package name */
    private String f153665f;

    /* renamed from: g  reason: collision with root package name */
    private String f153666g;

    static {
        Covode.recordClassIndex(102485);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102486);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static g a(String str) {
            l.c(str, "");
            return new g(str, (byte) 0);
        }

        public static String b(String str) {
            int a2;
            p.a((CharSequence) str, "/");
            int a3 = p.a((CharSequence) str, "_v");
            if (p.a((CharSequence) str, (CharSequence) "size", false)) {
                a2 = p.a((CharSequence) str, "_size");
            } else {
                a2 = p.a((CharSequence) str, "_model");
            }
            if (a3 <= 0) {
                return "1.0";
            }
            int i2 = a3 + 2;
            if (str != null) {
                String substring = str.substring(i2, a2);
                l.a((Object) substring, "");
                return p.i(substring);
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    public final String a() {
        String d2;
        String str = this.f153665f;
        if ((str == null || p.a((CharSequence) str)) && (d2 = d.d(this.f153664d)) != null) {
            this.f153665f = n.a(d2);
        }
        return this.f153665f;
    }

    public final String b() {
        String d2;
        String str = this.f153666g;
        if ((str == null || p.a((CharSequence) str)) && (d2 = d.d(this.f153664d)) != null) {
            this.f153666g = a.b(d2);
        }
        return this.f153666g;
    }

    public final String d() {
        String d2;
        String str = this.f153661a;
        if ((str == null || p.a((CharSequence) str)) && (d2 = d.d(this.f153664d)) != null) {
            this.f153661a = n.d(d2);
        }
        return this.f153661a;
    }

    public final int c() {
        String d2;
        if (this.f153662b == -1) {
            int i2 = 0;
            if (d.f(this.f153664d) && (d2 = d.d(this.f153664d)) != null) {
                i2 = n.c(d2);
            }
            this.f153662b = i2;
        }
        return this.f153662b;
    }

    public final String toString() {
        return "LocalModelInfo{name=" + a() + '\'' + ",version=" + b() + '\'' + ",size=" + c() + '\'' + '}';
    }

    public final void a(String str) {
        l.c(str, "");
        this.f153665f = str;
    }

    public final void b(String str) {
        l.c(str, "");
        this.f153666g = str;
    }

    private g(String str) {
        this.f153664d = str;
        this.f153662b = -1;
    }

    public /* synthetic */ g(String str, byte b2) {
        this(str);
    }
}

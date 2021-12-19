package com.bytedance.lynx.hybrid.resource.config;

import com.bytedance.covode.number.Covode;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import java.util.LinkedHashMap;
import java.util.Map;

public class j {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f41105a = {new y(ab.a(j.class), "customParams", "getCustomParams()Ljava/util/Map;")};

    /* renamed from: b  reason: collision with root package name */
    public a f41106b;

    /* renamed from: c  reason: collision with root package name */
    public int f41107c;

    /* renamed from: d  reason: collision with root package name */
    public long f41108d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f41109e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f41110f;

    /* renamed from: g  reason: collision with root package name */
    public String f41111g;

    /* renamed from: h  reason: collision with root package name */
    public String f41112h;

    /* renamed from: i  reason: collision with root package name */
    public String f41113i;

    /* renamed from: j  reason: collision with root package name */
    public String f41114j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f41115k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f41116l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f41117m;
    public com.bytedance.lynx.hybrid.h.a n;
    public String o;
    public String p;
    public boolean q;
    public boolean r;
    public final h s;
    public String t;

    static final class a extends m implements h.f.a.a<Map<String, Object>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f41118a = new a();

        static {
            Covode.recordClassIndex(25196);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    public /* synthetic */ j() {
        this("");
    }

    static {
        Covode.recordClassIndex(25195);
    }

    public String toString() {
        return "[accessKey=" + this.t + ", loaderConfig=" + this.f41106b + ", dynamic=" + this.f41109e + ',' + "onlyLocal=" + this.f41110f + ", channel=" + this.f41111g + ',' + "bundle=" + this.f41112h + ", group=" + this.f41113i + ",cdnUrl=" + this.f41114j + ',' + "enableCached:" + this.r + ']';
    }

    public final void a(a aVar) {
        l.c(aVar, "");
        this.f41106b = aVar;
    }

    public final void b(String str) {
        l.c(str, "");
        this.f41112h = str;
    }

    public final void c(String str) {
        l.c(str, "");
        this.f41114j = str;
    }

    public final void d(String str) {
        l.c(str, "");
        this.o = str;
    }

    public final void e(String str) {
        l.c(str, "");
        this.p = str;
    }

    public final void f(String str) {
        l.c(str, "");
        this.t = str;
    }

    public final void a(String str) {
        l.c(str, "");
        this.f41111g = str;
    }

    public j(String str) {
        l.c(str, "");
        this.t = str;
        this.f41106b = new a(false);
        this.f41108d = 1000;
        this.f41111g = "";
        this.f41112h = "";
        this.f41114j = "";
        this.f41115k = true;
        this.f41116l = true;
        this.f41117m = true;
        this.o = "";
        this.p = "";
        this.r = true;
        this.s = h.i.a((h.f.a.a) a.f41118a);
    }

    public j a(j jVar) {
        l.c(jVar, "");
        this.f41106b = jVar.f41106b;
        this.f41108d = jVar.f41108d;
        this.f41109e = jVar.f41109e;
        this.f41110f = jVar.f41110f;
        this.f41111g = jVar.f41111g;
        this.f41112h = jVar.f41112h;
        this.f41113i = jVar.f41113i;
        this.f41114j = jVar.f41114j;
        this.n = jVar.n;
        this.q = jVar.q;
        this.r = jVar.r;
        this.o = jVar.o;
        return this;
    }
}

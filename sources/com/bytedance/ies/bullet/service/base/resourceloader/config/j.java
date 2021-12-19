package com.bytedance.ies.bullet.service.base.resourceloader.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.e.d;
import h.f.b.l;

public class j {

    /* renamed from: g  reason: collision with root package name */
    public a f32633g;

    /* renamed from: h  reason: collision with root package name */
    public int f32634h;

    /* renamed from: i  reason: collision with root package name */
    public long f32635i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f32636j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f32637k;

    /* renamed from: l  reason: collision with root package name */
    public String f32638l;

    /* renamed from: m  reason: collision with root package name */
    public String f32639m;
    public String n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public o s;
    public String t;
    public String u;
    public boolean v;
    public d w;
    public boolean x;
    public String y;

    static {
        Covode.recordClassIndex(19383);
    }

    public /* synthetic */ j() {
        this("");
    }

    public String toString() {
        return "[accessKey=" + this.y + ", loaderConfig=" + this.f32633g + ", dynamic=" + this.f32636j + ',' + "onlyLocal=" + this.f32637k + ", channel=" + this.f32638l + ',' + "bundle=" + this.f32639m + ", group=" + this.n + ",cdnUrl=" + this.o + ',' + "enableCached:" + this.x + ']';
    }

    public final void a(a aVar) {
        l.c(aVar, "");
        this.f32633g = aVar;
    }

    public final void b(String str) {
        l.c(str, "");
        this.f32639m = str;
    }

    public final void c(String str) {
        l.c(str, "");
        this.o = str;
    }

    public final void d(String str) {
        l.c(str, "");
        this.t = str;
    }

    public final void e(String str) {
        l.c(str, "");
        this.u = str;
    }

    public final void f(String str) {
        l.c(str, "");
        this.y = str;
    }

    public final void a(String str) {
        l.c(str, "");
        this.f32638l = str;
    }

    public j(String str) {
        l.c(str, "");
        this.y = str;
        this.f32633g = new a(false);
        this.f32635i = 1000;
        this.f32638l = "";
        this.f32639m = "";
        this.o = "";
        this.p = true;
        this.q = true;
        this.r = true;
        this.t = "";
        this.u = "";
        this.x = true;
    }

    public j a(j jVar) {
        l.c(jVar, "");
        this.f32633g = jVar.f32633g;
        this.f32635i = jVar.f32635i;
        this.f32636j = jVar.f32636j;
        this.f32637k = jVar.f32637k;
        this.f32638l = jVar.f32638l;
        this.f32639m = jVar.f32639m;
        this.n = jVar.n;
        this.o = jVar.o;
        this.s = jVar.s;
        this.v = jVar.v;
        this.x = jVar.x;
        this.t = jVar.t;
        return this;
    }
}

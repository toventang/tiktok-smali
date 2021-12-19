package com.bytedance.apm.block;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

final class c {

    /* renamed from: a  reason: collision with root package name */
    boolean f24645a = true;

    /* renamed from: b  reason: collision with root package name */
    String f24646b;

    /* renamed from: c  reason: collision with root package name */
    boolean f24647c;

    /* renamed from: d  reason: collision with root package name */
    boolean f24648d;

    /* renamed from: e  reason: collision with root package name */
    boolean f24649e;

    /* renamed from: f  reason: collision with root package name */
    boolean f24650f;

    /* renamed from: g  reason: collision with root package name */
    long f24651g = -1;

    /* renamed from: h  reason: collision with root package name */
    long f24652h = -1;

    /* renamed from: i  reason: collision with root package name */
    long f24653i;

    /* renamed from: j  reason: collision with root package name */
    boolean f24654j;

    /* renamed from: k  reason: collision with root package name */
    boolean f24655k;

    /* renamed from: l  reason: collision with root package name */
    volatile boolean f24656l;

    /* renamed from: m  reason: collision with root package name */
    boolean f24657m;
    long n;
    long o;
    StackTraceElement[] p;
    StackTraceElement[] q;
    String r;
    String s;
    String t;
    JSONObject u;
    JSONObject v;
    JSONObject w;
    JSONObject x;

    static {
        Covode.recordClassIndex(14494);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f24645a = true;
        this.f24647c = false;
        this.f24648d = false;
        this.f24649e = false;
        this.f24650f = false;
        this.f24653i = 0;
        this.f24654j = false;
        this.f24656l = false;
        this.f24655k = false;
        this.f24657m = false;
        this.n = 0;
        this.o = 0;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
    }

    /* access modifiers changed from: package-private */
    public final c a() {
        c cVar = new c(this.f24651g, this.f24646b);
        cVar.f24652h = this.f24652h;
        cVar.f24645a = this.f24645a;
        cVar.f24647c = this.f24647c;
        cVar.f24648d = this.f24648d;
        cVar.f24649e = this.f24649e;
        cVar.f24650f = this.f24650f;
        cVar.f24653i = this.f24653i;
        cVar.f24654j = this.f24654j;
        cVar.f24655k = this.f24655k;
        cVar.n = this.n;
        cVar.o = this.o;
        cVar.p = this.p;
        cVar.q = this.q;
        cVar.r = this.r;
        cVar.s = this.s;
        cVar.t = this.t;
        cVar.u = this.u;
        cVar.v = this.v;
        cVar.w = this.w;
        cVar.x = this.x;
        cVar.f24657m = this.f24657m;
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, String str) {
        this.f24651g = j2;
        this.f24646b = str;
        this.f24652h = -1;
        this.f24645a = false;
    }

    c(long j2, String str) {
        this.f24651g = j2;
        this.f24646b = str;
    }
}

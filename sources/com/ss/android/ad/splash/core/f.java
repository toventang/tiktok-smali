package com.ss.android.ad.splash.core;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f58536a = true;

    /* renamed from: b  reason: collision with root package name */
    private String f58537b;

    /* renamed from: c  reason: collision with root package name */
    private String f58538c;

    /* renamed from: d  reason: collision with root package name */
    private String f58539d;

    /* renamed from: e  reason: collision with root package name */
    private String f58540e;

    /* renamed from: f  reason: collision with root package name */
    private String f58541f;

    /* renamed from: g  reason: collision with root package name */
    private String f58542g;

    /* renamed from: h  reason: collision with root package name */
    private String f58543h;

    /* renamed from: i  reason: collision with root package name */
    private String f58544i;

    /* renamed from: j  reason: collision with root package name */
    private String f58545j;

    /* renamed from: k  reason: collision with root package name */
    private String f58546k;

    /* renamed from: l  reason: collision with root package name */
    private String f58547l;

    /* renamed from: m  reason: collision with root package name */
    private String f58548m;
    private long n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;

    static {
        Covode.recordClassIndex(36305);
    }

    private String f() {
        if (a(this.f58539d)) {
            this.f58539d = h.ah.k();
        }
        return this.f58539d;
    }

    private String g() {
        if (a(this.f58540e)) {
            this.f58540e = h.ah.c();
        }
        return this.f58540e;
    }

    private String h() {
        if (a(this.f58541f)) {
            this.f58541f = h.ah.d();
        }
        return this.f58541f;
    }

    private String i() {
        if (a(this.f58543h)) {
            this.f58543h = h.ah.f();
        }
        return this.f58543h;
    }

    private String j() {
        if (a(this.f58544i)) {
            this.f58544i = h.ah.l();
        }
        return this.f58544i;
    }

    private String k() {
        if (a(this.f58545j)) {
            this.f58545j = h.ah.g();
        }
        return this.f58545j;
    }

    private String l() {
        if (a(this.f58548m)) {
            this.f58548m = h.ah.i();
        }
        return this.f58548m;
    }

    private String m() {
        if (a(this.f58547l)) {
            this.f58547l = h.ah.m();
        }
        return this.f58547l;
    }

    private String n() {
        if (a(this.o)) {
            this.o = h.ah.j();
        }
        return this.o;
    }

    private String o() {
        if (a(this.p)) {
            this.p = h.ah.n();
        }
        return this.p;
    }

    private String p() {
        if (a(this.q)) {
            this.q = h.ah.o();
        }
        return this.q;
    }

    private String q() {
        if (a(this.r)) {
            this.r = h.ah.p();
        }
        return this.r;
    }

    private String r() {
        if (a(this.s)) {
            this.s = h.ah.q();
        }
        return this.s;
    }

    public final String a() {
        if (a(this.f58537b)) {
            this.f58537b = h.ah.a();
        }
        return this.f58537b;
    }

    public final String b() {
        if (a(this.f58538c)) {
            this.f58538c = h.ah.b();
        }
        return this.f58538c;
    }

    public final String c() {
        if (a(this.f58542g)) {
            this.f58542g = h.ah.e();
        }
        return this.f58542g;
    }

    public final String d() {
        if (a(this.f58546k)) {
            this.f58546k = h.ah.h();
        }
        return this.f58546k;
    }

    public final long e() {
        if (this.n == 0 && h.ah != null) {
            this.n = 0;
        }
        return this.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(c())) {
            sb.append("&channel=").append(Uri.encode(c()));
        }
        if (!TextUtils.isEmpty(a())) {
            sb.append("&aid=").append(Uri.encode(a()));
        }
        if (!TextUtils.isEmpty(r())) {
            sb.append("&gaid=").append(Uri.encode(r()));
        }
        if (!TextUtils.isEmpty(b())) {
            sb.append("&app_name=").append(Uri.encode(b()));
        }
        if (!TextUtils.isEmpty(h())) {
            sb.append("&update_version_code=").append(Uri.encode(h()));
        }
        if (!TextUtils.isEmpty(f())) {
            sb.append("&version_code=").append(Uri.encode(f()));
        }
        if (!TextUtils.isEmpty(g())) {
            sb.append("&version_name=").append(Uri.encode(g()));
        }
        if (!TextUtils.isEmpty(i())) {
            sb.append("&manifest_version_code=").append(Uri.encode(i()));
        }
        if (!TextUtils.isEmpty(j())) {
            sb.append("&language=").append(Uri.encode(j()));
        } else if (!h.a().f58917i) {
            sb.append("&language=zh");
        }
        if (!TextUtils.isEmpty(k())) {
            sb.append("&iid=").append(Uri.encode(k()));
        }
        if (!TextUtils.isEmpty(d())) {
            sb.append("&device_id=").append(Uri.encode(d()));
        }
        if (!TextUtils.isEmpty(l())) {
            sb.append("&openudid=").append(Uri.encode(l()));
        }
        if (!TextUtils.isEmpty(m())) {
            sb.append("&uuid=").append(Uri.encode(m()));
        }
        if (this.f58536a) {
            if (!TextUtils.isEmpty(n())) {
                sb.append("&ab_version=").append(Uri.encode(n()));
            }
            if (!TextUtils.isEmpty(o())) {
                sb.append("&ab_client=").append(Uri.encode(o()));
            }
            if (!TextUtils.isEmpty(p())) {
                sb.append("&ab_group=").append(Uri.encode(p()));
            }
            if (!TextUtils.isEmpty(q())) {
                sb.append("&ab_feature=").append(Uri.encode(q()));
            }
        }
        return sb.toString();
    }

    private static boolean a(String str) {
        if (!TextUtils.isEmpty(str) || h.ah == null) {
            return false;
        }
        return true;
    }
}

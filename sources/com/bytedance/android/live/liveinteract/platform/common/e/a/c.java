package com.bytedance.android.live.liveinteract.platform.common.e.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;

public class c {
    @com.google.gson.a.c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public int f11928a;
    @com.google.gson.a.c(a = "account")

    /* renamed from: b  reason: collision with root package name */
    public long f11929b;
    @com.google.gson.a.c(a = "alpha")

    /* renamed from: c  reason: collision with root package name */
    public int f11930c;
    @com.google.gson.a.c(a = "w")

    /* renamed from: d  reason: collision with root package name */
    public double f11931d;
    @com.google.gson.a.c(a = "h")

    /* renamed from: e  reason: collision with root package name */
    public double f11932e;
    @com.google.gson.a.c(a = "x")

    /* renamed from: f  reason: collision with root package name */
    public double f11933f;
    @com.google.gson.a.c(a = "y")

    /* renamed from: g  reason: collision with root package name */
    public double f11934g;
    @com.google.gson.a.c(a = "zorder")

    /* renamed from: h  reason: collision with root package name */
    public int f11935h;
    @com.google.gson.a.c(a = "stat")

    /* renamed from: i  reason: collision with root package name */
    public int f11936i;
    @com.google.gson.a.c(a = "uid")

    /* renamed from: j  reason: collision with root package name */
    public String f11937j;
    @com.google.gson.a.c(a = "uid_str")

    /* renamed from: k  reason: collision with root package name */
    public String f11938k;
    @com.google.gson.a.c(a = "talk")

    /* renamed from: l  reason: collision with root package name */
    public int f11939l;
    @com.google.gson.a.c(a = "mute_audio")

    /* renamed from: m  reason: collision with root package name */
    public int f11940m;
    @com.google.gson.a.c(a = "p")
    public int n;
    @com.google.gson.a.c(a = "mute_a")
    public boolean o;
    @com.google.gson.a.c(a = "mute_v")
    public boolean p;

    static {
        Covode.recordClassIndex(6522);
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f11938k)) {
            return this.f11937j;
        }
        return this.f11938k;
    }

    public final boolean a(c cVar) {
        if (cVar != null && this.f11932e == cVar.f11932e && this.f11931d == cVar.f11931d && this.f11933f == cVar.f11933f && this.f11934g == cVar.f11934g && this.o == cVar.o && this.p == cVar.p) {
            return true;
        }
        return false;
    }
}

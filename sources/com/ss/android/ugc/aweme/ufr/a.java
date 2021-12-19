package com.ss.android.ugc.aweme.ufr;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import f.a.t;
import h.f.b.l;
import java.util.Map;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected Context f141626a;

    /* renamed from: b  reason: collision with root package name */
    protected String f141627b;

    /* renamed from: c  reason: collision with root package name */
    protected String f141628c;

    /* renamed from: d  reason: collision with root package name */
    protected String f141629d;

    /* renamed from: e  reason: collision with root package name */
    public Map<String, String> f141630e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f141631f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f141632g = true;

    static {
        Covode.recordClassIndex(92555);
    }

    public abstract t<e> a(boolean z, int i2);

    public abstract t<e> e();

    public abstract t<e> f();

    public abstract t<e> g();

    public abstract t<e> h();

    public abstract t<e> i();

    public final String b() {
        String str = this.f141627b;
        if (str == null) {
            l.a("uid");
        }
        return str;
    }

    public final String c() {
        String str = this.f141628c;
        if (str == null) {
            l.a("enterFrom");
        }
        return str;
    }

    public final String d() {
        String str = this.f141629d;
        if (str == null) {
            l.a("enterMethod");
        }
        return str;
    }

    public final Context a() {
        Context context = this.f141626a;
        if (context == null) {
            l.a("context");
        }
        return context;
    }

    public final void a(Context context, String str, String str2, String str3, boolean z, boolean z2, Map<String, String> map) {
        l.c(context, "");
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        this.f141626a = context;
        this.f141627b = str;
        this.f141628c = str2;
        this.f141629d = str3;
        this.f141631f = z;
        this.f141632g = z2;
        this.f141630e = map;
    }
}

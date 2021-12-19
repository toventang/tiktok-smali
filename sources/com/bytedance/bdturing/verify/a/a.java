package com.bytedance.bdturing.verify.a;

import android.app.Activity;
import com.bytedance.bdturing.a.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public Activity f26573a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26574b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26575c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26576d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26577e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f26578f;

    static {
        Covode.recordClassIndex(15614);
    }

    public abstract void a(StringBuilder sb);

    public abstract int b();

    public abstract String c();

    public abstract int d();

    public boolean a() {
        return this.f26578f;
    }

    public final String e() {
        b();
        StringBuilder a2 = b.a(c(), this.f26573a);
        if (this.f26574b) {
            com.bytedance.bdturing.f.b.a(a2, "preload", 1);
        }
        a(a2);
        String sb = a2.toString();
        l.a((Object) sb, "");
        return sb;
    }

    public void a(boolean z) {
        this.f26578f = z;
    }
}

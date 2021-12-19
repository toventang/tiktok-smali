package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

public final class es {

    /* renamed from: a  reason: collision with root package name */
    private final String f51553a;

    /* renamed from: b  reason: collision with root package name */
    private final String f51554b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f51555c;

    /* renamed from: d  reason: collision with root package name */
    private String f51556d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ em f51557e;

    static {
        Covode.recordClassIndex(32213);
    }

    public final String a() {
        if (!this.f51555c) {
            this.f51555c = true;
            this.f51556d = this.f51557e.f().getString(this.f51553a, null);
        }
        return this.f51556d;
    }

    public final void a(String str) {
        if (this.f51557e.s().d(null, p.ax) || !jz.c(str, this.f51556d)) {
            SharedPreferences.Editor edit = this.f51557e.f().edit();
            edit.putString(this.f51553a, str);
            edit.apply();
            this.f51556d = str;
        }
    }

    public es(em emVar, String str) {
        this.f51557e = emVar;
        r.a(str);
        this.f51553a = str;
    }
}

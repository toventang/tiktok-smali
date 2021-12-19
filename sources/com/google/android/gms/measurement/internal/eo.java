package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

public final class eo {

    /* renamed from: a  reason: collision with root package name */
    private final String f51537a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f51538b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f51539c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f51540d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ em f51541e;

    static {
        Covode.recordClassIndex(32209);
    }

    public final boolean a() {
        if (!this.f51539c) {
            this.f51539c = true;
            this.f51540d = this.f51541e.f().getBoolean(this.f51537a, this.f51538b);
        }
        return this.f51540d;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.f51541e.f().edit();
        edit.putBoolean(this.f51537a, z);
        edit.apply();
        this.f51540d = z;
    }

    public eo(em emVar, String str, boolean z) {
        this.f51541e = emVar;
        r.a(str);
        this.f51537a = str;
        this.f51538b = z;
    }
}

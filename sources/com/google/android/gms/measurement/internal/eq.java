package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

public final class eq {

    /* renamed from: a  reason: collision with root package name */
    private final String f51547a;

    /* renamed from: b  reason: collision with root package name */
    private final long f51548b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f51549c;

    /* renamed from: d  reason: collision with root package name */
    private long f51550d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ em f51551e;

    static {
        Covode.recordClassIndex(32211);
    }

    public final long a() {
        if (!this.f51549c) {
            this.f51549c = true;
            this.f51550d = this.f51551e.f().getLong(this.f51547a, this.f51548b);
        }
        return this.f51550d;
    }

    public final void a(long j2) {
        SharedPreferences.Editor edit = this.f51551e.f().edit();
        edit.putLong(this.f51547a, j2);
        edit.apply();
        this.f51550d = j2;
    }

    public eq(em emVar, String str, long j2) {
        this.f51551e = emVar;
        r.a(str);
        this.f51547a = str;
        this.f51548b = j2;
    }
}

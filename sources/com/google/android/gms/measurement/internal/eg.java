package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class eg {

    /* renamed from: a  reason: collision with root package name */
    public String f51497a;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f51498b;

    /* renamed from: c  reason: collision with root package name */
    private String f51499c;

    /* renamed from: d  reason: collision with root package name */
    private long f51500d;

    static {
        Covode.recordClassIndex(32201);
    }

    public final zzao a() {
        return new zzao(this.f51497a, new zzan(new Bundle(this.f51498b)), this.f51499c, this.f51500d);
    }

    public final String toString() {
        String str = this.f51499c;
        String str2 = this.f51497a;
        String valueOf = String.valueOf(this.f51498b);
        return new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("origin=").append(str).append(",name=").append(str2).append(",params=").append(valueOf).toString();
    }

    public static eg a(zzao zzao) {
        return new eg(zzao.f52061a, zzao.f52063c, zzao.f52062b.a(), zzao.f52064d);
    }

    private eg(String str, String str2, Bundle bundle, long j2) {
        this.f51497a = str;
        this.f51499c = str2;
        this.f51498b = bundle == null ? new Bundle() : bundle;
        this.f51500d = j2;
    }
}

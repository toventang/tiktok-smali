package com.google.android.gms.auth.api.signin.internal;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static int f49856b = 31;

    /* renamed from: a  reason: collision with root package name */
    public int f49857a = 1;

    static {
        Covode.recordClassIndex(31115);
    }

    public final a a(boolean z) {
        this.f49857a = (f49856b * this.f49857a) + (z ? 1 : 0);
        return this;
    }

    public final a a(Object obj) {
        int hashCode;
        int i2 = f49856b * this.f49857a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.f49857a = i2 + hashCode;
        return this;
    }
}

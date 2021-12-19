package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.twitter.sdk.android.core.a;

public class i<T extends a> {
    @c(a = "auth_token")

    /* renamed from: a  reason: collision with root package name */
    public final T f155913a;
    @c(a = "id")

    /* renamed from: b  reason: collision with root package name */
    public final long f155914b;

    static {
        Covode.recordClassIndex(103594);
    }

    public int hashCode() {
        int i2;
        T t = this.f155913a;
        if (t != null) {
            i2 = t.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f155914b;
        return (i2 * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f155914b != iVar.f155914b) {
                return false;
            }
            T t = this.f155913a;
            T t2 = iVar.f155913a;
            if (t != null) {
                return t.equals(t2);
            }
            if (t2 == null) {
                return true;
            }
        }
        return false;
    }

    public i(T t, long j2) {
        if (t != null) {
            this.f155913a = t;
            this.f155914b = j2;
            return;
        }
        throw new IllegalArgumentException("AuthToken must not be null.");
    }
}

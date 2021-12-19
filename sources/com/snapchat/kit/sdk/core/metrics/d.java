package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.a;
import com.google.gson.a.c;
import java.util.Objects;

public final class d<T> {
    @a
    @c(a = "retry_count")

    /* renamed from: a  reason: collision with root package name */
    public int f57184a;
    @a
    @c(a = "event")

    /* renamed from: b  reason: collision with root package name */
    public T f57185b;

    static {
        Covode.recordClassIndex(35630);
    }

    public d(T t) {
        this(t, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!Objects.equals(Integer.valueOf(this.f57184a), Integer.valueOf(dVar.f57184a)) || !Objects.equals(this.f57185b, dVar.f57185b)) {
            return false;
        }
        return true;
    }

    public d(T t, int i2) {
        this.f57184a = i2;
        this.f57185b = t;
    }
}

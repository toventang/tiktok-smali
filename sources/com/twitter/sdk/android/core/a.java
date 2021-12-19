package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public abstract class a {
    @c(a = "created_at")

    /* renamed from: a  reason: collision with root package name */
    protected final long f155896a;

    static {
        Covode.recordClassIndex(103584);
    }

    public a() {
        this(System.currentTimeMillis());
    }

    private a(long j2) {
        this.f155896a = j2;
    }
}

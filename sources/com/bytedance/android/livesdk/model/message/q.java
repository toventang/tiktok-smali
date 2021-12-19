package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class q extends a {
    @c(a = "donation_total")

    /* renamed from: a  reason: collision with root package name */
    public String f19670a;
    @c(a = "donation_user_count")

    /* renamed from: f  reason: collision with root package name */
    public long f19671f;
    @c(a = "currency")

    /* renamed from: g  reason: collision with root package name */
    public String f19672g;

    static {
        Covode.recordClassIndex(11694);
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        return false;
    }

    public q() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.DONATION_INFO;
    }
}

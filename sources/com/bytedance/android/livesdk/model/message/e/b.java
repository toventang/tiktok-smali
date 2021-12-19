package com.bytedance.android.livesdk.model.message.e;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class b extends a {
    @c(a = "envelope_info")

    /* renamed from: a  reason: collision with root package name */
    public a f19615a;
    @c(a = "display")

    /* renamed from: f  reason: collision with root package name */
    public int f19616f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f19617g = true;

    static {
        Covode.recordClassIndex(11618);
    }

    @Override // com.bytedance.android.livesdk.ac.b.a
    public final boolean a() {
        return true;
    }

    public b() {
        this.L = com.bytedance.android.livesdk.model.message.a.a.RED_ENVELOPE_MESSAGE;
    }

    @Override // com.bytedance.android.livesdkapi.h.a
    public final boolean b() {
        if (this.f19616f != 1 || !this.f19617g) {
            return false;
        }
        return true;
    }
}

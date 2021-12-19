package com.bytedance.push.third.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.third.b;
import com.ss.android.message.a.a;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    private Context f42355a;

    static {
        Covode.recordClassIndex(25875);
    }

    public c(Context context) {
        this.f42355a = context;
    }

    @Override // com.bytedance.push.third.a.b
    public final boolean a(b bVar, int i2) {
        if (bVar == null || !a.a(this.f42355a, "com.android.vending") || !a.a(this.f42355a, "com.google.android.gms")) {
            return false;
        }
        return true;
    }
}

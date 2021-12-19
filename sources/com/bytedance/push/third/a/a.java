package com.bytedance.push.third.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.third.b;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private Context f42354a;

    static {
        Covode.recordClassIndex(25873);
    }

    public a(Context context) {
        this.f42354a = context;
    }

    @Override // com.bytedance.push.third.a.b
    public final boolean a(b bVar, int i2) {
        if (bVar == null || !bVar.isPushAvailable(this.f42354a, i2)) {
            return false;
        }
        return true;
    }
}

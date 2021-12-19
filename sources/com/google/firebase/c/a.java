package com.google.firebase.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.firebase.c.c;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private d f54300a;

    static {
        Covode.recordClassIndex(33710);
    }

    a(Context context) {
        this.f54300a = d.a(context);
    }

    @Override // com.google.firebase.c.c
    public final c.a a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = this.f54300a.a(str, currentTimeMillis);
        boolean a3 = this.f54300a.a(currentTimeMillis);
        if (a2) {
            if (a3) {
                return c.a.COMBINED;
            }
        } else if (a3) {
            return c.a.GLOBAL;
        } else {
            if (!a2) {
                return c.a.NONE;
            }
        }
        return c.a.SDK;
    }
}

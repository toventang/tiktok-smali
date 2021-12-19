package com.bytedance.sdk.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.a;
import com.bytedance.sdk.a.a.a.b;

public abstract class c<T extends b> extends a<T> {
    static {
        Covode.recordClassIndex(26456);
    }

    public abstract void a(T t, int i2);

    public void a(T t, String str) {
    }

    public boolean b(T t) {
        return false;
    }

    public boolean c(T t) {
        return false;
    }

    public String d(T t) {
        return null;
    }

    public abstract void e(T t);

    @Override // com.bytedance.sdk.a.a.a.a
    public final void a(T t) {
        if (t.f43071b) {
            e(t);
        } else if (!b(t)) {
            a(t, t.f43073d);
        } else if (c(t)) {
            a(t, d(t));
        } else {
            a(t, t.f43073d);
        }
    }
}

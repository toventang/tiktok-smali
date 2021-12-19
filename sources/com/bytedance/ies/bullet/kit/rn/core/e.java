package com.bytedance.ies.bullet.kit.rn.core;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public abstract class e<T extends View> {
    static {
        Covode.recordClassIndex(19058);
    }

    public abstract T a(c cVar);

    public abstract String a();

    public void a(T t) {
        l.c(t, "");
    }

    public void a(T t, int i2, List<? extends Object> list) {
        l.c(t, "");
    }

    public void a(c cVar, T t) {
        l.c(cVar, "");
        l.c(t, "");
    }

    public Map<String, Integer> b() {
        return null;
    }
}

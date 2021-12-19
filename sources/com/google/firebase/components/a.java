package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import java.util.Set;

/* access modifiers changed from: package-private */
public abstract class a implements e {
    static {
        Covode.recordClassIndex(33716);
    }

    a() {
    }

    @Override // com.google.firebase.components.e
    public <T> T a(Class<T> cls) {
        com.google.firebase.d.a<T> c2 = c(cls);
        if (c2 == null) {
            return null;
        }
        return c2.a();
    }

    @Override // com.google.firebase.components.e
    public <T> Set<T> b(Class<T> cls) {
        return d(cls).a();
    }
}

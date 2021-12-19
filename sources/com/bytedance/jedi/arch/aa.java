package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class aa implements z {

    /* renamed from: a  reason: collision with root package name */
    private boolean f39374a = true;

    static {
        Covode.recordClassIndex(24156);
    }

    @Override // com.bytedance.jedi.arch.z
    public final <S extends af, VM extends JediViewModel<S>, T extends y<S, VM>> T a(Class<VM> cls) {
        l.c(cls, "");
        String str = cls.getName() + "_MiddlewareBinding";
        try {
            if (!this.f39374a) {
                return null;
            }
            Class<?> cls2 = ab.f39375a.get(str);
            if (cls2 != null || !ab.f39375a.containsKey(str)) {
                Class<?> cls3 = cls2;
                if (cls3 == null) {
                    cls3 = Class.forName(str);
                    ab.f39375a.put(str, cls3);
                }
                Object newInstance = cls3.newInstance();
                if (!(newInstance instanceof y)) {
                    newInstance = null;
                }
                T t = (T) ((y) newInstance);
                if (t == null) {
                    return null;
                }
                this.f39374a = false;
                return t;
            }
            this.f39374a = false;
            return null;
        } catch (Exception unused) {
            ab.f39375a.put(str, null);
            this.f39374a = false;
            return null;
        }
    }
}

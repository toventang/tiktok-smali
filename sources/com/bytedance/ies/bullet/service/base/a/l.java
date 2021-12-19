package com.bytedance.ies.bullet.service.base.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.b.f;

public interface l extends g {
    static {
        Covode.recordClassIndex(19294);
    }

    <T extends c> T a(Class<T> cls);

    <T extends c> T a(String str, Class<T> cls);

    <T extends c> l a(Class<T> cls, T t);

    l a(String str, f fVar);

    <T extends c> l a(String str, Class<T> cls, T t);

    public static final class a {
        static {
            Covode.recordClassIndex(19295);
        }

        public static <T extends c> T a(l lVar, Class<T> cls) {
            h.f.b.l.c(cls, "");
            return (T) lVar.a("default_bid", cls);
        }

        public static <T extends c> l a(l lVar, Class<T> cls, T t) {
            h.f.b.l.c(cls, "");
            h.f.b.l.c(t, "");
            return lVar.a("default_bid", cls, t);
        }
    }
}

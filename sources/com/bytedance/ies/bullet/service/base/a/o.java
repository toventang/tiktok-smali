package com.bytedance.ies.bullet.service.base.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.b.e;
import h.f.b.l;

public interface o extends j {
    static {
        Covode.recordClassIndex(19298);
    }

    <T> T a_(Class<T> cls);

    <T extends c> T b_(Class<T> cls);

    String f();

    m g();

    public static final class a {
        static {
            Covode.recordClassIndex(19299);
        }

        public static void a(o oVar, String str, p pVar, String str2) {
            l.c(str, "");
            l.c(pVar, "");
            l.c(str2, "");
            j.b.a(oVar, str, pVar, str2);
        }

        public static void a(o oVar, Throwable th, String str) {
            l.c(th, "");
            l.c(str, "");
            j.b.a(oVar, th, str);
        }

        public static <T> T b(o oVar, Class<T> cls) {
            l.c(cls, "");
            return (T) oVar.g().a(cls);
        }

        public static <T extends c> T a(o oVar, Class<T> cls) {
            l.c(cls, "");
            return (T) e.a.a().a(oVar.f(), cls);
        }
    }
}

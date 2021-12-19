package com.bytedance.ies.im.core.api.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.c;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.h;
import h.f.b.l;
import java.util.List;
import java.util.Map;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33950a = new a((byte) 0);

    static {
        Covode.recordClassIndex(20191);
    }

    public abstract void a();

    public abstract void a(com.bytedance.ies.im.core.api.b.a.b bVar);

    public abstract void a(com.bytedance.im.core.a.a.b<String> bVar);

    public abstract void a(String str, int i2, Map<String, String> map, com.bytedance.im.core.a.a.b<ah> bVar);

    public abstract void a(String str, com.bytedance.im.core.a.a.b<h> bVar);

    public abstract void a(List<String> list, Map<String, String> map, com.bytedance.im.core.a.a.b<List<ah>> bVar);

    public abstract void a(Map<String, String> map);

    public abstract void a(Map<String, String> map, com.bytedance.im.core.a.a.b<h> bVar);

    public abstract void a(boolean z, com.bytedance.im.core.a.a.b<h> bVar);

    public abstract String b();

    public abstract void b(com.bytedance.im.core.a.a.b<String> bVar);

    public abstract void b(String str, com.bytedance.im.core.a.a.b<ah> bVar);

    public abstract void b(List<String> list, Map<String, String> map, com.bytedance.im.core.a.a.b<List<ah>> bVar);

    public abstract void b(Map<String, String> map, com.bytedance.im.core.a.a.b<h> bVar);

    public abstract void b(boolean z, com.bytedance.im.core.a.a.b<h> bVar);

    public abstract h c();

    public abstract void d();

    public abstract void e();

    public static final class a {
        static {
            Covode.recordClassIndex(20192);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static long c(String str) {
            return c.f33958a.a(str);
        }

        public static b a(String str) {
            l.d(str, "");
            return c.f33958a.c(str);
        }

        public static String b(String str) {
            String b2 = c.f33958a.b(str);
            if (b2 == null) {
                return "";
            }
            return b2;
        }

        public static String a(long j2) {
            String b2 = c.f33958a.b(String.valueOf(j2));
            if (b2 == null) {
                return "";
            }
            return b2;
        }
    }
}

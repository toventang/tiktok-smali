package com.bytedance.ies.ugc.network.partner;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.b.f;
import com.bytedance.ies.ugc.network.partner.b.g;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import h.f.b.l;

public interface b {

    public interface a extends b {
        static {
            Covode.recordClassIndex(21119);
        }

        u<?> a(f fVar, a aVar);

        u<?> b(f fVar, a aVar);
    }

    /* renamed from: com.bytedance.ies.ugc.network.partner.b$b  reason: collision with other inner class name */
    public interface AbstractC0800b extends b {
        static {
            Covode.recordClassIndex(21120);
        }

        void a(Request request);

        void a(u<?> uVar);

        void a(Throwable th);

        void b(Request request);

        void c(Request request);
    }

    public interface d extends b {
        static {
            Covode.recordClassIndex(21122);
        }

        boolean a(f fVar, a aVar, Throwable th, boolean z);
    }

    public interface e extends b {

        public static final class a {
            static {
                Covode.recordClassIndex(21124);
            }

            public static Object a(e eVar, a aVar) {
                l.d(aVar, "");
                return c.a(eVar, aVar);
            }
        }

        static {
            Covode.recordClassIndex(21123);
        }

        void a(f fVar, a aVar);
    }

    public interface f extends b {

        public static final class a {
            static {
                Covode.recordClassIndex(21126);
            }

            public static Object a(f fVar, a aVar) {
                l.d(aVar, "");
                return c.a(fVar, aVar);
            }
        }

        static {
            Covode.recordClassIndex(21125);
        }

        void a(g<?> gVar, a aVar);
    }

    static {
        Covode.recordClassIndex(21118);
    }

    String a();

    public static final class c {
        static {
            Covode.recordClassIndex(21121);
        }

        public static String a(b bVar) {
            String simpleName = bVar.getClass().getSimpleName();
            l.b(simpleName, "");
            return simpleName;
        }

        public static Object a(b bVar, a aVar) {
            l.d(aVar, "");
            return aVar.a(bVar);
        }

        public static void a(b bVar, a aVar, Object obj) {
            l.d(aVar, "");
            aVar.a(bVar, obj);
        }
    }
}

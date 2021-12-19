package com.bytedance.ies.xbridge;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface b {

    /* renamed from: c  reason: collision with root package name */
    public static final c f35766c = c.f35768a;

    /* renamed from: com.bytedance.ies.xbridge.b$b  reason: collision with other inner class name */
    public interface AbstractC0814b {
        static {
            Covode.recordClassIndex(21356);
        }

        void a(Map<String, Object> map);
    }

    public interface d {
        static {
            Covode.recordClassIndex(21358);
        }

        void a(String str, n nVar);
    }

    static {
        Covode.recordClassIndex(21354);
    }

    void a(com.bytedance.ies.xbridge.model.b.c cVar);

    void a(n nVar, AbstractC0814b bVar, e eVar);

    String b();

    a c();

    Class<? extends com.bytedance.ies.xbridge.model.params.a> d();

    Class<? extends com.bytedance.ies.xbridge.model.c.a> e();

    void f();

    public enum a {
        PUBLIC("public"),
        PRIVATE("private"),
        PROTECT("protect"),
        SECURE("secure");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(21355);
        }

        private a(String str) {
            this.value = str;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ c f35768a = new c();

        private c() {
        }

        static {
            Covode.recordClassIndex(21357);
        }
    }
}

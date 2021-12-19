package com.ss.android.ugc.aweme.ecommerce.pdp.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.ab.k;
import com.ss.android.ugc.aweme.ecommerce.ab.l;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import f.a.t;

public interface a {
    public static final C2085a e_ = C2085a.f86535a;

    public static final class b {
        static {
            Covode.recordClassIndex(54212);
        }
    }

    static {
        Covode.recordClassIndex(54210);
    }

    d a(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i2, boolean z2, Boolean bool);

    t<com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b> a(IPdpStarter.PdpEnterParam pdpEnterParam);

    void a(String str);

    void b(IPdpStarter.PdpEnterParam pdpEnterParam);

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.a$a */
    public static final class C2085a {

        /* renamed from: a */
        static final /* synthetic */ C2085a f86535a = new C2085a();

        /* renamed from: b */
        private static final b f86536b = b.f86544b;

        private C2085a() {
        }

        static {
            Covode.recordClassIndex(54211);
        }

        public static a a() {
            if (k.a() != k.f84231a || l.a()) {
                return c.f86564c;
            }
            return b.f86544b;
        }
    }
}

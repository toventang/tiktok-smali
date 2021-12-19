package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import h.z;

public interface IHostOpenDepend {

    public interface b {
        static {
            Covode.recordClassIndex(21421);
        }

        void a(a aVar);
    }

    public interface c {
        static {
            Covode.recordClassIndex(21422);
        }

        void a(String str);

        void b(String str);
    }

    public interface d {
        static {
            Covode.recordClassIndex(21423);
        }

        void a();

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(21419);
    }

    z getGeckoInfo(String str, String str2, b bVar);

    void scanCode(com.bytedance.ies.xbridge.model.b.c cVar, boolean z, c cVar2);

    z updateGecko(String str, String str2, d dVar, boolean z);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Long f35864a;

        /* renamed from: b  reason: collision with root package name */
        public String f35865b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f35866c;

        static {
            Covode.recordClassIndex(21420);
        }

        public a(boolean z) {
            this.f35866c = z;
        }
    }
}

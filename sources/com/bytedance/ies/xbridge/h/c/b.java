package com.bytedance.ies.xbridge.h.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class b extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0837b f36032e = new C0837b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36033a;

    /* renamed from: b  reason: collision with root package name */
    public String f36034b;

    /* renamed from: c  reason: collision with root package name */
    public String f36035c;

    /* renamed from: d  reason: collision with root package name */
    public a f36036d;

    static {
        Covode.recordClassIndex(21554);
    }

    /* renamed from: com.bytedance.ies.xbridge.h.c.b$b  reason: collision with other inner class name */
    public static final class C0837b {
        static {
            Covode.recordClassIndex(21556);
        }

        private C0837b() {
        }

        public /* synthetic */ C0837b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("level", "message", "tag", "codePosition");
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f36037a;

        /* renamed from: b  reason: collision with root package name */
        public final String f36038b;

        /* renamed from: c  reason: collision with root package name */
        public final int f36039c;

        static {
            Covode.recordClassIndex(21555);
        }

        public a(String str, String str2, int i2) {
            l.c(str, "");
            l.c(str2, "");
            this.f36037a = str;
            this.f36038b = str2;
            this.f36039c = i2;
        }
    }
}

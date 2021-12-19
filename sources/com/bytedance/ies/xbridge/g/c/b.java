package com.bytedance.ies.xbridge.g.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class b extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35998b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<C0832b> f35999a;

    static {
        Covode.recordClassIndex(21527);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21528);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.a("keys");
    }

    /* renamed from: com.bytedance.ies.xbridge.g.c.b$b  reason: collision with other inner class name */
    public static final class C0832b {

        /* renamed from: a  reason: collision with root package name */
        public String f36000a = "";

        /* renamed from: b  reason: collision with root package name */
        public final String f36001b;

        /* renamed from: c  reason: collision with root package name */
        public final String f36002c;

        static {
            Covode.recordClassIndex(21529);
        }

        public C0832b(String str, String str2) {
            l.c(str, "");
            l.c(str2, "");
            this.f36001b = str;
            this.f36002c = str2;
        }
    }
}

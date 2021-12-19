package com.bytedance.ies.xbridge.k.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class a extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0857a f36219c = new C0857a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36220a;

    /* renamed from: b  reason: collision with root package name */
    public String f36221b;

    static {
        Covode.recordClassIndex(21651);
    }

    /* renamed from: com.bytedance.ies.xbridge.k.c.a$a  reason: collision with other inner class name */
    public static final class C0857a {
        static {
            Covode.recordClassIndex(21652);
        }

        private C0857a() {
        }

        public /* synthetic */ C0857a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("accessKey", "channel");
    }
}

package com.bytedance.ies.xbridge.e.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.n;
import java.util.List;

public final class a extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0823a f35928d = new C0823a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f35929a;

    /* renamed from: b  reason: collision with root package name */
    public long f35930b;

    /* renamed from: c  reason: collision with root package name */
    public n f35931c;

    static {
        Covode.recordClassIndex(21479);
    }

    /* renamed from: com.bytedance.ies.xbridge.e.c.a$a  reason: collision with other inner class name */
    public static final class C0823a {
        static {
            Covode.recordClassIndex(21480);
        }

        private C0823a() {
        }

        public /* synthetic */ C0823a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return h.a.n.b("eventName", "timestamp", "params");
    }
}

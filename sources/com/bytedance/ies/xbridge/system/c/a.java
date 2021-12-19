package com.bytedance.ies.xbridge.system.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class a extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0887a f36488b = new C0887a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f36489a = true;

    static {
        Covode.recordClassIndex(21886);
    }

    /* renamed from: com.bytedance.ies.xbridge.system.c.a$a  reason: collision with other inner class name */
    public static final class C0887a {
        static {
            Covode.recordClassIndex(21887);
        }

        private C0887a() {
        }

        public /* synthetic */ C0887a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.a("allow");
    }
}

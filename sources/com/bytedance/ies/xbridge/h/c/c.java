package com.bytedance.ies.xbridge.h.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.n;
import java.util.List;

public final class c extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36040c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36041a;

    /* renamed from: b  reason: collision with root package name */
    public n f36042b;

    static {
        Covode.recordClassIndex(21557);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21558);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return h.a.n.b("eventName", "params");
    }
}

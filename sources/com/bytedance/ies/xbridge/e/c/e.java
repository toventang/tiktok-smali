package com.bytedance.ies.xbridge.e.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class e extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35937b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f35938a;

    static {
        Covode.recordClassIndex(21485);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21486);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.a("eventName");
    }
}

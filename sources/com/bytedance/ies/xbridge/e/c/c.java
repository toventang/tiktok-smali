package com.bytedance.ies.xbridge.e.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class c extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f35933c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f35934a;

    /* renamed from: b  reason: collision with root package name */
    public long f35935b;

    static {
        Covode.recordClassIndex(21482);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21483);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("eventName", "timestamp");
    }
}

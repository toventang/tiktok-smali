package com.bytedance.ies.xbridge.m.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.k;
import h.a.n;
import java.util.List;

public final class e extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36275c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36276a;

    /* renamed from: b  reason: collision with root package name */
    public k f36277b;

    static {
        Covode.recordClassIndex(21702);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21703);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("key", "data");
    }
}

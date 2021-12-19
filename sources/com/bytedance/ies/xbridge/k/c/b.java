package com.bytedance.ies.xbridge.k.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class b extends com.bytedance.ies.xbridge.model.c.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f36222d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Boolean f36223a;

    /* renamed from: b  reason: collision with root package name */
    public Long f36224b;

    /* renamed from: c  reason: collision with root package name */
    public String f36225c;

    static {
        Covode.recordClassIndex(21653);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21654);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.c.a
    public final List<String> a() {
        return n.b("needUpdate", "totalSize", "version");
    }
}

package com.bytedance.ies.xbridge.l.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class b extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f36246d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36247a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36248b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36249c;

    static {
        Covode.recordClassIndex(21674);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21675);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("schema", "replace", "useSysBrowser");
    }
}

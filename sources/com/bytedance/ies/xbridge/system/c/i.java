package com.bytedance.ies.xbridge.system.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class i extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36513c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f36514a = 300;

    /* renamed from: b  reason: collision with root package name */
    public String f36515b = "medium";

    static {
        Covode.recordClassIndex(21902);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21903);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("duration", "style");
    }
}

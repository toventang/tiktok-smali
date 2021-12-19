package com.bytedance.ies.xbridge.l.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class a extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0860a f36243c = new C0860a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36244a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36245b;

    static {
        Covode.recordClassIndex(21672);
    }

    /* renamed from: com.bytedance.ies.xbridge.l.c.a$a  reason: collision with other inner class name */
    public static final class C0860a {
        static {
            Covode.recordClassIndex(21673);
        }

        private C0860a() {
        }

        public /* synthetic */ C0860a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("containerID", "animated");
    }
}

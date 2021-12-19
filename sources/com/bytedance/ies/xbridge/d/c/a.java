package com.bytedance.ies.xbridge.d.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class a extends com.bytedance.ies.xbridge.model.c.a {

    /* renamed from: e  reason: collision with root package name */
    public static final C0818a f35892e = new C0818a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Boolean f35893a;

    /* renamed from: b  reason: collision with root package name */
    public String f35894b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f35895c;

    /* renamed from: d  reason: collision with root package name */
    public String f35896d;

    static {
        Covode.recordClassIndex(21454);
    }

    /* renamed from: com.bytedance.ies.xbridge.d.c.a$a  reason: collision with other inner class name */
    public static final class C0818a {
        static {
            Covode.recordClassIndex(21455);
        }

        private C0818a() {
        }

        public /* synthetic */ C0818a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.c.a
    public final List<String> a() {
        return n.b("useBOE", "boeChannel", "usePPE", "ppeChannel");
    }
}

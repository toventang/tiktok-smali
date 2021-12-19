package com.bytedance.ies.xbridge.n.d;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class d extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f36344g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36345a;

    /* renamed from: b  reason: collision with root package name */
    public String f36346b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36347c;

    /* renamed from: d  reason: collision with root package name */
    public String f36348d;

    /* renamed from: e  reason: collision with root package name */
    public String f36349e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f36350f;

    static {
        Covode.recordClassIndex(21776);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21777);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String a() {
        String str = this.f36348d;
        if (str == null) {
            l.a("cancelText");
        }
        return str;
    }

    public final String b() {
        String str = this.f36349e;
        if (str == null) {
            l.a("confirmText");
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("title", "content", "showCancel", "cancelText", "confirmText", "tapMaskToDismiss");
    }
}

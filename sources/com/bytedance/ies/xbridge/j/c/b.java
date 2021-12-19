package com.bytedance.ies.xbridge.j.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.List;

public final class b extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f36191g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36192a;

    /* renamed from: b  reason: collision with root package name */
    public String f36193b;

    /* renamed from: c  reason: collision with root package name */
    public Object f36194c;

    /* renamed from: d  reason: collision with root package name */
    public String f36195d;

    /* renamed from: e  reason: collision with root package name */
    public n f36196e;

    /* renamed from: f  reason: collision with root package name */
    public n f36197f;

    static {
        Covode.recordClassIndex(21631);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21632);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String a() {
        String str = this.f36192a;
        if (str == null) {
            l.a("url");
        }
        return str;
    }

    public final String b() {
        String str = this.f36193b;
        if (str == null) {
            l.a("method");
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return h.a.n.b("url", "method", "body", "params", "header", "bodyType");
    }
}

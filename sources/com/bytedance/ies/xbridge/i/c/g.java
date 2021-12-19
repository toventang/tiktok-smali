package com.bytedance.ies.xbridge.i.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;
import java.util.Map;

public final class g extends com.bytedance.ies.xbridge.model.c.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f36126e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36127a;

    /* renamed from: b  reason: collision with root package name */
    public String f36128b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, ? extends Object> f36129c;

    /* renamed from: d  reason: collision with root package name */
    public String f36130d;

    static {
        Covode.recordClassIndex(21599);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21600);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.c.a
    public final List<String> a() {
        return n.b("url", "uri", "response", "base64");
    }
}

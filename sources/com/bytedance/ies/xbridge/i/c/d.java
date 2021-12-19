package com.bytedance.ies.xbridge.i.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;
import java.util.Map;

public final class d extends com.bytedance.ies.xbridge.model.c.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f36113d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36114a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, ? extends Object> f36115b;

    /* renamed from: c  reason: collision with root package name */
    public String f36116c;

    static {
        Covode.recordClassIndex(21593);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21594);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.c.a
    public final List<String> a() {
        return n.b("httpCode", "header", "filePath");
    }
}

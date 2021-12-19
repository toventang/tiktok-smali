package com.bytedance.ies.xbridge.h.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.n;
import java.util.List;

public final class d extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f36043e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36044a;

    /* renamed from: b  reason: collision with root package name */
    public String f36045b;

    /* renamed from: c  reason: collision with root package name */
    public int f36046c;

    /* renamed from: d  reason: collision with root package name */
    public n f36047d;

    static {
        Covode.recordClassIndex(21559);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21560);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return h.a.n.b("logType", "service", "status", "value");
    }
}

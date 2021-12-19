package com.bytedance.ies.xbridge.h.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.n;
import java.util.List;

public final class a extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: h  reason: collision with root package name */
    public static final C0836a f36024h = new C0836a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36025a;

    /* renamed from: b  reason: collision with root package name */
    public String f36026b;

    /* renamed from: c  reason: collision with root package name */
    public String f36027c;

    /* renamed from: d  reason: collision with root package name */
    public String f36028d;

    /* renamed from: e  reason: collision with root package name */
    public String f36029e;

    /* renamed from: f  reason: collision with root package name */
    public String f36030f;

    /* renamed from: g  reason: collision with root package name */
    public n f36031g;

    static {
        Covode.recordClassIndex(21552);
    }

    /* renamed from: com.bytedance.ies.xbridge.h.c.a$a  reason: collision with other inner class name */
    public static final class C0836a {
        static {
            Covode.recordClassIndex(21553);
        }

        private C0836a() {
        }

        public /* synthetic */ C0836a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return h.a.n.b("label", "tag", "refer", "groupID", "creativeID", "logExtra", "extraParams");
    }
}

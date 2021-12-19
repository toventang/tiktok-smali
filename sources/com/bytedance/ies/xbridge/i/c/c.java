package com.bytedance.ies.xbridge.i.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.List;

public final class c extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f36108e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f36109a;

    /* renamed from: b  reason: collision with root package name */
    public String f36110b;

    /* renamed from: c  reason: collision with root package name */
    public n f36111c;

    /* renamed from: d  reason: collision with root package name */
    public n f36112d;

    static {
        Covode.recordClassIndex(21591);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21592);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String a() {
        String str = this.f36109a;
        if (str == null) {
            l.a("url");
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return h.a.n.b("url", "extension", "params", "header");
    }
}

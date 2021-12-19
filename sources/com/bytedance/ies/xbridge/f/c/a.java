package com.bytedance.ies.xbridge.f.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class a extends com.bytedance.ies.xbridge.model.params.a {

    /* renamed from: c  reason: collision with root package name */
    public static final b f35961c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f35962a;

    /* renamed from: b  reason: collision with root package name */
    public List<C0828a> f35963b;

    static {
        Covode.recordClassIndex(21506);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(21508);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.a("actionList");
    }

    /* renamed from: com.bytedance.ies.xbridge.f.c.a$a  reason: collision with other inner class name */
    public static final class C0828a {

        /* renamed from: a  reason: collision with root package name */
        public final String f35964a;

        /* renamed from: b  reason: collision with root package name */
        public final JSONObject f35965b;

        static {
            Covode.recordClassIndex(21507);
        }

        public C0828a(String str, JSONObject jSONObject) {
            l.c(str, "");
            this.f35964a = str;
            this.f35965b = jSONObject;
        }
    }
}

package com.bytedance.lynx.hybrid.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.a.b;
import com.bytedance.sdk.xbridge.registry.core_api.a.b;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, a> f40891a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final String f40892b = "BridgeHandler";

    static {
        Covode.recordClassIndex(25068);
    }

    public final void a() {
        for (Map.Entry<String, a> entry : this.f40891a.entrySet()) {
            if (entry.getValue().f40886e) {
                b bVar = entry.getValue().f40885d;
                if (bVar != null) {
                    bVar.a();
                }
                entry.getValue().f40885d = null;
            }
        }
    }

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f40893a;

        static {
            Covode.recordClassIndex(25069);
        }

        a(b bVar) {
            this.f40893a = bVar;
        }

        @Override // com.bytedance.lynx.hybrid.b.a.c
        public final void a(int i2, String str, JSONObject jSONObject) {
            l.c(str, "");
            if (jSONObject == null) {
                this.f40893a.a(b.a.b(i2, str).a());
            } else {
                this.f40893a.a(jSONObject);
            }
        }
    }

    public final void a(a aVar) {
        l.c(aVar, "");
        this.f40891a.put(aVar.f40882a, aVar);
    }

    public final boolean a(String str, String str2, com.bytedance.sdk.xbridge.registry.core_api.a.b bVar) {
        b bVar2;
        l.c(str, "");
        l.c(str2, "");
        l.c(bVar, "");
        a aVar = this.f40891a.get(str);
        if (aVar == null || (bVar2 = aVar.f40885d) == null) {
            return false;
        }
        bVar2.a(str, str2, new a(bVar));
        return true;
    }
}

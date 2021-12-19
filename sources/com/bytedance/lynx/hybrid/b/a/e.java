package com.bytedance.lynx.hybrid.b.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.d.b;
import com.bytedance.sdk.xbridge.registry.core.b;
import com.bytedance.sdk.xbridge.registry.core_api.a.c;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import h.f.b.l;
import h.n;
import java.util.HashMap;
import org.json.JSONObject;

public final class e implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f40894c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d f40895a = new d();

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, d> f40896b = new HashMap<>();

    static {
        Covode.recordClassIndex(25070);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(25071);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static String a(Object obj) {
        JSONObject jSONObject;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else if (obj instanceof ReadableMap) {
            ReadableMap map = ((ReadableMap) obj).getMap("data");
            if (map == null) {
                jSONObject = new JSONObject();
            } else if (map instanceof JavaOnlyMap) {
                jSONObject = b.f43958a.a((JavaOnlyMap) map);
            } else {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        l.a((Object) jSONObject2, "");
        return jSONObject2;
    }

    public final void a(a aVar) {
        b.a aVar2;
        l.c(aVar, "");
        if (aVar.f40884c.length() > 0) {
            if (this.f40896b.get(aVar.f40884c) == null) {
                this.f40896b.put(aVar.f40884c, new d());
            }
            d dVar = this.f40896b.get(aVar.f40884c);
            if (dVar != null) {
                dVar.a(aVar);
            }
        } else {
            this.f40895a.a(aVar);
        }
        int i2 = f.f40897a[aVar.f40883b.ordinal()];
        if (i2 == 1) {
            aVar2 = b.a.PUBLIC;
        } else if (i2 == 2) {
            aVar2 = b.a.PRIVATE;
        } else if (i2 == 3) {
            aVar2 = b.a.PROTECT;
        } else if (i2 == 4) {
            aVar2 = b.a.SECURE;
        } else {
            throw new n();
        }
        com.bytedance.sdk.xbridge.a.b.f43912b.a(aVar.f40882a, "DEFAULT", aVar2);
    }

    @Override // com.bytedance.sdk.xbridge.registry.core_api.a.c
    public final void a(Object obj, String str, String str2, String str3, com.bytedance.sdk.xbridge.registry.core_api.a.b bVar) {
        d dVar;
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        l.c(bVar, "");
        com.bytedance.sdk.xbridge.protocol.d.e.b("MagpieLegacyBridgeSupport", "realDispatchBridgeMethod: " + Thread.currentThread());
        if ((str2.length() <= 0 || (dVar = this.f40896b.get(str2)) == null || !dVar.a(str, a(obj), bVar)) && !this.f40895a.a(str, a(obj), bVar)) {
            bVar.a(com.bytedance.sdk.xbridge.registry.core_api.a.a.NOT_FOUND);
        }
    }
}

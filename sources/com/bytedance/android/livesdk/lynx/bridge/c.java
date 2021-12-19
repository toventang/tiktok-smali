package com.bytedance.android.livesdk.lynx.bridge;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.b;
import com.bytedance.ies.web.jsbridge2.l;
import com.bytedance.ies.web.jsbridge2.w;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.WritableMap;
import h.z;
import org.json.JSONObject;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f18763d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TTLiveLynxBridgeModule f18764a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ies.bullet.service.base.c.c f18765b;

    /* renamed from: c  reason: collision with root package name */
    public h.f.a.b<? super TTLiveLynxBridgeModule, z> f18766c;
    private final Context n;
    private final h.f.a.a<String> o;

    static {
        Covode.recordClassIndex(11105);
    }

    @Override // com.bytedance.ies.web.jsbridge2.b
    public final void a(l lVar) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11106);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.b
    public final String a() {
        return this.o.invoke();
    }

    @Override // com.bytedance.ies.web.jsbridge2.b
    public final View b() {
        com.bytedance.ies.bullet.service.base.c.c cVar = this.f18765b;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // com.bytedance.ies.web.jsbridge2.b
    public final Context b(l lVar) {
        return this.n;
    }

    public final void a(TTLiveLynxBridgeModule tTLiveLynxBridgeModule) {
        h.f.b.l.d(tTLiveLynxBridgeModule, "");
        this.f18764a = tTLiveLynxBridgeModule;
    }

    @Override // com.bytedance.ies.web.jsbridge2.b
    public final void a(String str) {
        Object remove;
        JSONObject jSONObject = new JSONObject(str);
        Object remove2 = jSONObject.remove("__event_id");
        if (!(remove2 instanceof String)) {
            remove2 = null;
        }
        String str2 = (String) remove2;
        if (str2 != null && (remove = jSONObject.remove("__params")) != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("data", remove);
            WritableMap a2 = a.a(jSONObject2);
            com.bytedance.ies.bullet.service.base.c.c cVar = this.f18765b;
            if (cVar != null) {
                cVar.a(str2, JavaOnlyArray.of(a2));
            }
        }
    }

    public c(Context context, h.f.a.a<String> aVar) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(aVar, "");
        this.n = context;
        this.o = aVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.b
    public final void a(String str, w wVar) {
        if (wVar != null) {
            TTLiveLynxBridgeModule tTLiveLynxBridgeModule = this.f18764a;
            if (tTLiveLynxBridgeModule == null) {
                h.f.b.l.a("lynxBridgeModule");
            }
            tTLiveLynxBridgeModule.invokeCallback$livehybrid_impl_release(new JSONObject(str), wVar);
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.b
    public final void a(JSONObject jSONObject, w wVar) {
        h.f.b.l.d(jSONObject, "");
        if (wVar != null) {
            TTLiveLynxBridgeModule tTLiveLynxBridgeModule = this.f18764a;
            if (tTLiveLynxBridgeModule == null) {
                h.f.b.l.a("lynxBridgeModule");
            }
            tTLiveLynxBridgeModule.invokeCallback$livehybrid_impl_release(jSONObject, wVar);
        }
    }

    public final w a(String str, String str2, String str3, String str4) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        h.f.b.l.d(str3, "");
        h.f.b.l.d(str4, "");
        w.a a2 = w.a();
        a2.f35701c = str;
        a2.f35702d = str2;
        a2.f35703e = str4;
        a2.f35704f = str3;
        w a3 = a2.a();
        a(a3);
        h.f.b.l.b(a3, "");
        return a3;
    }
}

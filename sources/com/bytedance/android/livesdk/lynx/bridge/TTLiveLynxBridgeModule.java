package com.bytedance.android.livesdk.lynx.bridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.w;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.d;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import h.f.a.b;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class TTLiveLynxBridgeModule extends LynxModule {
    private final c bridge;
    private final ConcurrentHashMap<w, Callback> callRegistry = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(11102);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTLiveLynxBridgeModule(Context context, Object obj) {
        super(context);
        l.d(context, "");
        l.d(obj, "");
        c cVar = (c) (!(obj instanceof c) ? null : obj);
        this.bridge = cVar;
        if (cVar != null) {
            cVar.a(this);
            b<? super TTLiveLynxBridgeModule, z> bVar = cVar.f18766c;
            if (bVar != null) {
                bVar.invoke(this);
            }
        }
    }

    public final void invokeCallback$livehybrid_impl_release(JSONObject jSONObject, w wVar) {
        z zVar;
        l.d(jSONObject, "");
        l.d(wVar, "");
        try {
            Object remove = jSONObject.remove("__params");
            if (remove != null && (remove instanceof JSONObject)) {
                ((JSONObject) remove).remove("__data");
                ((JSONObject) remove).remove("__msg_type");
                String optString = ((JSONObject) remove).optString("__callback_id", "0");
                l.b(optString, "");
                jSONObject.put("eventId", Long.parseLong(optString));
                if (((JSONObject) remove).has("___error___")) {
                    jSONObject.put("code", 0);
                    jSONObject.put("errMsg", ((JSONObject) remove).remove("___error___"));
                } else {
                    jSONObject.put("code", ((JSONObject) remove).remove("code"));
                }
                jSONObject.put("data", remove);
            }
            WritableMap a2 = a.a(jSONObject);
            Callback remove2 = this.callRegistry.remove(wVar);
            if (remove2 != null) {
                remove2.invoke(a2);
                zVar = z.f158842a;
            } else {
                zVar = null;
            }
            q.m223constructorimpl(zVar);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }

    @d
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        w wVar;
        String str2;
        l.d(str, "");
        l.d(readableMap, "");
        l.d(callback, "");
        try {
            JSONObject a2 = a.a(readableMap);
            c cVar = this.bridge;
            if (cVar != null) {
                JSONObject optJSONObject = a2.optJSONObject("data");
                if (optJSONObject == null || (str2 = optJSONObject.toString()) == null) {
                    str2 = "{}";
                }
                l.b(str2, "");
                String optString = a2.optString("namespace", "webcast");
                l.b(optString, "");
                String optString2 = a2.optString("eventId", "lynx");
                l.b(optString2, "");
                wVar = cVar.a(str, str2, optString, optString2);
                if (wVar != null) {
                    this.callRegistry.put(wVar, callback);
                    q.m223constructorimpl(wVar);
                }
            }
            wVar = null;
            q.m223constructorimpl(wVar);
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
        }
    }
}

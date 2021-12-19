package com.bytedance.sdk.bridge.js.spec;

import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.sdk.bridge.d;
import com.bytedance.sdk.bridge.f;
import com.bytedance.sdk.bridge.g;
import com.bytedance.sdk.bridge.h;
import com.bytedance.sdk.bridge.js.a;
import com.bytedance.services.apm.api.IApmAgent;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class JsBridgeLifeCycleObserver implements au {

    /* renamed from: a  reason: collision with root package name */
    private final Object f43895a;

    /* renamed from: b  reason: collision with root package name */
    private final i f43896b;

    static {
        Covode.recordClassIndex(26823);
    }

    @v(a = i.a.ON_ANY)
    public final void onAny() {
    }

    @v(a = i.a.ON_START)
    public final void onStart() {
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        onAny();
        if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestory$js_bridge_release();
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        Object obj = this.f43895a;
        i iVar = this.f43896b;
        l.c(obj, "");
        g.a(a.f43877a, " disableJsBridgeMethods " + obj.getClass().getSimpleName());
        h a2 = com.bytedance.sdk.bridge.a.a.a(obj.getClass());
        if (a2 != null) {
            for (d dVar : a2.a()) {
                l.a((Object) dVar, "");
                String str = dVar.f43858b;
                com.bytedance.sdk.bridge.b.a a3 = f.a(a.f43878b.get(str), iVar);
                if (a3 != null) {
                    a3.f43842c = false;
                }
                g.a(a.f43877a, " disable  " + str + '\n');
            }
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        Object obj = this.f43895a;
        i iVar = this.f43896b;
        l.c(obj, "");
        g.a(a.f43877a, " enableJsBridgeMethods " + obj.getClass().getSimpleName());
        h a2 = com.bytedance.sdk.bridge.a.a.a(obj.getClass());
        if (a2 != null) {
            for (d dVar : a2.a()) {
                l.a((Object) dVar, "");
                String str = dVar.f43858b;
                com.bytedance.sdk.bridge.b.a a3 = f.a(a.f43878b.get(str), iVar);
                if (a3 != null) {
                    a3.f43842c = true;
                }
                g.a(a.f43877a, " enable  " + str + '\n');
            }
        }
        com.bytedance.sdk.bridge.js.a.a.f43886a.size();
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestory$js_bridge_release() {
        MethodCollector.i(1484);
        Object obj = this.f43895a;
        i iVar = this.f43896b;
        l.c(obj, "");
        l.c(iVar, "");
        g.a(a.f43877a, " unregister " + obj.getClass().getSimpleName());
        h a2 = com.bytedance.sdk.bridge.a.a.a(obj.getClass());
        if (a2 != null) {
            try {
                for (d dVar : a2.a()) {
                    l.a((Object) dVar, "");
                    String str = dVar.f43858b;
                    List<com.bytedance.sdk.bridge.b.a> list = a.f43878b.get(str);
                    if (list != null && a.f43880d.contains(str)) {
                        a.f43880d.remove(str);
                    }
                    com.bytedance.sdk.bridge.b.a a3 = f.a(list, iVar);
                    if (!(list == null || a3 == null)) {
                        list.remove(a3);
                        g.a(a.f43877a, "unregister  " + iVar + " -- " + str);
                    }
                }
            } catch (ClassCastException e2) {
                e2.printStackTrace();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_msg", Log.getStackTraceString(e2));
                jSONObject.put("error_code", 1);
                jSONObject.put("event_type", "exception");
                JSONObject jSONObject2 = new JSONObject();
                l.c("exception", "");
                l.c(jSONObject, "");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("exception", 1);
                IApmAgent iApmAgent = (IApmAgent) c.a(IApmAgent.class);
                if (iApmAgent != null) {
                    iApmAgent.monitorEvent("component_bridge_sdk_monitor", jSONObject3, jSONObject2, jSONObject);
                }
                if (com.bytedance.sdk.bridge.c.f43852a.f43826b != null) {
                    try {
                        if (jSONObject.has("error_msg")) {
                            jSONObject.optString("error_msg");
                        }
                        if (jSONObject.has("error_url")) {
                            jSONObject.optString("error_url");
                        }
                        if (jSONObject.has("event_type")) {
                            jSONObject.optString("event_type");
                        }
                        if (jSONObject.has("bridge_name")) {
                            jSONObject.optString("bridge_name");
                        }
                        if (jSONObject.has("error_activity")) {
                            jSONObject.optString("error_activity");
                        }
                        if (jSONObject.has("error_code")) {
                            jSONObject.optInt("error_code");
                        }
                        if (jSONObject.has("is_sync")) {
                            jSONObject.optInt("is_sync");
                        }
                        if (jSONObject.has("extra_params")) {
                            jSONObject.optJSONObject("extra_params");
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
        synchronized (a.f43879c) {
            try {
                Iterator<com.bytedance.sdk.bridge.b.c> it = a.f43879c.iterator();
                l.a((Object) it, "");
                while (it.hasNext()) {
                    com.bytedance.sdk.bridge.b.c next = it.next();
                    if (l.a(obj, next.f43849a)) {
                        a.f43879c.remove(next);
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(1484);
                throw th;
            }
        }
        a.a();
        MethodCollector.o(1484);
    }
}

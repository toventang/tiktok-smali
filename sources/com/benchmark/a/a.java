package com.benchmark.a;

import com.benchmark.IBTCHApplog;
import com.benchmark.tools.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static e.a f6025a;

    static {
        Covode.recordClassIndex(2936);
    }

    public static synchronized void a(e.a aVar) {
        synchronized (a.class) {
            MethodCollector.i(6440);
            f6025a = aVar;
            MethodCollector.o(6440);
        }
    }

    public static void a(String str, String str2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject = null;
        }
        a(str, jSONObject);
    }

    public static void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("sdk_version", "2.6.0-mt_2");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        e.a aVar = f6025a;
        if (aVar != null) {
            aVar.a(str, jSONObject);
            return;
        }
        IBTCHApplog iBTCHApplog = (IBTCHApplog) ServiceManager.get().getService(IBTCHApplog.class);
        if (iBTCHApplog != null) {
            iBTCHApplog.onEvent(str, jSONObject);
        }
    }
}

package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.l;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;

/* access modifiers changed from: package-private */
public class m implements e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f27388a = m.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final Context f27389b;

    static {
        Covode.recordClassIndex(16110);
    }

    @Override // com.bytedance.common.wschannel.server.e
    public final Map<Integer, IWsApp> a() {
        JSONArray jSONArray;
        int length;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String a2 = l.a(this.f27389b).f27243a.a("ws_apps", "");
            if (TextUtils.isEmpty(a2) || (length = (jSONArray = new JSONArray(a2)).length()) <= 0) {
                return linkedHashMap;
            }
            for (int i2 = 0; i2 < length; i2++) {
                SsWsApp a3 = SsWsApp.a.a(jSONArray.optJSONObject(i2));
                if (a(a3)) {
                    linkedHashMap.put(Integer.valueOf(WsChannelService.a(a3)), a3);
                }
            }
            return linkedHashMap;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    m(Context context) {
        this.f27389b = context;
    }

    private static boolean a(IWsApp iWsApp) {
        if (iWsApp != null && iWsApp.a() > 0 && iWsApp.b() > 0 && !com.bytedance.common.utility.m.a(iWsApp.h()) && iWsApp.e() > 0 && !iWsApp.k().isEmpty() && !com.bytedance.common.utility.m.a(iWsApp.c()) && iWsApp.i() > 0 && !com.bytedance.common.utility.m.a(iWsApp.d()) && iWsApp.f() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.server.e
    public final void a(Map<Integer, IWsApp> map) {
        MethodCollector.i(6129);
        if (map == null) {
            MethodCollector.o(6129);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (WsChannelService.class) {
            try {
                for (Map.Entry<Integer, IWsApp> entry : map.entrySet()) {
                    try {
                        if (a(entry.getValue())) {
                            jSONArray.put(entry.getValue().g());
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(6129);
                throw th;
            }
        }
        try {
            l a2 = l.a(this.f27389b);
            String jSONArray2 = jSONArray.toString();
            WsChannelMultiProcessSharedProvider.a a3 = a2.f27243a.a();
            a3.f26989b.put("ws_apps", jSONArray2);
            a3.a();
            MethodCollector.o(6129);
        } catch (Exception e3) {
            e3.printStackTrace();
            MethodCollector.o(6129);
        }
    }
}

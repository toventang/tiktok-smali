package com.ss.android.common.c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.analytics.page.f;
import com.bytedance.analytics.page.g;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.t;
import com.ss.android.j.b;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.search.k.as;
import com.ss.android.ugc.aweme.search.k.c;
import h.m.p;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public class a {
    static {
        Covode.recordClassIndex(36649);
    }

    public static void a() {
        b.f59365a = false;
        b.f59367c = 0;
    }

    private static JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        if (keys == null) {
            return null;
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public static void a(final String str, final Bundle bundle) {
        final long currentTimeMillis = System.currentTimeMillis();
        t.a().a(new Runnable() {
            /* class com.ss.android.common.c.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(36651);
            }

            public final void run() {
                if (!m.a(str)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("_event_v3", 1);
                        jSONObject.put("event_v3_reserved_field_time_stamp", currentTimeMillis);
                        Bundle bundle = bundle;
                        if (bundle != null) {
                            for (String str : bundle.keySet()) {
                                jSONObject.put(str, a(bundle, str));
                            }
                        }
                        String abSDKVersion = AppLog.getAbSDKVersion();
                        if (!TextUtils.isEmpty(abSDKVersion)) {
                            jSONObject.put("ab_sdk_version", abSDKVersion);
                        }
                    } catch (Throwable unused) {
                    }
                    AppLog.onEvent((Context) null, "event_v3", str, (String) null, 0, 0, jSONObject);
                }
            }

            private static Object a(Bundle bundle, String str) {
                try {
                    return bundle.get(str);
                } catch (Exception | OutOfMemoryError unused) {
                    return null;
                }
            }
        });
    }

    public static void a(final String str, JSONObject jSONObject) {
        String str2;
        Object obj;
        Object obj2;
        String str3;
        boolean z;
        int value;
        if (as.f121196a && str != null && jSONObject != null && c.f121226e.containsKey(str)) {
            c.a.a().execute(new c.a.RunnableC3136a(str, jSONObject));
        }
        if (com.ss.android.j.a.a() && !p.a("btm_page_show", str, true)) {
            String str4 = null;
            if (jSONObject != null) {
                str2 = jSONObject.optString("enter_from");
            } else {
                str2 = null;
            }
            f fVar = g.f6584b;
            if (!(fVar == null || (obj = fVar.q) == null || jSONObject == null)) {
                jSONObject.put("btm_pre", obj);
            }
            f fVar2 = g.f6584b;
            if (!(fVar2 == null || (obj2 = fVar2.r) == null || jSONObject == null)) {
                jSONObject.put("btm_ppre", obj2);
            }
            f fVar3 = g.f6584b;
            if (fVar3 == null) {
                str3 = null;
            } else {
                str3 = fVar3.p;
            }
            if (jSONObject != null) {
                jSONObject.put("btm", str3);
            }
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && str3 != null && str3.length() != 0) {
                f fVar4 = g.f6584b;
                if (fVar4 != null) {
                    str4 = fVar4.f6571b;
                }
                if (p.a(str2, str4, true)) {
                    value = b.a.SAME.getValue();
                } else {
                    value = b.a.DIFF.getValue();
                }
                jSONObject.put("btm_compare_enter_from", value);
            } else if (jSONObject != null) {
                jSONObject.put("btm_compare_enter_from", b.a.NULL.getValue());
            }
        }
        final JSONObject a2 = a(jSONObject);
        final long currentTimeMillis = System.currentTimeMillis();
        t.a().a(new Runnable() {
            /* class com.ss.android.common.c.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36650);
            }

            public final void run() {
                while (b.f59365a) {
                    b.a();
                }
                if (!m.a(str)) {
                    JSONObject jSONObject = a2;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    try {
                        jSONObject.put("_event_v3", 1);
                        jSONObject.put("event_v3_reserved_field_time_stamp", currentTimeMillis);
                        String abSDKVersion = AppLog.getAbSDKVersion();
                        if (!TextUtils.isEmpty(abSDKVersion)) {
                            jSONObject.put("ab_sdk_version", abSDKVersion);
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    AppLog.onEvent((Context) null, "event_v3", str, (String) null, 0, 0, jSONObject);
                }
            }
        });
        MLDataCenterService.instance().traceMobClickEvent(str, jSONObject);
    }
}

package com.bytedance.push.i;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.c.k;
import com.bytedance.push.f.c;
import com.ss.android.message.a;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f42197a;

    /* renamed from: b  reason: collision with root package name */
    private final k f42198b;

    static {
        Covode.recordClassIndex(25786);
    }

    public final void run() {
        Map<Integer, c> a2;
        MethodCollector.i(6469);
        synchronized (b.f42187a) {
            try {
                if (!TextUtils.isEmpty(this.f42197a) && (a2 = e.a(a.f59817a)) != null && !a2.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    for (c cVar : a2.values()) {
                        if (cVar != null && cVar.f42132e > 0) {
                            if (!TextUtils.isEmpty(cVar.f42131d)) {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("sender_id", cVar.f42132e);
                                    jSONObject.put("token", cVar.f42131d);
                                    jSONArray.put(jSONObject);
                                } catch (JSONException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                    }
                    Map<String, String> e3 = this.f42198b.e();
                    e3.put("update_event", this.f42197a);
                    String a3 = com.ss.android.message.a.a.a(com.ss.android.pushmanager.a.a("/service/1/update_token/"), e3);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Pair("sender_token_list", jSONArray.toString()));
                    int i2 = 0;
                    while (true) {
                        try {
                            if ("success".equals(new JSONObject(j.f26946a.a(a3, arrayList, (Map<String, String>) null)).optString("message"))) {
                                break;
                            }
                        } catch (Throwable unused) {
                        }
                        i2++;
                        if (i2 >= 2) {
                            break;
                        }
                    }
                }
            } finally {
                MethodCollector.o(6469);
            }
        }
    }

    public d(k kVar, String str) {
        this.f42198b = kVar;
        this.f42197a = str;
    }
}

package com.bytedance.bdturing.c;

import android.text.TextUtils;
import com.bytedance.bdturing.a;
import com.bytedance.bdturing.b;
import com.bytedance.bdturing.g;
import com.bytedance.bdturing.j;
import com.bytedance.bdturing.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.kakao.usermgmt.StringSet;
import h.m.d;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class e implements a {
    static {
        Covode.recordClassIndex(15550);
    }

    public void a() {
    }

    public void a(int i2, int i3) {
    }

    public void a(int i2, String str, String str2) {
    }

    public void a(c cVar) {
    }

    public void a(String str, b bVar) {
    }

    public void b() {
    }

    private void c(final c cVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject(cVar.f26446c);
            final String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("method");
            JSONObject optJSONObject = jSONObject.optJSONObject("query");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
            final String str2 = null;
            if (optJSONObject != null) {
                StringBuilder append = new StringBuilder(string).append("?");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (optJSONObject.get(next) != null) {
                        str = optJSONObject.get(next).toString();
                    } else {
                        str = null;
                    }
                    append.append("&" + next + "=").append(str);
                }
                string = append.toString();
            }
            if (optJSONObject2 != null) {
                str2 = optJSONObject2.toString().replaceAll("\\\\/", "/");
            }
            if (g.a()) {
                g.d(string);
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json; charset=utf-8");
            if (string2.equals(UGCMonitor.TYPE_POST)) {
                m.a.f26544a.a(new Runnable() {
                    /* class com.bytedance.bdturing.c.e.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(15552);
                    }

                    public final void run() {
                        e.a(cVar, new String(a.C0562a.f26400a.f26393a.v.post(string, hashMap, str2.getBytes()), d.f158808a));
                    }
                });
            } else {
                m.a.f26544a.a(new Runnable() {
                    /* class com.bytedance.bdturing.c.e.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(15553);
                    }

                    public final void run() {
                        e.a(cVar, new String(a.C0562a.f26400a.f26393a.v.get(string, hashMap), d.f158808a));
                    }
                });
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.bdturing.c.a
    public final void b(final c cVar) {
        String str;
        try {
            String str2 = cVar.f26445b;
            char c2 = 65535;
            switch (str2.hashCode()) {
                case -1759249244:
                    if (str2.equals("bytedcert.verifyResult")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1628743486:
                    if (str2.equals("bytedcert.h5_state_changed")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1563440329:
                    if (str2.equals("bytedcert.getTouch")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1534238297:
                    if (str2.equals("bytedcert.verify")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case -1471628194:
                    if (str2.equals("bytedcert.pageEnd")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1366167938:
                    if (str2.equals("bytedcert.refreshVerifyViewFinish")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case -1028963129:
                    if (str2.equals("bytedcert.preLoadVerifyFinish")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case -514719849:
                    if (str2.equals("bytedcert.dialogSize")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 428780843:
                    if (str2.equals("bytedcert.getSettings")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 491779646:
                    if (str2.equals("bytedcert.eventToNative")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1154510586:
                    if (str2.equals("bytedcert.readyView")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 1176627553:
                    if (str2.equals("bytedcert.network.request")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    JSONObject jSONObject = new JSONObject(cVar.f26446c);
                    a(jSONObject.getInt("w"), jSONObject.getInt("h"));
                    return;
                case 1:
                    m.a.f26544a.a(2, cVar);
                    return;
                case 2:
                    a();
                    return;
                case 3:
                    JSONObject jSONObject2 = new JSONObject(cVar.f26446c);
                    int optInt = jSONObject2.optInt("result");
                    jSONObject2.optString("mode");
                    jSONObject2.optString(StringSet.type);
                    a(optInt, jSONObject2.optString("token"), jSONObject2.optString("mobile"));
                    return;
                case 4:
                    JSONObject jSONObject3 = new JSONObject(cVar.f26446c);
                    HashMap hashMap = new HashMap();
                    Iterator<String> keys = jSONObject3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = jSONObject3.opt(next);
                        if (opt != null) {
                            str = opt.toString();
                        } else {
                            str = null;
                        }
                        hashMap.put(next, str);
                    }
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    JSONObject jSONObject4 = new JSONObject(cVar.f26446c);
                    com.bytedance.bdturing.e.a(jSONObject4.optString("event"), jSONObject4);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    c(cVar);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    a(cVar);
                    return;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    a(new JSONObject(cVar.f26446c).getString("params"), new b() {
                        /* class com.bytedance.bdturing.c.e.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(15551);
                        }

                        @Override // com.bytedance.bdturing.b
                        public final void b(int i2) {
                            a(i2);
                        }

                        @Override // com.bytedance.bdturing.b
                        public final void a(int i2) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("result", i2);
                                cVar.a(1, jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                    });
                    return;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    b();
                    return;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    j.a.f26515a.f26514d = true;
                    long currentTimeMillis = System.currentTimeMillis() - j.a.f26515a.f26512b;
                    JSONObject jSONObject5 = new JSONObject();
                    try {
                        jSONObject5.put("duration", currentTimeMillis);
                        jSONObject5.put("key", "pre_create_success");
                        com.bytedance.bdturing.e.a("turing_verify_sdk", jSONObject5);
                        return;
                    } catch (JSONException e2) {
                        g.a(e2);
                        return;
                    }
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                    long currentTimeMillis2 = System.currentTimeMillis() - j.a.f26515a.f26513c;
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("duration", currentTimeMillis2);
                        jSONObject6.put("key", "pre_create_load_success");
                        com.bytedance.bdturing.e.a("turing_verify_sdk", jSONObject6);
                        return;
                    } catch (JSONException e3) {
                        g.a(e3);
                        return;
                    }
                default:
                    return;
            }
        } catch (Exception unused) {
        }
    }

    public static void a(c cVar, String str) {
        if (g.a()) {
            g.d(str);
        }
        int i2 = !TextUtils.isEmpty(str) ? 1 : 0;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", str);
            jSONObject = new JSONObject(str);
        } catch (JSONException e2) {
            e2.printStackTrace();
            i2 = 0;
        }
        cVar.a(i2, jSONObject);
    }
}

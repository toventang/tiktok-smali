package com.ss.android.sdk.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.aweme.bf.d;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile b f60131a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final c[] f60132b = c.f60135a;

    /* renamed from: c  reason: collision with root package name */
    public final c[] f60133c = c.f60136b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f60134d;

    static {
        Covode.recordClassIndex(37147);
    }

    private b() {
    }

    public final boolean a() {
        if (b() != null) {
            return true;
        }
        return false;
    }

    public final c b() {
        b(a.f62426a);
        c[] cVarArr = this.f60133c;
        for (c cVar : cVarArr) {
            if (cVar.o) {
                return cVar;
            }
        }
        return null;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        b(a.f62426a);
        c[] cVarArr = this.f60132b;
        for (c cVar : cVarArr) {
            if (cVar.o && !TextUtils.isEmpty(cVar.f60146l) && cVar.f60146l.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public final void a(Context context) {
        if (context != null) {
            JSONObject jSONObject = new JSONObject();
            c[] cVarArr = this.f60133c;
            for (c cVar : cVarArr) {
                if (cVar.u > 0) {
                    try {
                        jSONObject.put(cVar.f60146l, cVar.u);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            c[] cVarArr2 = this.f60133c;
            boolean z = true;
            for (c cVar2 : cVarArr2) {
                if (cVar2.o) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(cVar2.f60146l);
                    z = false;
                }
            }
            String sb2 = sb.toString();
            SharedPreferences.Editor edit = d.a(context, "com.ss.spipe_setting", 0).edit();
            edit.putString("expire_platforms", jSONObject.toString());
            edit.putString("bind_platforms", sb2);
            com.bytedance.common.utility.e.a.a(edit);
        }
    }

    private void b(Context context) {
        JSONObject jSONObject;
        String[] split;
        if (!this.f60134d && context != null) {
            this.f60134d = true;
            SharedPreferences a2 = d.a(context, "com.ss.spipe_setting", 0);
            try {
                HashMap hashMap = new HashMap();
                String string = a2.getString("expire_platforms", null);
                String string2 = a2.getString("bind_platforms", "");
                if (TextUtils.isEmpty(string)) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = new JSONObject(string);
                }
                c[] cVarArr = this.f60133c;
                for (c cVar : cVarArr) {
                    if (!jSONObject.isNull(cVar.f60146l)) {
                        cVar.u = jSONObject.optLong(cVar.f60146l, -1);
                    }
                }
                hashMap.clear();
                if (!(TextUtils.isEmpty(string2) || (split = string2.split(",")) == null || split.length <= 0)) {
                    for (String str : split) {
                        hashMap.put(str, str);
                    }
                    c[] cVarArr2 = this.f60133c;
                    for (c cVar2 : cVarArr2) {
                        if (hashMap.containsKey(cVar2.f60146l)) {
                            cVar2.o = true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}

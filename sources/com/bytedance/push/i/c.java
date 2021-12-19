package com.bytedance.push.i;

import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.PushBody;
import com.bytedance.push.f;
import com.ss.android.message.a.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final int f42195a;

    /* renamed from: b  reason: collision with root package name */
    private final PushBody f42196b;

    static {
        Covode.recordClassIndex(25785);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.push.i.a
    public final void a() {
        byte[] bArr;
        Map<String, String> e2 = f.f42099a.e();
        String a2 = a.a(com.ss.android.pushmanager.a.a("/cloudpush/callback/client_show/"), e2);
        String str = e2.get("device_id");
        String str2 = e2.get("aid");
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("client_time", String.valueOf(System.currentTimeMillis() / 1000));
            jSONObject.put("did", str);
            jSONObject.put("aid", str2);
            jSONObject.put("sender", String.valueOf(this.f42195a));
            jSONObject.put("group_id", String.valueOf(this.f42196b.f42026c));
            jSONObject.put("rid", String.valueOf(this.f42196b.f42024a));
            jSONObject.put("rid64", String.valueOf(this.f42196b.f42025b));
            jSONArray.put(jSONObject);
            bArr = jSONArray.toString().getBytes("UTF-8");
        } catch (Throwable unused) {
            bArr = null;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/json; charset=utf-8");
            j.f26946a.a(a2, bArr, hashMap);
        } catch (Throwable unused2) {
        }
    }

    public c(int i2, PushBody pushBody) {
        this.f42195a = i2;
        this.f42196b = pushBody;
    }
}

package com.ss.android.deviceregister.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class c extends d {
    static {
        Covode.recordClassIndex(36704);
    }

    public c(Context context, boolean z) {
        super(context, z);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.deviceregister.b.d
    public final void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String a2 = this.f59446l.a();
                String b2 = this.f59446l.b();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("old_id", str);
                jSONObject.put("new_id", str2);
                if (this.f59444j) {
                    jSONObject.put("openudid", a2);
                }
                jSONObject.put("clientudid", b2);
                a("did_change", jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}

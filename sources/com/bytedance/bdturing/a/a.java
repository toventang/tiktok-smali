package com.bytedance.bdturing.a;

import android.content.SharedPreferences;
import com.bytedance.bdturing.a;
import com.bytedance.bdturing.e;
import com.bytedance.bdturing.e.f;
import com.bytedance.bdturing.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static f.a f26401a = new f.a() {
        /* class com.bytedance.bdturing.a.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(15531);
        }

        @Override // com.bytedance.bdturing.e.f.a
        public final void a(int i2, String str, long j2) {
            int i3 = 0;
            if (i2 == 200) {
                try {
                    SharedPreferences.Editor edit = d.a(a.C0562a.f26400a.f26393a.o, "bd_turning_settings_init", 0).edit();
                    edit.putBoolean("inited", true);
                    edit.commit();
                } catch (Exception unused) {
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", j2);
                jSONObject.put("result", i3);
                jSONObject.put("key", "setting");
                e.a("turing_verify_sdk", jSONObject);
            }
            if (i2 != 200) {
                i3 = 1;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("duration", j2);
                jSONObject2.put("result", i3);
                jSONObject2.put("key", "setting");
                e.a("turing_verify_sdk", jSONObject2);
            } catch (JSONException e2) {
                g.a(e2);
            }
        }
    };

    static {
        Covode.recordClassIndex(15530);
    }
}

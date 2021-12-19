package com.bytedance.apm.h;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static c f24999a;

    /* renamed from: b  reason: collision with root package name */
    private static c f25000b;

    static {
        Covode.recordClassIndex(14598);
        AnonymousClass1 r0 = new c() {
            /* class com.bytedance.apm.h.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14599);
            }
        };
        f24999a = r0;
        f25000b = r0;
    }

    public static void a(Object... objArr) {
        if (f25000b != null) {
            JSONObject jSONObject = new JSONObject();
            for (int i2 = 0; i2 < 2; i2 += 2) {
                try {
                    jSONObject.put(String.valueOf(objArr[0]), String.valueOf(objArr[1]));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            String[] strArr = new String[1];
            jSONObject.toString();
        }
    }
}

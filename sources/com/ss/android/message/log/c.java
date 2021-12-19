package com.ss.android.message.log;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(36983);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static void a(Context context, String str, Bundle bundle) {
        if (!m.a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                if (bundle != null) {
                    for (String str2 : bundle.keySet()) {
                        jSONObject.put(str2, a(bundle, str2));
                    }
                }
            } catch (Throwable unused) {
            }
            a(context, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    public static void a(Context context, String str, String str2, JSONObject... jSONObjectArr) {
        if (jSONObjectArr.length > 0) {
            a(context, "event_v1", str, str2, 0, 0, jSONObjectArr[0]);
        } else {
            a(context, "event_v1", str, str2, 0, 0, null);
        }
    }

    public static void a(Context context, String str, String str2, String str3, long j2, long j3) {
        a(context, str, str2, str3, j2, j3, null);
    }

    public static void a(final Context context, final String str, final String str2, final String str3, final long j2, final long j3, final JSONObject jSONObject) {
        if (!m.a(str) && !m.a(str2)) {
            new e() {
                /* class com.ss.android.message.log.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36984);
                }

                @Override // com.bytedance.common.utility.b.e
                public final void run() {
                    try {
                        b bVar = new b();
                        bVar.f59834a = str;
                        bVar.f59835b = str2;
                        bVar.f59836c = str3;
                        bVar.f59837d = j2;
                        bVar.f59838e = j3;
                        JSONObject jSONObject = jSONObject;
                        if (jSONObject != null) {
                            bVar.f59839f = jSONObject.toString();
                        }
                        Logger.debug();
                        a a2 = a.a(context);
                        if (a2 != null) {
                            a2.a(bVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }.a();
        }
    }
}

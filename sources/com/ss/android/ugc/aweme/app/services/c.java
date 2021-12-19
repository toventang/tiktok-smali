package com.ss.android.ugc.aweme.app.services;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f66886b;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f66887a;

    static {
        Covode.recordClassIndex(41197);
    }

    private c(Context context) {
        String a2 = a(context, "assets-map/aweme.json");
        if (!TextUtils.isEmpty(a2)) {
            try {
                this.f66887a = new JSONObject(a2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static c a(Context context) {
        MethodCollector.i(2236);
        if (f66886b == null) {
            synchronized (c.class) {
                try {
                    if (f66886b == null) {
                        f66886b = new c(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2236);
                    throw th;
                }
            }
        }
        c cVar = f66886b;
        MethodCollector.o(2236);
        return cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f A[SYNTHETIC, Splitter:B:25:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = 2242(0x8c2, float:3.142E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            r4 = 0
            android.content.res.AssetManager r0 = r6.getAssets()     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            java.io.InputStream r3 = r0.open(r7)     // Catch:{ IOException -> 0x002c, all -> 0x002a }
            int r0 = r3.available()     // Catch:{ IOException -> 0x0028 }
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0028 }
            r3.read(r2)     // Catch:{ IOException -> 0x0028 }
            r3.close()     // Catch:{ IOException -> 0x0028 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0028 }
            java.lang.String r0 = "utf-8"
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x0028 }
            r3.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r1
        L_0x0028:
            r0 = move-exception
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            goto L_0x0034
        L_0x002c:
            r0 = move-exception
            r3 = r4
        L_0x002e:
            r0.printStackTrace()     // Catch:{ all -> 0x0032 }
            goto L_0x003d
        L_0x0032:
            r0 = move-exception
            r4 = r3
        L_0x0034:
            if (r4 == 0) goto L_0x0039
            r4.close()     // Catch:{ IOException -> 0x0039 }
        L_0x0039:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x003d:
            if (r3 == 0) goto L_0x0042
            r3.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.services.c.a(android.content.Context, java.lang.String):java.lang.String");
    }
}

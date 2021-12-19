package com.bytedance.frameworks.baselib.network.http.g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f29359a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f29360b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile List<String> f29361c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static volatile List<String> f29362d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f29363e = false;

    static {
        Covode.recordClassIndex(17119);
    }

    private static boolean b(Context context) {
        String a2 = a(context, "ttnet_config.json");
        if (!TextUtils.isEmpty(a2)) {
            try {
                if (new JSONObject(a2).optBoolean("boe_proxy_enabled", false)) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        if (d.f107195c == null || !d.f107197e) {
            d.f107195c = context.getFilesDir();
        }
        String absolutePath = d.f107195c.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return false;
        }
        try {
            if (new File(absolutePath + "/ttnet_boe.flag").exists()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[SYNTHETIC, Splitter:B:13:0x0029] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = 4272(0x10b0, float:5.986E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            android.content.res.AssetManager r0 = r5.getAssets()     // Catch:{ all -> 0x0026 }
            java.io.InputStream r3 = r0.open(r6)     // Catch:{ all -> 0x0026 }
            int r0 = r3.available()     // Catch:{ all -> 0x0027 }
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0027 }
            r3.read(r2)     // Catch:{ all -> 0x0027 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = "UTF-8"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0027 }
            r3.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0033
        L_0x0021:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0033
        L_0x0026:
            r3 = 0
        L_0x0027:
            if (r3 == 0) goto L_0x0031
            r3.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x0031
        L_0x002d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0031:
            java.lang.String r1 = ""
        L_0x0033:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.g.a.a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d2, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r4, java.lang.String r5, java.util.List<com.bytedance.retrofit2.client.b> r6) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.g.a.a(android.content.Context, java.lang.String, java.util.List):java.lang.String");
    }
}

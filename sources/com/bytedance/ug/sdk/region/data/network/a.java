package com.bytedance.ug.sdk.region.data.network;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ug.sdk.region.data.c.c;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(27906);
    }

    public static String a() {
        String str = com.bytedance.ug.sdk.region.data.d.a.f45785b;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "https://".concat(String.valueOf(str));
    }

    private static String a(InputStream inputStream) {
        MethodCollector.i(11496);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                byteArrayOutputStream.write(read);
            } else {
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                MethodCollector.o(11496);
                return byteArrayOutputStream2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[Catch:{ Exception -> 0x00fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e8 A[Catch:{ Exception -> 0x00fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, byte[] r8) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ug.sdk.region.data.network.a.a(java.lang.String, java.util.Map, byte[]):java.lang.String");
    }

    public static String a(String str, String str2, Map<String, String> map, byte[] bArr) {
        c cVar;
        if (com.bytedance.ug.sdk.region.data.d.a.f45784a == null) {
            cVar = null;
        } else {
            cVar = com.bytedance.ug.sdk.region.data.d.a.f45784a.f45769d;
        }
        String str3 = str + str2;
        try {
            Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
            if (buildUpon != null) {
                buildUpon.appendQueryParameter("sdk_version", "1.1.0-alpha.15");
                str3 = buildUpon.toString();
            }
        } catch (Throwable unused) {
        }
        if (cVar == null) {
            return a(str3, map, bArr);
        }
        return cVar.a(str3, new HashMap(), map, bArr);
    }
}

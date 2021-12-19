package com.bytedance.crash.j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.n;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.m;
import com.bytedance.crash.util.v;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27672a;

    /* renamed from: b  reason: collision with root package name */
    public static j f27673b;

    static {
        Covode.recordClassIndex(16229);
    }

    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);
        
        final int nativeInt;

        public final int getValue() {
            return this.nativeInt;
        }

        static {
            Covode.recordClassIndex(16231);
        }

        private b(int i2) {
            this.nativeInt = i2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r1.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10284);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        com.bytedance.crash.m.f27730g.isDebugMode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        r1.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(10284);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(byte[] r4) {
        /*
            r3 = 10284(0x282c, float:1.4411E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r0 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r0)
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream
            r1.<init>(r2)
            r1.write(r4)     // Catch:{ all -> 0x001f }
            r1.close()
            byte[] r0 = r2.toByteArray()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r0
        L_0x001f:
            com.bytedance.crash.runtime.ConfigManager r0 = com.bytedance.crash.m.f27730g     // Catch:{ all -> 0x002c }
            r0.isDebugMode()     // Catch:{ all -> 0x002c }
            r1.close()
            r0 = 0
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r0
        L_0x002c:
            r0 = move-exception
            r1.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.j.f.a(byte[]):byte[]");
    }

    public static byte[] a(String str, Map<String, String> map) {
        return a(b(str, map), "application/json; charset=utf-8", "gzip", "GET").f27718d;
    }

    private static byte[] a(InputStream inputStream) {
        MethodCollector.i(10444);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    m.a(byteArrayOutputStream);
                    MethodCollector.o(10444);
                }
            }
        }
    }

    public enum a {
        NONE(0),
        GZIP(1),
        DEFLATER(2);
        
        final int nativeInt;

        static {
            Covode.recordClassIndex(16230);
        }

        private a(int i2) {
            this.nativeInt = i2;
        }
    }

    private static String c(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static boolean a(File file, String str) {
        try {
            return a(com.bytedance.crash.m.f27730g.getCoreDumpUrl(), Header.b(com.bytedance.crash.m.f27724a).f27553a.toString(), new JSONObject().put("event_type", "raphael_file").put("timestamp", System.currentTimeMillis()).put("uuid", str).toString(), file);
        } catch (JSONException unused) {
            return false;
        }
    }

    private static String b(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith("&")) {
                str = str + "&";
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    private static String b(String str, Map map) {
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.contains("?")) {
            sb.append("?");
        }
        try {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    if (!sb.toString().endsWith("?")) {
                        sb.append("&");
                    }
                    sb.append(c(entry.getKey().toString(), "UTF-8"));
                    sb.append("=");
                    sb.append(c(entry.getValue().toString(), "UTF-8"));
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static n a(String str, String str2) {
        String str3 = str;
        MethodCollector.i(10296);
        try {
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                n nVar = new n(201);
                MethodCollector.o(10296);
                return nVar;
            }
            byte[] bytes = str2.getBytes();
            a aVar = a.GZIP;
            String str4 = "application/json; charset=utf-8";
            if (n.f27744h) {
                n nVar2 = new n(201);
                MethodCollector.o(10296);
                return nVar2;
            } else if (str3 == null) {
                n nVar3 = new n(201);
                MethodCollector.o(10296);
                return nVar3;
            } else {
                if (bytes == null) {
                    bytes = new byte[0];
                }
                int length = bytes.length;
                String str5 = null;
                if (a.GZIP == aVar && length > 128) {
                    bytes = a(bytes);
                    str5 = "gzip";
                } else if (a.DEFLATER == aVar && length > 128) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                    Deflater deflater = new Deflater();
                    deflater.setInput(bytes);
                    deflater.finish();
                    byte[] bArr = new byte[8192];
                    while (!deflater.finished()) {
                        byteArrayOutputStream.write(bArr, 0, deflater.deflate(bArr));
                    }
                    deflater.end();
                    bytes = byteArrayOutputStream.toByteArray();
                    str5 = "deflate";
                }
                if (bytes == null) {
                    n nVar4 = new n(202);
                    MethodCollector.o(10296);
                    return nVar4;
                }
                byte[] a2 = com.bytedance.crash.m.f27730g.getEncryptImpl().a(bytes);
                if (a2 != null) {
                    if (TextUtils.isEmpty(new URL(str3).getQuery())) {
                        if (!str3.endsWith("?")) {
                            str3 = str3 + "?";
                        }
                    } else if (!str3.endsWith("&")) {
                        str3 = str3 + "&";
                    }
                    str3 = str3 + "tt_data=a";
                    str4 = "application/octet-stream;tt-data=a";
                } else {
                    a2 = bytes;
                }
                n a3 = a(str3, a2, str4, str5, "POST", true);
                MethodCollector.o(10296);
                return a3;
            }
        } catch (Throwable th) {
            com.bytedance.crash.m.f27730g.isDebugMode();
            n nVar5 = new n(207, th);
            MethodCollector.o(10296);
            return nVar5;
        }
    }

    public static n a(String str, String str2, File... fileArr) {
        return a(str, str2, new j.b(fileArr, true));
    }

    public static n a(String str, String str2, j.b... bVarArr) {
        if (n.f27744h) {
            return new n(201);
        }
        try {
            l lVar = new l(b(str, "have_dump=true&encrypt=true"), "UTF-8", true);
            lVar.a("json", str2, true);
            lVar.a("file", null);
            if (lVar.f27704a) {
                j.a(lVar.f27706c, bVarArr);
            } else {
                j.a(lVar.f27705b, bVarArr);
            }
            lVar.a("\r\n".getBytes());
            try {
                JSONObject jSONObject = new JSONObject(lVar.a());
                v.a("success upload crash log");
                return new n(jSONObject);
            } catch (JSONException e2) {
                v.a("err upload crash log");
                return new n(0, e2);
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            com.bytedance.crash.m.f27730g.isDebugMode();
            return new n(207);
        }
    }

    private static n a(String str, String str2, String str3, String str4) {
        return a(str, null, str2, str3, str4, false);
    }

    private static boolean a(String str, String str2, String str3, File file) {
        try {
            l lVar = new l(str, "UTF-8", false);
            lVar.a("data", str3, false);
            lVar.a("header", str2, false);
            lVar.a("file", null);
            lVar.a(file);
            lVar.a("\r\n".getBytes());
            lVar.a();
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean a(String str, String str2, String str3, String str4, List<String> list) {
        if (n.f27744h) {
            return false;
        }
        try {
            l lVar = new l(str, "UTF-8", false);
            lVar.a("aid", str2, false);
            lVar.a("device_id", str3, false);
            lVar.a("os", "Android", false);
            lVar.a("process_name", str4, false);
            for (String str5 : list) {
                File file = new File(str5);
                if (file.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", "crash");
                    lVar.a(file.getName(), hashMap);
                    lVar.a(file);
                    lVar.a("\r\n".getBytes());
                }
            }
            try {
                if (new JSONObject(lVar.a()).optInt("errno", -1) == 200) {
                    return true;
                }
                return false;
            } catch (JSONException unused) {
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.json.JSONObject, java.io.Closeable, android.webkit.WebView] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077 A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0084 A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0090 A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0138 A[SYNTHETIC, Splitter:B:96:0x0138] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.crash.j.n a(java.lang.String r8, byte[] r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 335
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.j.f.a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean):com.bytedance.crash.j.n");
    }
}

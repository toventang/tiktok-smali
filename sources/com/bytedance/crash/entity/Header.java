package com.bytedance.crash.entity;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.bytedance.crash.runtime.q;
import com.bytedance.crash.util.n;
import com.bytedance.crash.util.u;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class Header {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f27549b = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* renamed from: d  reason: collision with root package name */
    private static String f27550d;

    /* renamed from: e  reason: collision with root package name */
    private static int f27551e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static int f27552f = -1;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f27553a = new JSONObject();

    /* renamed from: c  reason: collision with root package name */
    private final Context f27554c;

    public final JSONObject c() {
        return a(m.a().a());
    }

    static {
        Covode.recordClassIndex(16182);
    }

    public final void e() {
        try {
            long e2 = m.a().e();
            if (e2 > 0) {
                this.f27553a.put("user_id", e2);
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
    }

    public static boolean a() {
        if (f27551e == -1) {
            f27551e = f().contains("64") ? 1 : 0;
        }
        if (f27551e == 1) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if (f27552f == -1) {
            f27552f = f().contains("86") ? 1 : 0;
        }
        if (f27552f == 1) {
            return true;
        }
        return false;
    }

    public final void d() {
        try {
            this.f27553a.put("device_id", m.b().a());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static String f() {
        if (f27550d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
                    sb = new StringBuilder(Build.CPU_ABI);
                } else {
                    for (int i2 = 0; i2 < Build.SUPPORTED_ABIS.length; i2++) {
                        sb.append(Build.SUPPORTED_ABIS[i2]);
                        if (i2 != Build.SUPPORTED_ABIS.length - 1) {
                            sb.append(", ");
                        }
                    }
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    f27550d = "unknown";
                }
                f27550d = sb.toString();
            } catch (Exception unused) {
                m.f27730g.isDebugMode();
                f27550d = "unknown";
            }
        }
        return f27550d;
    }

    public Header(Context context) {
        this.f27554c = context;
    }

    public static Header a(Context context) {
        Header header = new Header(context);
        d(header.f27553a);
        return header;
    }

    public static void a(Header header) {
        if (header != null) {
            addOtherHeader(header.f27553a);
        }
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        try {
            jSONObject.put("access", u.a(u.a(m.f27724a)));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static Header b(Context context) {
        Header a2 = a(context);
        addRuntimeHeader(a2.f27553a);
        a(a2);
        a2.c();
        a2.d();
        a2.e();
        return a2;
    }

    public static boolean c(JSONObject jSONObject) {
        if (n.a(jSONObject)) {
            return true;
        }
        String optString = jSONObject.optString("aid");
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        try {
            if (Integer.parseInt(optString) <= 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    private static void d(JSONObject jSONObject) {
        try {
            jSONObject.put("sdk_version", 3010663);
            jSONObject.put("sdk_version_name", "3.1.6-rc.13-ttp");
            jSONObject.put("bytrace_id", m.g());
        } catch (Exception unused) {
        }
    }

    public static boolean b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        if ((jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null) {
            return true;
        }
        return false;
    }

    public final JSONObject a(Map<String, Object> map) {
        if (map == null) {
            try {
                return this.f27553a;
            } catch (Throwable unused) {
            }
        } else {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!this.f27553a.has(entry.getKey())) {
                    this.f27553a.put(entry.getKey(), entry.getValue());
                }
            }
            String[] strArr = f27549b;
            for (String str : strArr) {
                if (map.containsKey(str)) {
                    try {
                        this.f27553a.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                    } catch (Throwable unused2) {
                        this.f27553a.put(str, map.get(str));
                    }
                }
            }
            if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
                try {
                    this.f27553a.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
                } catch (Throwable unused3) {
                }
            }
            if (map.containsKey("version_name")) {
                this.f27553a.put("app_version", map.get("version_name"));
                this.f27553a.remove("version_name");
            }
            this.f27553a.put("version_get_time", 0);
            return this.f27553a;
        }
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                n.a(this.f27553a, next, jSONObject.opt(next));
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(32:3|4|5|6|(1:8)(2:9|(1:11)(6:16|(1:18)(1:29)|19|(1:23)|24|(1:26)))|12|(1:14)|15|30|(2:32|(1:34))(2:35|(2:37|(1:41))(2:42|(2:44|(1:46))(4:48|(1:55)(1:52)|53|(1:56)(2:57|(2:62|(6:67|(2:69|(1:73))|74|(1:76)|77|(1:79))(1:66))(1:61)))))|47|80|81|(2:83|(2:85|(1:87)(1:90))(1:88))(1:89)|91|92|93|(1:95)(2:96|(1:98))|99|100|102|103|(1:105)(1:112)|106|(1:111)|108|(2:110|113)(1:(1:117))|118|(1:122)|123|124|126) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x039c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x025c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x02a9 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02da A[Catch:{ all -> 0x039c }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0308 A[Catch:{ all -> 0x039c }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0309 A[Catch:{ all -> 0x039c }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x031d A[Catch:{ all -> 0x039c }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0322 A[ADDED_TO_REGION, Catch:{ all -> 0x039c }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x026c A[Catch:{ Exception -> 0x02a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x027a A[Catch:{ Exception -> 0x02a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02b9 A[Catch:{ Exception -> 0x02c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02bc A[Catch:{ Exception -> 0x02c7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void addOtherHeader(org.json.JSONObject r10) {
        /*
        // Method dump skipped, instructions count: 928
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.entity.Header.addOtherHeader(org.json.JSONObject):void");
    }

    public static b a(String str, Context context, long j2, long j3) {
        b bVar;
        Header header;
        long j4 = j3;
        q a2 = q.a();
        if (j4 == 0) {
            j4 = System.currentTimeMillis();
        }
        JSONObject a3 = a2.a(str, j2, j4);
        if (a3 == null || a3.length() == 0) {
            bVar = new b();
            header = a(context);
            header.c();
            try {
                header.f27553a.put("version_get_time", System.currentTimeMillis());
            } catch (Throwable unused) {
            }
        } else {
            bVar = new b(a3);
            header = new Header(m.f27724a);
            header.a(a3.optJSONObject("header"));
        }
        header.d();
        a(header);
        bVar.a(header);
        return bVar;
    }
}

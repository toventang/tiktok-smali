package com.ss.android.socialbase.downloader.i;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.k.i;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60573a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static JSONObject f60574b;

    /* renamed from: c  reason: collision with root package name */
    private static final i<Integer, a> f60575c = new i<>(16, 16);

    /* renamed from: d  reason: collision with root package name */
    private static JSONObject f60576d;

    /* renamed from: e  reason: collision with root package name */
    private static Boolean f60577e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f60578f;

    /* renamed from: g  reason: collision with root package name */
    private static a f60579g;

    /* renamed from: h  reason: collision with root package name */
    private final JSONObject f60580h;

    /* renamed from: i  reason: collision with root package name */
    private final JSONObject f60581i;

    /* renamed from: j  reason: collision with root package name */
    private final Boolean f60582j;

    /* renamed from: k  reason: collision with root package name */
    private int f60583k;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(String str, boolean z) {
        if (this.f60581i != null && !b(str)) {
            if (this.f60581i.has(str)) {
                return this.f60581i.optInt(str, z) == 1;
            }
            Boolean bool = this.f60582j;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        JSONObject jSONObject = f60574b;
        if (jSONObject != null) {
            if (jSONObject.has(str)) {
                return f60574b.optInt(str, z ? 1 : 0) == 1;
            }
            Boolean bool2 = f60577e;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
        }
        return z;
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject = this.f60580h;
        if (jSONObject == null || !jSONObject.has(str) || b(str)) {
            return c.v().optJSONObject(str);
        }
        return this.f60580h.optJSONObject(str);
    }

    static {
        Covode.recordClassIndex(37420);
        a();
    }

    public static void a() {
        boolean z;
        JSONObject v = c.v();
        boolean z2 = false;
        if (v.optInt("disable_task_setting", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        f60578f = z;
        f60576d = v.optJSONObject("disabled_task_keys");
        JSONObject optJSONObject = v.optJSONObject("bugfix");
        Boolean bool = null;
        if (optJSONObject != null && optJSONObject.has("default")) {
            if (optJSONObject.optInt("default", 0) == 1) {
                z2 = true;
            }
            bool = Boolean.valueOf(z2);
        }
        f60574b = optJSONObject;
        f60577e = bool;
    }

    private static boolean b(String str) {
        JSONObject jSONObject = f60576d;
        if (jSONObject == null || jSONObject.optInt(str, 0) != 1) {
            return false;
        }
        return true;
    }

    private static a a(DownloadInfo downloadInfo) {
        if (f60578f) {
            return f60573a;
        }
        try {
            String downloadSettingString = downloadInfo.getDownloadSettingString();
            if (!TextUtils.isEmpty(downloadSettingString)) {
                return new a(new JSONObject(downloadSettingString));
            }
        } catch (Throwable unused) {
        }
        return f60573a;
    }

    private a(JSONObject jSONObject) {
        Boolean bool;
        this.f60580h = jSONObject;
        JSONObject jSONObject2 = null;
        r2 = null;
        r2 = null;
        Boolean bool2 = null;
        if (jSONObject == null || b("bugfix")) {
            bool = null;
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("bugfix");
            if (optJSONObject != null && optJSONObject.has("default") && !b("default")) {
                bool2 = Boolean.valueOf(optJSONObject.optInt("default", 0) == 1);
            }
            bool = bool2;
            jSONObject2 = optJSONObject;
        }
        this.f60581i = jSONObject2;
        this.f60582j = bool;
    }

    public static void a(int i2) {
        MethodCollector.i(12580);
        a aVar = f60579g;
        if (aVar != null && aVar.f60583k == i2) {
            f60579g = null;
        }
        i<Integer, a> iVar = f60575c;
        synchronized (iVar) {
            try {
                iVar.remove(Integer.valueOf(i2));
            } finally {
                MethodCollector.o(12580);
            }
        }
    }

    public static a a(int i2, DownloadInfo downloadInfo) {
        a aVar;
        Context B;
        MethodCollector.i(12448);
        a aVar2 = f60579g;
        if (aVar2 == null || aVar2.f60583k != i2) {
            i<Integer, a> iVar = f60575c;
            synchronized (iVar) {
                try {
                    aVar = (a) iVar.get(Integer.valueOf(i2));
                } finally {
                    MethodCollector.o(12448);
                }
            }
            if (aVar == null) {
                if (downloadInfo == null && (f60578f || (B = c.B()) == null || (downloadInfo = Downloader.getInstance(B).getDownloadInfo(i2)) == null)) {
                    aVar = f60573a;
                } else {
                    aVar = a(downloadInfo);
                }
                synchronized (iVar) {
                    try {
                        iVar.put(Integer.valueOf(i2), aVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            aVar.f60583k = i2;
            f60579g = aVar;
            MethodCollector.o(12448);
            return aVar;
        }
        MethodCollector.o(12448);
        return aVar2;
    }

    public final int a(String str, int i2) {
        JSONObject jSONObject = this.f60580h;
        if (jSONObject == null || !jSONObject.has(str) || b(str)) {
            return c.v().optInt(str, i2);
        }
        return this.f60580h.optInt(str, i2);
    }

    public final long a(String str, long j2) {
        JSONObject jSONObject = this.f60580h;
        if (jSONObject == null || !jSONObject.has(str) || b(str)) {
            return c.v().optLong(str, j2);
        }
        return this.f60580h.optLong(str, j2);
    }

    public final String a(String str, String str2) {
        JSONObject jSONObject = this.f60580h;
        if (jSONObject == null || !jSONObject.has(str) || b(str)) {
            return c.v().optString(str, str2);
        }
        return this.f60580h.optString(str, str2);
    }
}

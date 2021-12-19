package com.bytedance.crash.runtime;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.util.ab;
import com.bytedance.crash.util.b;
import com.bytedance.crash.util.z;
import com.ss.android.ugc.aweme.legoImp.task.NpthCoreInitTask;
import com.ss.android.ugc.aweme.miniapp.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    private static JSONObject f27904d;

    /* renamed from: a  reason: collision with root package name */
    public final ICommonParams f27905a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f27906b;

    /* renamed from: c  reason: collision with root package name */
    private final ICommonParams f27907c;

    static {
        Covode.recordClassIndex(16331);
    }

    public final String c() {
        try {
            return this.f27905a.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String d() {
        try {
            return this.f27905a.getSessionId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final long e() {
        try {
            return this.f27905a.getUserId();
        } catch (Throwable unused) {
            return 0;
        }
    }

    private String f() {
        try {
            return String.valueOf(this.f27905a.getCommonParams().get("aid"));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    public final Map<String, Object> a() {
        Map<String, Object> b2 = b();
        if (a(b2, "aid") == null) {
            b2.put("aid", 4444);
        }
        return b2;
    }

    public final Map<String, Object> b() {
        Throwable th;
        Map<String, Object> map;
        Object obj = null;
        try {
            ICommonParams iCommonParams = this.f27907c;
            if (iCommonParams != null) {
                map = iCommonParams.getCommonParams();
            } else {
                map = new HashMap<>();
            }
            try {
                map.putAll(this.f27905a.getCommonParams());
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            map = null;
        }
        if (map == null) {
            map = new HashMap<>(4);
            if (th != null) {
                try {
                    map.put("err_info", ab.a(th));
                    map.put("params_err", "crash while getting params");
                } catch (Throwable unused) {
                }
            } else {
                map.put("params_err", "empty params");
            }
        }
        if (a(map)) {
            try {
                PackageInfo packageInfo = this.f27906b.getPackageManager().getPackageInfo(this.f27906b.getPackageName(), 128);
                map.put("version_name", packageInfo.versionName);
                map.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (map.get("update_version_code") == null) {
                    if (packageInfo.applicationInfo.metaData != null) {
                        obj = a(packageInfo.applicationInfo.metaData, "UPDATE_VERSION_CODE");
                    }
                    if (obj == null) {
                        obj = map.get("version_code");
                    }
                    map.put("update_version_code", obj);
                }
            } catch (Throwable unused2) {
                map.put("version_name", b.d(this.f27906b));
                map.put("version_code", Integer.valueOf(b.e(this.f27906b)));
                if (map.get("update_version_code") == null) {
                    map.put("update_version_code", map.get("version_code"));
                }
            }
            if (!map.containsKey("params_err")) {
                map.put("params_err", "unavailable params");
            }
        } else {
            try {
                String str = this.f27906b.getPackageManager().getPackageInfo(this.f27906b.getPackageName(), 128).versionName;
                String str2 = (String) Class.forName(this.f27906b.getPackageName() + ".BuildConfig").getDeclaredField("VERSION_NAME").get(null);
                if (str != null && !str.equals(str2)) {
                    map.put("manifest_version", str);
                }
            } catch (Throwable unused3) {
            }
        }
        map.putAll(z.a());
        JSONObject jSONObject = f27904d;
        if (jSONObject != null) {
            map.put("mp_params", jSONObject);
        }
        map.put("first_update_launch", Integer.valueOf(q.a().a(String.valueOf(map.get("update_version_code")))));
        return map;
    }

    public static String a(d dVar) {
        ICommonParams iCommonParams = dVar.f27905a;
        if (iCommonParams instanceof NpthCoreInitTask.a) {
            try {
                String valueOf = String.valueOf(com.bytedance.ies.ugc.appcontext.d.n);
                if ("3902".equals(((NpthCoreInitTask.a) iCommonParams).f107845a)) {
                    return "3902";
                }
                return valueOf;
            } catch (Throwable unused) {
                return "4444";
            }
        } else if (!(iCommonParams instanceof a)) {
            return dVar.f();
        } else {
            try {
                return String.valueOf(com.bytedance.ies.ugc.appcontext.d.n);
            } catch (Throwable unused2) {
                return "4444";
            }
        }
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        if ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) {
            return false;
        }
        return true;
    }

    public d(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private static String a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return null;
        }
        return String.valueOf(obj);
    }

    public static Map<String, String> a(Map<String, Object> map, String... strArr) {
        HashMap hashMap = new HashMap();
        if (strArr.length == 0 || strArr.length % 2 != 0) {
            com.bytedance.crash.d.a("NPTH_CATCH", new IllegalArgumentException("err keysWithDefaultValue:".concat(String.valueOf(strArr))));
            return hashMap;
        }
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            String str = strArr[i2];
            Object obj = map.get(str);
            if (obj == null) {
                hashMap.put(str, strArr[i2 + 1]);
            } else {
                hashMap.put(str, String.valueOf(obj));
            }
        }
        return hashMap;
    }

    public d(Context context, ICommonParams iCommonParams, d dVar) {
        ICommonParams iCommonParams2;
        this.f27906b = context;
        this.f27905a = iCommonParams;
        if (dVar == null) {
            iCommonParams2 = null;
        } else {
            iCommonParams2 = dVar.f27905a;
        }
        this.f27907c = iCommonParams2;
    }
}

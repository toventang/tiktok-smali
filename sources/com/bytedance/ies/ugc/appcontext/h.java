package com.bytedance.ies.ugc.appcontext;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Properties;
import org.json.JSONObject;

class h {

    /* renamed from: d  reason: collision with root package name */
    private static h f34645d;

    /* renamed from: a  reason: collision with root package name */
    private Properties f34646a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f34647b;

    /* renamed from: c  reason: collision with root package name */
    private Context f34648c;

    static {
        Covode.recordClassIndex(20758);
    }

    private static boolean a(JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(jSONObject.getString("meta_channel"))) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    private static String c(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    private h(Context context) {
        this.f34648c = context;
        try {
            this.f34647b = b(context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static JSONObject b(Context context) {
        try {
            String a2 = b.a(c(context));
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a2);
            if (!a(jSONObject)) {
                return null;
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static h a(Context context) {
        MethodCollector.i(4556);
        if (f34645d == null) {
            synchronized (h.class) {
                try {
                    if (f34645d == null) {
                        f34645d = new h(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4556);
                    throw th;
                }
            }
        }
        h hVar = f34645d;
        MethodCollector.o(4556);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    public final Object a(String str) {
        MethodCollector.i(4568);
        Object obj = null;
        try {
            JSONObject jSONObject = this.f34647b;
            if (jSONObject != null) {
                obj = jSONObject.get(str);
            }
        } catch (Throwable unused) {
        }
        if (obj != null) {
            new StringBuilder("Key:").append(str).append(";Value:").append(obj).append(" load from channel info file!");
            MethodCollector.o(4568);
            return obj;
        }
        try {
            if (this.f34646a == null) {
                Properties properties = new Properties();
                this.f34646a = properties;
                try {
                    properties.load(this.f34648c.getAssets().open("ss.properties"));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            Properties properties2 = this.f34646a;
            if (properties2 != null && properties2.containsKey(str)) {
                obj = this.f34646a.get(str);
                new StringBuilder("Key:").append(str).append(";Value:").append(obj).append(" load from ss.properties file!");
            }
        } catch (Throwable unused2) {
        }
        MethodCollector.o(4568);
        return obj;
    }
}

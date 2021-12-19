package com.ss.android.newmedia.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.b;
import java.util.Properties;
import org.json.JSONObject;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static a f59925c;

    /* renamed from: a  reason: collision with root package name */
    private Properties f59926a = new Properties();

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f59927b;

    static {
        Covode.recordClassIndex(37038);
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

    private a(Context context) {
        MethodCollector.i(2295);
        try {
            this.f59927b = b(context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            this.f59926a.load(context.getAssets().open("ss.properties"));
            MethodCollector.o(2295);
        } catch (Exception e3) {
            e3.printStackTrace();
            MethodCollector.o(2295);
        }
    }

    public static a a(Context context) {
        MethodCollector.i(2296);
        if (f59925c == null) {
            synchronized (a.class) {
                try {
                    if (f59925c == null) {
                        f59925c = new a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2296);
                    throw th;
                }
            }
        }
        a aVar = f59925c;
        MethodCollector.o(2296);
        return aVar;
    }

    private Object a(String str) {
        Object obj;
        try {
            JSONObject jSONObject = this.f59927b;
            if (jSONObject != null) {
                obj = jSONObject.get(str);
            } else {
                Properties properties = this.f59926a;
                if (properties == null || !properties.containsKey(str)) {
                    obj = null;
                } else {
                    obj = this.f59926a.get(str);
                }
            }
            Logger.debug();
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public final String a(String str, String str2) {
        Object a2 = a(str);
        if (!(a2 instanceof String)) {
            return str2;
        }
        return (String) a2;
    }
}

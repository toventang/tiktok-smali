package com.facebook.internal.a;

import android.content.Context;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.m;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    static {
        Covode.recordClassIndex(29259);
    }

    public static File a() {
        ae.a();
        File file = new File(a(m.f48921g), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public static boolean b(String str) {
        File a2 = a();
        if (a2 == null || str == null) {
            return false;
        }
        return a(new File(a2, str));
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    public static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        do {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th = th.getCause();
            if (th == null) {
                break;
            }
        } while (th != th);
        return jSONArray.toString();
    }

    public static JSONObject a(String str) {
        MethodCollector.i(78);
        File a2 = a();
        if (a2 == null || str == null) {
            MethodCollector.o(78);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(ad.a((InputStream) new FileInputStream(new File(a2, str))));
            MethodCollector.o(78);
            return jSONObject;
        } catch (Exception unused) {
            b(str);
            MethodCollector.o(78);
            return null;
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(1103);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(1103);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(1103);
        return delete;
    }

    public static void a(String str, String str2) {
        MethodCollector.i(627);
        File a2 = a();
        if (a2 == null || str == null || str2 == null) {
            MethodCollector.o(627);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(a2, str));
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.close();
            MethodCollector.o(627);
        } catch (Exception unused) {
            MethodCollector.o(627);
        }
    }

    public static void a(String str, JSONArray jSONArray, GraphRequest.b bVar) {
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                ae.a();
                GraphRequest.a((AccessToken) null, a.a("%s/instruments", new Object[]{m.f48915a}), jSONObject, bVar).a();
            } catch (JSONException unused) {
            }
        }
    }
}

package com.bytedance.ies.bullet.kit.a;

import android.content.res.AssetManager;
import android.os.Build;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.m.p;
import h.q;
import h.r;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f32239a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(18905);
    }

    public static WebResourceResponse a(String str) {
        boolean z;
        MethodCollector.i(10693);
        if (str != null) {
            try {
                File file = new File(str);
                if (!file.exists() || file.isDirectory()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    file = null;
                }
                if (file != null) {
                    WebResourceResponse a2 = a(b(str), "", new FileInputStream(file));
                    MethodCollector.o(10693);
                    return a2;
                }
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
        }
        q.m223constructorimpl(null);
        MethodCollector.o(10693);
        return null;
    }

    private static String b(String str) {
        l.c(str, "");
        if (p.c(str, ".js", false)) {
            return "application/x-javascript";
        }
        if (p.c(str, ".json", false)) {
            return "application/json";
        }
        if (p.c(str, ".css", false)) {
            return "text/css";
        }
        if (p.c(str, ".html", false)) {
            return "text/html";
        }
        if (p.c(str, ".ico", false)) {
            return "image/x-icon";
        }
        if (p.c(str, ".jpeg", false) || p.c(str, ".jpg", false)) {
            return "image/jpeg";
        }
        if (p.c(str, ".png", false)) {
            return "image/png";
        }
        if (p.c(str, ".gif", false)) {
            return "image/gif";
        }
        if (p.c(str, ".woff", false)) {
            return "font/woff";
        }
        if (p.c(str, ".svg", false)) {
            return "image/svg+xml";
        }
        if (p.c(str, ".ttf", false)) {
            return "font/ttf";
        }
        return "";
    }

    public static WebResourceResponse a(AssetManager assetManager, String str) {
        MethodCollector.i(10691);
        if (assetManager == null || str == null || str.length() == 0) {
            MethodCollector.o(10691);
            return null;
        }
        WebResourceResponse a2 = a(b(str), "", assetManager.open(str));
        MethodCollector.o(10691);
        return a2;
    }

    private static WebResourceResponse a(String str, String str2, InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("Access-Control-Allow-Origin", "*");
            if (Build.VERSION.SDK_INT >= 21 && l.a((Object) "font/ttf", (Object) str)) {
                return new WebResourceResponse(str, str2, 200, "OK", hashMap, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, inputStream);
            if (Build.VERSION.SDK_INT >= 21) {
                webResourceResponse.setResponseHeaders(hashMap);
                return webResourceResponse;
            }
            try {
                Field field = webResourceResponse.getClass().getField("mResponseHeaders");
                l.a((Object) field, "");
                field.setAccessible(true);
                field.set(webResourceResponse, hashMap);
                return webResourceResponse;
            } catch (Throwable unused) {
                return webResourceResponse;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}

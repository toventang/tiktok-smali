package com.ss.android.ugc.aweme.web.b;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.ss.android.sdk.webview.h;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class a implements h.a {
    public boolean o;

    static {
        Covode.recordClassIndex(94735);
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract InputStream b(String str);

    public a(boolean z) {
        this.o = z;
    }

    @Override // com.ss.android.sdk.webview.h.a
    public WebResourceResponse a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2) || !Pattern.compile(a2).matcher(str).find()) {
            return null;
        }
        return a(c(str), "", b(str), null);
    }

    public String c(String str) {
        if (str.endsWith(".js")) {
            return "application/x-javascript";
        }
        if (str.endsWith(".css")) {
            return "text/css";
        }
        if (str.endsWith(".html")) {
            return "text/html";
        }
        if (str.endsWith(".ico")) {
            return "image/x-icon";
        }
        if (str.endsWith(".jpeg") || str.endsWith(".jpg")) {
            return "image/jpeg";
        }
        if (str.endsWith(".png")) {
            return "image/png";
        }
        if (str.endsWith(".gif")) {
            return "image/gif";
        }
        if (str.endsWith(".woff")) {
            return "font/woff";
        }
        if (str.endsWith(".svg")) {
            return "image/svg+xml";
        }
        if (str.endsWith(".ttf")) {
            return "font/ttf";
        }
        return "";
    }

    protected static WebResourceResponse a(String str, String str2, InputStream inputStream) {
        return a(str, str2, inputStream, null);
    }

    protected static WebResourceResponse a(String str, String str2, InputStream inputStream, Map<String, String> map) {
        Map<String, String> map2 = map;
        if (inputStream == null) {
            return null;
        }
        if (map2 == null) {
            try {
                map2 = new HashMap<>();
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        if (!map2.containsKey("Access-Control-Allow-Origin") && !map2.containsKey("access-control-allow-origin")) {
            map2.put("Access-Control-Allow-Origin", "*");
        }
        if (Build.VERSION.SDK_INT >= 21 && "font/ttf".equals(str)) {
            return new WebResourceResponse(str, str2, 200, "OK", map2, inputStream);
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, inputStream);
        if (Build.VERSION.SDK_INT >= 21) {
            webResourceResponse.setResponseHeaders(map2);
            return webResourceResponse;
        }
        try {
            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
            field.setAccessible(true);
            field.set(webResourceResponse, map2);
            return webResourceResponse;
        } catch (Throwable unused) {
            return webResourceResponse;
        }
    }
}

package com.bytedance.falconx.c;

import android.os.Build;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.HashMap;

public final class b {
    static {
        Covode.recordClassIndex(16925);
    }

    public static WebResourceResponse a(String str, String str2, InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("Access-Control-Allow-Origin", "*");
            hashMap.put("Content-Type", str);
            if (Build.VERSION.SDK_INT >= 21 && "font/ttf".equals(str)) {
                return new WebResourceResponse(str, str2, 200, "OK", hashMap, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, inputStream);
            if (Build.VERSION.SDK_INT >= 21) {
                webResourceResponse.setResponseHeaders(hashMap);
                return webResourceResponse;
            }
            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
            field.setAccessible(true);
            field.set(webResourceResponse, hashMap);
            return webResourceResponse;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}

package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.ab;
import com.ss.android.ugc.aweme.utils.dc;
import com.ss.android.ugc.aweme.web.k;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f78882a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(48951);
    }

    public static WebResourceResponse a(String str) {
        boolean z;
        boolean z2;
        FileInputStream fileInputStream;
        MethodCollector.i(10201);
        int i2 = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        WebResourceResponse webResourceResponse = null;
        if (z) {
            MethodCollector.o(10201);
            return null;
        }
        ab[] abVarArr = (ab[]) SettingsManager.a().a("ecommerce_buynow_config", ab[].class);
        if (abVarArr != null) {
            if (abVarArr.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                Uri parse = Uri.parse(str);
                l.b(parse, "");
                if (parse.getScheme() == null || ((!l.a((Object) parse.getScheme(), (Object) "http")) && (true ^ l.a((Object) parse.getScheme(), (Object) "https")))) {
                    MethodCollector.o(10201);
                    return null;
                }
                try {
                    String uri = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build().toString();
                    l.b(uri, "");
                    int length = abVarArr.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        ab abVar = abVarArr[i2];
                        if (p.e((CharSequence) uri, (CharSequence) abVar.f123080a)) {
                            String str2 = abVar.f123081b;
                            String str3 = abVar.f123082c;
                            k kVar = k.f145061a;
                            l.b(kVar, "");
                            String b2 = dc.b(kVar.c(), str2);
                            if (b2 != null) {
                                fileInputStream = new FileInputStream(new File(b2, str3));
                            } else {
                                fileInputStream = null;
                            }
                            if (fileInputStream != null) {
                                webResourceResponse = a("text/html", "", fileInputStream);
                                break;
                            }
                        }
                        i2++;
                    }
                } catch (Exception unused) {
                }
                MethodCollector.o(10201);
                return webResourceResponse;
            }
        }
        MethodCollector.o(10201);
        return null;
    }

    private static WebResourceResponse a(String str, String str2, InputStream inputStream) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("Access-Control-Allow-Origin", "*");
            linkedHashMap.put("Content-Type", str);
            if (Build.VERSION.SDK_INT >= 21 && l.a((Object) "font/ttf", (Object) str)) {
                return new WebResourceResponse(str, str2, 200, "OK", linkedHashMap, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, inputStream);
            if (Build.VERSION.SDK_INT >= 21) {
                webResourceResponse.setResponseHeaders(linkedHashMap);
                return webResourceResponse;
            }
            Field field = webResourceResponse.getClass().getField("mResponseHeaders");
            l.b(field, "");
            field.setAccessible(true);
            field.set(webResourceResponse, linkedHashMap);
            return webResourceResponse;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}

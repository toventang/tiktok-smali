package com.bytedance.ies.b.c;

import android.text.TextUtils;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

public final class b implements CookieJar {

    /* renamed from: a  reason: collision with root package name */
    private CookieHandler f31925a;

    /* renamed from: b  reason: collision with root package name */
    private Pattern f31926b = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    static {
        Covode.recordClassIndex(18672);
    }

    public b(CookieHandler cookieHandler) {
        this.f31925a = cookieHandler;
    }

    @Override // okhttp3.CookieJar
    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        if (httpUrl == null) {
            return Collections.emptyList();
        }
        try {
            Map<String, List<String>> map = this.f31925a.get(httpUrl.uri(), Collections.emptyMap());
            if (map == null || map.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) && entry.getValue() != null && !entry.getValue().isEmpty()) {
                    for (String str : entry.getValue()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.addAll(a(httpUrl, str));
                    }
                }
            }
            if (arrayList != null) {
                return Collections.unmodifiableList(arrayList);
            }
            return Collections.emptyList();
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }

    private static List<Cookie> a(HttpUrl httpUrl, String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(";")) {
            Cookie parse = Cookie.parse(httpUrl, str2);
            if (parse != null) {
                arrayList.add(parse);
            }
        }
        return arrayList;
    }

    @Override // okhttp3.CookieJar
    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        if (httpUrl != null && !h.a(list)) {
            ArrayList arrayList = new ArrayList();
            for (Cookie cookie : list) {
                arrayList.add(cookie.toString());
            }
            try {
                this.f31925a.put(httpUrl.uri(), Collections.singletonMap("Set-Cookie", arrayList));
            } catch (IOException unused) {
            }
        }
    }
}

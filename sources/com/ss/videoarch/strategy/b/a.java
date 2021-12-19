package com.ss.videoarch.strategy.b;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f154404a;

    /* renamed from: b  reason: collision with root package name */
    private final b f154405b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Pair<String, String>> f154406c;

    static {
        Covode.recordClassIndex(102920);
    }

    a(d dVar) {
        this.f154404a = dVar.f154426a;
        this.f154405b = dVar.f154427b;
        this.f154406c = dVar.f154428c;
    }

    private static String a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final JSONObject a(String str, Object obj) {
        return new JSONObject(this.f154405b.a(a(this.f154404a + str, this.f154406c), obj.toString().getBytes("UTF-8"), "application/json; charset=utf-8"));
    }

    private static String a(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) >= 0) {
            sb.append("&");
        } else if (list.size() > 0) {
            sb.append("?");
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 > 0) {
                sb.append("&");
            }
            Pair<String, String> pair = list.get(i2);
            sb.append((String) pair.first).append('=').append(a((String) pair.second, "UTF-8"));
        }
        return sb.toString();
    }
}

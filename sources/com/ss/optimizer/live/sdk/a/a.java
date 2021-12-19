package com.ss.optimizer.live.sdk.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f151640a;

    /* renamed from: b  reason: collision with root package name */
    public final b f151641b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Pair<String, String>> f151642c;

    static {
        Covode.recordClassIndex(101176);
    }

    a(c cVar) {
        this.f151640a = cVar.f151651b;
        this.f151641b = cVar.f151652c;
        this.f151642c = cVar.f151653d;
    }

    private static String a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static String a(String str, List<Pair<String, String>> list) {
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

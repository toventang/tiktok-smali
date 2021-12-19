package com.ss.android.ugc.aweme.account.network;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.http.a.b.d;
import f.a.h;
import java.util.List;
import java.util.Map;

public interface a {
    static {
        Covode.recordClassIndex(40090);
    }

    f a();

    <T> T a(String str, int i2, String str2, Class<T> cls, String str3, List<d> list);

    String a(String str);

    String a(String str, Map<String, String> map);

    String b(String str);

    String b(String str, Map<String, String> map);

    h<String> c(String str, Map<String, String> map);
}

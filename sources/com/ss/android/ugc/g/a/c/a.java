package com.ss.android.ugc.g.a.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.g.a.a.d;
import h.f.b.l;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f145625a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(95638);
    }

    public static HashMap<String, Object> a(String str, d dVar) {
        l.c(dVar, "");
        HashMap<String, Object> hashMap = new HashMap<>();
        if (str != null) {
            hashMap.put("unknown_reason", str);
        }
        String str2 = dVar.f145589a;
        if (str2 != null) {
            hashMap.put("top_activity", str2);
        }
        String str3 = dVar.f145590b;
        if (str3 != null) {
            hashMap.put("top_page", str3);
        }
        return hashMap;
    }
}

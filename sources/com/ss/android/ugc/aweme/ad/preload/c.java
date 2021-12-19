package com.ss.android.ugc.aweme.ad.preload;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static p<String, ? extends JSONObject> f66127a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f66128b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(40646);
    }

    public static JSONObject a(String str) {
        String str2;
        p<String, ? extends JSONObject> pVar;
        if (f66127a == null || TextUtils.isEmpty(str)) {
            return null;
        }
        p<String, ? extends JSONObject> pVar2 = f66127a;
        if (pVar2 != null) {
            str2 = pVar2.getFirst();
        } else {
            str2 = null;
        }
        if (!l.a((Object) str2, (Object) str) || (pVar = f66127a) == null) {
            return null;
        }
        return (JSONObject) pVar.getSecond();
    }
}

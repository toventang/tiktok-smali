package com.ss.android.ugc.aweme.feed.x;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.HashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f95325a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(60370);
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(j.f107222a) && j.b() && !j.c()) {
            return j.f107222a;
        }
        String a2 = l.a(l.a(context));
        j.f107222a = a2;
        return a2;
    }

    public static final HashMap<String, String> a(String str, String str2, HashMap<String, String> hashMap) {
        h.f.b.l.d(hashMap, "");
        if (str2 != null) {
            hashMap.put("previous_page", str2);
        }
        if (str != null) {
            hashMap.put("enter_from", str);
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.HashMap<java.lang.String, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final HashMap<String, String> a(Context context, String str, String str2, String str3, HashMap<String, String> hashMap) {
        Object obj;
        h.f.b.l.d(context, "");
        h.f.b.l.d(hashMap, "");
        if (str2 != null) {
            hashMap.put("ad_id", str2);
        }
        if (str3 != null) {
            hashMap.put("creative_id", str3);
        }
        if (str != null) {
            hashMap.put("log_extra", str);
        }
        hashMap.put("user_agent", RawURLGetter.a("other"));
        hashMap.put("access", a(context));
        hashMap.put("package", context.getPackageName());
        Pair<String, Boolean> a2 = com.ss.android.deviceregister.d.a(context);
        if (!(a2 == null || (obj = a2.first) == null)) {
            hashMap.put("google_aid", obj);
        }
        return hashMap;
    }
}

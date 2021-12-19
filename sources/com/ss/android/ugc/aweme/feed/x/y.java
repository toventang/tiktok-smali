package com.ss.android.ugc.aweme.feed.x;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f95370a = new y();

    private y() {
    }

    static {
        Covode.recordClassIndex(60395);
    }

    public static final String a(String str, String str2) {
        if (TextUtils.equals("homepage_hot", str) || TextUtils.equals("homepage_follow", str)) {
            return str2;
        }
        return "";
    }

    public static final Map<String, String> b(String str, String str2) {
        HashMap hashMap = new HashMap();
        String a2 = a(str, str2);
        if (a2 != null) {
            hashMap.put("from_group_id", a2);
        }
        return hashMap;
    }
}

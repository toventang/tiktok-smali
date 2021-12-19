package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Bundle> f102449a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final x f102450b = new x();

    private x() {
    }

    static {
        Covode.recordClassIndex(65587);
    }

    public static String a(String str, String str2) {
        boolean z;
        Bundle bundle;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && str2.length() != 0) {
            Map<String, Bundle> map = f102449a;
            if (map.containsKey(str) && (bundle = map.get(str)) != null) {
                return bundle.getString(str2);
            }
        }
        return null;
    }

    public static void a(String str, String str2, String str3) {
        if (str != null && str.length() != 0 && str2.length() != 0 && str3 != null && str3.length() != 0) {
            Map<String, Bundle> map = f102449a;
            if (map.containsKey(str)) {
                Bundle bundle = map.get(str);
                if (bundle != null) {
                    bundle.putString(str2, str3);
                    return;
                }
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString(str2, str3);
            map.put(str, bundle2);
        }
    }
}

package com.bytedance.ttnet.retrofit;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.Set;

public final class a {
    static {
        Covode.recordClassIndex(27292);
    }

    public static boolean a(String str, Set<String> set) {
        if (!m.a(str) && set != null) {
            for (String str2 : set) {
                if (!TextUtils.isEmpty(str2) && str.startsWith(str2)) {
                    Logger.debug();
                    return true;
                }
            }
        }
        return false;
    }
}

package com.ss.android.ugc.aweme.video.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.utils.in;

public final class b {
    static {
        Covode.recordClassIndex(94220);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("aweme/v1/play")) {
            return str;
        }
        return b(str).a();
    }

    public static g b(String str) {
        String addCommonParams = AppLog.addCommonParams(new g(str).toString(), true);
        g gVar = new g(addCommonParams);
        try {
            if (!in.d()) {
                return gVar;
            }
            if (!(addCommonParams.contains("openudid") || addCommonParams.contains("uoo"))) {
                return gVar;
            }
            String[] split = addCommonParams.substring(addCommonParams.indexOf("?") + 1).split("&");
            for (String str2 : split) {
                if (!str2.contains("openudid") && !str2.contains("uoo") && str2.contains("=") && !str.contains(str2.substring(0, str2.indexOf("=")))) {
                    str = str + "&" + str2;
                }
            }
            return new g(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return gVar;
        }
    }
}

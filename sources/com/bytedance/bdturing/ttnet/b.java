package com.bytedance.bdturing.ttnet;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import java.net.URL;
import java.util.Map;

public final class b {
    static {
        Covode.recordClassIndex(15598);
    }

    private static boolean a(Context context, String str) {
        URL url = new URL(str);
        if (TextUtils.isEmpty(url.getPath()) || !url.getPath().contains("vc/setting")) {
            return true;
        }
        return true ^ d.a(context, "bd_turning_settings_init", 0).getBoolean("inited", false);
    }

    public static void a(Context context, String str, Map<String, String> map) {
        int i2;
        try {
            boolean a2 = a(context, str);
            StringBuilder append = new StringBuilder().append("").append("n=");
            if (a2) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            map.put("x-tt-request-tag", append.append(i2).append(";").toString() + "t=0");
        } catch (Exception unused) {
        }
    }
}

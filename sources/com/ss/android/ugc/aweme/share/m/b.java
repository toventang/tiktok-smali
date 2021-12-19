package com.ss.android.ugc.aweme.share.m;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;

public final class b {
    static {
        Covode.recordClassIndex(81481);
    }

    public static String a(String str) {
        if (!SettingServiceImpl.v().b(d.a()) || TextUtils.isEmpty(str)) {
            return str;
        }
        return str.replace("#", "");
    }
}

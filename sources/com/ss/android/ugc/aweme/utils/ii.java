package com.ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;

public final class ii {
    static {
        Covode.recordClassIndex(93670);
    }

    public static Uri a() {
        Uri parse = Uri.parse("https://www.tiktokv.com/aweme/i18n/uninstall/");
        try {
            parse = parse.buildUpon().appendQueryParameter("app_id", String.valueOf(d.n)).appendQueryParameter("device_type", Build.MODEL).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("language", SettingServiceImpl.v().k()).build();
            return parse;
        } catch (Exception e2) {
            e2.printStackTrace();
            return parse;
        }
    }
}

package com.ss.android.ugc.aweme.crossplatform.f;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f78846a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(48912);
    }

    public static String a(String str) {
        Uri parse;
        String[] strArr;
        if (str != null && (parse = Uri.parse(str)) != null && !parse.isOpaque() && TextUtils.equals(parse.getQueryParameter("need_is_cutout"), "1")) {
            try {
                strArr = (String[]) SettingsManager.a().a("is_cutout_android", String[].class);
            } catch (Throwable unused) {
                strArr = null;
            }
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (TextUtils.equals(Build.MODEL, str2)) {
                        return parse.buildUpon().appendQueryParameter("is_cutout", "1").build().toString();
                    }
                }
            }
        }
        return str;
    }
}

package com.ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import com.bytedance.common.utility.e.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class l {
    static {
        Covode.recordClassIndex(41133);
    }

    public static int a() {
        return d.a(com.bytedance.ies.ugc.appcontext.d.a(), "app_setting", 0).getInt("last_version_code", 0);
    }

    public static void a(int i2) {
        SharedPreferences.Editor edit = d.a(com.bytedance.ies.ugc.appcontext.d.a(), "app_setting", 0).edit();
        edit.putInt("last_version_code", i2);
        a.a(edit);
    }
}

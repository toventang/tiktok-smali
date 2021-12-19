package com.bytedance.android.livesdk.ao;

import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.other.LoginGuideConfigSetting;
import com.bytedance.android.livesdk.model.LoginGuideConfig;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {
    static {
        Covode.recordClassIndex(7748);
    }

    public static String b() {
        LoginGuideConfig value = LoginGuideConfigSetting.INSTANCE.getValue();
        if (value == null) {
            return null;
        }
        return value.getImageUrlFromFollow();
    }

    public static String a() {
        LoginGuideConfig value = LoginGuideConfigSetting.INSTANCE.getValue();
        if (value == null || TextUtils.isEmpty(value.getFromFollow())) {
            return y.a((int) R.string.gm7);
        }
        return value.getFromFollow();
    }
}

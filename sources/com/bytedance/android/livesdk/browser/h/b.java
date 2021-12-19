package com.bytedance.android.livesdk.browser.h;

import android.text.TextUtils;
import com.bytedance.android.livesdk.f.c;
import com.bytedance.covode.number.Covode;

public final class b implements a {
    static {
        Covode.recordClassIndex(7995);
    }

    @Override // com.bytedance.android.livesdk.browser.h.a
    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("market://details?id=") || str.startsWith("https://play.google.com")) {
            return c.a(str);
        }
        return false;
    }
}

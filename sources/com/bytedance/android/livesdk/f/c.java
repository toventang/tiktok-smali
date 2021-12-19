package com.bytedance.android.livesdk.f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.browser.a;
import com.bytedance.covode.number.Covode;

public final class c {
    static {
        Covode.recordClassIndex(9555);
    }

    public static boolean a(String str) {
        Context e2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if ((!str.startsWith("market://details?id=") && !str.startsWith("https://play.google.com")) || !a.c("com.android.vending") || (e2 = y.e()) == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            com.ss.android.ugc.tiktok.security.a.a.a(intent, e2);
            e2.startActivity(intent);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}

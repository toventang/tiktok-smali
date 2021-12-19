package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;
import java.net.URLEncoder;

public final class b {
    static {
        Covode.recordClassIndex(66956);
    }

    public static final boolean a(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        l.b(packageManager, "");
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            String concat = "https://api.whatsapp.com/send?phone=".concat(String.valueOf(str));
            if (hk.a(str2)) {
                concat = concat + "&text=" + URLEncoder.encode(str2, "UTF-8");
            }
            intent.setPackage("com.whatsapp");
            intent.setData(Uri.parse(concat));
            if (intent.resolveActivity(packageManager) == null) {
                return false;
            }
            a.a(intent, context);
            context.startActivity(intent);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}

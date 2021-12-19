package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tiktok.security.a.a;

public final class c {
    static {
        Covode.recordClassIndex(66957);
    }

    private static void a(Context context, Intent intent) {
        a.a(intent, context);
        context.startActivity(intent);
    }

    public static final void a(Context context, String[] strArr, String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", strArr);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            a(context, intent);
        }
    }
}

package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;

public final class bn {
    static {
        Covode.recordClassIndex(46682);
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Uri uri, Intent intent) {
        String queryParameter;
        if (uri != null && intent != null && (queryParameter = uri.getQueryParameter("trigger_by")) != null) {
            intent.putExtra("trigger_by", queryParameter);
        }
    }
}

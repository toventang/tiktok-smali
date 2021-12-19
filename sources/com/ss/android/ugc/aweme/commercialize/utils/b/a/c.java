package com.ss.android.ugc.aweme.commercialize.utils.b.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f75655a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(46657);
    }

    public static final boolean a(Context context, String str) {
        if (str == null) {
            return false;
        }
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=".concat(String.valueOf(str))));
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("hide_status_bar", true);
        return w.a(context, intent);
    }
}

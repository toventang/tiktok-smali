package com.ss.android.ugc.aweme.aq.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.b.a.a;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import java.net.URLEncoder;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static c f66968a;

    static {
        Covode.recordClassIndex(41273);
        try {
            f66968a = (c) a.a(d.a(), c.class);
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "Get show xmas tree SP failed." + th.getMessage());
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static void a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            if (str.startsWith("https://") || str.startsWith("http://")) {
                try {
                    sb.append("aweme://ame/webview/?url=").append(URLEncoder.encode(str, "ISO-8859-1"));
                } catch (Exception unused) {
                }
                Intent a2 = com.ss.android.ugc.aweme.crossplatform.a.b.a(context, Uri.parse(sb.toString()));
                a2.setClass(context, CrossPlatformActivity.class);
                a2.putExtra("hide_more", false);
                a2.putExtra("bundle_auto_play_audio", true);
                a(context, a2);
                return;
            }
            sb.append(str);
            t.a(t.a(), sb.toString());
        }
    }
}

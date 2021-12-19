package com.ss.android.ugc.aweme.authorize.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.openauthorize.a.g;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f67131a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(41368);
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("hide_nav_bar", false);
        intent.putExtra("use_webview_title", true);
        a(context, intent);
    }

    public static String a(String str, int i2, List<g> list) {
        l.d(list, "");
        if (str == null) {
            return list.get(i2).getScopeName();
        }
        return str + "," + list.get(i2).getScopeName();
    }
}

package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.tux.a.i.a;

public final class ao {

    /* renamed from: a  reason: collision with root package name */
    public static int f22245a;

    static {
        Covode.recordClassIndex(13137);
    }

    public static void a(String str) {
        a(y.e(), str, 0);
    }

    public static void a(Activity activity, CharSequence charSequence) {
        new b(activity).b(2131234593).a(charSequence).b();
    }

    public static void a(Context context, int i2) {
        if (context != null || (context = y.e()) != null) {
            a(context, context.getString(i2), 0);
        }
    }

    public static void a(Context context, String str, long j2) {
        if ((context == null && (context = y.e()) == null) || TextUtils.isEmpty(str)) {
            return;
        }
        if (j2 > 0) {
            new a(context).a(str).a(j2).a();
        } else {
            new a(context).a(str).a();
        }
    }
}

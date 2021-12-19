package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class f {
    static {
        Covode.recordClassIndex(13179);
    }

    public static void a(Context context, Throwable th) {
        if (th != null && context != null) {
            if (th instanceof a) {
                a aVar = (a) th;
                String alert = aVar.getAlert();
                String prompt = aVar.getPrompt();
                if (!TextUtils.isEmpty(alert)) {
                    a(context, alert, context.getResources().getString(R.string.gly));
                } else if (!TextUtils.isEmpty(prompt)) {
                    ao.a(context, prompt, 0);
                }
            } else {
                ao.a(context, (int) R.string.gme);
            }
        }
    }

    private static void a(Context context, String str, String str2) {
        if (context != null) {
            b.a aVar = new b.a(context);
            aVar.f18284a = context.getResources().getString(R.string.gmf);
            aVar.f18285b = str;
            aVar.a((CharSequence) str2, (DialogInterface.OnClickListener) null, false);
            aVar.a().show();
        }
    }

    public static void a(Context context, Throwable th, int i2) {
        if (th != null && context != null) {
            if (th instanceof a) {
                a aVar = (a) th;
                String prompt = aVar.getPrompt();
                String alert = aVar.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    a(context, alert, context.getResources().getString(R.string.gly));
                } else if (!TextUtils.isEmpty(prompt)) {
                    ao.a(context, prompt, 0);
                } else {
                    ao.a(context, i2);
                }
            } else {
                ao.a(context, i2);
            }
        }
    }
}

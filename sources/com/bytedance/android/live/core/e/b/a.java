package com.bytedance.android.live.core.e.b;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {
    static {
        Covode.recordClassIndex(4592);
    }

    public static boolean a(Exception exc) {
        if (!(exc instanceof com.bytedance.android.live.a.a.b.a) || ((com.bytedance.android.live.a.a.a) exc).getErrorCode() != 20047) {
            return false;
        }
        return true;
    }

    public static void a(Context context, Throwable th, String str) {
        if (th instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
            if (aVar.getErrorCode() != 20006) {
                String prompt = aVar.getPrompt();
                String alert = aVar.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    String string = context.getResources().getString(R.string.gly);
                    b.a aVar2 = new b.a(context);
                    aVar2.f18284a = context.getResources().getString(R.string.gmf);
                    aVar2.f18285b = alert;
                    aVar2.a((CharSequence) string, (DialogInterface.OnClickListener) null, false);
                    aVar2.f18289f = new b(null);
                    aVar2.a().show();
                    return;
                } else if (!TextUtils.isEmpty(prompt)) {
                    ao.a(context, prompt, 0);
                    return;
                } else {
                    ao.a(context, str, 0);
                    return;
                }
            }
        }
        ao.a(context, str, 0);
    }
}

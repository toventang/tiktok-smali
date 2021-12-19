package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.os.Build;
import androidx.appcompat.app.c;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class bt {
    static {
        Covode.recordClassIndex(93363);
    }

    private static void c(Dialog dialog) {
        try {
            dialog.dismiss();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static void a(Dialog dialog) {
        if (dialog != null) {
            Context context = dialog.getContext();
            if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && !dialog.isShowing()) {
                try {
                    dialog.show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void b(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            Context baseContext = ((ContextWrapper) dialog.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                int i2 = Build.VERSION.SDK_INT;
                Activity activity = (Activity) baseContext;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
            }
            c(dialog);
        }
    }

    public static c a(Context context, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        c.a aVar = new c.a(context);
        aVar.b(R.string.vc).b(R.string.a9e, onClickListener).a(R.string.asi, onClickListener2);
        c a2 = aVar.a();
        try {
            a2.show();
        } catch (Exception unused) {
        }
        return a2;
    }
}

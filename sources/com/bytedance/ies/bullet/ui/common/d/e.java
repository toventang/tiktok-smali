package com.bytedance.ies.bullet.ui.common.d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f33106a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(19766);
    }

    public static Activity a(Context context) {
        while (context != null) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (Activity) context;
            }
        }
        return null;
    }
}

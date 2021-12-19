package com.bytedance.ies.xbridge.o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36359a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(21784);
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

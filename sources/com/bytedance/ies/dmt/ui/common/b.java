package com.bytedance.ies.dmt.ui.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public int f33347a;

    static {
        Covode.recordClassIndex(19910);
    }

    public static boolean a(int i2) {
        return i2 == 1;
    }

    private b() {
        this.f33347a = 1;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f33348a = new b((byte) 0);

        static {
            Covode.recordClassIndex(19911);
        }
    }

    public static boolean a() {
        if (a.f33348a.f33347a == 1) {
            return true;
        }
        return false;
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public static boolean b(Context context) {
        if (a.f33348a.f33347a == 0 || a(context)) {
            return true;
        }
        return false;
    }

    public static boolean a(Context context) {
        Context context2;
        while (true) {
            context2 = null;
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context2 = context;
                    break;
                }
            } else {
                break;
            }
        }
        if (context2 instanceof com.bytedance.ies.dmt.ui.a.b) {
            return true;
        }
        return false;
    }
}

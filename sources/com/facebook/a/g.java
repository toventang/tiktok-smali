package com.facebook.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class g {

    /* renamed from: b  reason: collision with root package name */
    private static final String f46795b = g.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    public h f46796a;

    static {
        Covode.recordClassIndex(28505);
    }

    public enum a {
        AUTO,
        EXPLICIT_ONLY;

        static {
            Covode.recordClassIndex(28506);
        }
    }

    public static g a(Context context) {
        return new g(context);
    }

    private g(Context context) {
        this.f46796a = new h(context, null);
    }
}

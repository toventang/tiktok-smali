package com.ss.android.ugc.aweme.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.c;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f109132a = b();

    public static boolean a() {
        if (f109132a) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(69880);
    }

    private static boolean b() {
        try {
            return c.f99077a.f99078b.getMainTabFollowUseLazyViewpager().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }
}

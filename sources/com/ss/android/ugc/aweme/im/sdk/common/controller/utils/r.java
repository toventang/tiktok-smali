package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import androidx.core.f.g;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f102442a = new r();

    private r() {
    }

    static {
        Covode.recordClassIndex(65578);
    }

    public static boolean a() {
        if (g.a(Locale.getDefault()) == 0) {
            return true;
        }
        return false;
    }
}

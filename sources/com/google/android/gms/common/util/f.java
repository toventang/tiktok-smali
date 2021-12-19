package com.google.android.gms.common.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f50505a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b  reason: collision with root package name */
    private static int f50506b = -1;

    static {
        Covode.recordClassIndex(31468);
    }

    public static boolean a(Context context, Throwable th) {
        try {
            r.a(context);
            r.a(th);
        } catch (Exception unused) {
        }
        return false;
    }
}

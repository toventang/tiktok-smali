package com.ss.android.ugc.aweme.framework.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.fe;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static fe.a f96676a;

    /* renamed from: b  reason: collision with root package name */
    public static fe.a f96677b;

    static {
        Covode.recordClassIndex(61340);
    }

    public static boolean a(Context context) {
        fe.a aVar = f96676a;
        if (aVar == null || aVar == fe.a.NONE) {
            f96676a = fe.b(context);
        }
        if (f96676a == fe.a.WIFI) {
            return true;
        }
        return false;
    }
}

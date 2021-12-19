package com.bytedance.geckox.utils;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Context f30127a;

    static {
        Covode.recordClassIndex(17496);
    }

    public static void a(Context context) {
        if (context != null) {
            f30127a = context;
        }
    }

    public static void a(String str) {
        Context context = f30127a;
        if (context == null) {
            b(str);
        } else {
            Librarian.a(str, true, context);
        }
    }

    private static void b(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }
}

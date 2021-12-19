package com.ss.android.ugc.aweme.utils;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f142631a = false;

    static {
        Covode.recordClassIndex(93303);
    }

    public static boolean a(i iVar) {
        if (iVar == null || iVar.c() || iVar.b() || iVar.d() == null) {
            return false;
        }
        return true;
    }

    public static void a(Runnable runnable, String str) {
        i.b(new aj(runnable, str), i.f4824a).a((g) new ak(str));
    }

    public static void b(Runnable runnable, String str) {
        i.b(new al(runnable, str), i.f4826c).a((g) new am(str));
    }
}

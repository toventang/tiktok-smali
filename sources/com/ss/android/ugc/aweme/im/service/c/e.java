package com.ss.android.ugc.aweme.im.service.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f103837a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(66513);
    }

    public static boolean b() {
        if (d() == 2) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (d() == 3) {
            return true;
        }
        return false;
    }

    private static int d() {
        return b.a().a(true, "messaging_longpress_optimization", 0);
    }

    public static boolean a() {
        if (d() == 1 || d() == 2) {
            return true;
        }
        return false;
    }
}

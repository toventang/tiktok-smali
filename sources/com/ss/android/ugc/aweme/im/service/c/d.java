package com.ss.android.ugc.aweme.im.service.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f103836a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(66512);
    }

    public static int a() {
        return b.a().a(true, "im_guide_user_to_send_message", 0);
    }

    public static boolean b() {
        if (a() != 0) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (a() == 6) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (a() == 3 || a() == 5) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (a() == 0 || a() == 1 || a() == 2 || a() == 4) {
            return true;
        }
        return false;
    }
}

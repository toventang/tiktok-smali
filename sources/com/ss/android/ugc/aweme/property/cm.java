package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class cm {

    /* renamed from: a  reason: collision with root package name */
    public static final cm f118412a = new cm();

    private cm() {
    }

    static {
        Covode.recordClassIndex(76910);
    }

    public static int a() {
        return b.a().a(true, "move_captions_position", 0);
    }

    public static boolean b() {
        int a2 = a();
        if (a2 == 4 || a2 == 5) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (a() == 6) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (a() == 5) {
            return true;
        }
        return false;
    }
}

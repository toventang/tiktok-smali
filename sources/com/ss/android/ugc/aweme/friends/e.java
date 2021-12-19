package com.ss.android.ugc.aweme.friends;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f96833a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(61443);
    }

    public static int a() {
        return b.a().a(true, "display_mutual_connections", 0);
    }

    public static boolean b() {
        int a2 = a();
        if (a2 == 1 || a2 == 2 || a2 == 3) {
            return true;
        }
        return false;
    }

    public static String c() {
        if (a() != 2) {
            return "0";
        }
        return "1";
    }

    public static int d() {
        int a2 = a();
        if (a2 != 1) {
            if (a2 == 2) {
                return 4;
            }
            if (a2 != 3) {
                return 0;
            }
        }
        return 2;
    }

    public static int e() {
        int a2 = a();
        if (a2 != 1) {
            if (a2 == 2) {
                return 4;
            }
            if (a2 != 3) {
                return 0;
            }
        }
        return 1;
    }
}

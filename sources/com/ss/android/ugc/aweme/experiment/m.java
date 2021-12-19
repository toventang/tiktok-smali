package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f90265a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(56614);
    }

    public static int a() {
        return b.a().a(true, "BA_direct_message_new_entry_point", 0);
    }

    public static boolean b() {
        int a2 = a();
        if (a2 == 1 || a2 == 2) {
            return true;
        }
        return false;
    }

    public static boolean a(boolean z) {
        int a2 = a();
        if (a2 == 0 || (a2 == 1 && z)) {
            return true;
        }
        return false;
    }
}

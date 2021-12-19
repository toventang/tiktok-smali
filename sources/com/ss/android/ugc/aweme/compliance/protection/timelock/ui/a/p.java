package com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.common.e.a.a;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.c.a.b;

public final class p {
    static {
        Covode.recordClassIndex(48398);
    }

    public static Fragment a(int i2) {
        if (i2 == 0) {
            return a.a(l.class).a();
        }
        return a.a(com.ss.android.ugc.aweme.compliance.protection.restrictmode.c.a.a.class).a();
    }

    public static Fragment b(int i2) {
        return a.a(o.class).a("type_close", i2).a();
    }

    public static Fragment c(int i2) {
        if (i2 == 0) {
            return a.a(q.class).a();
        }
        return a.a(b.class).a();
    }

    public static Fragment a(boolean z) {
        return a.a(v.class).a("from_change_pwd", z).a();
    }
}

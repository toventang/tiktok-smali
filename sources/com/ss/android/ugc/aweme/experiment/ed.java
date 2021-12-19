package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;

public final class ed {

    /* renamed from: a  reason: collision with root package name */
    public static final ed f89900a = new ed();

    private ed() {
    }

    static {
        Covode.recordClassIndex(56452);
    }

    public static final boolean a() {
        int a2 = b.a().a(false, "landing_page_optimization_experiment_v2", 0);
        if (a2 == 2 || a2 == 4) {
            return true;
        }
        return false;
    }

    public static final boolean b(int i2) {
        int a2 = b.a().a(false, "landing_page_optimization_experiment_v2", 0);
        if (a2 != 1 ? a2 == 3 || a2 == 4 : i2 > 1000) {
            return true;
        }
        return false;
    }

    public static final boolean a(int i2) {
        int a2 = b.a().a(false, "landing_page_optimization_experiment_v2", 0);
        if (a2 == 0 || (a2 != 1 ? a2 == 2 : i2 <= 1000)) {
            return true;
        }
        return false;
    }
}

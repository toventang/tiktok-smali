package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import h.f.b.l;

public final class ec {

    /* renamed from: a  reason: collision with root package name */
    public static final ec f89899a = new ec();

    private ec() {
    }

    static {
        Covode.recordClassIndex(56451);
    }

    public static final boolean a() {
        int a2 = b.a().a(false, "landing_page_optimization_experiment", 0);
        if (a2 == 0 || a2 == 1) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        if (b.a().a(false, "landing_page_optimization_experiment", 0) == 3) {
            return true;
        }
        return false;
    }

    public static final boolean a(Aweme aweme) {
        AwemeStatus status;
        l.d(aweme, "");
        int a2 = b.a().a(false, "landing_page_optimization_experiment", 0);
        if (a2 == 3 || ((a2 == 1 || a2 == 2) && (status = aweme.getStatus()) != null && status.getPrivateStatus() == 0)) {
            return true;
        }
        return false;
    }

    public static final boolean b(Aweme aweme) {
        AwemeStatus status;
        l.d(aweme, "");
        int a2 = b.a().a(false, "landing_page_optimization_experiment", 0);
        if (a2 == 0 || ((a2 == 1 || a2 == 2) && ((status = aweme.getStatus()) == null || status.getPrivateStatus() != 0))) {
            return true;
        }
        return false;
    }
}

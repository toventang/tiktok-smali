package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.keva.Keva;

public final class bl {
    static {
        Covode.recordClassIndex(56319);
    }

    public static void a() {
        Keva.getRepo("ab_repo_cold_boot").storeInt("optimize_preload_resource_repo", b.a().a(true, "optimize_preload_resource_repo", 0));
    }
}

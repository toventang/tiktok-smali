package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.s.g;
import com.ss.android.ugc.aweme.video.ac;
import com.ss.android.ugc.tools.utils.d;
import java.util.List;

public final class ho {
    static {
        Covode.recordClassIndex(56597);
    }

    public static void a(List<Aweme> list) {
        if (d.a(list)) {
            return;
        }
        if (g.a() && !NetworkUtils.isWifi(com.bytedance.ies.ugc.appcontext.g.a())) {
            return;
        }
        if (((Boolean) g.f120824b.getValue()).booleanValue()) {
            for (Aweme aweme : list) {
                if (aweme != null) {
                    ac.a(aweme, 819200);
                }
            }
            return;
        }
        Aweme aweme2 = list.get(0);
        if (aweme2 != null) {
            ac.a(aweme2, 819200);
        }
    }
}

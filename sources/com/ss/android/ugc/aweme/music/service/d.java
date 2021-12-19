package com.ss.android.ugc.aweme.music.service;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.presenter.g;
import java.util.List;

public final class d {
    static {
        Covode.recordClassIndex(71857);
    }

    public static void a(a<?, ?> aVar, List<? extends Aweme> list) {
        if (aVar instanceof g) {
            ((g) aVar).a((List<Aweme>) list);
        }
    }
}

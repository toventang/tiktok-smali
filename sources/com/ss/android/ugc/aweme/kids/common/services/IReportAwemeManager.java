package com.ss.android.ugc.aweme.kids.common.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public interface IReportAwemeManager {
    static {
        Covode.recordClassIndex(67774);
    }

    List<Aweme> a(List<? extends Aweme> list);

    void a(String str);
}

package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

public interface IQnaService {
    static {
        Covode.recordClassIndex(79472);
    }

    boolean enablePublicQna();

    void setQuestionAwemeListCacheCache(long j2, int i2, int i3, List<? extends Aweme> list);
}

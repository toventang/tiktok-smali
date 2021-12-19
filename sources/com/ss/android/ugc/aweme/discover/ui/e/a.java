package com.ss.android.ugc.aweme.discover.ui.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.e.c;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public interface a extends c<Aweme> {
    static {
        Covode.recordClassIndex(51393);
    }

    void a(GlobalDoodleConfig globalDoodleConfig);

    void a(LogPbBean logPbBean);

    void a(boolean z);

    void d(List<? extends Aweme> list, boolean z);
}

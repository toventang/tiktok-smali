package com.ss.android.ugc.aweme.discover.ui;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.d;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.ss.android.ugc.aweme.keyword.a;
import java.lang.ref.WeakReference;

public interface ac {
    static {
        Covode.recordClassIndex(51187);
    }

    void a(d dVar);

    void a(d dVar, String str);

    void a(QueryCorrectInfo queryCorrectInfo);

    void a(SearchApiResult searchApiResult);

    void a(SearchPreventSuicide searchPreventSuicide, GlobalDoodleConfig globalDoodleConfig);

    a.AbstractC2689a aP_();

    com.ss.android.ugc.aweme.search.model.d aQ_();

    WeakReference<e> aR_();

    void b(SearchApiResult searchApiResult);

    void c_(boolean z);
}

package com.ss.android.ugc.aweme.discover.c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import h.f.b.l;

public interface f {
    static {
        Covode.recordClassIndex(50304);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50305);
        }

        public static SearchApiResult a(SearchApiResult searchApiResult) {
            String imprId;
            String str = "";
            l.d(searchApiResult, str);
            if (TextUtils.isEmpty(searchApiResult.getRequestId())) {
                LogPbBean logPbBean = searchApiResult.logPb;
                if (!(logPbBean == null || (imprId = logPbBean.getImprId()) == null)) {
                    str = imprId;
                }
                searchApiResult.setRequestId(str);
            }
            ac.a.f91473a.a(searchApiResult.getRequestId(), searchApiResult.logPb);
            QueryCorrectInfo queryCorrectInfo = searchApiResult.queryCorrectInfo;
            if (queryCorrectInfo != null) {
                queryCorrectInfo.setRequestId(searchApiResult.getRequestId());
            }
            return searchApiResult;
        }
    }
}

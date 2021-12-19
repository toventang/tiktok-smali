package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;

public interface IAVFilterService {
    static {
        Covode.recordClassIndex(79449);
    }

    String getFilterFolder(FilterBean filterBean);

    void setFilterFolder(FilterBean filterBean, String str);
}

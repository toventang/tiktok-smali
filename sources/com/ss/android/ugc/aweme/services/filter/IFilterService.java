package com.ss.android.ugc.aweme.services.filter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;

public interface IFilterService {
    static {
        Covode.recordClassIndex(79721);
    }

    FilterBean getFilter(int i2);

    String getFilterEnName(int i2);

    void refreshData();
}

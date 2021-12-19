package com.ss.android.ugc.aweme.filter.view.internal.main;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;

public interface r {
    static {
        Covode.recordClassIndex(60800);
    }

    LiveData<FilterBean> a();

    void a(FilterBean filterBean);
}

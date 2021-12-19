package com.ss.android.ugc.aweme.filter.view.internal.main;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.g;
import java.util.List;
import java.util.Map;

public interface s {
    static {
        Covode.recordClassIndex(60801);
    }

    LiveData<Map<FilterBean, g>> a();

    void a(List<? extends FilterBean> list);
}

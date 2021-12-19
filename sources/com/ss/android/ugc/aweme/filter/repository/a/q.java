package com.ss.android.ugc.aweme.filter.repository.a;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import h.p;
import java.util.List;
import java.util.Map;

public interface q {
    static {
        Covode.recordClassIndex(60561);
    }

    LiveData<List<FilterBean>> a();

    LiveData<List<FilterBean>> b();

    LiveData<List<p<EffectCategoryResponse, List<FilterBean>>>> c();

    LiveData<Map<String, Effect>> d();
}

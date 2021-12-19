package com.bytedance.creativex.recorder.filter.a;

import androidx.lifecycle.LiveData;
import com.bytedance.als.b;
import com.bytedance.als.g;
import com.bytedance.als.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.List;

public interface a extends b {

    /* renamed from: com.bytedance.creativex.recorder.filter.a.a$a  reason: collision with other inner class name */
    public static final class C0598a {
        static {
            Covode.recordClassIndex(16545);
        }
    }

    static {
        Covode.recordClassIndex(16544);
    }

    void addFilterSource(e eVar);

    void clearFilterChosen();

    h<FilterBean> getCurSelectedFilter();

    LiveData<e> getCurrentFilterSource();

    LiveData<List<e>> getFilterSources();

    g<h> getFilterSwitchEvent();

    g<i> getFilterUpdateEvent();

    boolean isFilterDisable(String str);

    void removeFilterSource(String str);

    void setFilterChosen(FilterBean filterBean, String str, boolean z, boolean z2, boolean z3);

    void setFilterDisable(boolean z, String str);

    void setFilterFromStore(boolean z);

    void setFilterIntensity(FilterBean filterBean, float f2);

    void setFilterProgress(FilterBean filterBean, int i2);

    void setFilterScroll(FilterBean filterBean, FilterBean filterBean2, float f2);

    void useFilterSource(String str);
}

package com.ss.android.ugc.tools.infosticker.view.internal;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import h.p;
import java.util.List;

public interface a<CATEGORY, DATA> extends e<DATA> {
    static {
        Covode.recordClassIndex(98460);
    }

    LiveData<List<p<CATEGORY, List<DATA>>>> a();
}

package com.ss.android.ugc.tools.infosticker.view.internal;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.d;
import com.ss.android.ugc.tools.h.a.c;
import h.p;
import java.util.List;
import java.util.Map;

public interface k<DATA> {
    static {
        Covode.recordClassIndex(98522);
    }

    void a(DATA data);

    LiveData<Map<DATA, p<c, Integer>>> j();

    LiveData<d<List<DATA>>> k();

    LiveData<d<List<DATA>>> l();
}

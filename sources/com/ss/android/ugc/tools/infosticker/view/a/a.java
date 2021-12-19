package com.ss.android.ugc.tools.infosticker.view.a;

import com.bytedance.covode.number.Covode;
import f.a.t;
import h.p;
import java.util.List;

public interface a<CATEGORY, DATA> extends b<DATA> {
    static {
        Covode.recordClassIndex(98450);
    }

    t<List<p<CATEGORY, List<DATA>>>> a();

    void a(DATA data, int i2);
}

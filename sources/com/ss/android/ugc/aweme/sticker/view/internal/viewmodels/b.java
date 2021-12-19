package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.d;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.view.widget.b.a;
import h.p;
import h.u;
import java.util.List;

public interface b<DATA> {
    static {
        Covode.recordClassIndex(89243);
    }

    p<c, Integer> a(DATA data);

    void a(String str);

    int b(DATA data);

    void b(f<DATA> fVar);

    LiveData<u<DATA, c, Integer>> k();

    LiveData<List<DATA>> l();

    LiveData<a> m();

    LiveData<d<DATA>> n();
}

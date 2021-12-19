package com.ss.android.ugc.aweme.sticker.view.internal;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.c;
import h.p;
import h.u;

public interface f {
    static {
        Covode.recordClassIndex(88984);
    }

    LiveData<u<Effect, c, Integer>> a();

    p<c, Integer> a(Effect effect);

    void a(Effect effect, c cVar, Integer num, boolean z);
}

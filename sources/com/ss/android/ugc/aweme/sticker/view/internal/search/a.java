package com.ss.android.ugc.aweme.sticker.view.internal.search;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.c.c;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface a extends b<Effect> {
    static {
        Covode.recordClassIndex(89170);
    }

    void a();

    void a(c cVar);

    String b();

    m c();

    LiveData<String> d();

    LiveData<k> e();

    LiveData<f> f();

    LiveData<d> g();

    LiveData<Boolean> h();
}

package com.ss.android.ugc.aweme.sticker.presenter;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface j {
    static {
        Covode.recordClassIndex(88467);
    }

    Effect a();

    void a(b bVar);

    void a(a aVar);

    void a(Effect effect);

    void a(Effect effect, int i2);

    LiveData<Effect> b();

    void b(Effect effect);

    LiveData<k> c();

    boolean c(Effect effect);

    LiveData<n> d();

    LiveData<l> e();

    LiveData<r> f();

    LiveData<b> g();

    LiveData<Effect> h();

    LiveData<Effect> i();
}

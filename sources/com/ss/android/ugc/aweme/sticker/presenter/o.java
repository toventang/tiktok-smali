package com.ss.android.ugc.aweme.sticker.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.e.g;
import com.ss.android.ugc.aweme.sticker.repository.a.m;
import com.ss.android.ugc.aweme.sticker.repository.a.w;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.p;
import java.util.List;
import java.util.Map;

public interface o extends g, m {
    static {
        Covode.recordClassIndex(88472);
    }

    void a(int i2);

    void a(int i2, List<? extends Effect> list);

    void a(long j2);

    void a(Effect effect, IFetchEffectListener iFetchEffectListener);

    void a(String str);

    void a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    void a(List<String> list, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener);

    void a(boolean z);

    boolean a();

    void b(Effect effect);

    boolean b();

    w c();

    String d();

    int e();

    Effect f();

    Effect g();

    Effect h();

    long i();

    boolean j();

    String k();

    String l();

    p<String, String> m();

    j n();

    void o();

    q p();
}

package com.bytedance.android.live.effect.api.a;

import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

public interface h extends e {
    static {
        Covode.recordClassIndex(4902);
    }

    @Override // com.bytedance.android.live.effect.api.a.e
    void a(l lVar);

    void a(EffectChannelResponse effectChannelResponse);

    @Override // com.bytedance.android.live.effect.api.a.e
    void a(String str);

    void a(String str, float f2);

    @Override // com.bytedance.android.live.effect.api.a.e
    void a(String str, a aVar);

    @Override // com.bytedance.android.live.effect.api.a.e
    List<a> b(String str);

    Float e(String str);
}

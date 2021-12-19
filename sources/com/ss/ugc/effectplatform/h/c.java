package com.ss.ugc.effectplatform.h;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.e;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import java.util.List;

public interface c extends e<GifProviderEffectListResponse> {
    static {
        Covode.recordClassIndex(102410);
    }

    void a(e eVar);

    void a(List<? extends ProviderEffect> list);
}

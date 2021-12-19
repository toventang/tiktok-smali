package com.ss.android.ugc.tools.infosticker.view.internal;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.util.List;

public interface l {
    static {
        Covode.recordClassIndex(98523);
    }

    d a();

    void a(List<? extends Effect> list);

    void a(boolean z);

    a<EffectCategoryResponse, Effect> b();

    k<Effect> c();

    e<Effect> d();

    k<Effect> e();

    h<ProviderEffect> f();

    k<ProviderEffect> g();

    i<InfoStickerEffect> h();

    k<InfoStickerEffect> i();
}

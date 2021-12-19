package com.bytedance.android.live.effect.api;

import com.bytedance.android.live.base.a;
import com.bytedance.android.live.effect.api.a.b;
import com.bytedance.android.live.effect.api.a.e;
import com.bytedance.android.live.effect.api.a.g;
import com.bytedance.android.live.effect.api.a.h;
import com.bytedance.android.live.effect.api.a.i;
import com.bytedance.android.live.effect.api.a.j;
import com.bytedance.android.live.effect.api.a.k;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public interface IEffectService extends a {
    static {
        Covode.recordClassIndex(4893);
    }

    e baseComposerManager();

    h composerManager();

    i composerManagerB();

    com.bytedance.android.livesdkapi.depend.model.a convertStickerBean(Effect effect);

    b getComposerHandler(com.bytedance.android.livesdkapi.depend.model.a.e eVar);

    v getEffectDialogFragment(g gVar, com.bytedance.android.live.effect.model.b bVar);

    d getEffectLogHelper();

    v getEffectNewDialogFragment(com.bytedance.android.live.effect.model.b bVar);

    j getLiveEffectDataProvider();

    k getLiveEffectRestoreManager();

    e getLiveFilterHelper();

    f getLiveFilterManager();
}

package com.ss.android.ugc.aweme.sticker.repository.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;

public interface o {
    static {
        Covode.recordClassIndex(88526);
    }

    void a(Effect effect, IFetchEffectListener iFetchEffectListener);

    void a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    void a(List<String> list, boolean z, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener);
}

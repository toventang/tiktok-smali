package com.ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import h.f.b.l;
import java.util.ArrayList;

public final class d {
    static {
        Covode.recordClassIndex(55699);
    }

    public static final InnerEffectTextLayoutConfig a(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, float f2) {
        l.d(innerEffectTextLayoutConfig, "");
        ArrayList arrayList = new ArrayList();
        for (T t : innerEffectTextLayoutConfig.getTextConfigs()) {
            arrayList.add(InnerEffectTextConfig.copy$default(t, 0, 0, 0, 0, 0, 0, 0, 0, 0, (int) (((float) t.getTextSize()) * f2), 0, 0, 0, 0, null, 0, null, 0, 0, null, null, 0, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, 2147483135, null));
        }
        return InnerEffectTextLayoutConfig.copy$default(innerEffectTextLayoutConfig, null, 0, 0.0f, 0, 0, 0, 0, arrayList, null, 383, null);
    }
}

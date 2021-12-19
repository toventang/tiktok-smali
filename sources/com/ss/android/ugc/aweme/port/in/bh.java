package com.ss.android.ugc.aweme.port.in;

import android.widget.FrameLayout;
import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import h.f.a.a;
import h.f.a.b;
import h.z;

public interface bh {
    static {
        Covode.recordClassIndex(74568);
    }

    void a();

    void a(d dVar, String str, String str2, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, EffectTextModel effectTextModel, AVETParameter aVETParameter, b<? super Boolean, z> bVar);

    void a(BaseShortVideoContext baseShortVideoContext, EffectTextModel effectTextModel, boolean z, boolean z2, a<z> aVar);

    void a(BaseShortVideoContext baseShortVideoContext, boolean z, a<z> aVar);

    void a(boolean z, b<? super Boolean, z> bVar);

    void b(boolean z, b<? super Boolean, z> bVar);
}

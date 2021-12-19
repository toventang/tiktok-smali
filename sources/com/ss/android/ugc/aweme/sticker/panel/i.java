package com.ss.android.ugc.aweme.sticker.panel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.services.StickerTagChangeData;
import com.ss.android.ugc.aweme.sticker.d.e;
import com.ss.android.ugc.aweme.sticker.panel.a.b;
import com.ss.android.ugc.aweme.sticker.view.a.h;

public interface i extends h {
    static {
        Covode.recordClassIndex(88383);
    }

    LiveData<StickerTagChangeData> a();

    void a(u<StickerTagChangeData> uVar);

    void a(l lVar);

    LiveData<Boolean> b();

    void b(e eVar);

    b c();

    j m();
}

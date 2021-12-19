package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.p;
import com.ss.android.ugc.aweme.sticker.view.internal.f;
import com.ss.android.ugc.aweme.sticker.view.internal.main.k;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class StickerStatesStoreViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, f> f136646a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(89241);
    }

    public final f a(p pVar, String str) {
        l.d(pVar, "");
        l.d(str, "");
        f fVar = this.f136646a.get(str);
        if (fVar != null) {
            return fVar;
        }
        k kVar = new k(pVar);
        this.f136646a.put(str, kVar);
        return kVar;
    }
}

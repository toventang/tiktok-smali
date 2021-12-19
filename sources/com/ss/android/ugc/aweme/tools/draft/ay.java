package com.ss.android.ugc.aweme.tools.draft;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.a.a;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class ay {

    /* renamed from: a  reason: collision with root package name */
    public static final ay f139421a = new ay();

    private ay() {
    }

    static {
        Covode.recordClassIndex(91154);
    }

    public static final bb a(e eVar, c cVar, m<? super Boolean, ? super String, z> mVar, a<z> aVar) {
        l.d(eVar, "");
        l.d(cVar, "");
        l.d(mVar, "");
        l.d(aVar, "");
        com.ss.android.ugc.aweme.shortvideo.c cVar2 = cVar.f83185f;
        if (cVar2 == null) {
            return new ba();
        }
        if (cVar2.musicType == MusicModel.MusicType.LOCAL.ordinal()) {
            return new av(cVar, mVar, aVar);
        }
        DraftOnlineMusicProcessor draftOnlineMusicProcessor = new DraftOnlineMusicProcessor(cVar, mVar, aVar);
        eVar.getLifecycle().a(draftOnlineMusicProcessor);
        return draftOnlineMusicProcessor;
    }
}

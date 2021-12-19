package com.ss.android.ugc.aweme.tools.draft.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b extends a<c> {
    static {
        Covode.recordClassIndex(91364);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.g.a
    public final boolean b(com.ss.android.ugc.aweme.draft.model.c cVar) {
        com.ss.android.ugc.aweme.draft.model.c cVar2;
        c cVar3;
        c cVar4;
        l.d(cVar, "");
        l.d(cVar, "");
        ArrayList<com.ss.android.ugc.aweme.draft.model.c> arrayList = this.f139774b;
        if (!(arrayList == null || (cVar2 = (com.ss.android.ugc.aweme.draft.model.c) n.h((List) arrayList)) == null || (cVar3 = cVar2.f83185f) == null || (cVar4 = cVar.f83185f) == null || cVar3.musicType != cVar4.musicType)) {
            if (cVar3.isLocalMusic()) {
                if (cVar3.getLocalMusicId() == cVar4.getLocalMusicId()) {
                    return true;
                }
                return false;
            } else if (cVar3.getId() == cVar4.getId()) {
                return true;
            }
        }
        return false;
    }
}

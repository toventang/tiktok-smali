package com.ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final c f83130a;

    static {
        Covode.recordClassIndex(51833);
    }

    @Override // com.ss.android.ugc.aweme.draft.d
    public final DraftCheckResult a() {
        ArrayList arrayList;
        List<EditVideoSegment> videoList;
        EditPreviewInfo h2 = d.h(this.f83130a);
        if (h2 == null || (videoList = h2.getVideoList()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) videoList, 10));
            Iterator<T> it = videoList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().getVideoPath());
            }
            arrayList = arrayList2;
        }
        return e.a(arrayList);
    }

    public b(c cVar) {
        l.d(cVar, "");
        this.f83130a = cVar;
    }
}

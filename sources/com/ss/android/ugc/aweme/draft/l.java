package com.ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.draft.model.d;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import h.a.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class l implements d {

    /* renamed from: a  reason: collision with root package name */
    public final c f83139a;

    static {
        Covode.recordClassIndex(51845);
    }

    @Override // com.ss.android.ugc.aweme.draft.d
    public final DraftCheckResult a() {
        ArrayList arrayList;
        List<EditVideoSegment> i2 = d.i(this.f83139a);
        if (i2 != null) {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) i2, 10));
            Iterator<T> it = i2.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().getVideoPath());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return e.a(arrayList);
    }

    public l(c cVar) {
        h.f.b.l.d(cVar, "");
        this.f83139a = cVar;
    }
}

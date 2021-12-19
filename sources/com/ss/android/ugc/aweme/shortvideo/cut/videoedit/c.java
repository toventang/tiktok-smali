package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.i;
import java.util.List;

final /* synthetic */ class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final b f126161a;

    static {
        Covode.recordClassIndex(82829);
    }

    c(b bVar) {
        this.f126161a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.i
    public final void a(List list) {
        b bVar = this.f126161a;
        if (list != null && !list.isEmpty()) {
            bVar.n.clear();
            bVar.n.addAll(list);
            bVar.notifyDataSetChanged();
        }
    }
}

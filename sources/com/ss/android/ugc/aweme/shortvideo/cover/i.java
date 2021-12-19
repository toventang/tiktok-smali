package com.ss.android.ugc.aweme.shortvideo.cover;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.b;
import java.util.List;

final /* synthetic */ class i implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.i {

    /* renamed from: a  reason: collision with root package name */
    private final b f125256a;

    static {
        Covode.recordClassIndex(82253);
    }

    i(b bVar) {
        this.f125256a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.i
    public final void a(List list) {
        b bVar = this.f125256a;
        if (list != null && !list.isEmpty()) {
            bVar.f128775a.clear();
            bVar.f128775a.addAll(list);
            bVar.notifyDataSetChanged();
        }
    }
}

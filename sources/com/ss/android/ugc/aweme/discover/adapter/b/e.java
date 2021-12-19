package com.ss.android.ugc.aweme.discover.adapter.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.adapter.b.f;

final /* synthetic */ class e implements f.b {

    /* renamed from: a  reason: collision with root package name */
    private final d f80482a;

    static {
        Covode.recordClassIndex(50083);
    }

    e(d dVar) {
        this.f80482a = dVar;
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b.f.b
    public final void a(int i2) {
        d dVar = this.f80482a;
        if (i2 >= 0 && i2 < dVar.getItemCount()) {
            dVar.f80465a.remove(i2);
            dVar.notifyItemRemoved(i2);
        }
    }
}

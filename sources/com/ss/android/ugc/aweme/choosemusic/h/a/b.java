package com.ss.android.ugc.aweme.choosemusic.h.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.viewholder.u;

final /* synthetic */ class b implements u.b {

    /* renamed from: a  reason: collision with root package name */
    private final a f70546a;

    static {
        Covode.recordClassIndex(43506);
    }

    b(a aVar) {
        this.f70546a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.viewholder.u.b
    public final void a(int i2) {
        a aVar = this.f70546a;
        if (i2 >= 0 && i2 < aVar.getItemCount()) {
            aVar.f70542a.remove(i2);
            aVar.notifyItemRemoved(i2);
        }
    }
}

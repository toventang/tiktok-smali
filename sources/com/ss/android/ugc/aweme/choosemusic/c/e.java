package com.ss.android.ugc.aweme.choosemusic.c;

import androidx.lifecycle.u;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.model.a;
import com.ss.android.ugc.aweme.choosemusic.view.ab;

final /* synthetic */ class e implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d f70460a;

    static {
        Covode.recordClassIndex(43451);
    }

    e(d dVar) {
        this.f70460a = dVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        d dVar = this.f70460a;
        if (obj == a.C1596a.f70585a) {
            i.b(new g(dVar), i.f4826c);
            new ab(new h(dVar), 5).a(dVar.f70451a);
        }
    }
}

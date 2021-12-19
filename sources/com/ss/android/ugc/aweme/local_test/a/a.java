package com.ss.android.ugc.aweme.local_test.a;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.local_test.b.c;
import h.f.b.l;

public final class a implements c {
    static {
        Covode.recordClassIndex(69789);
    }

    @Override // com.ss.android.ugc.aweme.local_test.b.c
    public final void a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
    }

    @Override // com.ss.android.ugc.aweme.local_test.b.c
    public final void b(ViewGroup viewGroup) {
        l.d(viewGroup, "");
    }

    @Override // com.ss.android.ugc.aweme.local_test.b.c
    public final Keva a() {
        Keva repo = Keva.getRepo("Customer Mock");
        l.b(repo, "");
        return repo;
    }
}

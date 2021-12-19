package com.ss.android.ugc.aweme.kids.choosemusic.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.kids.a.h.d;
import com.ss.android.ugc.aweme.kids.choosemusic.a.b;

final /* synthetic */ class f implements d.a {

    /* renamed from: a  reason: collision with root package name */
    private final b.AnonymousClass2 f105468a;

    static {
        Covode.recordClassIndex(67582);
    }

    f(b.AnonymousClass2 r1) {
        this.f105468a = r1;
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.d.a
    public final void a() {
        b bVar = b.this;
        if (bVar.f105452c >= 0) {
            bVar.f105451b.post(new e(bVar));
        }
    }
}

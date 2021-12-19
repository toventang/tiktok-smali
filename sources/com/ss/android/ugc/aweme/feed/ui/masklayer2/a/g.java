package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.feed.i.e;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.f;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g extends n implements l {

    /* renamed from: a  reason: collision with root package name */
    public final a f94892a;

    /* renamed from: b  reason: collision with root package name */
    public final f f94893b;

    static {
        Covode.recordClassIndex(60183);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void a(View view) {
        l.d(view, "");
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.l
    public final void a(Exception exc) {
        l.d(exc, "");
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.l
    public final void a(String str) {
        l.d(str, "");
        new com.ss.android.ugc.aweme.tux.a.i.a(o.a(this.f94893b.getContext())).a(R.string.bv_).a();
        c.a(new e(this.f94892a.f94865b));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(a aVar, f fVar) {
        super(aVar, fVar);
        l.d(aVar, "");
        l.d(fVar, "");
        this.f94892a = aVar;
        this.f94893b = fVar;
    }
}

package com.ss.android.ugc.aweme.xsearch.horizontallist;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.d;
import com.ss.android.ugc.aweme.flowfeed.utils.g;
import com.ss.android.ugc.aweme.flowfeed.utils.i;
import com.ss.android.ugc.aweme.xsearch.b;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.Set;

public final class h extends d {

    /* renamed from: e  reason: collision with root package name */
    public b f145199e;

    /* renamed from: f  reason: collision with root package name */
    private final Rect f145200f = new Rect(0, 0, 0, 0);

    static {
        Covode.recordClassIndex(94946);
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.d
    public final int c() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.autoplay.player.d
    public final void d() {
        e().getLocationOnScreen(b());
        this.f67485b.left = b()[0];
        this.f67485b.top = b()[1];
        this.f67485b.right = b()[0] + e().getWidth();
        this.f67485b.bottom = b()[1] + e().getHeight();
        this.f67484a.set(this.f67485b.left + this.f145200f.left, this.f67485b.top + this.f145200f.top, this.f67485b.left + this.f145200f.right, this.f67485b.top + this.f145200f.bottom);
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.e, com.ss.android.ugc.aweme.autoplay.player.d
    public final i a(Set<? extends i> set) {
        l.d(set, "");
        i a2 = super.a(set);
        if (a2 == null) {
            return null;
        }
        b bVar = this.f145199e;
        if (bVar != null) {
            b.a(bVar, "scrolltoactive", ag.a(new p("index", Integer.valueOf(a2.a()))));
        }
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view, g gVar) {
        super(view, gVar);
        l.d(view, "");
        l.d(gVar, "");
    }

    public final void a(float f2, float f3, float f4, float f5) {
        this.f145200f.set(com.ss.android.ugc.aweme.framework.d.b.a(e().getContext(), f2), com.ss.android.ugc.aweme.framework.d.b.a(e().getContext(), f3), com.ss.android.ugc.aweme.framework.d.b.a(e().getContext(), f2 + f4), com.ss.android.ugc.aweme.framework.d.b.a(e().getContext(), f3 + f5));
    }
}

package com.ss.android.ugc.aweme.detail.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.e;
import com.ss.android.ugc.aweme.base.ui.p;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;

final /* synthetic */ class u implements p.c {

    /* renamed from: a  reason: collision with root package name */
    static final p.c f79981a = new u();

    static {
        Covode.recordClassIndex(49769);
    }

    private u() {
    }

    @Override // com.ss.android.ugc.aweme.base.ui.p.c
    public final void a(e eVar) {
        if (eVar instanceof z) {
            z zVar = (z) eVar;
            zVar.f79994m = false;
            VerticalViewPager verticalViewPager = zVar.f79992k.N;
            if (verticalViewPager != null) {
                verticalViewPager.setDisableScroll(true);
            }
        }
    }
}

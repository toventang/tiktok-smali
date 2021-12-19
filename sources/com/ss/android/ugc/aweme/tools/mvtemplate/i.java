package com.ss.android.ugc.aweme.tools.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.mvtemplate.g;
import com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a;
import com.ss.android.ugc.d.a.c;

final /* synthetic */ class i implements a.c {

    /* renamed from: a  reason: collision with root package name */
    private final MvTemplateView f140859a;

    static {
        Covode.recordClassIndex(91972);
    }

    i(MvTemplateView mvTemplateView) {
        this.f140859a = mvTemplateView;
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.a.c
    public final void a(int i2) {
        MvTemplateView mvTemplateView = this.f140859a;
        c.a(new g(g.b.START, g.a.ICON_LIST, (byte) 0));
        mvTemplateView.f140598d.a(i2, 0.0f, true);
    }
}

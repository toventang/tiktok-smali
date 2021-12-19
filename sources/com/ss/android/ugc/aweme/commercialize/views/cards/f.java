package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.views.cards.TopPageAction;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements TopPageAction.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f76089a;

    static {
        Covode.recordClassIndex(46932);
    }

    f(e eVar) {
        this.f76089a = eVar;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.TopPageAction.a
    public final void a(d dVar) {
        e eVar = this.f76089a;
        CardStruct ar = b.ar(eVar.f76067b);
        String cardUrl = ar != null ? ar.getCardUrl() : "";
        a.a(Locale.getDefault(), "onRenderFinish:%s, %d", new Object[]{cardUrl, Integer.valueOf(dVar.f76061a)});
        ae a2 = eVar.a(false);
        if (a2 != null) {
            a2.a(a.a(Locale.getDefault(), "javascript:window.modalLoadStatusEvent({'modal_url': '%s', 'status': %d})", new Object[]{cardUrl, Integer.valueOf(dVar.f76061a)}));
        }
    }
}

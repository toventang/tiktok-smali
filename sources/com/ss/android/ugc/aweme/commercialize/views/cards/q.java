package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.depend.b;
import com.ss.android.ugc.aweme.commercialize.views.cards.TopPageActionV2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements TopPageActionV2.a {

    /* renamed from: a  reason: collision with root package name */
    private final p f76122a;

    static {
        Covode.recordClassIndex(46950);
    }

    q(p pVar) {
        this.f76122a = pVar;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.TopPageActionV2.a
    public final void a(d dVar) {
        CardStruct o;
        p pVar = this.f76122a;
        String cardUrl = (b.f73781b.a() == null || (o = b.f73781b.a().o(pVar.f76101b)) == null) ? "" : o.getCardUrl();
        a.a(Locale.getDefault(), "onRenderFinish:%s, %d", new Object[]{cardUrl, Integer.valueOf(dVar.f76061a)});
        ae a2 = pVar.a(false);
        if (a2 != null) {
            a2.a(a.a(Locale.getDefault(), "javascript:window.modalLoadStatusEvent({'modal_url': '%s', 'status': %d})", new Object[]{cardUrl, Integer.valueOf(dVar.f76061a)}));
        }
    }
}

package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class DownloadAdCardAction extends AbsAdCardAction implements au, j {

    /* renamed from: i  reason: collision with root package name */
    private boolean f76008i = true;

    static {
        Covode.recordClassIndex(46867);
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(62, new g(DownloadAdCardAction.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.k, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai, com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void f() {
        if (this.f76008i) {
            super.f();
        }
    }

    @r
    public void onEvent(AdCardClose adCardClose) {
        if (this.f75996c.getAwemeRawAd() != null && !this.f75996c.getAwemeRawAd().isCardOnceClick()) {
            this.f76008i = false;
            this.f75996c.getAwemeRawAd().setCardOnceClick(true);
            this.f75998e.a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
        }
    }

    public DownloadAdCardAction(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f75990a = 2131231768;
    }
}

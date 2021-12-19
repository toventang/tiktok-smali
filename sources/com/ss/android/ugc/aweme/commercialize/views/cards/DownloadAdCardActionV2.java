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

public class DownloadAdCardActionV2 extends AbsAdCardActionV2 implements au, j {

    /* renamed from: i  reason: collision with root package name */
    private boolean f76009i = true;

    static {
        Covode.recordClassIndex(46868);
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(62, new g(DownloadAdCardActionV2.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai, com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void f() {
        if (this.f76009i) {
            super.f();
        }
    }

    @r
    public void onEvent(AdCardClose adCardClose) {
        if (this.f76003c.getAwemeRawAd() != null && !this.f76003c.getAwemeRawAd().isCardOnceClick()) {
            this.f76009i = false;
            this.f76003c.getAwemeRawAd().setCardOnceClick(true);
            this.f76005e.a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
        }
    }

    public DownloadAdCardActionV2(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f75992a = 2131232527;
    }
}

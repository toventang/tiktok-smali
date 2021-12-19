package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import org.greenrobot.eventbus.j;

public final class FeedLiveAdCardAction extends AbsAdCardAction implements au, j {
    static {
        Covode.recordClassIndex(46869);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.k, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedLiveAdCardAction(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        l.d(aeVar, "");
    }
}

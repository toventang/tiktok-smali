package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.greenrobot.eventbus.j;

public class InteractAdCardAction extends AbsAdCardAction implements au, j {
    static {
        Covode.recordClassIndex(46877);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.k, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public InteractAdCardAction(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
    }
}

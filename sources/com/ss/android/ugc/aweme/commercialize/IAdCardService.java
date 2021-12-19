package com.ss.android.ugc.aweme.commercialize;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.views.cards.ae;
import com.ss.android.ugc.aweme.commercialize.views.cards.ag;
import com.ss.android.ugc.aweme.commercialize.views.cards.ah;
import com.ss.android.ugc.aweme.commercialize.views.cards.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

public interface IAdCardService {
    static {
        Covode.recordClassIndex(45308);
    }

    ag a();

    ai a(Integer num, Context context, Aweme aweme, ae aeVar);

    boolean a(CardStruct cardStruct);

    ah b();

    boolean b(CardStruct cardStruct);
}

package com.ss.android.ugc.aweme.commercialize;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.views.cards.CouponAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.DownloadAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.FeedLiveAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.FormAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.GeneralAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.ImageAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.InteractAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.LandingPageAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.PollAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.ShopAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.SurveyAdCardActionV2;
import com.ss.android.ugc.aweme.commercialize.views.cards.ac;
import com.ss.android.ugc.aweme.commercialize.views.cards.ae;
import com.ss.android.ugc.aweme.commercialize.views.cards.ag;
import com.ss.android.ugc.aweme.commercialize.views.cards.ah;
import com.ss.android.ugc.aweme.commercialize.views.cards.ai;
import com.ss.android.ugc.aweme.commercialize.views.cards.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class AdCardServiceImpl implements IAdCardService {
    static {
        Covode.recordClassIndex(45306);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.IAdCardService
    public final ah b() {
        return ac.f76047a;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.IAdCardService
    public final ag a() {
        return new p.a();
    }

    public static IAdCardService c() {
        MethodCollector.i(12866);
        Object a2 = b.a(IAdCardService.class, false);
        if (a2 != null) {
            IAdCardService iAdCardService = (IAdCardService) a2;
            MethodCollector.o(12866);
            return iAdCardService;
        }
        if (b.ai == null) {
            synchronized (IAdCardService.class) {
                try {
                    if (b.ai == null) {
                        b.ai = new AdCardServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12866);
                    throw th;
                }
            }
        }
        AdCardServiceImpl adCardServiceImpl = (AdCardServiceImpl) b.ai;
        MethodCollector.o(12866);
        return adCardServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.IAdCardService
    public final boolean b(CardStruct cardStruct) {
        if (cardStruct == null || 4 == cardStruct.getCardType()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.IAdCardService
    public final boolean a(CardStruct cardStruct) {
        if (cardStruct == null || cardStruct.getCardType() != 4 || cardStruct.getCardStyle() == 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.IAdCardService
    public final ai a(Integer num, Context context, Aweme aweme, ae aeVar) {
        l.d(aeVar, "");
        if (num != null) {
            if (num.intValue() == 2) {
                return new DownloadAdCardActionV2(context, aweme, aeVar);
            }
            if (num.intValue() == 3) {
                return new ShopAdCardActionV2(context, aweme, aeVar);
            }
            if (num != null) {
                if (num.intValue() == 1) {
                    return new FormAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 4) {
                    return new ImageAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 5) {
                    return new InteractAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 6) {
                    return new PollAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 7) {
                    return new SurveyAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 8 || num.intValue() == 9) {
                    return new CouponAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 11) {
                    return new SelectAdCardActionV2(context, aweme, aeVar);
                }
                if (num.intValue() == 12) {
                    if (aweme == null || !aweme.isLive()) {
                        return new GeneralAdCardActionV2(context, aweme, aeVar);
                    }
                    return new FeedLiveAdCardActionV2(context, aweme, aeVar);
                }
            }
        }
        return new LandingPageAdCardActionV2(context, aweme, aeVar);
    }
}

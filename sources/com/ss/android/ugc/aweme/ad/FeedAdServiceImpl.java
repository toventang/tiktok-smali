package com.ss.android.ugc.aweme.ad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.dynamic.b;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.b.d;
import com.ss.android.ugc.aweme.ad.feed.dialog.b;
import com.ss.android.ugc.aweme.ad.feed.e;
import com.ss.android.ugc.aweme.ad.feed.mask.f;
import com.ss.android.ugc.aweme.ad.feed.mask.h;
import com.ss.android.ugc.aweme.ad.feed.survey.c;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import h.z;

public final class FeedAdServiceImpl implements IFeedAdService {
    static {
        Covode.recordClassIndex(40346);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final d b() {
        return b.f65701a;
    }

    public static final class a implements com.ss.android.ugc.aweme.ad.feed.dialog.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f65568a;

        static {
            Covode.recordClassIndex(40347);
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.dialog.d
        public final void a() {
            this.f65568a.invoke();
        }

        a(h.f.a.a aVar) {
            this.f65568a = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final com.ss.android.ugc.aweme.ad.feed.a.b a() {
        return new com.ss.android.ugc.aweme.ad.feed.a.a();
    }

    public static IFeedAdService c() {
        MethodCollector.i(3477);
        Object a2 = com.ss.android.ugc.b.a(IFeedAdService.class, false);
        if (a2 != null) {
            IFeedAdService iFeedAdService = (IFeedAdService) a2;
            MethodCollector.o(3477);
            return iFeedAdService;
        }
        if (com.ss.android.ugc.b.G == null) {
            synchronized (IFeedAdService.class) {
                try {
                    if (com.ss.android.ugc.b.G == null) {
                        com.ss.android.ugc.b.G = new FeedAdServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3477);
                    throw th;
                }
            }
        }
        FeedAdServiceImpl feedAdServiceImpl = (FeedAdServiceImpl) com.ss.android.ugc.b.G;
        MethodCollector.o(3477);
        return feedAdServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final h b(ViewStub viewStub) {
        return new f(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final e c(ViewStub viewStub) {
        l.d(viewStub, "");
        return new com.ss.android.ugc.aweme.ad.feed.sticker.a(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final e d(ViewStub viewStub) {
        l.d(viewStub, "");
        return new com.ss.android.ugc.aweme.ad.feed.superlike.a(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final com.ss.android.ugc.aweme.ad.feed.b.e a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return new com.ss.android.ugc.aweme.ad.dynamic.f(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final com.ss.android.ugc.aweme.ad.feed.g.b a(View view) {
        l.d(view, "");
        return new com.ss.android.ugc.aweme.ad.feed.g.a(view);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final c a(ViewStub viewStub) {
        l.d(viewStub, "");
        return new com.ss.android.ugc.aweme.ad.feed.survey.a(viewStub);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final androidx.fragment.app.d a(AwemeRawAd awemeRawAd, String str, com.ss.android.ugc.aweme.ad.feed.dialog.d dVar) {
        l.d(dVar, "");
        return b.a.a(awemeRawAd, str, dVar, 0L);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void a(Context context, String str, long j2) {
        l.d(context, "");
        l.d(str, "");
        if (AwemeService.b().b(str) != null) {
            l.b(b.a.f65586a, "");
            com.ss.android.ugc.aweme.ad.b.b.a().a((androidx.fragment.app.e) context, str, j2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void a(androidx.fragment.app.e eVar, AwemeRawAd awemeRawAd, String str) {
        l.d(eVar, "");
        l.d(eVar, "");
        com.ss.android.ugc.aweme.ad.feed.dialog.c cVar = new com.ss.android.ugc.aweme.ad.feed.dialog.c();
        cVar.f65835a = awemeRawAd;
        cVar.f65836b = str;
        cVar.f65837c = eVar;
        a.C1112a a2 = new a.C1112a().a(cVar).a(false).a(1);
        double b2 = (double) n.b(com.ss.android.ugc.aweme.base.a.e.a(eVar));
        Double.isNaN(b2);
        com.bytedance.tux.sheet.sheet.a aVar = a2.b((int) (b2 * 0.73d)).f45299a;
        com.ss.android.ugc.aweme.ad.feed.dialog.c.f65833d = aVar;
        if (aVar == null) {
            l.a("tuxSheet");
        }
        aVar.show(eVar.getSupportFragmentManager(), "FeedAdExplainDialog");
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final androidx.fragment.app.d a(AwemeRawAd awemeRawAd, String str, com.ss.android.ugc.aweme.ad.feed.dialog.d dVar, long j2) {
        l.d(dVar, "");
        return b.a.a(awemeRawAd, str, dVar, Long.valueOf(j2));
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.IFeedAdService
    public final void a(Context context, String str, long j2, h.f.a.a<z> aVar) {
        AwemeRawAd awemeRawAd;
        com.ss.android.ugc.aweme.commercialize.model.b dislikeInfo;
        l.d(context, "");
        l.d(str, "");
        l.d(aVar, "");
        Aweme b2 = AwemeService.b().b(str);
        if (b2 == null || !b2.isAd() || (awemeRawAd = b2.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.getEnable() != 1) {
            aVar.invoke();
        } else if (context instanceof androidx.fragment.app.e) {
            androidx.fragment.app.d a2 = a(b2.getAwemeRawAd(), str, new a(aVar), j2);
            a2.setCancelable(true);
            a2.show(((androidx.fragment.app.e) context).getSupportFragmentManager(), "feed_ad_dislike_sub_reason_dialog");
        }
    }
}

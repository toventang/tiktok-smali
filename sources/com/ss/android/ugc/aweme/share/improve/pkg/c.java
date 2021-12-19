package com.ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.e;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.feed.dialog.d;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.model.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.android.livesdkapi.depend.e.c f124032a;

    static {
        Covode.recordClassIndex(81435);
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.b, com.ss.android.ugc.aweme.sharer.ui.h
    public final int ch_() {
        return R.raw.icon_2pt_broken_heart;
    }

    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f124033a;

        static {
            Covode.recordClassIndex(81436);
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.dialog.d
        public final void a() {
            com.bytedance.android.livesdkapi.service.d a2 = f.a();
            if (a2 != null) {
                a2.b(this.f124033a.f124032a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(c cVar) {
            this.f124033a = cVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.bytedance.android.livesdkapi.depend.e.c cVar) {
        super(cVar);
        l.d(cVar, "");
        this.f124032a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.share.improve.pkg.b, com.ss.android.ugc.aweme.sharer.ui.h
    public final void a(Context context, SharePackage sharePackage) {
        AwemeRawAd awemeRawAd;
        b dislikeInfo;
        IFeedAdService c2;
        androidx.fragment.app.d a2;
        l.d(context, "");
        l.d(sharePackage, "");
        Aweme b2 = AwemeService.b().b(this.f124032a.M);
        if (b2 == null || !b2.isAd() || (awemeRawAd = b2.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.getEnable() != 1) {
            c.b bVar = this.f124032a.Q;
            if (bVar != null) {
                bVar.a();
                return;
            }
            com.bytedance.android.livesdkapi.service.d a3 = f.a();
            if (a3 != null) {
                a3.a(this.f124032a);
            }
        } else if ((com.ss.android.ugc.aweme.share.improve.c.b.a(context) instanceof e) && (c2 = FeedAdServiceImpl.c()) != null && (a2 = c2.a(b2.getAwemeRawAd(), b2.getAid(), new a(this), this.f124032a.f22967c)) != null) {
            a2.setCancelable(true);
            Activity a4 = com.ss.android.ugc.aweme.share.improve.c.b.a(context);
            Objects.requireNonNull(a4, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            a2.show(((e) a4).getSupportFragmentManager(), "feed_ad_dislike_sub_reason_dialog");
        }
    }
}

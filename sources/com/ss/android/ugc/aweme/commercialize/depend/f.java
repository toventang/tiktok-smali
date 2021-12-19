package com.ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bd;
import com.ss.android.ugc.aweme.commerce.model.b;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.utils.b.a.a;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.x.k;
import h.f.b.l;
import h.f.b.m;

public final class f implements com.ss.android.ugc.aweme.ad.feed.e.a {
    static {
        Covode.recordClassIndex(45419);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e.a
    public final boolean a(Context context) {
        if (bd.a(context) != 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e.a
    public final void a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            aj.a("play", awemeRawAd.getPlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new a(awemeRawAd));
        }
    }

    static final class a extends m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ AwemeRawAd $awemeRawAd$inlined;

        static {
            Covode.recordClassIndex(45420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AwemeRawAd awemeRawAd) {
            super(2);
            this.$awemeRawAd$inlined = awemeRawAd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b a2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$awemeRawAd$inlined);
            } else {
                a2 = bVar2.a(this.$awemeRawAd$inlined);
            }
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e.a
    public final void a(Context context, Aweme aweme) {
        l.d(aweme, "");
        if (context != null && aweme.getActivityPendant() != null) {
            b activityPendant = aweme.getActivityPendant();
            if ((TextUtils.isEmpty(activityPendant.getJumpOpenUrl()) || !n.a(context, activityPendant.getJumpOpenUrl(), false)) && !TextUtils.isEmpty(activityPendant.getJumpWebUrl())) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    n.a(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, null, k.a(awemeRawAd), new a.C1724a(awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), awemeRawAd.getDownloadUrl(), awemeRawAd.getPackageName(), awemeRawAd.getAppName(), awemeRawAd.getType(), (byte) 0));
                    return;
                }
                n.a(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, null, false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e.a
    public final boolean b(Context context, Aweme aweme) {
        boolean z;
        l.d(aweme, "");
        if (context == null || aweme == null || aweme.getSpecialSticker() == null) {
            return false;
        }
        String openUrl = aweme.getSpecialSticker().getOpenUrl();
        if (!TextUtils.isEmpty(openUrl)) {
            return w.a(context, openUrl, false);
        }
        String linkUrl = aweme.getSpecialSticker().getLinkUrl();
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
            z = k.a(aweme.getAwemeRawAd());
        } else {
            z = true;
        }
        return n.a(context, linkUrl, aweme.getSpecialSticker().getTitle(), false, null, z);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e.a
    public final boolean a(Context context, Aweme aweme, com.ss.android.ugc.aweme.commercialize.j.b bVar) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(bVar, "");
        return w.a(context, aweme, 9, bVar);
    }
}

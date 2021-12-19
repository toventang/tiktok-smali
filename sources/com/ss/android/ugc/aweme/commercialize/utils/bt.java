package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.x.b.c;
import com.bytedance.x.b.f;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.model.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.model.l;
import h.a.ag;
import h.v;
import java.util.List;
import java.util.concurrent.Executor;

public final class bt implements bd {
    static {
        Covode.recordClassIndex(46722);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.bd
    public final void a(c cVar) {
        bs.a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.bd
    public final boolean b(Aweme aweme) {
        return bs.c(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.bd
    public final boolean a(Aweme aweme) {
        return bs.b(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.bd
    public final void c(Aweme aweme) {
        ai omVast;
        f fVar;
        String str;
        Video video;
        VideoUrlModel playAddr;
        List<String> urlList;
        ai omVast2;
        if (bs.b(aweme) || bs.c(aweme)) {
            AwemeRawAd awemeRawAd = null;
            if (aweme != null) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 == null || (omVast2 = awemeRawAd2.getOmVast()) == null || !omVast2.loading) {
                    AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                    if (!(awemeRawAd3 == null || (omVast = awemeRawAd3.getOmVast()) == null || (fVar = omVast.vast) == null || (str = fVar.adTitle) == null || str.length() == 0)) {
                        if (aweme == null || (video = aweme.getVideo()) == null || (playAddr = video.getPlayAddr()) == null || (urlList = playAddr.getUrlList()) == null || urlList.isEmpty()) {
                            f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(aweme);
                            b2.f74804a = "draw_ad";
                            b2.f74805b = "show_fail";
                            b2.a(ag.a(v.a("error_message", "vast_mediafile_missing"))).a((Context) null);
                            if (aweme != null) {
                                awemeRawAd = aweme.getAwemeRawAd();
                            }
                            a.a("draw_ad", "show_fail", awemeRawAd).a("error_message", "vast_mediafile_missing").c();
                            return;
                        }
                        return;
                    }
                } else {
                    f.b b3 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(aweme);
                    b3.f74804a = "draw_ad";
                    b3.f74805b = "show_fail";
                    b3.a(new d().a("error_message", "vast_wrapper_late_response").f66730a).a((Context) null);
                    a.a("draw_ad", "show_fail", aweme.getAwemeRawAd()).a("error_message", "vast_wrapper_late_response").c();
                    return;
                }
            }
            f.b b4 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(aweme);
            b4.f74804a = "draw_ad";
            b4.f74805b = "show_fail";
            b4.a(ag.a(v.a("error_message", "vast_title_missing"))).a((Context) null);
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            a.a("draw_ad", "show_fail", awemeRawAd).a("error_message", "vast_title_missing").c();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.bd
    public final void a(Aweme aweme, l lVar) {
        String str;
        String obj;
        if (aweme != null && lVar != null && br.a(aweme, 3)) {
            f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(aweme);
            b2.f74804a = "draw_ad";
            b2.f74805b = "show_fail";
            d a2 = new d().a("error_message", "vast_mediafile_bad_response").a("error_code", lVar.f148749d);
            Object obj2 = lVar.f148751f;
            String str2 = "";
            if (obj2 == null || (str = obj2.toString()) == null) {
                str = str2;
            }
            b2.a(a2.a("error_detail", str).f66730a).a((Context) null);
            a.C0791a a3 = a.a("draw_ad", "show_fail", aweme.getAwemeRawAd()).a("error_message", "vast_mediafile_bad_response").a("error_code", Integer.valueOf(lVar.f148749d));
            Object obj3 = lVar.f148751f;
            if (!(obj3 == null || (obj = obj3.toString()) == null)) {
                str2 = obj;
            }
            a3.a("error_detail", str2).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.bd
    public final void a(Aweme aweme, Executor executor, boolean z) {
        bs.a(aweme, executor, z);
    }
}

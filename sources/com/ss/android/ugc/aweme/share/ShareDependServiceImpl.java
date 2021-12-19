package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.app.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.feed.helper.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.x.ah;
import com.ss.android.ugc.aweme.im.a.a;
import com.ss.android.ugc.aweme.livewallpaper.f.f;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.gif.b;
import com.ss.android.ugc.aweme.share.gif.h;
import com.ss.android.ugc.aweme.utils.cp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ShareDependServiceImpl extends ab {
    static {
        Covode.recordClassIndex(80957);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final h a() {
        return new b();
    }

    @Override // com.ss.android.ugc.aweme.share.ab, com.ss.android.ugc.aweme.share.ShareDependService
    public final boolean c() {
        return a.a();
    }

    public static ShareDependService d() {
        MethodCollector.i(4313);
        Object a2 = com.ss.android.ugc.b.a(ShareDependService.class, false);
        if (a2 != null) {
            ShareDependService shareDependService = (ShareDependService) a2;
            MethodCollector.o(4313);
            return shareDependService;
        }
        if (com.ss.android.ugc.b.dT == null) {
            synchronized (ShareDependService.class) {
                try {
                    if (com.ss.android.ugc.b.dT == null) {
                        com.ss.android.ugc.b.dT = new ShareDependServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4313);
                    throw th;
                }
            }
        }
        ab abVar = (ab) com.ss.android.ugc.b.dT;
        MethodCollector.o(4313);
        return abVar;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final boolean a(Aweme aweme) {
        l.d(aweme, "");
        if (!f.a(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(com.ss.android.ugc.aweme.sharer.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
        w.a().storeLong(bVar.a(), System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Activity activity) {
        l.d(activity, "");
        c a2 = new c.a(activity, R.style.l9).a(R.string.di0).b(R.string.dhz).b(R.string.a9e, new DialogInterface.OnClickListener(activity) {
            /* class com.ss.android.ugc.aweme.utils.permission.b.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f143172a;

            static {
                Covode.recordClassIndex(93712);
            }

            {
                this.f143172a = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (com.ss.android.ugc.aweme.friends.service.a.f97047a.b(this.f143172a)) {
                    this.f143172a.finish();
                }
            }
        }).a(R.string.asg, new DialogInterface.OnClickListener(activity) {
            /* class com.ss.android.ugc.aweme.utils.permission.b.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f143170a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f143171b = null;

            static {
                Covode.recordClassIndex(93711);
            }

            {
                this.f143170a = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                cp.a(this.f143170a);
            }
        }).a();
        try {
            a2.setCancelable(false);
            a2.setCanceledOnTouchOutside(false);
            a2.show();
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Aweme aweme, String str) {
        String str2;
        l.d(aweme, "");
        l.d(str, "");
        if (f.a(aweme)) {
            if (aweme != null) {
                str2 = "type " + aweme.getAwemeType();
                Video video = aweme.getVideo();
                if (video != null) {
                    str2 = str2 + " width " + video.getWidth() + " height " + video.getHeight();
                }
            } else {
                str2 = "";
            }
            n.a("livewall_not_show", "", new com.ss.android.ugc.aweme.app.f.c().a("setting", Boolean.valueOf(!f.c())).a("isInValidValueAweme", Boolean.valueOf(f.b(aweme))).a("message", str2).a());
        } else if (aweme != null) {
            r.a("wall_paper_show", new d().a("group_id", aweme.getAid()).a("request_id", aweme.getRequestId()).a("enter_from", str).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ab, com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Context context, Aweme aweme, String str, String str2, String str3) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        com.ss.android.ugc.aweme.feed.x.h.f95331a = aweme;
        SmartRouter.buildRoute(context, "//setting//privacy").withParam("tab_name", str).withParam("enter_from", str2).withParam("impr_id", str3).open();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareDependService
    public final void a(Aweme aweme, String str, Context context, String str2, String str3) {
        String mixId;
        String str4 = str2;
        String str5 = "";
        l.d(aweme, str5);
        l.d(str, str5);
        l.d(context, str5);
        l.d(str4, str5);
        l.d(str3, str5);
        if (aweme.isAd() && aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                l.b();
            }
            l.b(awemeRawAd, str5);
            if (awemeRawAd.isReportEnable()) {
                com.ss.android.ugc.aweme.compliance.api.a.a().b(com.ss.android.ugc.aweme.share.improve.c.b.a(context), com.ss.android.ugc.aweme.report.b.a(aweme, "creative", "ad"));
                return;
            }
        }
        String aid = aweme.getAid();
        l.b(aid, str5);
        int awemeType = aweme.getAwemeType();
        String str6 = "mix";
        if (awemeType == 13) {
            str6 = "forward";
        } else if (awemeType != 300) {
            str6 = "video";
        } else {
            PlayListInfo playListInfo = aweme.playlist_info;
            if (!(playListInfo == null || (mixId = playListInfo.getMixId()) == null)) {
                aid = mixId;
            }
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", str6).appendQueryParameter("object_id", aid);
        User author = aweme.getAuthor();
        l.b(author, str5);
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("owner_id", author.getUid()).appendQueryParameter("enter_from", str3);
        if (ah.b(aweme)) {
            appendQueryParameter2.appendQueryParameter("subtitle_id", String.valueOf(ah.d(aweme)));
        }
        com.ss.android.ugc.aweme.compliance.api.a.a().a(com.ss.android.ugc.aweme.share.improve.c.b.a(context), appendQueryParameter2);
        IReportService a2 = com.ss.android.ugc.aweme.compliance.api.a.a();
        String a3 = com.ss.android.ugc.aweme.compliance.api.a.a().a(aweme);
        String e2 = ac.e(aweme);
        String e3 = ac.e(aweme);
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            str5 = author2.getUid();
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = com.ss.android.ugc.aweme.compliance.api.a.a().a(str);
        }
        a2.a(str, a3, e2, e3, str5, "", str4, aweme);
    }
}

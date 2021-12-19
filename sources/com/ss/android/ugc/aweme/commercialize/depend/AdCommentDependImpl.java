package com.ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.router.SmartRouter;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.f;
import com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.widgets.CommentHeaderWidget;
import com.ss.android.ugc.aweme.comment.widgets.NewCommentAdWidget;
import com.ss.android.ugc.aweme.commercialize.link.a.a;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs;
import com.ss.android.ugc.aweme.global.config.settings.pojo.LinkPlan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.model.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class AdCommentDependImpl implements IAdCommentDepend {

    /* renamed from: a  reason: collision with root package name */
    private final h f73770a = i.a((h.f.a.a) a.f73771a);

    static {
        Covode.recordClassIndex(45392);
    }

    private final y c() {
        return (y) this.f73770a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final boolean a(String str) {
        return com.ss.android.ugc.aweme.commercialize.im.a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final boolean a(Context context, Aweme aweme, int i2, com.ss.android.ugc.aweme.commercialize.j.b bVar) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(bVar, "");
        return w.a(context, aweme, i2, bVar);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void a(Context context, String str, String str2) {
        c();
        if (!w.a(context, str, false)) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            if (!TextUtils.isEmpty(str2)) {
                intent.setData(Uri.parse(str2));
                com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
                context.startActivity(intent);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void a(Context context, String str) {
        c();
        Aweme b2 = AwemeService.b().b(str);
        if (context instanceof Activity) {
            IReportService a2 = com.ss.android.ugc.aweme.compliance.api.a.a();
            Activity activity = (Activity) context;
            l.d(b2, "");
            l.d("landing_page", "");
            l.d("ad", "");
            HashMap hashMap = new HashMap();
            ac a3 = bh.a(b2);
            String str2 = null;
            hashMap.put("log_extra", a3 != null ? a3.logExtra : null);
            if (a3 != null) {
                str2 = a3.creativeId;
            }
            hashMap.put("cid", str2);
            Uri.Builder builder = new Uri.Builder();
            String b3 = new f().b(hashMap);
            l.b(b3, "");
            a2.b(activity, com.ss.android.ugc.aweme.report.b.a(builder, b2, "landing_page", "ad", b3));
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void a(Context context, User user) {
        if (user != null && context != null) {
            SmartRouter.buildRoute(context, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("profile_enterprise_type", ae.f115954a.a(user)).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void a(String str, Context context, ac acVar, Aweme aweme, String str2) {
        a.C1683a a2 = new a.C1683a().a(acVar).a(aweme);
        a2.f74509e = true;
        a.C1683a a3 = a2.a(true).a(str);
        if (str2 == null) {
            str2 = "";
        }
        l.d(str2, "");
        a3.f74512h = str2;
        j.a(context, a3.a());
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new b(awemeRawAd));
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final boolean a(Aweme aweme) {
        l.d(aweme, "");
        ac a2 = bh.a(aweme);
        return a2 != null && a2.linkType == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        if (r6 != null) goto L_0x002f;
     */
    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r11, java.lang.String r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl.a(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void a(Context context, String str, String str2, String str3) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refer", str2);
            jSONObject.put("log_extra", str3);
            jSONObject.put("is_ad_event", "1");
        } catch (JSONException unused) {
        }
        j.a(context, "draw_ad", "replay", jSONObject, str, 0);
    }

    static final class a extends m implements h.f.a.a<y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f73771a = new a();

        static {
            Covode.recordClassIndex(45393);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ y invoke() {
            return new y();
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final String a() {
        LinkPlan linkPlan;
        try {
            l.b(d.a(), "");
            AwemeFEConfigs e2 = d.e();
            if (e2 == null || (linkPlan = e2.getLinkPlan()) == null) {
                return null;
            }
            return linkPlan.getInfo();
        } catch (com.bytedance.ies.a e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static IAdCommentDepend b() {
        MethodCollector.i(2336);
        Object a2 = com.ss.android.ugc.b.a(IAdCommentDepend.class, false);
        if (a2 != null) {
            IAdCommentDepend iAdCommentDepend = (IAdCommentDepend) a2;
            MethodCollector.o(2336);
            return iAdCommentDepend;
        }
        if (com.ss.android.ugc.b.ak == null) {
            synchronized (IAdCommentDepend.class) {
                try {
                    if (com.ss.android.ugc.b.ak == null) {
                        com.ss.android.ugc.b.ak = new AdCommentDependImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2336);
                    throw th;
                }
            }
        }
        AdCommentDependImpl adCommentDependImpl = (AdCommentDependImpl) com.ss.android.ugc.b.ak;
        MethodCollector.o(2336);
        return adCommentDependImpl;
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final Widget a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        return new NewCommentAdWidget(aVar);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final Widget b(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        return new CommentHeaderWidget(aVar);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final String b(s sVar) {
        l.d(sVar, "");
        return CommentServiceImpl.e().b(sVar);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final List<TextExtraStruct> a(s sVar) {
        l.d(sVar, "");
        return CommentServiceImpl.e().a(sVar);
    }

    static final class b extends m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ AwemeRawAd $it;

        static {
            Covode.recordClassIndex(45394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AwemeRawAd awemeRawAd) {
            super(2);
            this.$it = awemeRawAd;
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
                a2 = bVar2.b(this.$it);
            } else {
                a2 = bVar2.a(this.$it);
            }
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void a(Context context, Aweme aweme) {
        ac a2 = bh.a(aweme);
        if (a2 == null) {
            return;
        }
        if (a2.linkType == 0) {
            w.a(context, a2, aweme, true);
        } else if (a2.linkType == 1) {
            w.a(context, a2, aweme, true);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void a(Context context, ac acVar, Aweme aweme) {
        c();
        w.a(context, acVar, aweme, true);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final List<TextExtraStruct> a(Context context, Aweme aweme, s sVar) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(sVar, "");
        return CommentServiceImpl.e().a(context, aweme, sVar);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final List<TextExtraStruct> a(s sVar, AwemeRawAd awemeRawAd, h.f.a.a<z> aVar) {
        l.d(sVar, "");
        l.d(aVar, "");
        return CommentServiceImpl.e().a(sVar, awemeRawAd, aVar);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void a(Context context, Aweme aweme, String str) {
        l.d(context, "");
        JSONObject a2 = j.a(context, aweme, false, (Map<String, String>) null);
        if (!TextUtils.isEmpty(str)) {
            try {
                a2.put("refer", str);
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", j.b(aweme));
                hashMap.put("room_id", j.a(aweme));
                a2.put("ad_extra_data", new com.google.gson.f().b(hashMap));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        j.b(context, UGCMonitor.EVENT_COMMENT, aweme, a2);
    }

    @Override // com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend
    public final void a(Context context, Aweme aweme, String str, String str2) {
        String str3;
        LiveRoomStruct newLiveRoomData;
        LiveRoomStruct newLiveRoomData2;
        f.b b2 = com.ss.android.ugc.aweme.commercialize.log.f.a().b(aweme);
        b2.f74804a = str;
        b2.f74805b = str2;
        b2.a(context);
        if (aweme != null) {
            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a(str, str2, aweme.getAwemeRawAd());
            String str4 = null;
            if (aweme.isLive()) {
                RoomFeedCellStruct roomFeedCellStruct = aweme.getRoomFeedCellStruct();
                if (!(roomFeedCellStruct == null || (newLiveRoomData2 = roomFeedCellStruct.getNewLiveRoomData()) == null)) {
                    str3 = String.valueOf(newLiveRoomData2.getAnchorId());
                }
                str3 = null;
            } else {
                if (aweme.getAuthor() != null) {
                    User author = aweme.getAuthor();
                    l.b(author, "");
                    if (author.isLive()) {
                        User author2 = aweme.getAuthor();
                        l.b(author2, "");
                        str3 = author2.getUid().toString();
                    }
                }
                str3 = null;
            }
            a.C0791a a3 = a2.a("anchor_id", str3);
            if (aweme.isLive()) {
                RoomFeedCellStruct roomFeedCellStruct2 = aweme.getRoomFeedCellStruct();
                if (!(roomFeedCellStruct2 == null || (newLiveRoomData = roomFeedCellStruct2.getNewLiveRoomData()) == null)) {
                    str4 = String.valueOf(newLiveRoomData.id);
                }
            } else if (aweme.getAuthor() != null) {
                User author3 = aweme.getAuthor();
                l.b(author3, "");
                if (author3.isLive()) {
                    str4 = String.valueOf(aweme.getAuthor().roomId);
                }
            }
            a3.a("room_id", str4).c();
        }
    }
}

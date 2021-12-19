package com.ss.android.ugc.aweme.ad.feed.e.a;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.log.a.a;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;
import org.json.JSONObject;

public final class a implements View.OnClickListener, com.ss.android.ugc.aweme.ad.feed.e.b {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f65843a;

    /* renamed from: b  reason: collision with root package name */
    private final RemoteImageView f65844b;

    /* renamed from: c  reason: collision with root package name */
    private String f65845c = "";

    /* renamed from: d  reason: collision with root package name */
    private final h f65846d = i.a((h.f.a.a) C1472a.f65847a);

    static final class b implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65848a = new b();

        static {
            Covode.recordClassIndex(40513);
        }

        b() {
        }
    }

    static {
        Covode.recordClassIndex(40511);
    }

    private final com.ss.android.ugc.aweme.ad.feed.e.a a() {
        return (com.ss.android.ugc.aweme.ad.feed.e.a) this.f65846d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.e.a.a$a  reason: collision with other inner class name */
    static final class C1472a extends m implements h.f.a.a<com.ss.android.ugc.aweme.ad.feed.e.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1472a f65847a = new C1472a();

        static {
            Covode.recordClassIndex(40512);
        }

        C1472a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ad.feed.e.a invoke() {
            return CommercializeAdServiceImpl.a().a(4);
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.commercialize.track.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65849a;

        static {
            Covode.recordClassIndex(40514);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f65849a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.track.e
        public final void a(String str, String str2, long j2) {
            l.d(str, "");
            l.d(str2, "");
            a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a(str, str2, j2);
            a2.f74716b = "track_url";
            a2.f74715a = "track_ad";
            a2.b("click").b(a.a(this.f65849a).getAwemeRawAd()).c();
            a.C0791a b2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("track_ad", "track_url", a.a(this.f65849a).getAwemeRawAd()).b("track_label", "click").b("ad_event_priority", "10").b("ad_event_type", "monitor").b("track_url_list", str).b("track_status", str2).b("ts", Long.valueOf(j2)).b("ad_event_priority", "10");
            String e2 = com.ss.android.ugc.aweme.commercialize.track.a.f75356a.e();
            if (!TextUtils.isEmpty(e2)) {
                b2.b("user_agent", e2);
            }
            b2.c();
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.commercialize.track.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f65852a;

        static {
            Covode.recordClassIndex(40516);
        }

        e(Aweme aweme) {
            this.f65852a = aweme;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.track.e
        public final void a(String str, String str2, long j2) {
            l.d(str, "");
            l.d(str2, "");
            a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a(str, str2, j2);
            a2.f74716b = "track_url";
            a2.f74715a = "track_ad";
            a2.b("show").b(this.f65852a.getAwemeRawAd()).c();
            a.C0791a b2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("track_ad", "track_url", this.f65852a.getAwemeRawAd()).b("track_label", "show").b("ad_event_priority", "10").b("ad_event_type", "monitor").b("track_url_list", str).b("track_status", str2).b("ts", Long.valueOf(j2)).b("ad_event_priority", "10");
            String e2 = com.ss.android.ugc.aweme.commercialize.track.a.f75356a.e();
            if (!TextUtils.isEmpty(e2)) {
                b2.b("user_agent", e2);
            }
            b2.c();
        }
    }

    public a(com.ss.android.ugc.aweme.ad.feed.e.d dVar) {
        l.d(dVar, "");
        this.f65844b = dVar.f65853a;
    }

    public static final /* synthetic */ Aweme a(a aVar) {
        Aweme aweme = aVar.f65843a;
        if (aweme == null) {
            l.a("aweme");
        }
        return aweme;
    }

    public final void onClick(View view) {
        com.ss.android.ugc.aweme.ad.feed.e.a a2;
        IAppLogDepend iAppLogDepend;
        String str;
        String uid;
        Context context;
        ClickAgent.onClick(view);
        Aweme aweme = this.f65843a;
        if (aweme == null) {
            l.a("aweme");
        }
        User author = aweme.getAuthor();
        Aweme aweme2 = this.f65843a;
        if (aweme2 == null) {
            l.a("aweme");
        }
        String str2 = "";
        if (com.ss.android.ugc.aweme.ad.feed.h.a.a(aweme2)) {
            com.ss.android.ugc.aweme.ad.feed.e.a a3 = a();
            if (a3 != null) {
                Context context2 = this.f65844b.getContext();
                l.b(context2, str2);
                Aweme aweme3 = this.f65843a;
                if (aweme3 == null) {
                    l.a("aweme");
                }
                a3.a(context2, aweme3, b.f65848a);
                return;
            }
            return;
        }
        Aweme aweme4 = this.f65843a;
        if (aweme4 == null) {
            l.a("aweme");
        }
        Context context3 = null;
        List<String> list = null;
        if (com.ss.android.ugc.aweme.ad.feed.h.a.b(aweme4)) {
            com.ss.android.ugc.aweme.ad.feed.e.a a4 = a();
            if (a4 != null) {
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                Aweme aweme5 = this.f65843a;
                if (aweme5 == null) {
                    l.a("aweme");
                }
                a4.a(context, aweme5);
            }
            IAppLogDepend iAppLogDepend2 = com.bytedance.ies.android.base.runtime.a.f31872a;
            if (iAppLogDepend2 != null) {
                com.ss.android.ugc.aweme.app.f.d a5 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f65845c);
                Aweme aweme6 = this.f65843a;
                if (aweme6 == null) {
                    l.a("aweme");
                }
                com.ss.android.ugc.aweme.app.f.d a6 = a5.a("group_id", aweme6.getAid());
                if (!(author == null || (uid = author.getUid()) == null)) {
                    str2 = uid;
                }
                iAppLogDepend2.onEventV3Map("click_brand_sticker", a6.a("author_id", str2).f66730a);
            }
            c cVar = new c(this);
            Aweme aweme7 = this.f65843a;
            if (aweme7 == null) {
                l.a("aweme");
            }
            UrlModel clickTrackUrlList = aweme7.getActivityPendant().getClickTrackUrlList();
            if (clickTrackUrlList != null) {
                list = clickTrackUrlList.getUrlList();
            }
            com.ss.android.ugc.aweme.commercialize.track.b.a(cVar, list);
            return;
        }
        Aweme aweme8 = this.f65843a;
        if (aweme8 == null) {
            l.a("aweme");
        }
        if (com.ss.android.ugc.aweme.ad.feed.h.a.c(aweme8) && (a2 = a()) != null) {
            if (view != null) {
                context3 = view.getContext();
            }
            Aweme aweme9 = this.f65843a;
            if (aweme9 == null) {
                l.a("aweme");
            }
            if (a2.b(context3, aweme9) && (iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a) != null) {
                com.ss.android.ugc.aweme.app.f.d a7 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f65845c);
                Aweme aweme10 = this.f65843a;
                if (aweme10 == null) {
                    l.a("aweme");
                }
                com.ss.android.ugc.aweme.app.f.d a8 = a7.a("group_id", aweme10.getAid());
                if (author == null || (str = author.getUid()) == null) {
                    str = str2;
                }
                com.ss.android.ugc.aweme.app.f.d a9 = a8.a("author_id", str);
                Aweme aweme11 = this.f65843a;
                if (aweme11 == null) {
                    l.a("aweme");
                }
                SpecialSticker specialSticker = aweme11.getSpecialSticker();
                l.b(specialSticker, str2);
                iAppLogDepend.onEventV3Map("click_brand_sticker", a9.a("sticker_id", specialSticker.getStickerId()).f66730a);
            }
        }
    }

    public static final class d extends com.facebook.drawee.c.c<Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f65850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f65851b;

        static {
            Covode.recordClassIndex(40515);
        }

        d(boolean z, Aweme aweme) {
            this.f65850a = z;
            this.f65851b = aweme;
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFailure(String str, Throwable th) {
            if (!this.f65850a) {
                com.ss.android.ugc.aweme.commercialize.log.d.c(this.f65851b, 1);
            }
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onSubmit(String str, Object obj) {
            Aweme aweme;
            AwemeRawAd awemeRawAd;
            if (!this.f65850a && (aweme = this.f65851b) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                com.ss.android.ugc.aweme.commercialize.log.d.a(com.ss.android.ugc.aweme.commercialize.log.d.f74778a, "redpacket", "preload_start", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme.getAid());
            }
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (!this.f65850a) {
                com.ss.android.ugc.aweme.commercialize.log.d.c(this.f65851b, 0);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.e.b
    public final void a(boolean z, Aweme aweme, String str) {
        IAppLogDepend iAppLogDepend;
        String str2;
        String uid;
        String str3 = "";
        l.d(aweme, str3);
        l.d(str, str3);
        this.f65843a = aweme;
        this.f65845c = str;
        this.f65844b.setOnClickListener(this);
        List<String> list = null;
        UrlModel urlModel = null;
        if (com.ss.android.ugc.aweme.ad.feed.h.a.a(aweme)) {
            this.f65844b.setVisibility(0);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                urlModel = awemeRawAd.getRedImageUrl();
            }
            com.ss.android.ugc.aweme.commercialize.g.b.a(this.f65844b, urlModel, new d(z, aweme));
            if (z) {
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 != null) {
                    com.ss.android.ugc.aweme.commercialize.log.d.f74778a.a("redpacket", "show_result", awemeRawAd2.getCreativeId(), awemeRawAd2.getLogExtra(), aweme.getAid(), 0);
                }
                AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
                i.a aVar = new i.a();
                aVar.f74815a = awemeRawAd3;
                aVar.f74816b = "redpacket";
                JSONObject a2 = aVar.a();
                if (awemeRawAd3 != null) {
                    com.ss.android.ugc.aweme.commercialize.util.e.a("draw_ad", "othershow", a2, awemeRawAd3);
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", awemeRawAd).b("refer", "redpacket").c();
            }
        } else if (com.ss.android.ugc.aweme.ad.feed.h.a.b(aweme)) {
            this.f65844b.setVisibility(0);
            com.ss.android.ugc.aweme.commercialize.g.b.a(this.f65844b, aweme.getActivityPendant().getImage());
            User author = aweme.getAuthor();
            if (z) {
                IAppLogDepend iAppLogDepend2 = com.bytedance.ies.android.base.runtime.a.f31872a;
                if (iAppLogDepend2 != null) {
                    com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("group_id", aweme.getAid());
                    if (!(author == null || (uid = author.getUid()) == null)) {
                        str3 = uid;
                    }
                    iAppLogDepend2.onEventV3Map("show_brand_sticker", a3.a("author_id", str3).f66730a);
                }
                e eVar = new e(aweme);
                UrlModel trackUrlList = aweme.getActivityPendant().getTrackUrlList();
                if (trackUrlList != null) {
                    list = trackUrlList.getUrlList();
                }
                com.ss.android.ugc.aweme.commercialize.track.b.a(eVar, list);
            }
        } else if (com.ss.android.ugc.aweme.ad.feed.h.a.c(aweme)) {
            this.f65844b.setVisibility(0);
            SpecialSticker specialSticker = aweme.getSpecialSticker();
            if (specialSticker != null) {
                com.ss.android.ugc.aweme.commercialize.g.b.a(this.f65844b, specialSticker.getIconUrl());
            }
            User author2 = aweme.getAuthor();
            if (z && (iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a) != null) {
                com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("group_id", aweme.getAid());
                if (author2 == null || (str2 = author2.getUid()) == null) {
                    str2 = str3;
                }
                com.ss.android.ugc.aweme.app.f.d a5 = a4.a("author_id", str2);
                SpecialSticker specialSticker2 = aweme.getSpecialSticker();
                l.b(specialSticker2, str3);
                iAppLogDepend.onEventV3Map("show_brand_sticker", a5.a("sticker_id", specialSticker2.getStickerId()).f66730a);
            }
        } else {
            this.f65844b.setVisibility(8);
        }
    }
}

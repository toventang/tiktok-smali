package com.ss.android.ugc.aweme.ad.feed.survey;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.keva.Keva;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ad.feed.c;
import com.ss.android.ugc.aweme.ad.feed.survey.FeedAdLynxSurvey;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.bullet.e;
import com.ss.android.ugc.aweme.commercialize.model.l;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

public final class a implements u<b>, c {

    /* renamed from: d  reason: collision with root package name */
    public static final C1478a f66088d = new C1478a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    DataCenter f66089a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f66090b;

    /* renamed from: c  reason: collision with root package name */
    b f66091c;

    /* renamed from: e  reason: collision with root package name */
    private FeedAdLynxSurvey f66092e;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f66093f;

    /* renamed from: g  reason: collision with root package name */
    private Aweme f66094g;

    /* renamed from: h  reason: collision with root package name */
    private Long f66095h;

    /* renamed from: i  reason: collision with root package name */
    private final Keva f66096i;

    /* renamed from: j  reason: collision with root package name */
    private final c f66097j;

    /* renamed from: k  reason: collision with root package name */
    private final ViewStub f66098k;

    static {
        Covode.recordClassIndex(40626);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.survey.a$a  reason: collision with other inner class name */
    public static final class C1478a {
        static {
            Covode.recordClassIndex(40627);
        }

        private C1478a() {
        }

        public /* synthetic */ C1478a(byte b2) {
            this();
        }
    }

    private void d() {
        DataCenter dataCenter = this.f66089a;
        if (dataCenter != null) {
            dataCenter.a("action_ad_pop_up_web_pause_video", (Object) null);
        }
    }

    public final void b() {
        FrameLayout frameLayout = this.f66093f;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.f66090b = false;
        this.f66091c = null;
    }

    private final void e() {
        try {
            this.f66095h = Long.valueOf(this.f66096i.getLong("feed_ad_survey_last_show_time", -1));
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            e2.printStackTrace();
        }
    }

    private final boolean c() {
        Long l2;
        int i2;
        AwemeRawAd awemeRawAd;
        l adQuestionnaire;
        Integer showInterval;
        if (this.f66095h == null) {
            e();
        }
        Long l3 = this.f66095h;
        if ((l3 != null && l3.longValue() == -1) || (l2 = this.f66095h) == null) {
            return true;
        }
        long longValue = l2.longValue();
        Aweme aweme = this.f66094g;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adQuestionnaire = awemeRawAd.getAdQuestionnaire()) == null || (showInterval = adQuestionnaire.getShowInterval()) == null) {
            i2 = 259200;
        } else {
            i2 = showInterval.intValue();
        }
        if (System.currentTimeMillis() - longValue > ((long) (i2 * 1000))) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.survey.c
    public final void a() {
        FeedAdLynxSurvey feedAdLynxSurvey;
        String schema;
        String str;
        String str2;
        String str3;
        c cVar = this.f66097j;
        if (cVar != null && cVar.a(this.f66094g) && c() && !this.f66090b && (feedAdLynxSurvey = this.f66092e) != null) {
            feedAdLynxSurvey.f66074h = false;
            l lVar = feedAdLynxSurvey.f66069c;
            if (lVar != null && (schema = lVar.getSchema()) != null) {
                Uri.Builder buildUpon = Uri.parse(schema).buildUpon();
                o oVar = new o();
                AwemeRawAd awemeRawAd = feedAdLynxSurvey.f66068b;
                String str4 = null;
                if (awemeRawAd != null) {
                    Long adId = awemeRawAd.getAdId();
                    if (adId != null) {
                        str = String.valueOf(adId.longValue());
                    } else {
                        str = null;
                    }
                    oVar.a("adId", str);
                    oVar.a("creativeId", awemeRawAd.getCreativeIdStr());
                    oVar.a("logExtra", awemeRawAd.getLogExtra());
                    Long groupId = awemeRawAd.getGroupId();
                    if (groupId != null) {
                        str2 = String.valueOf(groupId.longValue());
                    } else {
                        str2 = null;
                    }
                    oVar.a("groupId", str2);
                    l adQuestionnaire = awemeRawAd.getAdQuestionnaire();
                    if (adQuestionnaire != null) {
                        str3 = adQuestionnaire.getContent();
                    } else {
                        str3 = null;
                    }
                    oVar.a("content", str3);
                }
                oVar.a("isRTL", Integer.valueOf(gb.a(feedAdLynxSurvey.f66076j.getContext()) ? 1 : 0));
                String oVar2 = oVar.toString();
                h.f.b.l.b(oVar2, "");
                buildUpon.appendQueryParameter("initialData", oVar2);
                e eVar = feedAdLynxSurvey.f66071e;
                if (eVar != null) {
                    String builder = buildUpon.toString();
                    h.f.b.l.b(builder, "");
                    Bundle bundle = new Bundle();
                    Context context = feedAdLynxSurvey.f66076j.getContext();
                    c a2 = feedAdLynxSurvey.a();
                    if (a2 != null) {
                        Aweme aweme = feedAdLynxSurvey.f66067a;
                        h.f.b.l.b(context, "");
                        a2.a(bundle, aweme, context);
                    }
                    AwemeRawAd awemeRawAd2 = feedAdLynxSurvey.f66068b;
                    if (awemeRawAd2 != null) {
                        str4 = awemeRawAd2.getNativeSiteCustomData();
                    }
                    bundle.putString("bundle_native_site_custom_data", str4);
                    eVar.a(builder, bundle);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.survey.c
    public final void a(DataCenter dataCenter) {
        this.f66089a = dataCenter;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_on_page_selected", (u<b>) this);
            dataCenter.a("ad_feed_on_page_unselected", (u<b>) this);
            dataCenter.a("ad_video_on_resume_play", (u<b>) this);
            dataCenter.a("ad_video_on_render_ready", (u<b>) this);
        }
    }

    public a(ViewStub viewStub) {
        h.f.b.l.d(viewStub, "");
        this.f66098k = viewStub;
        Keva repo = Keva.getRepo("feed_ad_survey_repo");
        h.f.b.l.b(repo, "");
        this.f66096i = repo;
        com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2 = CommercializeAdServiceImpl.a().a(17);
        this.f66097j = (c) (!(a2 instanceof c) ? null : a2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(b bVar) {
        String str;
        int i2;
        FeedAdLynxSurvey feedAdLynxSurvey;
        b bVar2 = bVar;
        c cVar = this.f66097j;
        if (cVar != null && cVar.a(this.f66094g)) {
            Long l2 = null;
            if (bVar2 != null && (str = bVar2.f67014a) != null) {
                switch (str.hashCode()) {
                    case -1929582278:
                        if (str.equals("ad_video_on_render_ready") && this.f66090b) {
                            d();
                            return;
                        }
                        return;
                    case -1540531799:
                        if (str.equals("ad_feed_on_page_unselected")) {
                            FeedAdLynxSurvey feedAdLynxSurvey2 = this.f66092e;
                            if (feedAdLynxSurvey2 != null) {
                                if (feedAdLynxSurvey2.f66075i.f66090b) {
                                    a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow_over", feedAdLynxSurvey2.f66068b);
                                    AwemeRawAd awemeRawAd = feedAdLynxSurvey2.f66068b;
                                    if (awemeRawAd != null) {
                                        l2 = awemeRawAd.getAdId();
                                    }
                                    a.C0791a a3 = a2.b("ad_id", l2).b("refer", feedAdLynxSurvey2.f66073g).a("duration", Long.valueOf(System.currentTimeMillis() - feedAdLynxSurvey2.f66070d));
                                    l lVar = feedAdLynxSurvey2.f66069c;
                                    if (lVar != null) {
                                        i2 = lVar.getId();
                                    } else {
                                        i2 = 0;
                                    }
                                    a3.a("five_star_survey_id", Integer.valueOf(i2)).b();
                                }
                                EventBus.a().b(feedAdLynxSurvey2);
                            }
                            b();
                            return;
                        }
                        return;
                    case -1132409520:
                        if (str.equals("ad_feed_on_page_selected") && (feedAdLynxSurvey = this.f66092e) != null) {
                            EventBus.a(EventBus.a(), feedAdLynxSurvey);
                            return;
                        }
                        return;
                    case 2040441990:
                        if (str.equals("ad_video_on_resume_play") && this.f66090b) {
                            d();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.survey.c
    public final void a(Aweme aweme, int i2) {
        MethodCollector.i(130);
        c cVar = this.f66097j;
        if (cVar == null || !cVar.a(aweme)) {
            this.f66094g = null;
            FeedAdLynxSurvey feedAdLynxSurvey = this.f66092e;
            if (feedAdLynxSurvey != null) {
                feedAdLynxSurvey.a(null, 0);
                MethodCollector.o(130);
                return;
            }
            MethodCollector.o(130);
            return;
        }
        this.f66094g = aweme;
        if (this.f66098k.getParent() != null) {
            this.f66098k.setLayoutResource(R.layout.aff);
            View inflate = this.f66098k.inflate();
            if (inflate != null) {
                this.f66093f = (FrameLayout) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                MethodCollector.o(130);
                throw nullPointerException;
            }
        }
        FrameLayout frameLayout = this.f66093f;
        if (frameLayout == null) {
            MethodCollector.o(130);
            return;
        }
        if (this.f66092e == null) {
            this.f66092e = new FeedAdLynxSurvey(this, frameLayout);
        }
        FeedAdLynxSurvey feedAdLynxSurvey2 = this.f66092e;
        if (feedAdLynxSurvey2 != null) {
            feedAdLynxSurvey2.a(aweme, i2);
        }
        b();
        MethodCollector.o(130);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.survey.c
    public final boolean a(int i2, int i3, int i4) {
        FrameLayout frameLayout;
        AwemeRawAd awemeRawAd;
        int i5;
        String str;
        l adQuestionnaire;
        AwemeRawAd awemeRawAd2;
        l adQuestionnaire2;
        String str2;
        l adQuestionnaire3;
        Long l2;
        int i6;
        c cVar = this.f66097j;
        if (cVar == null || !cVar.a(this.f66094g) || (frameLayout = this.f66093f) == null || this.f66090b || !c()) {
            return false;
        }
        FeedAdLynxSurvey feedAdLynxSurvey = this.f66092e;
        Long l3 = null;
        if (feedAdLynxSurvey == null || !feedAdLynxSurvey.f66074h) {
            Aweme aweme = this.f66094g;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", awemeRawAd);
            Aweme aweme2 = this.f66094g;
            if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || (adQuestionnaire2 = awemeRawAd2.getAdQuestionnaire()) == null) {
                i5 = 0;
            } else {
                i5 = adQuestionnaire2.getId();
            }
            a2.a("five_star_survey_id", Integer.valueOf(i5)).b();
            Aweme aweme3 = this.f66094g;
            if (aweme3 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    AwemeRawAd awemeRawAd3 = aweme3.getAwemeRawAd();
                    if (awemeRawAd3 == null || (adQuestionnaire = awemeRawAd3.getAdQuestionnaire()) == null) {
                        str = null;
                    } else {
                        str = adQuestionnaire.getSchema();
                    }
                    jSONObject.put("feed_ad_survey_url", str);
                    AwemeRawAd awemeRawAd4 = aweme3.getAwemeRawAd();
                    if (awemeRawAd4 != null) {
                        l3 = awemeRawAd4.getCreativeId();
                    }
                    jSONObject.put("feed_ad_survey_creative_id", l3);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                com.bytedance.apm.b.a("aweme_feed_ad_lynx_survey_show_error_rate", 1, jSONObject);
            }
            return false;
        }
        frameLayout.setVisibility(0);
        long currentTimeMillis = System.currentTimeMillis();
        FeedAdLynxSurvey feedAdLynxSurvey2 = this.f66092e;
        if (feedAdLynxSurvey2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time", currentTimeMillis);
            i iVar = feedAdLynxSurvey2.f66072f;
            if (iVar != null) {
                iVar.onEvent(new FeedAdLynxSurvey.d("ad_survey_show", jSONObject2));
            }
            feedAdLynxSurvey2.f66070d = currentTimeMillis;
            feedAdLynxSurvey2.f66073g = "";
            feedAdLynxSurvey2.f66075i.d();
            a.C0791a a3 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", feedAdLynxSurvey2.f66068b);
            AwemeRawAd awemeRawAd5 = feedAdLynxSurvey2.f66068b;
            if (awemeRawAd5 != null) {
                l2 = awemeRawAd5.getAdId();
            } else {
                l2 = null;
            }
            a.C0791a b2 = a3.b("ad_id", l2);
            l lVar = feedAdLynxSurvey2.f66069c;
            if (lVar != null) {
                i6 = lVar.getId();
            } else {
                i6 = 0;
            }
            b2.a("five_star_survey_id", Integer.valueOf(i6)).b();
        }
        this.f66095h = Long.valueOf(currentTimeMillis);
        try {
            this.f66096i.storeLong("feed_ad_survey_last_show_time", currentTimeMillis);
        } catch (Exception e3) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e3);
            e3.printStackTrace();
        }
        this.f66090b = true;
        this.f66091c = new b(i2, i3, i4);
        Aweme aweme4 = this.f66094g;
        if (aweme4 != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                AwemeRawAd awemeRawAd6 = aweme4.getAwemeRawAd();
                if (awemeRawAd6 == null || (adQuestionnaire3 = awemeRawAd6.getAdQuestionnaire()) == null) {
                    str2 = null;
                } else {
                    str2 = adQuestionnaire3.getSchema();
                }
                jSONObject3.put("feed_ad_survey_url", str2);
                AwemeRawAd awemeRawAd7 = aweme4.getAwemeRawAd();
                if (awemeRawAd7 != null) {
                    l3 = awemeRawAd7.getCreativeId();
                }
                jSONObject3.put("feed_ad_survey_creative_id", l3);
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            com.bytedance.apm.b.a("aweme_feed_ad_lynx_survey_show_error_rate", 0, jSONObject3);
        }
        return true;
    }
}

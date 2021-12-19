package com.ss.android.ugc.aweme.commercialize.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.event.g;
import com.ss.android.ugc.aweme.commercialize.model.al;
import com.ss.android.ugc.aweme.commercialize.model.e;
import com.ss.android.ugc.aweme.commercialize.utils.d;
import com.ss.android.ugc.aweme.commercialize.views.a;
import com.ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.z;
import org.json.JSONObject;

public final class AdLightWebPageWidget extends AbsAdFeedWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f76309a = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.commercialize.views.a f76310h;

    static {
        Covode.recordClassIndex(47066);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47067);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(Aweme aweme) {
            AwemeRawAd awemeRawAd;
            if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
                return null;
            }
            return awemeRawAd.getLightWebUrl();
        }
    }

    public static final class c implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdLightWebPageWidget f76311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f76312b;

        static {
            Covode.recordClassIndex(47069);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.a.c
        public final void a() {
            DataCenter dataCenter = this.f76311a.f67010e;
            if (dataCenter != null) {
                dataCenter.a("on_ad_light_web_page_show", (Object) null);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.a.c
        public final void c() {
            DataCenter dataCenter = this.f76311a.f67010e;
            if (dataCenter != null) {
                dataCenter.a("AD_ACTION_REPLAY_VIDEO", (Object) null);
            }
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.a.c
        public final void b() {
            e eVar = this.f76312b;
            int i2 = com.ss.android.ugc.aweme.commercialize.views.a.f75904m;
            l.d(eVar, "");
            com.ss.android.ugc.aweme.commercialize.views.a b2 = a.d.b(eVar, i2);
            if (b2 != null) {
                b2.a();
            }
            DataCenter dataCenter = this.f76311a.f67010e;
            if (dataCenter != null) {
                dataCenter.a("on_ad_light_web_page_hide", (Object) null);
            }
        }

        c(AdLightWebPageWidget adLightWebPageWidget, e eVar) {
            this.f76311a = adLightWebPageWidget;
            this.f76312b = eVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a() {
        super.a();
        DataCenter dataCenter = this.f67010e;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_feed_on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_on_receive_js_bridge_event", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u, com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    static final class b extends h.f.b.m implements h.f.a.b<a.e, z> {
        final /* synthetic */ String $url;
        final /* synthetic */ AdLightWebPageWidget this$0;

        static {
            Covode.recordClassIndex(47068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AdLightWebPageWidget adLightWebPageWidget, String str) {
            super(1);
            this.this$0 = adLightWebPageWidget;
            this.$url = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a.e eVar) {
            Context context;
            a.e eVar2 = eVar;
            l.d(eVar2, "");
            String str = this.$url;
            if (str != null) {
                eVar2.a(str);
            }
            eVar2.f75920b = this.this$0.p;
            eVar2.f75921c = this.this$0.o;
            AdLightWebPageWidget adLightWebPageWidget = this.this$0;
            Aweme aweme = adLightWebPageWidget.o;
            Bundle bundle = new Bundle();
            Fragment fragment = adLightWebPageWidget.p;
            if (!(fragment == null || (context = fragment.getContext()) == null)) {
                l.b(context, "");
                if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                    d.a(bundle, aweme, context);
                    d.b(bundle, aweme, context);
                    d.c(bundle, aweme, context);
                    d.a(bundle, context);
                }
            }
            eVar2.f75924f = bundle;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String str;
        Fragment fragment;
        e activity;
        Aweme aweme;
        String a2;
        Fragment fragment2;
        e activity2;
        int i2;
        AwemeRawAd awemeRawAd;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject;
        com.ss.android.ugc.aweme.commercialize.views.a aVar;
        String str5;
        com.ss.android.ugc.aweme.commercialize.views.a aVar2;
        MethodCollector.i(2682);
        super.onChanged(bVar);
        String str6 = null;
        Object obj = null;
        if (bVar == null || (str = bVar.f67014a) == null) {
            MethodCollector.o(2682);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1540531799) {
            boolean z = false;
            if (hashCode != -1132409520) {
                if (hashCode == -690921606 && str.equals("ad_on_receive_js_bridge_event")) {
                    g gVar = (g) bVar.a();
                    if (gVar != null) {
                        Object obj2 = gVar.f74054d;
                        if (!(obj2 instanceof com.bytedance.ies.web.a.a)) {
                            obj2 = null;
                        }
                        com.bytedance.ies.web.a.a aVar3 = (com.bytedance.ies.web.a.a) obj2;
                        String str7 = gVar.f74051a;
                        switch (str7.hashCode()) {
                            case 898583738:
                                if (str7.equals("openLightLandingPage")) {
                                    com.ss.android.ugc.aweme.commercialize.views.a aVar4 = this.f76310h;
                                    if (aVar4 != null && !aVar4.getMBottomSheet().a()) {
                                        JSONObject jSONObject2 = gVar.f74052b;
                                        if (jSONObject2 != null) {
                                            str2 = jSONObject2.optString("clickFrom");
                                        } else {
                                            str2 = null;
                                        }
                                        JSONObject jSONObject3 = gVar.f74052b;
                                        if (jSONObject3 != null) {
                                            str3 = jSONObject3.optString("url");
                                        } else {
                                            str3 = null;
                                        }
                                        if (!TextUtils.isEmpty(str3)) {
                                            a.d dVar = com.ss.android.ugc.aweme.commercialize.views.a.n;
                                            Activity d2 = d();
                                            l.b(d2, "");
                                            JSONObject jSONObject4 = gVar.f74052b;
                                            if (jSONObject4 != null) {
                                                str6 = jSONObject4.optString("url");
                                            }
                                            JSONObject jSONObject5 = gVar.f74052b;
                                            if (jSONObject5 != null && jSONObject5.optInt("isShieldNativeTouchEvent") == 1) {
                                                z = true;
                                            }
                                            a.d.a(dVar, d2, str6, Boolean.valueOf(z));
                                            MethodCollector.o(2682);
                                            return;
                                        }
                                        com.ss.android.ugc.aweme.commercialize.views.a aVar5 = this.f76310h;
                                        if (aVar5 != null) {
                                            if (str2 == null) {
                                                str4 = PreRenderWebViewBusiness.a.a(25);
                                            } else {
                                                str4 = str2;
                                            }
                                            aVar5.a(str4, (Boolean) false);
                                        }
                                        if (aVar3 != null) {
                                            aVar3.a(gVar.f74053c, new JSONObject(ag.a(new p("code", 1))));
                                        }
                                        e.a aVar6 = new e.a();
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        l.d(str2, "");
                                        aVar6.f74885a = str2;
                                        aVar6.f74886b = false;
                                        this.f67010e.a("ACTION_HALF_WEB_PAGE_HIDE", new com.ss.android.ugc.aweme.commercialize.model.e(aVar6.f74885a, aVar6.f74886b, (byte) 0));
                                    }
                                    if (aVar3 != null) {
                                        aVar3.a(gVar.f74053c, new JSONObject(ag.a(new p("code", 0))));
                                        MethodCollector.o(2682);
                                        return;
                                    }
                                    MethodCollector.o(2682);
                                    return;
                                }
                                break;
                            case 1518137890:
                                if (str7.equals("openAdUrl") && (jSONObject = gVar.f74052b) != null && jSONObject.optBoolean("close_current_page") && (aVar = this.f76310h) != null) {
                                    aVar.b();
                                    MethodCollector.o(2682);
                                    return;
                                }
                            case 1531924954:
                                if (str7.equals("openPanel")) {
                                    JSONObject jSONObject6 = gVar.f74052b;
                                    if (jSONObject6 != null) {
                                        obj = jSONObject6.opt(StringSet.type);
                                    }
                                    if (l.a(obj, (Object) "menu")) {
                                        f b2 = GsonHolder.c().b();
                                        JSONObject jSONObject7 = gVar.f74052b;
                                        if (jSONObject7 == null || (str5 = jSONObject7.toString()) == null) {
                                            str5 = "";
                                        }
                                        al alVar = (al) b2.a(str5, al.class);
                                        if (alVar != null) {
                                            com.ss.android.ugc.aweme.commercialize.views.a aVar7 = this.f76310h;
                                            if (aVar7 != null) {
                                                String str8 = gVar.f74053c;
                                                l.d(alVar, "");
                                                com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c cVar = new com.ss.android.ugc.aweme.commercialize.views.bottomdialog.c(aVar7.getContext(), alVar);
                                                cVar.f75964c = new a.y(aVar7, aVar3, str8);
                                                cVar.show();
                                                MethodCollector.o(2682);
                                                return;
                                            }
                                            MethodCollector.o(2682);
                                            return;
                                        }
                                        MethodCollector.o(2682);
                                        return;
                                    }
                                    MethodCollector.o(2682);
                                    return;
                                }
                                break;
                            case 2049435752:
                                if (str7.equals("closeLightLandingPage")) {
                                    JSONObject jSONObject8 = gVar.f74052b;
                                    if (jSONObject8 == null || jSONObject8.optInt("close_from_h5") != 1) {
                                        com.ss.android.ugc.aweme.commercialize.views.a aVar8 = this.f76310h;
                                        if (!(aVar8 == null || !aVar8.getMBottomSheet().a() || (aVar2 = this.f76310h) == null)) {
                                            aVar2.b();
                                        }
                                        if (aVar3 != null) {
                                            aVar3.a(gVar.f74053c, new JSONObject(ag.a(new p("code", 1))));
                                            MethodCollector.o(2682);
                                            return;
                                        }
                                        MethodCollector.o(2682);
                                        return;
                                    }
                                    Activity d3 = d();
                                    l.b(d3, "");
                                    a.d.a(d3, com.ss.android.ugc.aweme.commercialize.views.a.f75904m);
                                    MethodCollector.o(2682);
                                    return;
                                }
                                break;
                        }
                    } else {
                        MethodCollector.o(2682);
                        return;
                    }
                }
            } else if (str.equals("ad_feed_on_page_selected") && !((((a2 = a.a((aweme = this.o))) == null || a2.length() <= 0 || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getWebviewType() != 0) && !com.ss.android.ugc.aweme.commercialize.e.a.b.M(aweme) && !com.ss.android.ugc.aweme.commercialize.e.a.b.aV(aweme)) || (fragment2 = this.p) == null || (activity2 = fragment2.getActivity()) == null)) {
                String a3 = a.a(this.o);
                if ((a3 == null || a3.length() <= 0) && !com.ss.android.ugc.aweme.commercialize.e.a.b.M(this.o) && !com.ss.android.ugc.aweme.commercialize.e.a.b.aV(this.o)) {
                    MethodCollector.o(2682);
                    return;
                }
                T t = new a.e.C1729a().a(new b(this, a3)).f75479a;
                l.d(activity2, "");
                l.d(t, "");
                Integer num = t.f75922d;
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = com.ss.android.ugc.aweme.commercialize.views.a.f75904m;
                }
                com.ss.android.ugc.aweme.commercialize.views.a b3 = a.d.b(activity2, i2);
                if (b3 == null) {
                    b3 = new com.ss.android.ugc.aweme.commercialize.views.a(activity2, (byte) 0);
                    b3.setId(i2);
                    b3.setParams(t);
                    FrameLayout a4 = a.d.a(activity2);
                    if (a4 != null) {
                        a4.addView(b3);
                    }
                }
                this.f76310h = b3;
                b3.setCallback(new c(this, activity2));
                MethodCollector.o(2682);
                return;
            }
        } else if (!(!str.equals("ad_feed_on_page_unselected") || this.f76310h == null || (fragment = this.p) == null || (activity = fragment.getActivity()) == null)) {
            int i3 = com.ss.android.ugc.aweme.commercialize.views.a.f75904m;
            l.d(activity, "");
            com.ss.android.ugc.aweme.commercialize.views.a b4 = a.d.b(activity, i3);
            if (b4 != null) {
                b4.a();
                FrameLayout a5 = a.d.a(activity);
                if (a5 != null) {
                    a5.removeView(b4);
                }
            }
            this.f76310h = null;
            MethodCollector.o(2682);
            return;
        }
        MethodCollector.o(2682);
    }
}

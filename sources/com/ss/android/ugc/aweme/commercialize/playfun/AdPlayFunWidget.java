package com.ss.android.ugc.aweme.commercialize.playfun;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.c.e;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.log.c;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.model.ao;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;

public final class AdPlayFunWidget extends AbsAdPlayFunWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    private AdPlayFunView f74948a;

    static {
        Covode.recordClassIndex(46208);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.AbsAdPlayFunWidget, com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.AbsAdPlayFunWidget
    public final void f() {
        AdPlayFunView adPlayFunView = this.f74948a;
        if (adPlayFunView != null) {
            adPlayFunView.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a() {
        super.a();
        DataCenter dataCenter = this.f67010e;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_on_page_selected", (u<b>) this);
            dataCenter.a("ad_feed_on_page_unselected", (u<b>) this);
            dataCenter.a("ad_video_on_render_ready", (u<b>) this);
            dataCenter.a("ad_video_on_resume_play", (u<b>) this);
            dataCenter.a("ad_video_on_pause_play", (u<b>) this);
            dataCenter.a("ad_feed_bind_texture_size", (u<b>) this);
            dataCenter.a("on_ad_pop_up_web_page_show", (u<b>) this);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.AbsAdPlayFunWidget
    public final void e() {
        AdPlayFunView adPlayFunView = this.f74948a;
        if (adPlayFunView != null) {
            AwemePlayFunModel awemePlayFunModel = adPlayFunView.f74936g;
            if (awemePlayFunModel != null) {
                String tips = awemePlayFunModel.getTips();
                if (tips != null) {
                    TextView textView = adPlayFunView.f74931b;
                    if (textView == null) {
                        l.a("eggTitleView");
                    }
                    textView.setText(tips);
                }
                UrlModel imageInfo = awemePlayFunModel.getImageInfo();
                if (imageInfo != null) {
                    v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(imageInfo)).a("AdPlayFunView");
                    SmartImageView smartImageView = adPlayFunView.f74930a;
                    if (smartImageView == null) {
                        l.a("eggImageView");
                    }
                    a2.E = smartImageView;
                    a2.a(adPlayFunView.f74938i);
                }
            }
            adPlayFunView.setVisibility(0);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u, com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(b bVar) {
        onChanged(bVar);
    }

    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPlayFunWidget f74949a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f74950b;

        static {
            Covode.recordClassIndex(46209);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            com.ss.android.ugc.aweme.commercialize.playfun.b.a.a(this.f74949a.o, true, (String) null);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
            String str;
            Aweme aweme = this.f74949a.o;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.commercialize.playfun.b.a.a(aweme, false, str);
        }

        a(AdPlayFunWidget adPlayFunWidget, androidx.fragment.app.e eVar) {
            this.f74949a = adPlayFunWidget;
            this.f74950b = eVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.AbsAdPlayFunWidget
    public final void a(boolean z) {
        float f2;
        AdPlayFunView adPlayFunView = this.f74948a;
        if (adPlayFunView != null) {
            if (z) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            adPlayFunView.setAlpha(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a(com.ss.android.ugc.aweme.commercialize.widget.a aVar) {
        androidx.fragment.app.e activity;
        AwemeRawAd awemeRawAd;
        MethodCollector.i(905);
        l.d(aVar, "");
        super.a(aVar);
        Aweme aweme = this.o;
        if (!com.ss.android.ugc.aweme.ad.feed.h.a.d(this.o)) {
            AdPlayFunView adPlayFunView = this.f74948a;
            if (adPlayFunView != null) {
                adPlayFunView.setVisibility(8);
                adPlayFunView.a((Aweme) null);
                MethodCollector.o(905);
                return;
            }
            MethodCollector.o(905);
            return;
        }
        if (this.f74948a == null) {
            View view = this.f67009d;
            if (view != null) {
                View inflate = ((ViewStub) view).inflate();
                if (inflate != null) {
                    this.f74948a = (AdPlayFunView) inflate;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView");
                    MethodCollector.o(905);
                    throw nullPointerException;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                MethodCollector.o(905);
                throw nullPointerException2;
            }
        }
        AdPlayFunView adPlayFunView2 = this.f74948a;
        if (adPlayFunView2 != null) {
            if (aweme == null) {
                l.b();
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 == null) {
                l.b();
            }
            l.b(awemeRawAd2, "");
            UrlModel imageInfo = awemeRawAd2.getPlayFunModel().getImageInfo();
            Fragment fragment = this.p;
            if (!(fragment == null || (activity = fragment.getActivity()) == null)) {
                l.b(activity, "");
                if (imageInfo != null) {
                    Aweme aweme2 = this.o;
                    if (!(com.ss.android.ugc.aweme.commercialize.playfun.b.a.a() || aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null)) {
                        d.f74778a.a(new c("playfun", "preload_start", -1, System.currentTimeMillis()).a(aweme2.getAid()).b(awemeRawAd.getCreativeIdStr()).c(awemeRawAd.getLogExtra()));
                    }
                    v a2 = r.a(com.ss.android.ugc.aweme.base.v.a(imageInfo));
                    a2.f39906b = activity;
                    a2.a(new a(this, activity));
                }
            }
            adPlayFunView2.a(aweme);
            DataCenter dataCenter = this.f67010e;
            adPlayFunView2.f74933d = dataCenter;
            e eVar = adPlayFunView2.f74932c;
            if (eVar == null) {
                l.a("stateContext");
            }
            eVar.f75002h = dataCenter;
            adPlayFunView2.setVisibility(8);
            MethodCollector.o(905);
            return;
        }
        MethodCollector.o(905);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a(b bVar) {
        String str;
        AdPlayFunView adPlayFunView;
        AdPlayFunView adPlayFunView2;
        AdPlayFunView adPlayFunView3;
        AdPlayFunView adPlayFunView4;
        AdPlayFunView adPlayFunView5;
        AdPlayFunView adPlayFunView6;
        super.onChanged(bVar);
        if (bVar != null && (str = bVar.f67014a) != null) {
            switch (str.hashCode()) {
                case -2057127075:
                    if (str.equals("ad_video_on_pause_play") && com.ss.android.ugc.aweme.ad.feed.h.a.d(this.o) && (adPlayFunView = this.f74948a) != null) {
                        adPlayFunView.f74937h = true;
                        e eVar = adPlayFunView.f74932c;
                        if (eVar == null) {
                            l.a("stateContext");
                        }
                        d dVar = eVar.f75007m.get(eVar.f74996b);
                        if (dVar != null) {
                            dVar.b();
                            return;
                        }
                        return;
                    }
                    return;
                case -1929582278:
                    if (str.equals("ad_video_on_render_ready") && com.ss.android.ugc.aweme.ad.feed.h.a.d(this.o) && (adPlayFunView2 = this.f74948a) != null) {
                        adPlayFunView2.f74937h = false;
                        return;
                    }
                    return;
                case -1540531799:
                    if (str.equals("ad_feed_on_page_unselected")) {
                        AdPlayFunView adPlayFunView7 = this.f74948a;
                        if (adPlayFunView7 != null) {
                            adPlayFunView7.f74934e = false;
                            e eVar2 = adPlayFunView7.f74932c;
                            if (eVar2 == null) {
                                l.a("stateContext");
                            }
                            eVar2.a();
                            SmartImageView smartImageView = adPlayFunView7.f74930a;
                            if (smartImageView == null) {
                                l.a("eggImageView");
                            }
                            smartImageView.setImageDisplayListener(null);
                        }
                        AdPlayFunView adPlayFunView8 = this.f74948a;
                        if (adPlayFunView8 != null) {
                            adPlayFunView8.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    return;
                case -1304146782:
                    if (str.equals("ad_feed_bind_texture_size") && (adPlayFunView3 = this.f74948a) != null) {
                        Object a2 = bVar.a();
                        l.b(a2, "");
                        ao aoVar = (ao) a2;
                        l.d(aoVar, "");
                        e eVar3 = adPlayFunView3.f74932c;
                        if (eVar3 == null) {
                            l.a("stateContext");
                        }
                        l.d(aoVar, "");
                        eVar3.f75005k = aoVar;
                        return;
                    }
                    return;
                case -1132409520:
                    if (str.equals("ad_feed_on_page_selected") && (adPlayFunView4 = this.f74948a) != null) {
                        adPlayFunView4.f74934e = true;
                        return;
                    }
                    return;
                case -480868024:
                    if (str.equals("on_ad_pop_up_web_page_show") && (adPlayFunView5 = this.f74948a) != null) {
                        adPlayFunView5.b();
                        return;
                    }
                    return;
                case 2040441990:
                    if (str.equals("ad_video_on_resume_play") && com.ss.android.ugc.aweme.ad.feed.h.a.d(this.o) && (adPlayFunView6 = this.f74948a) != null) {
                        adPlayFunView6.f74937h = false;
                        e eVar4 = adPlayFunView6.f74932c;
                        if (eVar4 == null) {
                            l.a("stateContext");
                        }
                        d dVar2 = eVar4.f75007m.get(eVar4.f74996b);
                        if (dVar2 != null) {
                            dVar2.c();
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}

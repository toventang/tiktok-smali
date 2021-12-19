package com.ss.android.ugc.aweme.ad.feed.interactive;

import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.g.b;
import com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AdGestureGuidance;
import com.ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import h.z;
import java.util.List;
import java.util.concurrent.Callable;

public final class AdInteractiveWidget extends AbsAdFeedWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65878a = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private final h f65879h = i.a((h.f.a.a) c.f65883a);

    /* renamed from: i  reason: collision with root package name */
    private FeedAdInteractiveLayout f65880i;

    static {
        Covode.recordClassIndex(40537);
    }

    private final com.ss.android.ugc.aweme.ad.feed.c e() {
        return (com.ss.android.ugc.aweme.ad.feed.c) this.f65879h.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40538);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdInteractiveWidget f65881a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeedAdInteractiveLayout f65882b;

        static {
            Covode.recordClassIndex(40539);
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.interactive.f
        public final void a() {
            this.f65881a.f67010e.a("ad_feed_resume_video", (Object) null);
        }

        @Override // com.ss.android.ugc.aweme.ad.feed.interactive.f
        public final void b() {
            this.f65881a.f67010e.a("ad_feed_pause_video", (Object) null);
        }

        b(AdInteractiveWidget adInteractiveWidget, FeedAdInteractiveLayout feedAdInteractiveLayout) {
            this.f65881a = adInteractiveWidget;
            this.f65882b = feedAdInteractiveLayout;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ad.feed.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f65883a = new c();

        static {
            Covode.recordClassIndex(40540);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ad.feed.c invoke() {
            com.ss.android.ugc.aweme.commercialize_ad_api.a.a a2 = CommercializeAdServiceImpl.a().a(17);
            if (!(a2 instanceof com.ss.android.ugc.aweme.ad.feed.c)) {
                return null;
            }
            return a2;
        }
    }

    static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f65884a;

        static {
            Covode.recordClassIndex(40541);
        }

        d(String str) {
            this.f65884a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (!com.ss.android.ugc.aweme.commercialize.g.b.a(Uri.parse(this.f65884a))) {
                com.ss.android.ugc.aweme.commercialize.g.b.a(this.f65884a, new b.a() {
                    /* class com.ss.android.ugc.aweme.ad.feed.interactive.AdInteractiveWidget.d.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(40542);
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.g.b.a
                    public final void a() {
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.g.b.a
                    public final void b() {
                    }
                });
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a() {
        super.a();
        DataCenter dataCenter = this.f67010e;
        if (dataCenter != null) {
            dataCenter.a("ad_feed_show_interactive_ad", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_feed_bind_texture_size", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_feed_on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_feed_on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_video_on_resume_play", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_on_fragment_pager_resume", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_on_fragment_pager_pause", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("on_ad_pop_up_web_page_hide", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("on_ad_pop_up_web_page_show", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_video_on_render_ready", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_on_holder_pause", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            dataCenter.a("ad_on_holder_resume", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u, com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final void a(com.ss.android.ugc.aweme.commercialize.widget.a aVar) {
        AwemeRawAd awemeRawAd;
        AdInteractionData adInteractionData;
        AdGestureGuidance gestureGuidance;
        UrlModel image;
        List<String> urlList;
        MethodCollector.i(3647);
        l.d(aVar, "");
        super.a(aVar);
        com.ss.android.ugc.aweme.ad.feed.c e2 = e();
        if (e2 == null || !e2.c(this.o)) {
            FeedAdInteractiveLayout feedAdInteractiveLayout = this.f65880i;
            if (feedAdInteractiveLayout != null) {
                feedAdInteractiveLayout.a((Aweme) null, (String) null);
                feedAdInteractiveLayout.setVisibility(8);
                MethodCollector.o(3647);
                return;
            }
            MethodCollector.o(3647);
            return;
        }
        if (this.f65880i == null) {
            View view = this.f67009d;
            if (view != null) {
                ViewStub viewStub = (ViewStub) view;
                viewStub.setLayoutResource(R.layout.afa);
                View inflate = viewStub.inflate();
                if (inflate != null) {
                    this.f65880i = (FeedAdInteractiveLayout) inflate;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveLayout");
                    MethodCollector.o(3647);
                    throw nullPointerException;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                MethodCollector.o(3647);
                throw nullPointerException2;
            }
        }
        FeedAdInteractiveLayout feedAdInteractiveLayout2 = this.f65880i;
        if (feedAdInteractiveLayout2 == null) {
            MethodCollector.o(3647);
            return;
        }
        Aweme aweme = this.o;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adInteractionData = awemeRawAd.getAdInteractionData()) == null || (gestureGuidance = adInteractionData.getGestureGuidance()) == null || (image = gestureGuidance.getImage()) == null || (urlList = image.getUrlList()) == null || !(true ^ urlList.isEmpty())) {
            MethodCollector.o(3647);
            return;
        }
        String str = urlList.get(0);
        l.b(str, "");
        b.i.b(new d(str), b.i.f4824a);
        feedAdInteractiveLayout2.a(this.o, str);
        feedAdInteractiveLayout2.setOperator(new b(this, feedAdInteractiveLayout2));
        feedAdInteractiveLayout2.setVisibility(8);
        MethodCollector.o(3647);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b r4) {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.interactive.AdInteractiveWidget.a(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }
}

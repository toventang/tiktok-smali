package com.ss.android.ugc.aweme.bullet.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.kit.lynx.e;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdLynxCardStatusMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdLynxSuperLikeStatus;
import com.ss.android.ugc.aweme.bullet.bridge.ad.CloseAdLynxCardMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.CloseAdLynxHalfLoadingPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.CloseLynxFeedMaskMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.ClosePopUpWindow;
import com.ss.android.ugc.aweme.bullet.bridge.ad.CollapseAdLynxCardMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DidGetGameCodeClickMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DidSelectScoreMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DidSelectVoteCardOptionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DownloadAppClickMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DynamicAdReadyMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DynamicAdStatusMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DynamicAdViewSizeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.ExpandAdLynxCardMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.FeedElementAnimationMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.FeedElementStatusMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.FeedPlayerTriggerTimeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.GetNativeSiteCustomDataMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.GetPageDataMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.GetWebViewInfo;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdLandPageLinksMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenLightLandingPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.RegisterProgressObserverMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.SwipeUpVideoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.UpdateNavBarMethod;
import com.ss.android.ugc.aweme.bullet.module.ad.f;
import com.ss.android.ugc.aweme.bullet.module.ad.g;
import com.ss.android.ugc.aweme.bullet.module.ad.h;
import com.ss.android.ugc.aweme.bullet.module.ad.j;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class a extends b implements com.bytedance.ies.bullet.kit.lynx.b.d {

    /* renamed from: a  reason: collision with root package name */
    public static final C1561a f69276a = new C1561a((byte) 0);

    static {
        Covode.recordClassIndex(42709);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.d.a$a  reason: collision with other inner class name */
    public static final class C1561a {
        static {
            Covode.recordClassIndex(42710);
        }

        private C1561a() {
        }

        public /* synthetic */ C1561a(byte b2) {
            this();
        }
    }

    public static final class c extends com.bytedance.ies.bullet.kit.lynx.b.a {
        static {
            Covode.recordClassIndex(42712);
        }

        c() {
        }

        @Override // com.bytedance.ies.bullet.c.c.m, com.bytedance.ies.bullet.kit.lynx.b.a
        public final q a(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(bVar, "");
            return new h();
        }
    }

    public static final class d extends com.bytedance.ies.bullet.kit.web.a.c {
        static {
            Covode.recordClassIndex(42713);
        }

        d() {
        }

        @Override // com.bytedance.ies.bullet.c.c.m, com.bytedance.ies.bullet.kit.web.a.c
        public final q a(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(bVar, "");
            return new j();
        }
    }

    public static final class b implements com.bytedance.ies.bullet.kit.lynx.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.bullet.business.b f69277a;

        static {
            Covode.recordClassIndex(42711);
        }

        b(com.ss.android.ugc.aweme.bullet.business.b bVar) {
            this.f69277a = bVar;
        }

        @Override // com.bytedance.ies.bullet.c.c.e
        public final com.bytedance.ies.bullet.c.c.j a(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(bVar, "");
            return new g(bVar, this.f69277a);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.c
        public final com.bytedance.ies.bullet.kit.lynx.a b(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(bVar, "");
            return new f(bVar, this.f69277a);
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.c
        public final com.bytedance.ies.bullet.kit.lynx.c.a c(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(bVar, "");
            l.c(bVar, "");
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.c
        public final com.bytedance.ies.bullet.kit.lynx.c.a d(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(bVar, "");
            l.c(bVar, "");
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.c
        public final com.bytedance.ies.bullet.kit.lynx.c.b e(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(bVar, "");
            l.c(bVar, "");
            return null;
        }

        @Override // com.bytedance.ies.bullet.kit.lynx.c
        public final com.bytedance.ies.bullet.kit.lynx.c.c f(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.d(bVar, "");
            l.c(bVar, "");
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.d.b, com.bytedance.ies.bullet.a.f
    public final com.bytedance.ies.bullet.ui.common.b.c e(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return new com.ss.android.ugc.aweme.bullet.module.ad.b(bVar, new com.ss.android.ugc.aweme.bullet.business.a());
    }

    @Override // com.ss.android.ugc.aweme.bullet.d.b, com.bytedance.ies.bullet.a.i
    public final List<q> f(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return n.a(new com.ss.android.ugc.aweme.bullet.module.ad.c());
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.b.d
    public final e g(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return new c();
    }

    @Override // com.ss.android.ugc.aweme.bullet.d.b, com.bytedance.ies.bullet.kit.web.a.g
    public final com.bytedance.ies.bullet.kit.web.f k(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return new d();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.b.d
    public final com.bytedance.ies.bullet.kit.lynx.c h(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        Object c2 = bVar.c(com.bytedance.ies.bullet.ui.common.b.c.class);
        if (!(c2 instanceof com.ss.android.ugc.aweme.bullet.module.base.b)) {
            c2 = null;
        }
        com.ss.android.ugc.aweme.bullet.module.base.a aVar = (com.ss.android.ugc.aweme.bullet.module.base.a) c2;
        if (aVar != null) {
            return new b(aVar.z);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.bullet.d.b, com.bytedance.ies.bullet.a.d
    public final List<k> b(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        List d2 = n.d((Collection) super.b(bVar), (Iterable) n.b(new GetWebViewInfo(bVar), new AdInfoMethod(bVar), new UpdateNavBarMethod(bVar), new FeedElementAnimationMethod(bVar), new FeedElementStatusMethod(bVar), new FeedPlayerTriggerTimeMethod(bVar), new OpenAdLandPageLinksMethod(bVar), new DownloadAppClickMethod(bVar), new GetNativeSiteCustomDataMethod(bVar), new SwipeUpVideoMethod(bVar), new CloseLynxFeedMaskMethod(bVar), new DidGetGameCodeClickMethod(bVar), new DidSelectVoteCardOptionMethod(bVar), new OpenLightLandingPageMethod(bVar), new DidSelectScoreMethod(bVar), new DynamicAdViewSizeMethod(bVar), new DynamicAdReadyMethod(bVar), new DynamicAdStatusMethod(bVar), new AdLynxSuperLikeStatus(bVar), new CloseAdLynxHalfLoadingPageMethod(bVar), new ClosePopUpWindow(bVar), new RegisterProgressObserverMethod(bVar)));
        List<k> arrayList = new ArrayList<>();
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a2 != null) {
            arrayList = a2.a(bVar);
        }
        arrayList.add(new GetPageDataMethod(bVar));
        List d3 = n.d((Collection) d2, (Iterable) arrayList);
        List<k> arrayList2 = new ArrayList<>();
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a3 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a3 != null) {
            arrayList2 = a3.b(bVar);
        }
        List d4 = n.d((Collection) d3, (Iterable) arrayList2);
        List<k> arrayList3 = new ArrayList<>();
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.c a4 = com.ss.android.ugc.aweme.ad.b.b.a();
        if (a4 != null) {
            arrayList3 = a4.c(bVar);
        }
        List d5 = n.d((Collection) d4, (Iterable) arrayList3);
        l.d(bVar, "");
        return n.d((Collection) n.d((Collection) d5, (Iterable) new ArrayList()), (Iterable) n.c(new CloseAdLynxCardMethod(bVar), new AdLynxCardStatusMethod(bVar), new ExpandAdLynxCardMethod(bVar), new CollapseAdLynxCardMethod(bVar)));
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.bullet.d.b
    public final com.bytedance.ies.bullet.kit.web.a.e a(com.bytedance.ies.bullet.c.e.a.b bVar, com.ss.android.ugc.aweme.bullet.business.b bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        return new com.ss.android.ugc.aweme.bullet.module.ad.a(bVar, bVar2);
    }
}

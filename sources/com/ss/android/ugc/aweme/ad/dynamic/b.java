package com.ss.android.ugc.aweme.ad.dynamic;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.DynamicVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.cg;
import h.f.b.l;
import h.h;
import h.m;
import h.z;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class b implements com.ss.android.ugc.aweme.ad.feed.b.d, i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final b f65701a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f65702b = h.i.a(m.NONE, a.f65711a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f65703c = h.i.a(m.NONE, C1466b.f65712a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f65704d = h.i.a(m.NONE, c.f65713a);

    /* renamed from: e  reason: collision with root package name */
    private static final h f65705e = h.i.a(m.NONE, d.f65714a);

    /* renamed from: f  reason: collision with root package name */
    private static HashMap<String, com.ss.android.ugc.aweme.ad.feed.b.a> f65706f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private static WeakReference<Context> f65707g;

    /* renamed from: h  reason: collision with root package name */
    private static int f65708h;

    /* renamed from: i  reason: collision with root package name */
    private static int f65709i;

    /* renamed from: j  reason: collision with root package name */
    private static int f65710j;

    public static int a() {
        return ((Number) f65702b.getValue()).intValue();
    }

    private static int d() {
        return ((Number) f65703c.getValue()).intValue();
    }

    private static com.ss.android.ugc.aweme.ad.feed.c e() {
        return (com.ss.android.ugc.aweme.ad.feed.c) f65704d.getValue();
    }

    private static String f() {
        return (String) f65705e.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(325, new g(b.class, "onDynamicAdReadyEvent", c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(105, new g(b.class, "onAdFeedRefreshEvent", com.ss.android.ugc.aweme.ad.feed.c.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class e implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f65715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f65716b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f65717c;

        /* renamed from: d  reason: collision with root package name */
        private final String f65718d = "onDCViewSize";

        static {
            Covode.recordClassIndex(40432);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f65718d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f65715a;
        }

        e(int i2, int i3) {
            this.f65716b = i2;
            this.f65717c = i3;
            this.f65715a = new JSONObject().put("viewPortWidth", i2).put("viewPortHeight", i3);
        }
    }

    private b() {
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.d
    public final void a(Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        DynamicVideo dynamicVideo;
        String lynxScheme;
        com.ss.android.ugc.aweme.bullet.e a2;
        if (aweme != null) {
            WeakReference<Context> weakReference = f65707g;
            Context context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                l.d("preload failed: context is null", "");
            } else if (aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && (dynamicVideo = awemeRawAd.getDynamicVideo()) != null && (lynxScheme = dynamicVideo.getLynxScheme()) != null && lynxScheme.length() != 0 && f65706f.get(aweme.getAid()) == null) {
                com.ss.android.ugc.aweme.ad.feed.b.a aVar = new com.ss.android.ugc.aweme.ad.feed.b.a(aweme, z);
                HashMap<String, com.ss.android.ugc.aweme.ad.feed.b.a> hashMap = f65706f;
                String aid = aweme.getAid();
                l.b(aid, "");
                hashMap.put(aid, aVar);
                l.d("preload start, lynxScheme: ".concat(String.valueOf(lynxScheme)), "");
                aVar.f65749e = System.currentTimeMillis();
                BulletContainerView bulletContainerView = new BulletContainerView(context, null, 6, (byte) 0);
                aVar.f65746b = bulletContainerView;
                bulletContainerView.a(BulletService.f().a(context), 17, 0, 0, 0, 0);
                Uri.Builder buildUpon = Uri.parse(lynxScheme).buildUpon();
                buildUpon.appendQueryParameter("initialData", a(aweme));
                Bundle bundle = new Bundle();
                com.ss.android.ugc.aweme.ad.feed.c e2 = e();
                if (e2 != null) {
                    e2.a(bundle, aweme, context);
                }
                com.ss.android.ugc.aweme.ad.feed.c e3 = e();
                if (!(e3 == null || (a2 = e3.a(bulletContainerView, f(), new a(aVar))) == null)) {
                    String builder = buildUpon.toString();
                    l.b(builder, "");
                    a2.a(builder, bundle);
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "dc_prerender", aweme.getAwemeRawAd()).a("is_first", Integer.valueOf(z ? 1 : 0)).b();
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.ad.feed.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f65713a = new c();

        static {
            Covode.recordClassIndex(40430);
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

    static final class d extends h.f.b.m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f65714a = new d();

        static {
            Covode.recordClassIndex(40431);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            IAdLandPagePreloadService f2 = AdLandPagePreloadServiceImpl.f();
            if (f2 != null) {
                return f2.g("dynamic_ad_feed");
            }
            return null;
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f65711a = new a();

        static {
            Covode.recordClassIndex(40428);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            DynamicAdConfig a2 = d.a();
            if (a2 != null) {
                i2 = a2.getLynxViewPreRenderGap();
            } else {
                i2 = 6;
            }
            return Integer.valueOf(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.b$b  reason: collision with other inner class name */
    static final class C1466b extends h.f.b.m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1466b f65712a = new C1466b();

        static {
            Covode.recordClassIndex(40429);
        }

        C1466b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            DynamicAdConfig a2 = d.a();
            if (a2 != null) {
                i2 = a2.getLynxViewReleaseGap();
            } else {
                i2 = 8;
            }
            if (i2 <= b.a()) {
                i2 = b.a() + 1;
            }
            return Integer.valueOf(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.d
    public final h.p<Integer, Integer> b() {
        return new h.p<>(Integer.valueOf(f65708h), Integer.valueOf(f65709i));
    }

    static {
        Covode.recordClassIndex(40427);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.d
    public final void c() {
        cg.b(this);
        for (Map.Entry<String, com.ss.android.ugc.aweme.ad.feed.b.a> entry : f65706f.entrySet()) {
            BulletContainerView bulletContainerView = entry.getValue().f65746b;
            if (bulletContainerView != null) {
                bulletContainerView.a();
            }
        }
        f65706f.clear();
        f65708h = 0;
        f65709i = 0;
        f65710j = 0;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.d
    public final com.ss.android.ugc.aweme.ad.feed.b.a a(String str) {
        return f65706f.get(str);
    }

    private static String a(Aweme aweme) {
        String str;
        o oVar = new o();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            l.b(awemeRawAd, "");
            Long adId = awemeRawAd.getAdId();
            String str2 = null;
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
            }
            oVar.a("groupId", str2);
        }
        String oVar2 = oVar.toString();
        l.b(oVar2, "");
        return oVar2;
    }

    @r(a = ThreadMode.MAIN)
    public final void onAdFeedRefreshEvent(com.ss.android.ugc.aweme.ad.feed.c.a aVar) {
        MethodCollector.i(3610);
        l.d(aVar, "");
        for (Map.Entry<String, com.ss.android.ugc.aweme.ad.feed.b.a> entry : f65706f.entrySet()) {
            com.ss.android.ugc.aweme.ad.feed.b.a value = entry.getValue();
            BulletContainerView bulletContainerView = value.f65746b;
            if (bulletContainerView != null) {
                ViewParent parent = bulletContainerView.getParent();
                if (!(parent instanceof ViewGroup)) {
                    parent = null;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup != null) {
                    viewGroup.removeView(bulletContainerView);
                }
                bulletContainerView.a();
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "dc_release", value.f65750f.getAwemeRawAd()).a("is_first", Integer.valueOf(value.f65751g ? 1 : 0)).b();
            }
        }
        f65706f.clear();
        f65710j = 0;
        MethodCollector.o(3610);
    }

    @r(a = ThreadMode.MAIN)
    public final void onDynamicAdReadyEvent(c cVar) {
        int i2;
        l.d(cVar, "");
        l.d("DynamicAdReadyEvent", "");
        int i3 = cVar.f65719a;
        Collection<com.ss.android.ugc.aweme.ad.feed.b.a> values = f65706f.values();
        l.b(values, "");
        for (T t : values) {
            BulletContainerView bulletContainerView = t.f65746b;
            if (bulletContainerView != null) {
                i2 = bulletContainerView.hashCode();
                continue;
            } else {
                i2 = 0;
                continue;
            }
            if (i2 == i3) {
                t.f65745a = 1;
                t.f65748d = cVar.f65720b;
                Aweme aweme = t.f65750f;
                Video video = aweme.getVideo();
                if (video != null) {
                    video.setDuration((double) cVar.f65720b);
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "dc_ready", aweme.getAwemeRawAd()).a("is_first", Integer.valueOf(t.f65751g ? 1 : 0)).a("time", Long.valueOf(System.currentTimeMillis() - t.f65749e)).b();
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.d
    public final void a(Context context) {
        if (context != null) {
            f65707g = new WeakReference<>(context);
            cg.a(this);
        }
    }

    private static void b(int i2, List<? extends Aweme> list) {
        if (i2 >= 0 && i2 < list.size()) {
            Aweme aweme = (Aweme) list.get(i2);
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme)) {
                l.d("trigger release cache, index = ".concat(String.valueOf(i2)), "");
                a(aweme.getAid(), true);
            }
        }
    }

    private final void c(int i2, List<? extends Aweme> list) {
        if (i2 >= 0 && i2 < list.size()) {
            Aweme aweme = (Aweme) list.get(i2);
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme)) {
                l.d("trigger preload again, index = ".concat(String.valueOf(i2)), "");
                a(aweme, false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.d
    public final void a(int i2, int i3) {
        f65708h = i2;
        f65709i = i3;
        Collection<com.ss.android.ugc.aweme.ad.feed.b.a> values = f65706f.values();
        l.b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            l.d("send onDCViewSize event", "");
            com.bytedance.ies.bullet.c.c.i iVar = it.next().f65747c;
            if (iVar != null) {
                iVar.onEvent(new e(i2, i3));
            }
        }
    }

    private static void a(String str, boolean z) {
        BulletContainerView bulletContainerView;
        MethodCollector.i(3580);
        if (str == null) {
            MethodCollector.o(3580);
            return;
        }
        com.ss.android.ugc.aweme.ad.feed.b.a aVar = f65706f.get(str);
        ViewGroup viewGroup = null;
        if (!(aVar == null || (bulletContainerView = aVar.f65746b) == null)) {
            ViewParent parent = bulletContainerView.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = parent;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                viewGroup2.removeView(bulletContainerView);
            }
            bulletContainerView.a();
            if (z) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "dc_release", aVar.f65750f.getAwemeRawAd()).a("is_first", Integer.valueOf(aVar.f65751g ? 1 : 0)).b();
            }
            l.d("releaseCacheByAwemeId, awemeId: ".concat(String.valueOf(str)), "");
        }
        f65706f.remove(str);
        MethodCollector.o(3580);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.d
    public final void a(int i2, List<? extends Aweme> list) {
        if (list != null) {
            int i3 = f65710j;
            if (i2 > i3) {
                b(i2 - d(), list);
                c(a() + i2, list);
            } else if (i2 < i3) {
                b(d() + i2, list);
                c(i2 - a(), list);
            }
            f65710j = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.d
    public final void a(Aweme aweme, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        if (aweme != null && com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme)) {
            com.ss.android.ugc.aweme.ad.feed.b.a a2 = a(aweme.getAid());
            int i2 = 0;
            if (a2 == null || a2.f65745a != 1) {
                l.d("fallback to native video", "");
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    awemeRawAd.setDynamicVideo(null);
                }
                aVar.invoke();
                a(aweme.getAid(), false);
                a.C0791a a3 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "dc_downgrade", aweme.getAwemeRawAd());
                if (a2 == null || a2.f65751g) {
                    i2 = 1;
                }
                a3.a("is_first", Integer.valueOf(i2)).b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.b.d
    public final void a(Aweme aweme, int i2, List<? extends Aweme> list) {
        String str;
        l.d(list, "");
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme)) {
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            a(str, true);
        }
        c(i2 + a(), list);
    }
}

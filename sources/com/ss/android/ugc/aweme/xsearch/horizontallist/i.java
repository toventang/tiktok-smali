package com.ss.android.ugc.aweme.xsearch.horizontallist;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.lynx.react.bridge.ReadableMap;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.ss.android.ugc.aweme.discover.e.c;
import com.ss.android.ugc.aweme.discover.j.d;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import com.ss.android.ugc.aweme.xsearch.horizontallist.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;

public final class i extends com.ss.android.ugc.aweme.discover.adapter.b implements org.greenrobot.eventbus.i, j {
    public static final a n = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f145201a;

    /* renamed from: b  reason: collision with root package name */
    public ReadableMap f145202b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.xsearch.b f145203c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f145204d = true;

    /* renamed from: e  reason: collision with root package name */
    public final k f145205e;

    /* renamed from: f  reason: collision with root package name */
    public int f145206f;

    /* renamed from: g  reason: collision with root package name */
    public b.d f145207g;

    /* renamed from: h  reason: collision with root package name */
    public b.c f145208h;

    /* renamed from: i  reason: collision with root package name */
    public int f145209i;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.flowfeed.a.a f145210m;
    private List<d> o;
    private View p;
    private f q;
    private final h r;

    static {
        Covode.recordClassIndex(94947);
    }

    public final Runnable d() {
        return (Runnable) this.r.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(81, new g(i.class, "onOuterContainerStatusChanged", c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(82, new g(i.class, "onOpenHotSpotEvent", com.ss.android.ugc.aweme.discover.e.i.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94948);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(94949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Runnable(this) {
                /* class com.ss.android.ugc.aweme.xsearch.horizontallist.i.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f145211a;

                static {
                    Covode.recordClassIndex(94950);
                }

                public final void run() {
                    this.f145211a.this$0.f145201a.removeCallbacks(this);
                    this.f145211a.this$0.f145207g = this.f145211a.this$0.c();
                    if (this.f145211a.this$0.f145207g == null) {
                        com.bytedance.android.alog.c.a(1, "SearchHorizontalForLynx", "run in callBack");
                        this.f145211a.this$0.f145201a.postDelayed(this, 100);
                        this.f145211a.this$0.b();
                        return;
                    }
                    com.bytedance.android.alog.c.a(1, "SearchHorizontalForLynx", "finish in callBack");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f145211a = r1;
                }
            };
        }
    }

    public final boolean a() {
        ReadableMap readableMap = this.f145202b;
        if (readableMap == null) {
            return false;
        }
        return readableMap.hasKey("rank");
    }

    public final void b() {
        if (this.f145209i < 10) {
            this.f145205e.f145230c.f();
            this.f145209i++;
            return;
        }
        this.f145205e.f145230c.i();
        this.f145209i = 0;
    }

    private final List<com.ss.android.ugc.aweme.xsearch.video.b> f() {
        ArrayList arrayList = new ArrayList();
        RecyclerView a2 = this.f145205e.a();
        int childCount = a2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = a2.getChildAt(i2);
            while (true) {
                if (!(childAt instanceof ViewGroup)) {
                    break;
                } else if (childAt instanceof com.ss.android.ugc.aweme.xsearch.video.b) {
                    arrayList.add(childAt);
                    break;
                } else {
                    childAt = ((ViewGroup) childAt).getChildAt(0);
                }
            }
        }
        return arrayList;
    }

    public final b.d c() {
        List<com.ss.android.ugc.aweme.xsearch.video.b> f2 = f();
        int size = f2.size();
        for (int i2 = 0; i2 < size; i2++) {
            SearchPlayerCore core = f2.get(i2).getCore();
            if (core != null && core.m()) {
                this.f145207g = core;
                return core;
            }
        }
        return null;
    }

    private final void e() {
        com.ss.android.ugc.aweme.xsearch.c cVar;
        f fVar;
        Integer num;
        f fVar2 = this.q;
        if (!(fVar2 == null || (cVar = fVar2.f145177c) == null || (fVar = this.q) == null)) {
            fVar.f145176b = this.f145203c;
            List<d> list = this.o;
            if (list != null) {
                for (T t : list) {
                    List<Aweme> awemeList = cVar.f145149j.getAwemeList();
                    l.b(awemeList, "");
                    l.d(awemeList, "");
                    t.f145168b = awemeList;
                    t.f145169c = Integer.valueOf(this.f145206f);
                    t.f145171e = this.f145202b;
                    List<d> list2 = this.o;
                    if (list2 != null) {
                        num = Integer.valueOf(list2.size());
                    } else {
                        num = null;
                    }
                    t.f145170d = num;
                    t.f145172f = this.f145208h;
                }
                fVar.f145175a = list;
                this.o = list;
                a(fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(f fVar) {
        this.q = fVar;
        this.f145205e.a(fVar);
    }

    public final void a(boolean z) {
        this.f145205e.a().setTag(Boolean.valueOf(z));
        this.f145204d = z;
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final void onViewAttachedToWindow(View view) {
        l.d(view, "");
        com.bytedance.android.alog.c.a(1, "HorizontalContainer", " onViewAttachedToWindow  ".concat(String.valueOf(this)));
        super.onViewAttachedToWindow(view);
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final void onViewDetachedFromWindow(View view) {
        l.d(view, "");
        com.bytedance.android.alog.c.a(1, "HorizontalContainer", " onViewDetachedFromWindow  ".concat(String.valueOf(this)));
        super.onViewDetachedFromWindow(view);
        EventBus.a().b(this);
    }

    private final void a(Bundle bundle) {
        if (this.p == null) {
            View view = this.itemView;
            l.b(view, "");
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    break;
                } else if (parent instanceof com.ss.android.ugc.aweme.discover.lynx.e.b) {
                    this.p = (View) parent;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        View view2 = this.p;
        if (view2 != null) {
            r a2 = j.a.a(view2);
            String str = "general_search";
            if (!TextUtils.equals(a2.f121272g, str)) {
                str = "search_result";
            }
            bundle.putString("enter_from", str);
            bundle.putString("search_keyword", a2.f121271f);
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 70);
            bundle.putString("search_id", a2.f121274i);
            bundle.putString("key_search_type", a2.f121270e);
        }
    }

    public final void a(List<d> list) {
        l.d(list, "");
        com.bytedance.android.alog.c.a(1, "LynxSearchHorizontal", "bindFromLynx".concat(String.valueOf(list)));
        this.o = list;
        e();
        r F = F();
        F.f("general_search");
        String str = F.w.get("search_id");
        if (str != null) {
            F.h(str);
            String b2 = ac.a.f91473a.b(str);
            l.b(b2, "");
            F.i(b2);
        }
        String str2 = F.w.get("impr_id");
        if (str2 != null) {
            F.h(str2);
            String b3 = ac.a.f91473a.b(str2);
            l.b(b3, "");
            F.i(b3);
        }
        this.f145205e.a(list, F());
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onOuterContainerStatusChanged(c cVar) {
        b.d dVar;
        l.d(cVar, "");
        int i2 = cVar.f80948a;
        if (i2 == 1) {
            b.d dVar2 = this.f145207g;
            if (dVar2 != null) {
                dVar2.x();
            }
            this.f145205e.f145230c.f96191h = false;
        } else if (i2 == 2) {
            Iterator<WeakReference<b.d>> it = com.ss.android.ugc.aweme.autoplay.e.a.a().a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                WeakReference<b.d> next = it.next();
                if (next.get() != null) {
                    b.d dVar3 = next.get();
                    if (dVar3 == null) {
                        l.b();
                    }
                    if (dVar3.m()) {
                        b.d dVar4 = next.get();
                        if (dVar4 == null) {
                            l.b();
                        }
                        dVar = dVar4;
                    }
                }
            }
            this.f145207g = dVar;
        } else if (i2 == 3) {
            List<com.ss.android.ugc.aweme.xsearch.video.b> f2 = f();
            int size = f2.size();
            for (int i3 = 0; i3 < size; i3++) {
                SearchPlayerCore core = f2.get(i3).getCore();
                if (core != null) {
                    com.ss.android.ugc.aweme.autoplay.e.a.b(core);
                    core.A();
                }
            }
            com.bytedance.android.alog.c.a(1, "HorizontalContainer", "release " + f2.size());
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onOpenHotSpotEvent(com.ss.android.ugc.aweme.discover.e.i iVar) {
        Bundle bundle;
        T t;
        androidx.core.app.b bVar;
        String str;
        String str2;
        Aweme aweme;
        l.d(iVar, "");
        List<Aweme> f2 = this.f145205e.f145229b.f();
        if (!f2.isEmpty()) {
            Bundle bundle2 = iVar.f80962a;
            List<com.ss.android.ugc.aweme.xsearch.video.b> f3 = f();
            String string = bundle2.getString("id");
            Iterator<T> it = f3.iterator();
            while (true) {
                bundle = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider = t.getDataProvider();
                if (dataProvider == null || (aweme = dataProvider.f67578d) == null) {
                    str2 = null;
                } else {
                    str2 = aweme.getAid();
                }
                if (l.a((Object) str2, (Object) string)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                bVar = androidx.core.app.b.b(t2, t2.getWidth(), t2.getHeight());
            } else {
                bVar = null;
            }
            if (!TextUtils.isEmpty(string)) {
                if (string == null) {
                    l.b();
                }
                com.ss.android.ugc.aweme.feed.x.h.f95332b = f2;
                d dVar = new d();
                dVar.a_(f2);
                ae.f95296a = dVar;
                b.d c2 = c();
                this.f145207g = c2;
                if (c2 != null && (c2 instanceof SearchPlayerCore)) {
                    Objects.requireNonNull(c2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore");
                    com.ss.android.ugc.aweme.autoplay.player.video.c dataProvider2 = ((SearchPlayerCore) c2).getDataProvider();
                    Aweme aweme2 = dataProvider2.f67578d;
                    if (aweme2 != null) {
                        str = aweme2.getAid();
                    } else {
                        str = null;
                    }
                    if (l.a((Object) string, (Object) str)) {
                        com.ss.android.ugc.aweme.flowfeed.utils.b a2 = dataProvider2.a();
                        if (a2 != null) {
                            dataProvider2.f67579e = true;
                            com.ss.android.ugc.aweme.feed.helper.h a3 = com.ss.android.ugc.aweme.feed.helper.h.a();
                            l.b(a3, "");
                            a3.f93338a = dataProvider2.o;
                            com.ss.android.ugc.aweme.feed.helper.h a4 = com.ss.android.ugc.aweme.feed.helper.h.a();
                            l.b(a4, "");
                            a4.f93340c = a2.f96174d;
                            com.ss.android.ugc.aweme.feed.helper.h a5 = com.ss.android.ugc.aweme.feed.helper.h.a();
                            l.b(a5, "");
                            a5.f93344g = true;
                        }
                    } else {
                        b.d dVar2 = this.f145207g;
                        if (dVar2 != null) {
                            dVar2.y();
                        }
                    }
                }
                a(bundle2);
                this.f145205e.f67406e = string;
                SmartRoute withParam = new SmartRoute(H()).withParam(bundle2);
                if (bVar != null) {
                    bundle = bVar.a();
                }
                SmartRoute withParam2 = withParam.withBundleAnimation(bundle).withParam("activity_has_activity_options", true);
                String string2 = bundle2.getString("trending_event_id");
                if (!TrendingDetailServiceImpl.b().a() || TextUtils.isEmpty(string2)) {
                    withParam2.withUrl("//aweme/detail").withParam("video_from", "from_search_ad_no_request");
                } else {
                    withParam2.withUrl("//trending/detail").withParam("outer_aweme_id", string).withParam("is_from_trending_card", "1").withParam("video_from", "from_trending_inflow");
                }
                withParam2.open();
                this.f145205e.f145230c.f96191h = true;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(View view, com.ss.android.ugc.aweme.flowfeed.a.a aVar, com.ss.android.ugc.aweme.flowfeed.a.b bVar) {
        super(view);
        l.d(view, "");
        MethodCollector.i(575);
        this.f145210m = aVar;
        View findViewById = view.findViewById(R.id.du9);
        l.b(findViewById, "");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.f145201a = viewGroup;
        com.bytedance.android.alog.c.a(1, "HorizontalContainer", "SearchHorizontalViewHolder:  initSubHolder" + viewGroup);
        viewGroup.removeAllViews();
        View view2 = this.itemView;
        if (view2 != null) {
            ViewGroup viewGroup2 = (ViewGroup) view2;
            com.ss.android.ugc.aweme.flowfeed.a.a aVar2 = this.f145210m;
            f fVar = this.q;
            l.d(viewGroup2, "");
            k kVar = new k(new com.ss.android.ugc.aweme.discover.alading.d(com.ss.android.ugc.aweme.search.l.m.a(viewGroup2, R.layout.axn)), aVar2, bVar);
            kVar.a(fVar);
            viewGroup.addView(kVar.d());
            kVar.a().setTag(Boolean.valueOf(this.f145204d));
            this.f145205e = kVar;
            this.f145206f = 1;
            this.r = h.i.a((h.f.a.a) new b(this));
            MethodCollector.o(575);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.o(575);
        throw nullPointerException;
    }
}

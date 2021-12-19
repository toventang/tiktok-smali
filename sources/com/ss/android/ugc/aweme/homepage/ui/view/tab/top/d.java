package com.ss.android.ugc.aweme.homepage.ui.view.tab.top;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.feed.i.f;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class d implements i, j {

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap<String, String> f99702j = ag.c(new p("Following", "homepage_follow"), new p("For You", "homepage_hot"));

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap<String, String> f99703k = ag.c(new p("Following", "enter_homepage_follow"), new p("For You", "enter_homepage_hot"));

    /* renamed from: l  reason: collision with root package name */
    public static final HashMap<String, String> f99704l = ag.c(new p("Following", "click_follow_tab"), new p("For You", "click_hot_tab"));

    /* renamed from: m  reason: collision with root package name */
    public static final a f99705m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final a f99706a;

    /* renamed from: b  reason: collision with root package name */
    public final a.g f99707b;

    /* renamed from: c  reason: collision with root package name */
    public c f99708c;

    /* renamed from: d  reason: collision with root package name */
    public b f99709d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f99710e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f99711f;

    /* renamed from: g  reason: collision with root package name */
    public androidx.fragment.app.e f99712g;

    /* renamed from: h  reason: collision with root package name */
    public a.f f99713h;

    /* renamed from: i  reason: collision with root package name */
    public HashMap<String, by> f99714i = new HashMap<>();

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(63, new g(d.class, "onDislikeAwemeEvent", f.class, ThreadMode.POSTING, 0, false));
        hashMap.put(336, new g(d.class, "onScrollToFeedFollowGuideEvent", com.ss.android.ugc.aweme.main.guide.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63559);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final androidx.fragment.app.e a() {
        androidx.fragment.app.e eVar = this.f99712g;
        Objects.requireNonNull(eVar, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return eVar;
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f99717a;

        static {
            Covode.recordClassIndex(63561);
        }

        public c(d dVar) {
            this.f99717a = dVar;
        }

        public final void run() {
            a aVar = this.f99717a.f99706a;
            c cVar = this.f99717a.f99708c;
            if (cVar == null) {
                l.b();
            }
            a.f a2 = aVar.a(cVar.a());
            if (a2 != null) {
                a2.a();
            }
        }
    }

    private String c() {
        Object obj;
        a.f fVar = this.f99713h;
        if (fVar == null || (obj = fVar.f99690e) == null) {
            obj = "For You";
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        return (String) obj;
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f99719a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f99720b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f99721c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f99722d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f99723e;

        static {
            Covode.recordClassIndex(63563);
        }

        e(d dVar, String str, String str2, String str3, String str4) {
            this.f99719a = dVar;
            this.f99720b = str;
            this.f99721c = str2;
            this.f99722d = str3;
            this.f99723e = str4;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.ss.android.ugc.aweme.metrics.l lVar = new com.ss.android.ugc.aweme.metrics.l(this.f99720b);
            lVar.f109583a = this.f99721c;
            com.ss.android.ugc.aweme.metrics.l a2 = lVar.a(this.f99722d);
            a2.f109584b = this.f99723e;
            a2.f(AwemeChangeCallBack.a(this.f99719a.a())).f();
            return null;
        }
    }

    public final boolean b() {
        int i2;
        Object obj;
        c cVar = this.f99708c;
        if (cVar != null) {
            i2 = cVar.a();
        } else {
            i2 = -1;
        }
        a.f a2 = this.f99706a.a(i2);
        if (a2 != null) {
            obj = a2.f99690e;
        } else {
            obj = null;
        }
        if (l.a(obj, (Object) "For You")) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(63557);
    }

    public static final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f99716a;

        static {
            Covode.recordClassIndex(63560);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(d dVar) {
            this.f99716a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a.c
        public final void b(a.f fVar) {
            this.f99716a.f99713h = fVar;
        }

        @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a.c
        public final void a(a.f fVar) {
            l.d(fVar, "");
            if (this.f99716a.f99713h == null) {
                this.f99716a.f99713h = fVar;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.d$d  reason: collision with other inner class name */
    public static final class C2442d implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f99718a;

        static {
            Covode.recordClassIndex(63562);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C2442d(d dVar) {
            this.f99718a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a.b
        public final void a(a.f fVar) {
            Object obj;
            e eVar;
            d dVar = this.f99718a;
            dVar.f99713h = dVar.f99706a.a(this.f99718a.f99706a.getSelectedTabPosition());
            if (fVar != null) {
                obj = fVar.f99690e;
            } else {
                obj = null;
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            if ((!l.a((Object) str, (Object) "Following")) && (eVar = (e) HomeTabViewModel.a.a(this.f99718a.f99712g).b(str)) != null) {
                eVar.a();
            }
            by byVar = this.f99718a.f99714i.get(str);
            if (byVar != null) {
                byVar.h();
            }
            this.f99718a.a(str);
        }
    }

    private final void b(String str) {
        com.ss.android.common.c.c.a(a(), f99702j.get(str), "click");
    }

    @r
    public final void onDislikeAwemeEvent(f fVar) {
        int i2;
        l.d(fVar, "");
        if (fVar.f93476b == 1) {
            a aVar = this.f99706a;
            boolean z = fVar.f93475a;
            a.e eVar = aVar.f99642a;
            int i3 = 255;
            if (!z) {
                i2 = 255;
                i3 = 0;
            } else {
                i2 = 0;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(i3, i2);
            l.b(ofInt, "");
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(new a.e.C2439a(eVar));
            ofInt.start();
        }
    }

    @r
    public final void onScrollToFeedFollowGuideEvent(com.ss.android.ugc.aweme.main.guide.b bVar) {
        int i2;
        l.d(bVar, "");
        int i3 = 0;
        if (bVar.f109266a) {
            a aVar = this.f99706a;
            l.d("Following", "");
            int childCount = aVar.f99642a.getChildCount();
            while (true) {
                Object obj = null;
                if (i3 >= childCount) {
                    break;
                }
                a.f a2 = aVar.a(i3);
                if (a2 != null) {
                    obj = a2.f99690e;
                }
                if (l.a((Object) "Following", obj)) {
                    a.f a3 = aVar.a(i3);
                    if (a3 != null) {
                        i2 = a3.f99686a;
                    }
                } else {
                    i3++;
                }
            }
            i2 = -1;
            a aVar2 = this.f99706a;
            if (i2 >= 0 && i2 <= aVar2.f99642a.getChildCount() - 1) {
                aVar2.f99642a.a(i2, true);
                return;
            }
            return;
        }
        int selectedTabPosition = this.f99706a.getSelectedTabPosition();
        a aVar3 = this.f99706a;
        if (selectedTabPosition >= 0 && selectedTabPosition <= aVar3.f99642a.getChildCount() - 1) {
            aVar3.f99642a.a(selectedTabPosition, false);
        }
    }

    public d(FrameLayout frameLayout) {
        a aVar;
        l.d(frameLayout, "");
        MethodCollector.i(5365);
        if (com.ss.android.ugc.aweme.s.d.f()) {
            X2CFragmentMainPageIcon x2CFragmentMainPageIcon = (X2CFragmentMainPageIcon) com.ss.android.ugc.aweme.lego.f.a(new X2CFragmentMainPageIcon());
            if (x2CFragmentMainPageIcon.f99522h != null) {
                X2CFragmentMainPageIcon.a(x2CFragmentMainPageIcon.f99522h);
                aVar = x2CFragmentMainPageIcon.f99522h;
                x2CFragmentMainPageIcon.f99522h = null;
                if (aVar != null) {
                    this.f99711f = true;
                }
            }
            Context context = frameLayout.getContext();
            l.b(context, "");
            aVar = new a(context, (byte) 0);
        } else {
            Context context2 = frameLayout.getContext();
            l.b(context2, "");
            aVar = new a(context2, (byte) 0);
        }
        this.f99706a = aVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (com.bytedance.ies.abmock.b.a().a(true, "optimize_feed_tab_layout", false)) {
            layoutParams.gravity = 1;
            layoutParams.topMargin = (int) n.b(aVar.getContext(), -3.0f);
        } else {
            layoutParams.gravity = 17;
        }
        aVar.setLayoutParams(layoutParams);
        Context context3 = frameLayout.getContext();
        l.b(context3, "");
        aVar.setBackgroundColor(context3.getResources().getColor(R.color.c9));
        aVar.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.ugc.aweme.homepage.ui.view.tab.top.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f99715a;

            static {
                Covode.recordClassIndex(63558);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f99715a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                l.d(view, "");
                EventBus.a(EventBus.a(), this.f99715a);
            }

            public final void onViewDetachedFromWindow(View view) {
                l.d(view, "");
                EventBus.a().b(this.f99715a);
            }
        });
        frameLayout.addView(aVar, 0);
        Context context4 = aVar.getContext();
        if (context4 != null) {
            this.f99712g = (androidx.fragment.app.e) context4;
            aVar.setVisibility(0);
            if (aVar.f99646e == null) {
                aVar.f99646e = new a.g(aVar);
            }
            a.g gVar = aVar.f99646e;
            if (gVar == null) {
                l.b();
            }
            this.f99707b = gVar;
            MethodCollector.o(5365);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(5365);
        throw nullPointerException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014a, code lost:
        if ((r0 instanceof com.ss.android.ugc.aweme.service.b) != false) goto L_0x014c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 379
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.d.a(java.lang.String):void");
    }

    public final void a(int i2, int i3) {
        String str;
        a.f a2 = this.f99706a.a(i2);
        Object obj = null;
        if (a2 != null) {
            obj = a2.f99690e;
        }
        if (!(obj instanceof String) || obj == null) {
            obj = "";
        }
        String str2 = f99703k.get(obj);
        String str3 = f99702j.get(c());
        if (i3 == 2) {
            str = "slide";
        } else if (i3 == 1) {
            str = f99704l.get(obj);
        } else if (i3 == 3) {
            str = "goback_icon";
        } else {
            str = "click_follow_tab";
        }
        b.i.b(new e(this, str2, str, str3, FollowFeedServiceImpl.c().a(this.f99712g)), com.ss.android.ugc.aweme.common.r.a());
    }
}

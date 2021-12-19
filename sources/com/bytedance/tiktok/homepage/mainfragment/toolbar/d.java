package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.e;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.al.f;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.experiment.ax;
import com.ss.android.ugc.aweme.feed.i.k;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.main.ae;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class d extends c implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public int f44213a = 8388627;

    /* renamed from: b  reason: collision with root package name */
    public final ae f44214b;

    /* renamed from: c  reason: collision with root package name */
    public final b f44215c;

    /* renamed from: d  reason: collision with root package name */
    private a f44216d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f44217e;

    public interface a {
        static {
            Covode.recordClassIndex(27090);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(27089);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final boolean a() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(277, new g(d.class, "onUserLoginSuccessfully", f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(278, new g(d.class, "onLiveIconEntranceEnable", k.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final int c() {
        return this.f44213a;
    }

    private void e() {
        ImageView imageView = this.f44217e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    private void f() {
        ImageView imageView = this.f44217e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f44218a = new b();

        static {
            Covode.recordClassIndex(27091);
        }

        b() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            s.e().a();
            return null;
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final View b() {
        ImageView imageView = null;
        if (ax.b() || ax.a()) {
            View f2 = HomePageUIFrameServiceImpl.e().f(this.f44215c.getActivity());
            if (f2 instanceof ImageView) {
                imageView = f2;
            }
            this.f44217e = imageView;
            if (com.ss.android.ugc.aweme.s.d.i()) {
                return this.f44217e;
            }
        } else {
            View g2 = HomePageUIFrameServiceImpl.e().g(this.f44215c.getActivity());
            if (g2 instanceof ImageView) {
                imageView = g2;
            }
            this.f44217e = (ImageView) imageView;
        }
        boolean a2 = com.ss.android.ugc.aweme.live.a.a.a();
        int a3 = n.a(24.0d);
        int a4 = n.a(44.0d);
        if (a2) {
            a3 = n.a(56.0d);
            a4 = n.a(56.0d);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a3, a4);
        if (!a2) {
            if (this.f44213a == 8388627) {
                layoutParams.setMargins(n.a(16.0d), 0, 0, 0);
                int i2 = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(n.a(16.0d));
            } else {
                layoutParams.setMargins(0, 0, n.a(16.0d), 0);
                int i3 = Build.VERSION.SDK_INT;
                layoutParams.setMarginEnd(n.a(16.0d));
            }
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "optimize_feed_tab_layout", false)) {
            layoutParams.topMargin = n.a(-3.0d);
        }
        ImageView imageView2 = this.f44217e;
        if (imageView2 == null) {
            l.b();
        }
        imageView2.setLayoutParams(layoutParams);
        ImageView imageView3 = this.f44217e;
        if (imageView3 == null) {
            l.b();
        }
        return imageView3;
    }

    private final void a(boolean z) {
        if (!z) {
            e();
        } else {
            f();
        }
    }

    public final void a(a aVar) {
        EventBus.a(EventBus.a(), this);
        this.f44216d = aVar;
        b.i.b(b.f44218a, com.ss.android.ugc.aweme.cw.g.a());
    }

    @r(a = ThreadMode.MAIN)
    public final void onUserLoginSuccessfully(f fVar) {
        a(false);
        ILiveOuterService s = LiveOuterService.s();
        l.b(s, "");
        s.e().a();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.c
    public final void a(View view) {
        String str;
        l.d(view, "");
        ImageView imageView = this.f44217e;
        if (imageView != null && imageView.getVisibility() == 0) {
            ae aeVar = this.f44214b;
            if (aeVar == null || aeVar.ab_()) {
                ae aeVar2 = this.f44214b;
                e eVar = null;
                if (aeVar2 != null && aeVar2.getActivity() != null) {
                    ae aeVar3 = this.f44214b;
                    if (aeVar3 == null || !aeVar3.k()) {
                        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                        enterRoomConfig.f23299c.O = true;
                        EnterRoomConfig.LogData logData = enterRoomConfig.f23298b;
                        if (this.f44213a == 8388627) {
                            str = "top_left";
                        } else {
                            str = "top_right";
                        }
                        logData.G = str;
                        com.ss.android.ugc.aweme.story.live.d.a("homepage_hot", "");
                        ILiveOuterService s = LiveOuterService.s();
                        l.b(s, "");
                        com.ss.android.ugc.aweme.r.a i2 = s.i();
                        ae aeVar4 = this.f44214b;
                        if (aeVar4 != null) {
                            eVar = aeVar4.getActivity();
                        }
                        i2.b(eVar, enterRoomConfig, "homepage_hot");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x003d  */
    @org.greenrobot.eventbus.r(a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLiveIconEntranceEnable(com.ss.android.ugc.aweme.feed.i.k r7) {
        /*
            r6 = this;
            java.lang.String r5 = ""
            h.f.b.l.d(r7, r5)
            boolean r0 = r7.f93485a
            r4 = 0
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r4)
            h.f.b.l.b(r0, r5)
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L_0x0044
            r3 = 1
            java.lang.String r0 = "homepage_hot"
            com.ss.android.ugc.aweme.story.live.d.a(r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = "source"
            java.lang.String r0 = "for_you_feed_toplives"
            r2.put(r1, r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = com.ss.android.ugc.aweme.live.LiveOuterService.s()
            h.f.b.l.b(r0, r5)
            com.ss.android.ugc.aweme.live.j r1 = r0.m()
            java.lang.String r0 = "ttlive_homepage_toplives_entrance"
            r1.a(r0, r4, r2)
        L_0x0039:
            com.bytedance.tiktok.homepage.mainfragment.toolbar.d$a r0 = r6.f44216d
            if (r0 == 0) goto L_0x0040
            r0.a(r3)
        L_0x0040:
            r6.a(r3)
            return
        L_0x0044:
            r3 = 0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainfragment.toolbar.d.onLiveIconEntranceEnable(com.ss.android.ugc.aweme.feed.i.k):void");
    }

    public d(ae aeVar, b bVar) {
        l.d(aeVar, "");
        l.d(bVar, "");
        this.f44214b = aeVar;
        this.f44215c = bVar;
    }
}

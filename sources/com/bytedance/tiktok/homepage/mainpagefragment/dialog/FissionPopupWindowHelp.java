package com.bytedance.tiktok.homepage.mainpagefragment.dialog;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ui.bb;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.MainBottomTabView;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public final class FissionPopupWindowHelp implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    public UgAwemeActivitySetting f44268a;

    /* renamed from: b  reason: collision with root package name */
    public bb f44269b;

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f44270c;

    /* renamed from: d  reason: collision with root package name */
    public final ScrollSwitchStateManager f44271d;

    /* renamed from: e  reason: collision with root package name */
    ViewStub f44272e;

    /* renamed from: f  reason: collision with root package name */
    public FeedPanelStateViewModel f44273f;

    /* renamed from: g  reason: collision with root package name */
    Handler f44274g;

    /* renamed from: h  reason: collision with root package name */
    boolean f44275h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f44276i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.service.f.a.a f44277j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f44278k;

    /* renamed from: l  reason: collision with root package name */
    private final String f44279l = "MainPageFragment";

    /* renamed from: m  reason: collision with root package name */
    private final View f44280m;
    private MainBottomTabView n;
    private boolean o;

    static {
        Covode.recordClassIndex(27130);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(128, new org.greenrobot.eventbus.g(FissionPopupWindowHelp.class, "onScrolledToProfileTab", com.ss.android.ugc.aweme.share.model.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FissionPopupWindowHelp f44285a;

        static {
            Covode.recordClassIndex(27135);
        }

        e(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f44285a = fissionPopupWindowHelp;
        }

        public final void run() {
            this.f44285a.b();
        }
    }

    public final void c() {
        bb bbVar = this.f44269b;
        if (bbVar != null) {
            bbVar.dismiss();
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        this.f44276i = false;
        c();
    }

    public final void b() {
        ViewStub viewStub = this.f44272e;
        if (viewStub != null) {
            viewStub.setVisibility(8);
        }
    }

    public final void a() {
        long j2;
        g gVar = new g(this);
        MainBottomTabView mainBottomTabView = this.n;
        long j3 = 0;
        if (mainBottomTabView != null) {
            if (bb.f94317i) {
                j2 = 0;
            } else {
                j2 = 4000;
            }
            mainBottomTabView.postDelayed(gVar, j2);
        }
        MainBottomTabView mainBottomTabView2 = this.n;
        if (mainBottomTabView2 != null) {
            f fVar = new f(this);
            if (com.ss.android.ugc.aweme.profile.c.a().b()) {
                j3 = 4000;
            }
            mainBottomTabView2.postDelayed(fVar, j3);
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        this.f44276i = true;
        this.n = (MainBottomTabView) this.f44280m.findViewById(R.id.ck7);
        this.f44272e = (ViewStub) this.f44280m.findViewById(R.id.aga);
        if (this.f44273f == null) {
            this.f44273f = (FeedPanelStateViewModel) ae.a(this.f44270c.requireActivity(), (ad.b) null).a(FeedPanelStateViewModel.class);
        }
        if (com.ss.android.ugc.aweme.money.growth.e.f110852f) {
            UgAwemeActivitySetting ugAwemeActivitySetting = com.ss.android.ugc.aweme.money.growth.e.f110853g.f110855a;
            this.f44268a = ugAwemeActivitySetting;
            if (ugAwemeActivitySetting != null) {
                a();
            }
        } else if (!this.o) {
            this.o = true;
            com.ss.android.ugc.aweme.money.growth.e.f110853g.a(new a(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FissionPopupWindowHelp f44287a;

        static {
            Covode.recordClassIndex(27137);
        }

        g(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f44287a = fissionPopupWindowHelp;
        }

        public final void run() {
            Boolean bool;
            Boolean bool2;
            t<Boolean> tVar;
            t<Boolean> tVar2;
            if (this.f44287a.f44269b == null && this.f44287a.f44278k && this.f44287a.f44270c.getActivity() != null && this.f44287a.f44271d.b("page_feed")) {
                FeedPanelStateViewModel feedPanelStateViewModel = this.f44287a.f44273f;
                bb bbVar = null;
                if (feedPanelStateViewModel == null || (tVar2 = feedPanelStateViewModel.f124397c) == null) {
                    bool = null;
                } else {
                    bool = tVar2.getValue();
                }
                FeedPanelStateViewModel feedPanelStateViewModel2 = this.f44287a.f44273f;
                if (feedPanelStateViewModel2 == null || (tVar = feedPanelStateViewModel2.f124398d) == null) {
                    bool2 = null;
                } else {
                    bool2 = tVar.getValue();
                }
                if (bool != null && bool.booleanValue()) {
                    return;
                }
                if ((bool2 == null || !bool2.booleanValue()) && this.f44287a.f44277j.h()) {
                    androidx.fragment.app.e activity = this.f44287a.f44270c.getActivity();
                    if (activity == null) {
                        l.b();
                    }
                    l.b(activity, "");
                    com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a aVar = (com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a) HomeTabViewModel.a.a(activity).b("USER");
                    FissionPopupWindowHelp fissionPopupWindowHelp = this.f44287a;
                    if (aVar != null) {
                        UgAwemeActivitySetting ugAwemeActivitySetting = fissionPopupWindowHelp.f44268a;
                        androidx.fragment.app.e activity2 = this.f44287a.f44270c.getActivity();
                        l.d(aVar, "");
                        if (!(activity2 == null || !bb.a.a(ugAwemeActivitySetting) || bb.f94318j == null)) {
                            String str = bb.f94318j;
                            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                            bbVar = new bb(activity2, aVar, str);
                            if (bbVar.f94322a != null) {
                                int i2 = Build.VERSION.SDK_INT;
                                bbVar.showAsDropDown(bbVar.f94322a, bbVar.f94328g, -(bbVar.f94322a.getHeight() + bbVar.f94325d + bbVar.f94327f), 51);
                                bbVar.f94326e.post(new bb.d(bbVar));
                                long j2 = (long) bb.f94319k;
                                bbVar.getContentView().removeCallbacks(bbVar.f94324c);
                                bbVar.getContentView().postDelayed(bbVar.f94324c, j2);
                            }
                            com.ss.android.ugc.aweme.money.growth.e.f110853g.f110856b.a(true);
                        }
                    }
                    fissionPopupWindowHelp.f44269b = bbVar;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FissionPopupWindowHelp f44286a;

        static {
            Covode.recordClassIndex(27136);
        }

        f(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f44286a = fissionPopupWindowHelp;
        }

        public final void run() {
            Boolean bool;
            boolean z;
            View inflate;
            TextView textView;
            t<Boolean> tVar;
            t<Boolean> tVar2;
            MethodCollector.i(3590);
            FissionPopupWindowHelp fissionPopupWindowHelp = this.f44286a;
            if (!fissionPopupWindowHelp.f44275h) {
                fissionPopupWindowHelp.f44275h = true;
                if (fissionPopupWindowHelp.f44278k && fissionPopupWindowHelp.f44270c.getActivity() != null && fissionPopupWindowHelp.f44271d.b("page_feed")) {
                    FeedPanelStateViewModel feedPanelStateViewModel = fissionPopupWindowHelp.f44273f;
                    Boolean bool2 = null;
                    if (feedPanelStateViewModel == null || (tVar2 = feedPanelStateViewModel.f124397c) == null) {
                        bool = null;
                    } else {
                        bool = tVar2.getValue();
                    }
                    FeedPanelStateViewModel feedPanelStateViewModel2 = fissionPopupWindowHelp.f44273f;
                    if (!(feedPanelStateViewModel2 == null || (tVar = feedPanelStateViewModel2.f124398d) == null)) {
                        bool2 = tVar.getValue();
                    }
                    if ((bool == null || !bool.booleanValue()) && ((bool2 == null || !bool2.booleanValue()) && fissionPopupWindowHelp.f44277j.h())) {
                        try {
                            IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                            l.b(iESSettingsProxy, "");
                            UgAwemeActivitySetting awemeActivitySetting = iESSettingsProxy.getAwemeActivitySetting();
                            l.b(awemeActivitySetting, "");
                            UgProfileActivityButton profileActivityButton = awemeActivitySetting.getProfileActivityButton();
                            l.b(profileActivityButton, "");
                            Integer timeLimit = profileActivityButton.getTimeLimit();
                            com.ss.android.ugc.aweme.profile.c a2 = com.ss.android.ugc.aweme.profile.c.a();
                            String activityId = awemeActivitySetting.getActivityId();
                            l.b(timeLimit, "");
                            z = a2.a(activityId, timeLimit.intValue());
                        } catch (com.bytedance.ies.a unused) {
                            z = false;
                        }
                        if (com.ss.android.ugc.aweme.profile.c.a().b() && z) {
                            com.ss.android.ugc.aweme.profile.c.a().a(true);
                            try {
                                IESSettingsProxy iESSettingsProxy2 = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                                l.b(iESSettingsProxy2, "");
                                UgAwemeActivitySetting awemeActivitySetting2 = iESSettingsProxy2.getAwemeActivitySetting();
                                l.b(awemeActivitySetting2, "");
                                UgProfileActivityButton profileActivityButton2 = awemeActivitySetting2.getProfileActivityButton();
                                l.b(profileActivityButton2, "");
                                String tabBubbleText = profileActivityButton2.getTabBubbleText();
                                if (tabBubbleText != null && !TextUtils.equals(tabBubbleText, "")) {
                                    ViewStub viewStub = fissionPopupWindowHelp.f44272e;
                                    if (!(viewStub == null || (inflate = viewStub.inflate()) == null || (textView = (TextView) inflate.findViewById(R.id.agb)) == null)) {
                                        textView.setText(tabBubbleText);
                                    }
                                    ViewStub viewStub2 = fissionPopupWindowHelp.f44272e;
                                    if (viewStub2 != null) {
                                        viewStub2.setVisibility(0);
                                    }
                                    r.a("bubble_show", new com.ss.android.ugc.aweme.app.f.d().a("bubble_type", "coupon_fission").a("show_position", "personal_homepage").f66730a);
                                    fissionPopupWindowHelp.f44274g = new Handler(Looper.getMainLooper());
                                    Handler handler = fissionPopupWindowHelp.f44274g;
                                    if (handler != null) {
                                        handler.postDelayed(new e(fissionPopupWindowHelp), 5000);
                                        MethodCollector.o(3590);
                                        return;
                                    }
                                    MethodCollector.o(3590);
                                    return;
                                }
                            } catch (com.bytedance.ies.a unused2) {
                                MethodCollector.o(3590);
                                return;
                            } catch (Exception unused3) {
                            }
                        }
                    }
                }
            }
            MethodCollector.o(3590);
        }
    }

    @org.greenrobot.eventbus.r
    public final void onScrolledToProfileTab(com.ss.android.ugc.aweme.share.model.a aVar) {
        c();
    }

    public static final class a implements com.ss.android.ugc.aweme.money.growth.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FissionPopupWindowHelp f44281a;

        static {
            Covode.recordClassIndex(27131);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f44281a = fissionPopupWindowHelp;
        }

        @Override // com.ss.android.ugc.aweme.money.growth.a
        public final void a(UgAwemeActivitySetting ugAwemeActivitySetting) {
            this.f44281a.f44268a = ugAwemeActivitySetting;
            if (ugAwemeActivitySetting != null && this.f44281a.f44276i) {
                this.f44281a.a();
            }
        }
    }

    public static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FissionPopupWindowHelp f44282a;

        static {
            Covode.recordClassIndex(27132);
        }

        public b(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f44282a = fissionPopupWindowHelp;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f44282a.c();
            }
        }
    }

    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FissionPopupWindowHelp f44283a;

        static {
            Covode.recordClassIndex(27133);
        }

        public c(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f44283a = fissionPopupWindowHelp;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f44283a.c();
            }
        }
    }

    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FissionPopupWindowHelp f44284a;

        static {
            Covode.recordClassIndex(27134);
        }

        public d(FissionPopupWindowHelp fissionPopupWindowHelp) {
            this.f44284a = fissionPopupWindowHelp;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f44284a.c();
            }
        }
    }

    public FissionPopupWindowHelp(com.ss.android.ugc.aweme.im.service.f.a.a aVar, Fragment fragment, View view, ScrollSwitchStateManager scrollSwitchStateManager) {
        androidx.lifecycle.i lifecycle;
        l.d(aVar, "");
        l.d(fragment, "");
        l.d(view, "");
        l.d(scrollSwitchStateManager, "");
        this.f44270c = fragment;
        this.f44271d = scrollSwitchStateManager;
        this.f44280m = view;
        this.f44277j = aVar;
        if (!(!(fragment instanceof m) || fragment == null || (lifecycle = fragment.getLifecycle()) == null)) {
            lifecycle.a(this);
        }
        EventBus.a(EventBus.a(), this);
    }
}

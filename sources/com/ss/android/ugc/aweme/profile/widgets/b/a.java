package com.ss.android.ugc.aweme.profile.widgets.b;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.ak;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.DampScrollableLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.metrics.an;
import com.ss.android.ugc.aweme.music.assem.OriginMusicArg;
import com.ss.android.ugc.aweme.profile.f.o;
import com.ss.android.ugc.aweme.profile.model.PrivateTab;
import com.ss.android.ugc.aweme.profile.model.TabSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator;
import com.ss.android.ugc.aweme.profile.tab.MusProfileTabImageView;
import com.ss.android.ugc.aweme.profile.ui.SwipableViewPager;
import com.ss.android.ugc.aweme.profile.ui.aq;
import com.ss.android.ugc.aweme.profile.ui.as;
import com.ss.android.ugc.aweme.profile.ui.cr;
import com.ss.android.ugc.aweme.profile.ui.cs;
import com.ss.android.ugc.aweme.profile.ui.ct;
import com.ss.android.ugc.aweme.profile.ui.cu;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.ss.android.ugc.aweme.setting.ui.bv;
import com.ss.android.ugc.aweme.utils.ho;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.z;
import h.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class a extends com.bytedance.assem.arch.d.a implements MusProfileNavigator.a, c, i, j {
    public static final C2986a w = new C2986a((byte) 0);
    private aq.a A = new d(this);
    private long B = -1;

    /* renamed from: j  reason: collision with root package name */
    public final String f117650j = new StringBuilder("android:switcher:2131368023:").toString();

    /* renamed from: k  reason: collision with root package name */
    public List<cs> f117651k;

    /* renamed from: l  reason: collision with root package name */
    public List<Integer> f117652l;

    /* renamed from: m  reason: collision with root package name */
    public DampScrollableLayout f117653m;
    public cr<cs> n;
    public int o;
    int p;
    public boolean q;
    public View r;
    protected MusProfileNavigator s;
    protected SwipableViewPager t;
    protected ProfileViewModel u;
    public float v;
    private final User x;
    private final String y;
    private final String z;

    static {
        Covode.recordClassIndex(76108);
    }

    private static int g(int i2) {
        switch (i2) {
            case 0:
                return 0;
            case 1:
                return 5;
            case 2:
                return 1;
            case 3:
                return 3;
            case 4:
                return 6;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return 7;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            default:
                return -1;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return 10;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return 13;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return 12;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                return 14;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return 16;
        }
    }

    private static boolean h(int i2) {
        return i2 == 0 || i2 == 2;
    }

    public abstract boolean C();

    public boolean F() {
        return false;
    }

    public boolean J() {
        return true;
    }

    public abstract void e(int i2);

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(74, new org.greenrobot.eventbus.g(a.class, "onNeedScrollToTop", cu.class, ThreadMode.POSTING, 0, false));
        hashMap.put(75, new org.greenrobot.eventbus.g(a.class, "onProfilePageScrollToPosition", ct.class, ThreadMode.POSTING, 0, false));
        hashMap.put(76, new org.greenrobot.eventbus.g(a.class, "onUpdateWhoCanSeeMyLikeListModeEvent", bv.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    public abstract String u();

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.b.a$a  reason: collision with other inner class name */
    public static final class C2986a {
        static {
            Covode.recordClassIndex(76109);
        }

        private C2986a() {
        }

        public /* synthetic */ C2986a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public aq.a E() {
        return this.A;
    }

    public User v() {
        return this.x;
    }

    public String w() {
        return this.y;
    }

    public String x() {
        return this.z;
    }

    public static final class e implements ScrollableLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117658a;

        static {
            Covode.recordClassIndex(76113);
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final boolean an_() {
            return this.f117658a.C();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f117658a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final void a(float f2, float f3) {
            List<cs> list;
            if (this.f117658a.f25594h && (list = this.f117658a.f117651k) != null && !list.isEmpty() && this.f117658a.f117653m != null) {
                DampScrollableLayout dampScrollableLayout = this.f117658a.f117653m;
                if (dampScrollableLayout == null) {
                    l.b();
                }
                dampScrollableLayout.setCanScrollUp(true);
            }
        }

        @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
        public final void b(int i2, int i3) {
            float f2;
            float f3;
            if (this.f117658a.v == 0.0f) {
                a aVar = this.f117658a;
                View view = aVar.r;
                if (view != null) {
                    f3 = (float) view.getBottom();
                } else {
                    DampScrollableLayout dampScrollableLayout = this.f117658a.f117653m;
                    if (dampScrollableLayout != null) {
                        f2 = (float) dampScrollableLayout.getTabsMarginTop();
                    } else {
                        f2 = 0.0f;
                    }
                    f3 = 0.0f - f2;
                }
                aVar.v = f3;
            }
            List<cs> list = this.f117658a.f117651k;
            if (list != null && !list.isEmpty() && this.f117658a.f117653m != null) {
                DampScrollableLayout dampScrollableLayout2 = this.f117658a.f117653m;
                if (dampScrollableLayout2 == null) {
                    l.b();
                }
                dampScrollableLayout2.setCanScrollUp(true);
            }
        }
    }

    public final void K() {
        j(0);
    }

    public final void L() {
        j(1);
    }

    private int O() {
        List<Integer> list = this.f117652l;
        if (list == null) {
            return -1;
        }
        return list.indexOf(0);
    }

    /* access modifiers changed from: protected */
    public final ProfileViewModel A() {
        ProfileViewModel profileViewModel = this.u;
        if (profileViewModel == null) {
            l.a("mProfileViewModel");
        }
        return profileViewModel;
    }

    public final void B() {
        DampScrollableLayout dampScrollableLayout = this.f117653m;
        if (dampScrollableLayout != null) {
            dampScrollableLayout.setMinY(0);
        }
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        super.p();
        EventBus.a().b(this);
    }

    /* access modifiers changed from: protected */
    public final MusProfileNavigator y() {
        MusProfileNavigator musProfileNavigator = this.s;
        if (musProfileNavigator == null) {
            l.a("navigator");
        }
        return musProfileNavigator;
    }

    /* access modifiers changed from: protected */
    public final SwipableViewPager z() {
        SwipableViewPager swipableViewPager = this.t;
        if (swipableViewPager == null) {
            l.a("viewPager");
        }
        return swipableViewPager;
    }

    public final void H() {
        MusProfileNavigator musProfileNavigator = this.s;
        if (musProfileNavigator == null) {
            l.a("navigator");
        }
        if (musProfileNavigator.getTabCount() <= 1) {
            c(false);
        } else {
            c(true);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean I() {
        if (v() == null) {
            return false;
        }
        User v2 = v();
        if (v2 == null) {
            l.b();
        }
        if (v2.getShowArtistPlaylist() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.b.c
    public final void N() {
        cs csVar;
        List<cs> list = this.f117651k;
        if (list != null) {
            csVar = list.get(this.o);
        } else {
            csVar = null;
        }
        if (csVar instanceof as) {
            ((as) csVar).k();
        }
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void f() {
        Fragment a2 = com.bytedance.assem.arch.extensions.b.a((m) this);
        if (a2 != null) {
            this.u = ProfileViewModel.a.a(a2);
        }
        super.f();
        EventBus.a(EventBus.a(), this);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117654a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.c f117655b;

        static {
            Covode.recordClassIndex(76110);
        }

        b(a aVar, z.c cVar) {
            this.f117654a = aVar;
            this.f117655b = cVar;
        }

        public final void run() {
            boolean z;
            cr<cs> crVar = this.f117654a.n;
            if (crVar == null) {
                l.b();
            }
            int count = crVar.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                View a2 = this.f117654a.y().a(i2);
                if (a2 != null) {
                    if (i2 == this.f117655b.element) {
                        z = true;
                    } else {
                        z = false;
                    }
                    a2.setSelected(z);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f117660b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f117661c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f117662d;

        static {
            Covode.recordClassIndex(76115);
        }

        g(a aVar, String str, long j2, int i2) {
            this.f117659a = aVar;
            this.f117660b = str;
            this.f117661c = j2;
            this.f117662d = i2;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            an a2 = new an().a(this.f117660b);
            a2.f109503a = String.valueOf(this.f117661c);
            a2.c(this.f117659a.d(this.f117662d)).f();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void D() {
        SwipableViewPager swipableViewPager = this.t;
        if (swipableViewPager == null) {
            l.a("viewPager");
        }
        if (swipableViewPager.getCurrentItem() != O() && O() != -1) {
            SwipableViewPager swipableViewPager2 = this.t;
            if (swipableViewPager2 == null) {
                l.a("viewPager");
            }
            swipableViewPager2.setCurrentItem(O(), false);
        }
    }

    /* access modifiers changed from: protected */
    public final void G() {
        boolean z2;
        s sVar = s.a.f66880a;
        l.b(sVar, "");
        aj<Integer> c2 = sVar.c();
        l.b(c2, "");
        Integer c3 = c2.c();
        if ((c3 != null && c3.intValue() == 0) || !in.g(v())) {
            z2 = true;
        } else {
            z2 = false;
        }
        b(z2);
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.profile.effect.e M() {
        Fragment fragment;
        androidx.fragment.app.i childFragmentManager;
        Fragment a2 = com.bytedance.assem.arch.extensions.b.a((m) this);
        if (a2 == null || (childFragmentManager = a2.getChildFragmentManager()) == null) {
            fragment = null;
        } else {
            fragment = childFragmentManager.a(this.f117650j + 4);
        }
        if (fragment instanceof com.ss.android.ugc.aweme.profile.effect.e) {
            return (com.ss.android.ugc.aweme.profile.effect.e) fragment;
        }
        String w2 = w();
        String x2 = x();
        boolean F = F();
        com.ss.android.ugc.aweme.profile.effect.e eVar = new com.ss.android.ugc.aweme.profile.effect.e();
        Bundle bundle = new Bundle();
        bundle.putString("user_id", w2);
        bundle.putString("sec_user_id", x2);
        bundle.putBoolean("is_me", F);
        eVar.setArguments(bundle);
        return eVar;
    }

    public static final class c implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117656a;

        static {
            Covode.recordClassIndex(76111);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f117656a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            this.f117656a.c(i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            a aVar = this.f117656a;
            if (f2 != 0.0f) {
                aVar.p = n.a(aVar.ar_()) / 3;
            }
        }
    }

    public static final class d implements aq.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f117657a;

        static {
            Covode.recordClassIndex(76112);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f117657a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.aq.a
        public final void a(int i2) {
            if (this.f117657a.f117653m != null) {
                DampScrollableLayout dampScrollableLayout = this.f117657a.f117653m;
                if (dampScrollableLayout == null) {
                    l.b();
                }
                dampScrollableLayout.setCanScrollUp(true);
            }
            if (i2 == 0) {
                this.f117657a.A().c(false);
                this.f117657a.A().a(false);
            }
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.aq.a
        public final void a(boolean z, int i2) {
            if (this.f117657a.f117653m != null) {
                DampScrollableLayout dampScrollableLayout = this.f117657a.f117653m;
                if (dampScrollableLayout == null) {
                    l.b();
                }
                dampScrollableLayout.setCanScrollUp(true);
            }
            if (i2 == 0) {
                this.f117657a.A().c(true);
                this.f117657a.A().a(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.assem.arch.extensions.a<? extends User>, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(76114);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.assem.arch.extensions.a<? extends User> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                a aVar3 = this.this$0;
                t.getAwemeCount();
                aVar3.K();
                a aVar4 = this.this$0;
                t.getFavoritingCount();
                aVar4.L();
            }
            return h.z.f158842a;
        }
    }

    private final void c(boolean z2) {
        int i2;
        MusProfileNavigator musProfileNavigator = this.s;
        if (musProfileNavigator == null) {
            l.a("navigator");
        }
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        musProfileNavigator.setVisibility(i2);
    }

    private final void j(int i2) {
        if (this.f25594h && in.b(v(), in.g(v()))) {
            i(i2);
        }
    }

    private static List<Integer> a(List<Integer> list) {
        l.d(list, "");
        List<Integer> g2 = h.a.n.g((Collection) list);
        if (g2.contains(12) && g2.size() >= 2) {
            g2.remove(list.indexOf(12));
            g2.add(1, 12);
        }
        return g2;
    }

    private static List<Integer> b(String str) {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (TextUtils.equals(str, g2.getCurUserId())) {
            s sVar = s.a.f66880a;
            l.b(sVar, "");
            ak<Integer> w2 = sVar.w();
            l.b(w2, "");
            return w2.c();
        }
        s sVar2 = s.a.f66880a;
        l.b(sVar2, "");
        ak<Integer> x2 = sVar2.x();
        l.b(x2, "");
        return x2.c();
    }

    private static int c(User user) {
        int i2;
        if (!(user == null || user.getTabSetting() == null)) {
            TabSetting tabSetting = user.getTabSetting();
            l.b(tabSetting, "");
            if (tabSetting.getPrivateTab() != null) {
                TabSetting tabSetting2 = user.getTabSetting();
                l.b(tabSetting2, "");
                PrivateTab privateTab = tabSetting2.getPrivateTab();
                l.b(privateTab, "");
                i2 = privateTab.getPrivateTabStyle();
                if (i2 <= 0 || i2 > 3) {
                    return 1;
                }
                return i2;
            }
        }
        i2 = 1;
        return i2;
    }

    private final void i(int i2) {
        int i3;
        MusProfileNavigator musProfileNavigator = this.s;
        if (musProfileNavigator == null) {
            l.a("navigator");
        }
        List<Integer> list = this.f117652l;
        if (list != null) {
            i3 = list.indexOf(Integer.valueOf(i2));
        } else {
            i3 = 0;
        }
        View a2 = musProfileNavigator.a(i3);
        if (a2 != null) {
            a2.setClickable(false);
        }
    }

    /* access modifiers changed from: protected */
    public final String d(int i2) {
        List<Integer> list = this.f117652l;
        if (list == null || list.isEmpty()) {
            return "";
        }
        List<Integer> list2 = this.f117652l;
        if (list2 == null) {
            l.b();
        }
        if (i2 >= list2.size()) {
            return "";
        }
        List<Integer> list3 = this.f117652l;
        if (list3 == null) {
            l.b();
        }
        return ho.a(list3.get(i2).intValue());
    }

    @r
    public void onProfilePageScrollToPosition(ct ctVar) {
        boolean z2;
        l.d(ctVar, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin() || !in.g(v())) {
            z2 = false;
        } else {
            z2 = true;
        }
        DampScrollableLayout dampScrollableLayout = this.f117653m;
        if (dampScrollableLayout != null && z2 == ctVar.f117098a) {
            dampScrollableLayout.a(ctVar.f117099b);
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onUpdateWhoCanSeeMyLikeListModeEvent(bv bvVar) {
        User v2 = v();
        if (v2 == null) {
            l.b();
        }
        String uid = v2.getUid();
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (TextUtils.equals(uid, g2.getCurUserId())) {
            G();
        }
    }

    private final void a(String str) {
        List g2;
        List<Integer> b2 = b(str);
        if (!(b2 == null || (g2 = h.a.n.g((Collection) b2)) == null)) {
            Iterator it = g2.iterator();
            while (it.hasNext()) {
                if (!h(((Number) it.next()).intValue())) {
                    it.remove();
                }
            }
            List<Integer> a2 = a(g2);
            if (a2 != null) {
                this.f117651k = new ArrayList(a2.size());
                this.f117652l = new ArrayList(a2.size());
                for (Integer num : a2) {
                    e(num.intValue());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator.a
    public void b(int i2) {
        String str;
        String a2 = ho.a(i2);
        if (F()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        com.ss.android.ugc.aweme.common.r.a("change_profile_tab", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("enter_method", "click").a("tab_name", a2).f66730a);
        this.q = true;
    }

    @r
    public void onNeedScrollToTop(cu cuVar) {
        boolean z2;
        l.d(cuVar, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin() || !in.g(v())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.f117653m != null && z2 == cuVar.f117100a) {
            DampScrollableLayout dampScrollableLayout = this.f117653m;
            if (dampScrollableLayout == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.common.h.a.a(dampScrollableLayout, new p(Float.valueOf(1.0f), Float.valueOf(1.0f)), new p(Float.valueOf(1.0f), Float.valueOf(-3000.0f)));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.tab.MusProfileNavigator.a
    public final void a(int i2) {
        String str;
        String a2 = ho.a(i2);
        l.b(a2, "");
        l.d(a2, "");
        o.f116431a = a2;
        if (this.q) {
            this.q = false;
            return;
        }
        if (F()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        com.ss.android.ugc.aweme.common.r.a("change_profile_tab", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("enter_method", "slide").a("tab_name", a2).f66730a);
    }

    @Override // com.bytedance.assem.arch.core.p
    public void b(View view) {
        androidx.fragment.app.i iVar;
        View view2;
        l.d(view, "");
        this.f117653m = (DampScrollableLayout) view.findViewById(R.id.dtd);
        this.r = view.findViewById(R.id.d_k);
        if (in.d() && (view2 = this.r) != null) {
            view2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        DampScrollableLayout dampScrollableLayout = this.f117653m;
        if (dampScrollableLayout != null) {
            dampScrollableLayout.setLayoutParams(layoutParams);
        }
        DampScrollableLayout dampScrollableLayout2 = this.f117653m;
        if (dampScrollableLayout2 != null) {
            dampScrollableLayout2.setOnScrollListener(new e(this));
        }
        View findViewById = view.findViewById(R.id.db9);
        l.b(findViewById, "");
        this.s = (MusProfileNavigator) findViewById;
        View findViewById2 = view.findViewById(R.id.dtj);
        l.b(findViewById2, "");
        SwipableViewPager swipableViewPager = (SwipableViewPager) findViewById2;
        this.t = swipableViewPager;
        if (swipableViewPager == null) {
            l.a("viewPager");
        }
        swipableViewPager.setOffscreenPageLimit(2);
        if (v() == null) {
            a(w());
        } else {
            a(v());
        }
        Fragment a2 = com.bytedance.assem.arch.extensions.b.a((m) this);
        if (a2 != null) {
            iVar = a2.getChildFragmentManager();
        } else {
            iVar = null;
        }
        this.n = new cr<>(iVar, this.f117651k, this.f117652l);
        SwipableViewPager swipableViewPager2 = this.t;
        if (swipableViewPager2 == null) {
            l.a("viewPager");
        }
        swipableViewPager2.setAdapter(this.n);
        MusProfileNavigator musProfileNavigator = this.s;
        if (musProfileNavigator == null) {
            l.a("navigator");
        }
        SwipableViewPager swipableViewPager3 = this.t;
        if (swipableViewPager3 == null) {
            l.a("viewPager");
        }
        I();
        musProfileNavigator.a(swipableViewPager3, F(), this);
        c(this.o);
        SwipableViewPager swipableViewPager4 = this.t;
        if (swipableViewPager4 == null) {
            l.a("viewPager");
        }
        swipableViewPager4.setCurrentItem(this.o);
        SwipableViewPager swipableViewPager5 = this.t;
        if (swipableViewPager5 == null) {
            l.a("viewPager");
        }
        swipableViewPager5.addOnPageChangeListener(new c(this));
        G();
        com.bytedance.assem.arch.service.d.a(this, ab.a(com.ss.android.ugc.aweme.profile.widgets.common.j.class), b.f117663a, new f(this));
    }

    /* access modifiers changed from: protected */
    public final cs f(int i2) {
        androidx.fragment.app.i childFragmentManager;
        Fragment a2;
        Fragment a3 = com.bytedance.assem.arch.extensions.b.a((m) this);
        if (a3 != null && (childFragmentManager = a3.getChildFragmentManager()) != null && (a2 = childFragmentManager.a(this.f117650j + 0)) != null && ((a2 instanceof com.ss.android.ugc.aweme.music.g) || (a2 instanceof com.ss.android.ugc.aweme.music.assem.c))) {
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.ProfileListFragment");
            return (cs) a2;
        } else if (com.bytedance.ies.abmock.b.a().a(true, "enable_refactor_origin_music", true)) {
            com.ss.android.ugc.aweme.music.assem.c cVar = new com.ss.android.ugc.aweme.music.assem.c();
            RouteArgExtension.INSTANCE.withNavArg(cVar, new OriginMusicArg(F(), w(), x(), i2, u()));
            return cVar;
        } else {
            String w2 = w();
            String x2 = x();
            boolean F = F();
            com.ss.android.ugc.aweme.music.g gVar = new com.ss.android.ugc.aweme.music.g();
            Bundle bundle = new Bundle();
            bundle.putString("user_id", w2);
            bundle.putString("sec_user_id", x2);
            bundle.putBoolean("is_me", F);
            gVar.setArguments(bundle);
            l.b(gVar, "");
            return gVar;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(User user) {
        int privateTabStyle;
        boolean isShowEffectList;
        String str = null;
        if (user != null) {
            str = user.getUid();
        }
        List<Integer> b2 = b(str);
        if (b2 != null) {
            List g2 = h.a.n.g((Collection) b2);
            Iterator it = g2.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 10) {
                                if (intValue != 12) {
                                    if (user != null) {
                                        user.getUid();
                                    }
                                    isShowEffectList = h(intValue);
                                } else if (!(user == null || user.getTabSetting() == null || user.getTabSetting().shopTab == null || !user.getTabSetting().shopTab.showShopTab)) {
                                }
                            } else if (c(user) != 2) {
                                if (c(user) == 3) {
                                }
                            }
                        } else if (user != null) {
                            isShowEffectList = user.isShowEffectList();
                        }
                        if (isShowEffectList) {
                        }
                    } else if (user != null && user.getShowArtistPlaylist() == 1) {
                    }
                } else if (!in.g(user)) {
                    if (!com.ss.android.ugc.aweme.setting.services.f.f122672a.f()) {
                    }
                } else if (!(user == null || user.getTabSetting() == null)) {
                    TabSetting tabSetting = user.getTabSetting();
                    l.b(tabSetting, "");
                    if (!tabSetting.isHideLikeTab()) {
                    }
                }
                it.remove();
            }
            List<Integer> a2 = a(g2);
            if (a2 != null) {
                if (in.g(user)) {
                    boolean contains = a2.contains(10);
                    if (contains && user != null && user.getTabSetting() != null && user.getTabSetting().getPrivateTab() != null && (privateTabStyle = user.getTabSetting().getPrivateTab().getPrivateTabStyle()) > 0 && privateTabStyle <= 3 && privateTabStyle == 3) {
                        int lastIndexOf = a2.lastIndexOf(2);
                        int lastIndexOf2 = a2.lastIndexOf(10);
                        if (!(lastIndexOf == -1 || lastIndexOf2 == -1)) {
                            a2.set(lastIndexOf, 10);
                            a2.set(lastIndexOf2, 2);
                        }
                    }
                    com.ss.android.ugc.aweme.profile.experiment.l.f116366a = contains;
                }
                ArrayList arrayList = new ArrayList();
                List<cs> list = this.f117651k;
                if (list == null) {
                    this.f117651k = new ArrayList(a2.size());
                } else {
                    arrayList.addAll(list);
                    List<cs> list2 = this.f117651k;
                    if (list2 != null) {
                        list2.clear();
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                List<Integer> list3 = this.f117652l;
                if (list3 == null) {
                    this.f117652l = new ArrayList(a2.size());
                } else {
                    arrayList2.addAll(list3);
                    List<Integer> list4 = this.f117652l;
                    if (list4 != null) {
                        list4.clear();
                    }
                }
                for (Integer num : a2) {
                    int intValue2 = num.intValue();
                    if (arrayList2.contains(Integer.valueOf(g(intValue2)))) {
                        int indexOf = arrayList2.indexOf(Integer.valueOf(g(intValue2)));
                        a((cs) arrayList.get(indexOf), (Integer) arrayList2.get(indexOf));
                    } else {
                        e(intValue2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b(User user) {
        int tabType;
        if (user != null) {
            z.c cVar = new z.c();
            List<Integer> list = this.f117652l;
            if (list == null) {
                l.b();
            }
            if (in.b(user, TextUtils.equals(user.getUid(), com.ss.android.ugc.aweme.account.b.g().getCurUserId()))) {
                tabType = 0;
            } else {
                tabType = user.getTabType();
            }
            cVar.element = list.indexOf(Integer.valueOf(g(tabType)));
            if (cVar.element < 0) {
                cVar.element = 0;
            }
            cr<cs> crVar = this.n;
            if (crVar == null) {
                l.b();
            }
            cVar.element = Math.min(crVar.getCount() - 1, cVar.element);
            SwipableViewPager swipableViewPager = this.t;
            if (swipableViewPager == null) {
                l.a("viewPager");
            }
            if (swipableViewPager.getCurrentItem() != cVar.element) {
                SwipableViewPager swipableViewPager2 = this.t;
                if (swipableViewPager2 == null) {
                    l.a("viewPager");
                }
                swipableViewPager2.setCurrentItem(cVar.element, false);
            }
            c(cVar.element);
            MusProfileNavigator musProfileNavigator = this.s;
            if (musProfileNavigator == null) {
                l.a("navigator");
            }
            musProfileNavigator.post(new b(this, cVar));
        }
    }

    public void c(int i2) {
        boolean z2;
        com.ss.android.ugc.aweme.common.widget.scrollablelayout.a helper;
        String str;
        List<cs> list = this.f117651k;
        if (list != null && i2 >= 0 && i2 < list.size() && this.f117653m != null) {
            int i3 = this.o;
            if (i2 != i3 && i3 >= 0) {
                List<cs> list2 = this.f117651k;
                if (list2 == null) {
                    l.b();
                }
                if (i3 < list2.size()) {
                    List<cs> list3 = this.f117651k;
                    if (list3 == null) {
                        l.b();
                    }
                    list3.get(this.o).setUserVisibleHint(false);
                }
            }
            if (this.B > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.B;
                if (currentTimeMillis > 0) {
                    if (F()) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    b.i.b(new g(this, str, currentTimeMillis, this.o), com.ss.android.ugc.aweme.common.r.a());
                }
                this.B = -1;
            }
            this.o = i2;
            ProfileViewModel profileViewModel = this.u;
            if (profileViewModel == null) {
                l.a("mProfileViewModel");
            }
            List<Integer> list4 = this.f117652l;
            if (list4 == null) {
                l.b();
            }
            profileViewModel.c(new ProfileViewModel.b(list4.get(this.o).intValue()));
            this.B = System.currentTimeMillis();
            DampScrollableLayout dampScrollableLayout = this.f117653m;
            if (!(dampScrollableLayout == null || (helper = dampScrollableLayout.getHelper()) == null)) {
                List<cs> list5 = this.f117651k;
                if (list5 == null) {
                    l.b();
                }
                helper.f76605b = list5.get(i2);
            }
            DampScrollableLayout dampScrollableLayout2 = this.f117653m;
            if (dampScrollableLayout2 != null) {
                dampScrollableLayout2.setCanScrollUp(true);
            }
            if (i2 == 0) {
                if (J()) {
                    ar_();
                    com.ss.android.ugc.aweme.common.r.a("slide_left", "personal_homepage", 0);
                }
            } else if (i2 == 1) {
                if (J()) {
                    ar_();
                    com.ss.android.ugc.aweme.common.r.a("slide_right", "personal_homepage", 0);
                }
            } else if (i2 == 2 && J()) {
                ar_();
                com.ss.android.ugc.aweme.common.r.a("slide_right", "personal_homepage", 0);
            }
            cr<cs> crVar = this.n;
            if (crVar != null) {
                int count = crVar.getCount();
                for (int i4 = 0; i4 < count; i4++) {
                    cr<cs> crVar2 = this.n;
                    Fragment a2 = crVar2 != null ? crVar2.a(i4) : null;
                    if (!(a2 instanceof cs)) {
                        a2 = null;
                    }
                    cs csVar = (cs) a2;
                    if (!(csVar == null || csVar.getFragmentManager() == null)) {
                        if (i4 == i2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        csVar.setUserVisibleHint(z2);
                        csVar.g();
                    }
                }
            }
        }
    }

    public final void b(boolean z2) {
        int i2;
        int i3;
        MusProfileNavigator musProfileNavigator = this.s;
        if (musProfileNavigator == null) {
            l.a("navigator");
        }
        List<Integer> list = this.f117652l;
        if (list != null) {
            i2 = list.indexOf(1);
        } else {
            i2 = 0;
        }
        View a2 = musProfileNavigator.a(i2);
        if (a2 instanceof MusProfileTabImageView) {
            MusProfileTabImageView musProfileTabImageView = (MusProfileTabImageView) a2;
            if (z2) {
                i3 = R.raw.icon_3pt_heart;
            } else {
                i3 = R.raw.icon_3pt_heart_eye_slash;
            }
            musProfileTabImageView.setImageResource(i3);
        }
    }

    public final void a(boolean z2) {
        int i2;
        List<cs> list;
        cs csVar;
        List<cs> list2 = this.f117651k;
        if (list2 != null && (i2 = this.o) >= 0 && i2 < list2.size() && (list = this.f117651k) != null && (csVar = list.get(this.o)) != null) {
            csVar.setUserVisibleHint(z2);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(cs csVar, Integer num) {
        List<Integer> list = this.f117652l;
        if (list == null) {
            l.b();
        }
        if (h.a.n.a((Iterable) list, (Object) num)) {
            List<Integer> list2 = this.f117652l;
            if (list2 == null) {
                l.b();
            }
            int a2 = h.a.n.a((List) list2, (Object) num);
            List<cs> list3 = this.f117651k;
            if (list3 == null) {
                l.b();
            }
            list3.remove(a2);
            List<Integer> list4 = this.f117652l;
            if (list4 == null) {
                l.b();
            }
            list4.remove(a2);
        }
        List<cs> list5 = this.f117651k;
        if (list5 == null) {
            l.b();
        }
        if (csVar == null) {
            l.b();
        }
        list5.add(csVar);
        List<Integer> list6 = this.f117652l;
        if (list6 == null) {
            l.b();
        }
        if (num == null) {
            l.b();
        }
        list6.add(num);
    }
}

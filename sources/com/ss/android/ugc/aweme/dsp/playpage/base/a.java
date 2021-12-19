package com.ss.android.ugc.aweme.dsp.playpage.base;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.dsp.ui.DspLoadMoreFrameLayout;
import com.ss.android.ugc.aweme.dsp.widget.vvpager.MDFilterScrollVerticalVPager;
import com.ss.android.ugc.aweme.dsp.widget.vvpager.MDVerticalViewPager;
import com.ss.android.ugc.aweme.feed.adapter.al;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public abstract class a extends com.ss.android.ugc.aweme.dsp.common.arch.a implements com.ss.android.ugc.aweme.dsp.playerservice.a.a, b {
    public static final int t = com.ss.android.ugc.aweme.adaptation.c.a();
    public static final C1991a u = new C1991a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public MDVerticalViewPager f83690g;

    /* renamed from: h  reason: collision with root package name */
    public DspLoadMoreFrameLayout f83691h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playpage.a f83692i;

    /* renamed from: j  reason: collision with root package name */
    public DmtStatusView f83693j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playpage.playview.c.a f83694k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f83695l = new Handler(Looper.getMainLooper());

    /* renamed from: m  reason: collision with root package name */
    public boolean f83696m;
    public int n = 1;
    public int o;
    public final f.a.l.c<Boolean> p;
    public boolean q;
    public boolean r;
    public boolean s;
    private final com.ss.android.ugc.aweme.dsp.playpage.model.g v;
    private f.a.b.b w;
    private final d x;
    private final e y;
    private SparseArray z;

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a
    public View a(int i2) {
        if (this.z == null) {
            this.z = new SparseArray();
        }
        View view = (View) this.z.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.z.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a
    public void br_() {
        SparseArray sparseArray = this.z;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playpage.base.a$a  reason: collision with other inner class name */
    public static final class C1991a {
        static {
            Covode.recordClassIndex(52216);
        }

        private C1991a() {
        }

        public /* synthetic */ C1991a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.b
    public com.ss.android.ugc.aweme.dsp.playerservice.c.e k() {
        return com.ss.android.ugc.aweme.dsp.playerservice.c.e.f83415c;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.b
    public final com.ss.android.ugc.aweme.dsp.playpage.model.g n() {
        return this.v;
    }

    static final class b implements al {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83697a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f83698b;

        static {
            Covode.recordClassIndex(52217);
        }

        b(a aVar, View view) {
            this.f83697a = aVar;
            this.f83698b = view;
        }

        @Override // com.ss.android.ugc.aweme.feed.adapter.al
        public final void a() {
            BasePlayerViewModel h2 = this.f83697a.h();
            if (h2 != null) {
                h2.f();
            }
        }
    }

    public final BasePlayerViewModel h() {
        ac acVar = ((com.ss.android.ugc.aweme.dsp.common.arch.a) this).f83284e;
        if (!(acVar instanceof BasePlayerViewModel)) {
            acVar = null;
        }
        return (BasePlayerViewModel) acVar;
    }

    public final void i() {
        BasePlayerViewModel h2 = h();
        if (h2 != null) {
            h2.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.b
    public final androidx.fragment.app.e m() {
        androidx.fragment.app.e activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return activity;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        a().b(this);
    }

    static {
        Covode.recordClassIndex(52215);
        h.f.b.l.b(c.b.f66221a, "");
    }

    /* access modifiers changed from: protected */
    public final String f() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_method")) == null) {
            return "homepage_music_tab";
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.b
    public final int g() {
        if (a(getActivity())) {
            return 0;
        }
        return (int) n.b(getContext(), 61.0f);
    }

    public void l() {
        if (!this.q || !this.r || this.s) {
            com.ss.android.ugc.aweme.dsp.playpage.playview.c.a aVar = this.f83694k;
            if (aVar != null) {
                aVar.setVisibility(8);
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.c.a aVar2 = this.f83694k;
        if (aVar2 != null) {
            aVar2.setVisibility(0);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f83695l.removeCallbacksAndMessages(null);
        f.a.b.b bVar = this.w;
        if (bVar != null) {
            bVar.dispose();
        }
        super.onDestroyView();
        br_();
    }

    public static final class d implements MDFilterScrollVerticalVPager.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83701a;

        static {
            Covode.recordClassIndex(52219);
        }

        @Override // com.ss.android.ugc.aweme.dsp.widget.vvpager.MDFilterScrollVerticalVPager.b
        public final boolean a() {
            com.ss.android.ugc.aweme.dsp.playpage.playview.a a2;
            com.ss.android.ugc.aweme.dsp.playpage.a aVar = this.f83701a.f83692i;
            if (aVar == null || (a2 = aVar.a()) == null || !a2.f83750c.a()) {
                return this.f83701a.a().f83565a.q();
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.dsp.widget.vvpager.MDFilterScrollVerticalVPager.b
        public final boolean b() {
            com.ss.android.ugc.aweme.dsp.playerservice.b.c p;
            com.ss.android.ugc.aweme.dsp.playpage.playview.a a2;
            com.ss.android.ugc.aweme.dsp.playpage.a aVar = this.f83701a.f83692i;
            if ((aVar != null && (a2 = aVar.a()) != null && a2.f83750c.a()) || (p = this.f83701a.a().f83565a.p()) == null) {
                return false;
            }
            if (!com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.a(p.a())) {
                return true;
            }
            this.f83701a.p.onNext(true);
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(a aVar) {
            this.f83701a = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.a
    public final void d() {
        t<z> tVar;
        t<Boolean> tVar2;
        t<Boolean> tVar3;
        t<z> tVar4;
        t<z> tVar5;
        t<z> tVar6;
        BasePlayerViewModel h2 = h();
        if (!(h2 == null || (tVar6 = h2.f83683e) == null)) {
            tVar6.observe(this, new f(this));
        }
        BasePlayerViewModel h3 = h();
        if (!(h3 == null || (tVar5 = h3.f83681c) == null)) {
            tVar5.observe(this, new g(this));
        }
        BasePlayerViewModel h4 = h();
        if (!(h4 == null || (tVar4 = h4.f83682d) == null)) {
            tVar4.observe(this, new h(this));
        }
        BasePlayerViewModel h5 = h();
        if (!(h5 == null || (tVar3 = h5.f83679a) == null)) {
            tVar3.observe(this, new i(this));
        }
        BasePlayerViewModel h6 = h();
        if (!(h6 == null || (tVar2 = h6.f83680b) == null)) {
            tVar2.observe(this, new j(this));
        }
        BasePlayerViewModel h7 = h();
        if (!(h7 == null || (tVar = h7.f83684f) == null)) {
            tVar.observe(this, new k(this));
        }
        i();
    }

    public final void e() {
        MDVerticalViewPager mDVerticalViewPager = this.f83690g;
        if (mDVerticalViewPager != null) {
            mDVerticalViewPager.setAutoScroll(false);
        }
        if (this.f83696m) {
            this.f83696m = false;
            a().j(null);
            return;
        }
        int i2 = this.n;
        if (i2 == 1) {
            MDVerticalViewPager mDVerticalViewPager2 = this.f83690g;
            if (mDVerticalViewPager2 != null) {
                mDVerticalViewPager2.f84068f = (int) (mDVerticalViewPager2.getResources().getDisplayMetrics().density * 25.0f);
            }
        } else if (i2 == 0) {
            a().i(null);
        } else {
            a().j(null);
        }
    }

    public final void j() {
        com.ss.android.ugc.aweme.dsp.playerservice.b.c n2 = a().f83565a.n();
        com.ss.android.ugc.aweme.dsp.playerservice.b.c p2 = a().f83565a.p();
        if (p2 == null) {
            p2 = n2;
        }
        com.ss.android.ugc.aweme.dsp.playerservice.b.c o2 = a().f83565a.o();
        if (o2 == null) {
            o2 = n2;
        }
        com.ss.android.ugc.aweme.dsp.playpage.a aVar = this.f83692i;
        if (aVar != null) {
            com.ss.android.ugc.aweme.dsp.playpage.a.a(aVar.a(), n2);
            com.ss.android.ugc.aweme.dsp.playpage.playview.a aVar2 = aVar.f83673a.get(0);
            h.f.b.l.b(aVar2, "");
            com.ss.android.ugc.aweme.dsp.playpage.a.a(aVar2, p2);
            com.ss.android.ugc.aweme.dsp.playpage.a.a(aVar.b(), o2);
            this.s = aVar.a().f83750c.a();
            l();
            com.ss.android.ugc.aweme.dsp.playpage.playview.c.a aVar3 = this.f83694k;
            if (aVar3 != null) {
                aVar3.setData(n2);
            }
        }
        MDVerticalViewPager mDVerticalViewPager = this.f83690g;
        if (mDVerticalViewPager != null) {
            mDVerticalViewPager.a(1, false);
        }
        if (com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.b()) {
            DspLoadMoreFrameLayout dspLoadMoreFrameLayout = this.f83691h;
            if (dspLoadMoreFrameLayout != null) {
                dspLoadMoreFrameLayout.a();
            }
            DspLoadMoreFrameLayout dspLoadMoreFrameLayout2 = this.f83691h;
            if (dspLoadMoreFrameLayout2 != null) {
                dspLoadMoreFrameLayout2.setCanLoadMore(false);
                return;
            }
            return;
        }
        DspLoadMoreFrameLayout dspLoadMoreFrameLayout3 = this.f83691h;
        if (dspLoadMoreFrameLayout3 != null) {
            dspLoadMoreFrameLayout3.setCanLoadMore(true ^ a().f83565a.q());
        }
    }

    public static final class e implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83702a;

        static {
            Covode.recordClassIndex(52220);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f83702a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            this.f83702a.n = i2;
            if (this.f83702a.o == 0 && this.f83702a.n != 1) {
                this.f83702a.e();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f83702a.o = i2;
            if (i2 == 0) {
                this.f83702a.e();
                this.f83702a.r = true;
                this.f83702a.l();
            } else if (i2 == 1 || i2 == 2) {
                this.f83702a.r = false;
                this.f83702a.l();
            }
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83704a;

        static {
            Covode.recordClassIndex(52222);
        }

        g(a aVar) {
            this.f83704a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f83704a.j();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f83700b;

        static {
            Covode.recordClassIndex(52218);
        }

        c(a aVar, View view) {
            this.f83699a = aVar;
            this.f83700b = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f83699a.i();
        }
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83708a;

        static {
            Covode.recordClassIndex(52226);
        }

        k(a aVar) {
            this.f83708a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            DspLoadMoreFrameLayout dspLoadMoreFrameLayout = this.f83708a.f83691h;
            if (dspLoadMoreFrameLayout != null) {
                dspLoadMoreFrameLayout.a();
            }
        }
    }

    static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final m f83710a = new m();

        static {
            Covode.recordClassIndex(52228);
        }

        m() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            h.f.b.l.b(th, "");
            com.ss.android.ugc.aweme.dsp.common.b.b.a("Show Restriction Toast Error", th);
        }
    }

    private static boolean a(androidx.fragment.app.e eVar) {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(eVar);
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83703a;

        static {
            Covode.recordClassIndex(52221);
        }

        f(a aVar) {
            this.f83703a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f83703a;
            aVar.f83696m = true;
            MDVerticalViewPager mDVerticalViewPager = aVar.f83690g;
            if (mDVerticalViewPager != null) {
                mDVerticalViewPager.setAutoScroll(true);
            }
            MDVerticalViewPager mDVerticalViewPager2 = aVar.f83690g;
            if (mDVerticalViewPager2 != null) {
                mDVerticalViewPager2.a(2, true);
            }
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83705a;

        static {
            Covode.recordClassIndex(52223);
        }

        h(a aVar) {
            this.f83705a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f83705a;
            com.ss.android.ugc.aweme.dsp.playpage.a aVar2 = aVar.f83692i;
            if (aVar2 != null) {
                com.ss.android.ugc.aweme.dsp.playpage.a.a(aVar2.b(), aVar.a().f83565a.o());
            }
        }
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83706a;

        static {
            Covode.recordClassIndex(52224);
        }

        i(a aVar) {
            this.f83706a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            DmtStatusView dmtStatusView;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue() && (dmtStatusView = this.f83706a.f83693j) != null) {
                dmtStatusView.f();
            }
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83709a;

        static {
            Covode.recordClassIndex(52227);
        }

        l(a aVar) {
            this.f83709a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            new com.bytedance.tux.g.b(this.f83709a).e(R.string.dbd).b();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        h.f.b.l.d(context, "");
        super.onAttach(context);
        this.f83692i = new com.ss.android.ugc.aweme.dsp.playpage.a(context, this);
        a().a(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BasePlayerViewModel h2 = h();
        if (h2 != null) {
            h2.a(f());
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83707a;

        static {
            Covode.recordClassIndex(52225);
        }

        j(a aVar) {
            this.f83707a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                DmtStatusView dmtStatusView = this.f83707a.f83693j;
                if (dmtStatusView != null) {
                    dmtStatusView.h();
                }
                com.ss.android.ugc.aweme.dsp.playpage.a aVar = this.f83707a.f83692i;
                if (aVar != null) {
                    com.ss.android.ugc.aweme.dsp.playpage.a.a(aVar.a(), null);
                    return;
                }
                return;
            }
            DmtStatusView dmtStatusView2 = this.f83707a.f83693j;
            if (dmtStatusView2 != null) {
                dmtStatusView2.a(true);
            }
        }
    }

    public a(String str) {
        h.f.b.l.d(str, "");
        this.v = new com.ss.android.ugc.aweme.dsp.playpage.model.g(str);
        f.a.l.c<Boolean> cVar = new f.a.l.c<>();
        h.f.b.l.b(cVar, "");
        this.p = cVar;
        this.q = true;
        this.r = true;
        this.x = new d(this);
        this.y = new e(this);
    }

    @Override // com.ss.android.ugc.aweme.dsp.common.arch.a
    public final void a(View view) {
        com.ss.android.ugc.aweme.dsp.playpage.playview.c.a aVar;
        VideoSeekBar videoSeekBar;
        androidx.fragment.app.e activity;
        VideoSeekBarMaskView videoSeekBarMaskView;
        ViewStub viewStub;
        View inflate;
        FrameLayout frameLayout;
        com.ss.android.ugc.aweme.dsp.playpage.playview.a a2;
        com.ss.android.ugc.aweme.dsp.playpage.playview.c.a aVar2;
        ViewStub viewStub2;
        View inflate2;
        FrameLayout frameLayout2;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        h.f.b.l.d(view, "");
        MDVerticalViewPager mDVerticalViewPager = (MDVerticalViewPager) view.findViewById(R.id.fk_);
        this.f83690g = mDVerticalViewPager;
        if (mDVerticalViewPager != null) {
            mDVerticalViewPager.setAdapter(this.f83692i);
        }
        MDVerticalViewPager mDVerticalViewPager2 = this.f83690g;
        int i3 = 0;
        com.ss.android.ugc.aweme.dsp.playpage.playview.c.a aVar3 = null;
        if (mDVerticalViewPager2 != null) {
            mDVerticalViewPager2.setBackground(null);
            mDVerticalViewPager2.setOnPageChangeListener(this.y);
            mDVerticalViewPager2.a(1, false);
            Objects.requireNonNull(mDVerticalViewPager2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.dsp.widget.vvpager.MDFilterScrollVerticalVPager");
            ((MDFilterScrollVerticalVPager) mDVerticalViewPager2).setFilterScrollInterceptor(this.x);
        }
        MDVerticalViewPager mDVerticalViewPager3 = this.f83690g;
        if (mDVerticalViewPager3 != null) {
            DspLoadMoreFrameLayout dspLoadMoreFrameLayout = (DspLoadMoreFrameLayout) view.findViewById(R.id.cet);
            this.f83691h = dspLoadMoreFrameLayout;
            if (dspLoadMoreFrameLayout != null) {
                layoutParams = dspLoadMoreFrameLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                layoutParams = null;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                if (a(getActivity())) {
                    i2 = t;
                } else {
                    i2 = 0;
                }
                layoutParams2.bottomMargin = i2;
            }
            DspLoadMoreFrameLayout dspLoadMoreFrameLayout2 = this.f83691h;
            if (dspLoadMoreFrameLayout2 != null) {
                h.f.b.l.d(mDVerticalViewPager3, "");
                dspLoadMoreFrameLayout2.f83929a = mDVerticalViewPager3;
            }
            DspLoadMoreFrameLayout dspLoadMoreFrameLayout3 = this.f83691h;
            if (dspLoadMoreFrameLayout3 != null) {
                dspLoadMoreFrameLayout3.setLoadMoreListener(new b(this, view));
            }
        }
        if (this.f83693j == null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view.findViewById(R.id.e_6);
            this.f83693j = dmtStatusView;
            if (dmtStatusView != null) {
                DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(view.getContext());
                MtEmptyView a3 = MtEmptyView.a(getContext());
                a3.setStatus(new d.a(getContext()).b(R.string.bsy).c(R.string.bsx).a(2131233256).f33648a);
                dmtStatusView.setBuilder(DmtStatusView.a.a(getContext()).b(new d.a(getContext()).a(2131233141).b(R.string.h2z).c(R.string.h2y).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, R.string.h35, new c(this, view)).f33648a).b(a3).a(dmtLoadingLayout));
                dmtStatusView.a(1);
            }
        }
        Context context = getContext();
        if (context != null) {
            h.f.b.l.b(context, "");
            aVar3 = new com.ss.android.ugc.aweme.dsp.playpage.playview.c.a(context, (byte) 0);
        }
        this.f83694k = aVar3;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        if (!a(getActivity())) {
            layoutParams3.setMarginStart((int) n.b(getContext(), 16.0f));
            layoutParams3.setMarginEnd((int) n.b(getContext(), 16.0f));
            layoutParams3.bottomMargin = (int) n.b(getContext(), 50.0f);
            layoutParams3.gravity = 80;
            com.ss.android.ugc.aweme.dsp.playpage.playview.c.a aVar4 = this.f83694k;
            if (aVar4 != null) {
                aVar4.setLayoutParams(layoutParams3);
            }
            androidx.fragment.app.e activity2 = getActivity();
            if (!(activity2 == null || (viewStub2 = (ViewStub) activity2.findViewById(R.id.cqe)) == null || (inflate2 = viewStub2.inflate()) == null || (frameLayout2 = (FrameLayout) inflate2.findViewById(R.id.cqh)) == null)) {
                frameLayout2.addView(this.f83694k);
            }
        } else {
            layoutParams3.bottomMargin = t - ((int) ((n.b(getContext(), 20.0f) - n.b(getContext(), 2.0f)) / 2.0f));
            layoutParams3.gravity = 80;
            com.ss.android.ugc.aweme.dsp.playpage.playview.c.a aVar5 = this.f83694k;
            if (aVar5 != null) {
                aVar5.setLayoutParams(layoutParams3);
            }
            androidx.fragment.app.e activity3 = getActivity();
            if (!(activity3 == null || (viewStub = (ViewStub) activity3.findViewById(R.id.cqe)) == null || (inflate = viewStub.inflate()) == null || (frameLayout = (FrameLayout) inflate.findViewById(R.id.cqh)) == null)) {
                frameLayout.addView(this.f83694k);
            }
            if (!(!com.ss.android.ugc.aweme.dsp.experiment.b.a().getEnableMusicSeekBar() || (aVar = this.f83694k) == null || (videoSeekBar = aVar.getVideoSeekBar()) == null || (activity = getActivity()) == null || (videoSeekBarMaskView = (VideoSeekBarMaskView) activity.findViewById(R.id.ck9)) == null)) {
                videoSeekBarMaskView.setMusicDspSeekBarView(videoSeekBar);
            }
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.c.a aVar6 = this.f83694k;
        if (aVar6 != null) {
            aVar6.setPlayPage(this);
        }
        com.ss.android.ugc.aweme.dsp.playpage.a aVar7 = this.f83692i;
        if (!(aVar7 == null || (a2 = aVar7.a()) == null || (aVar2 = this.f83694k) == null)) {
            aVar2.setOnSeekBarChangeListener(a2);
        }
        if (a(getActivity())) {
            i3 = t;
        }
        View findViewById = view.findViewById(R.id.w9);
        h.f.b.l.b(findViewById, "");
        findViewById.getLayoutParams().height = i3;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.a
    public final void a(boolean z2, com.ss.android.ugc.aweme.dsp.playerservice.b.f fVar) {
        this.q = z2;
        l();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.common.arch.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        this.w = this.p.g(3, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new l(this), m.f83710a);
        if (!com.ss.android.ugc.aweme.dsp.experiment.a.a().getDspEnableBgPlay()) {
            view.setKeepScreenOn(true);
        }
    }
}

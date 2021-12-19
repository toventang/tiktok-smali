package com.ss.android.ugc.aweme.dsp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.g;
import com.ss.android.ugc.aweme.dsp.TTDspViewModel;
import com.ss.android.ugc.aweme.dsp.common.arch.a.a;
import com.ss.android.ugc.aweme.dsp.ui.MusicDspTab;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b extends com.bytedance.ies.foundation.fragment.a implements com.bytedance.hox.a.d, g, a, com.ss.android.ugc.aweme.dsp.ui.a.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f83240f = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public TuxIconView f83241e;

    /* renamed from: g  reason: collision with root package name */
    private boolean f83242g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f83243h;

    /* renamed from: i  reason: collision with root package name */
    private String f83244i;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f83245j;

    static {
        Covode.recordClassIndex(51897);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f83245j == null) {
            this.f83245j = new SparseArray();
        }
        View view = (View) this.f83245j.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f83245j.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.hox.a.d
    public final void b(Bundle bundle) {
        l.d(bundle, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f83245j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51898);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final String d() {
        e activity = getActivity();
        if (activity == null) {
            return "track_reco";
        }
        l.b(activity, "");
        String b2 = TTDspViewModel.a.a(activity).b();
        if (b2 == null) {
            b2 = "track_reco";
        }
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.dsp.a
    public final String a() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("enter_from");
        }
        return null;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.dsp.a
    public final String c() {
        String str;
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("enter_method")) == null) {
            str = "homepage_music_tab";
        }
        l.b(str, "");
        return str;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!this.f83243h) {
            com.ss.android.ugc.aweme.dsp.common.b.a.b(d(), "other");
            this.f83243h = true;
        }
        this.f83242g = false;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (l.a((Object) this.f83244i, (Object) a.C1960a.a(c()).f83292c)) {
            a.C1960a.a(c()).f83291b.b();
        }
        e activity = getActivity();
        if (activity != null) {
            TabChangeManager.a.a(activity).b(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!com.ss.android.ugc.aweme.dsp.common.b.a.f83296d) {
            com.ss.android.ugc.aweme.dsp.common.b.a.f83294b = SystemClock.elapsedRealtime();
        }
        a.C1960a.a(c()).f83291b.f83361a.d(System.currentTimeMillis());
        a.C1960a.a(c()).f83291b.f83362b.d(System.currentTimeMillis());
        if (!this.f83242g && isVisible()) {
            com.ss.android.ugc.aweme.dsp.common.b.a.a(a(), "");
            this.f83242g = true;
        }
        this.f83243h = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC1957b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f83252a;

        static {
            Covode.recordClassIndex(51899);
        }

        View$OnClickListenerC1957b(Activity activity) {
            this.f83252a = activity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f83252a.finish();
        }
    }

    static final class c extends m implements h.f.a.b<BaseFragmentViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f83262a = new c();

        static {
            Covode.recordClassIndex(51900);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(AnonymousClass1.f83263a);
            return z.f158842a;
        }
    }

    public static boolean a(e eVar) {
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(eVar);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(c.f83262a);
        a.C1960a.a(c()).f83291b.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        e activity;
        super.onViewStateRestored(bundle);
        if (bundle != null && (activity = getActivity()) != null) {
            l.b(activity, "");
            TTDspViewModel.a.a(activity).a(new Bundle());
        }
    }

    @Override // com.bytedance.hox.a.d
    public final void a(Bundle bundle) {
        l.d(bundle, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.dsp.common.a.b(g2.getCurUserId()));
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        MusicDspTab musicDspTab;
        l.d(context, "");
        super.onAttach(context);
        e activity = getActivity();
        if (activity != null) {
            l.b(activity, "");
            TTDspViewModel a2 = TTDspViewModel.a.a(activity);
            if (a(activity)) {
                musicDspTab = (MusicDspTab) HomeTabViewModel.a.a(activity).a("MUSIC_DSP");
            } else {
                musicDspTab = new MusicDspTab(activity);
            }
            a2.f83235d = musicDspTab;
        }
        this.f83244i = toString();
        String c2 = c();
        String str = this.f83244i;
        l.d(c2, "");
        com.ss.android.ugc.aweme.dsp.common.arch.a.a aVar = com.ss.android.ugc.aweme.dsp.common.arch.a.a.f83288d.get(c2);
        if (aVar != null && (!l.a((Object) aVar.f83292c, (Object) str))) {
            aVar.f83291b.b();
        }
        com.ss.android.ugc.aweme.dsp.common.arch.a.a.f83288d.put(c2, new com.ss.android.ugc.aweme.dsp.common.arch.a.a(c2, new com.ss.android.ugc.aweme.dsp.playerservice.a(), str));
    }

    public static final class d implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f83268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.dsp.ui.a.d f83269b;

        static {
            Covode.recordClassIndex(51902);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            int c2;
            MethodCollector.i(1010);
            e activity = this.f83268a.getActivity();
            if (activity != null) {
                l.b(activity, "");
                TTDspViewModel a2 = TTDspViewModel.a.a(activity);
                a2.f83232a = a2.f83233b.get(i2);
                boolean z = true;
                if (b.a(activity)) {
                    if (i2 != 0) {
                        z = false;
                    }
                    MainPageFragmentImpl.i().a(z);
                } else {
                    if (i2 == 0) {
                        z = false;
                    }
                    com.ss.android.ugc.aweme.dsp.common.b.c.a(activity, z);
                    b bVar = this.f83268a;
                    if (bVar.f83241e == null) {
                        TuxIconView tuxIconView = new TuxIconView(activity, null, 0, 6);
                        tuxIconView.setOnClickListener(new View$OnClickListenerC1957b(activity));
                        tuxIconView.setIconRes(R.raw.icon_arrow_left_ltr);
                        tuxIconView.setPadding((int) n.b(activity, 16.0f), 0, (int) n.b(activity, 16.0f), 0);
                        tuxIconView.setIconHeight((int) n.b(activity, 24.0f));
                        tuxIconView.setIconWidth((int) n.b(activity, 24.0f));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                        layoutParams.gravity = 16;
                        ((FrameLayout) bVar.a(R.id.b62)).addView(tuxIconView, layoutParams);
                        bVar.f83241e = tuxIconView;
                    }
                    TuxIconView tuxIconView2 = this.f83268a.f83241e;
                    if (tuxIconView2 != null) {
                        if (i2 == 0) {
                            c2 = androidx.core.content.b.c(activity, R.color.bx);
                        } else {
                            c2 = androidx.core.content.b.c(activity, R.color.a9);
                        }
                        tuxIconView2.setTintColor(c2);
                    }
                }
            }
            this.f83269b.f84016b.onPageSelected(i2);
            MethodCollector.o(1010);
        }

        d(b bVar, com.ss.android.ugc.aweme.dsp.ui.a.d dVar) {
            this.f83268a = bVar;
            this.f83269b = dVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02ca, code lost:
        if (r1 != false) goto L_0x01e9;
     */
    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
        // Method dump skipped, instructions count: 726
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.alv, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.g
    public final void a(String str, String str2, boolean z, boolean z2) {
        if (l.a((Object) str2, (Object) "MUSIC_DSP")) {
            if (!this.f83243h) {
                com.ss.android.ugc.aweme.dsp.common.b.a.b(d(), "shift");
                this.f83243h = true;
            }
            this.f83242g = false;
        } else if (l.a((Object) str, (Object) "MUSIC_DSP")) {
            if (!this.f83242g) {
                com.ss.android.ugc.aweme.dsp.common.b.a.a("", c());
                this.f83242g = true;
            }
            this.f83243h = false;
            com.ss.android.ugc.aweme.dsp.common.b.a.f83294b = SystemClock.elapsedRealtime();
        }
    }
}

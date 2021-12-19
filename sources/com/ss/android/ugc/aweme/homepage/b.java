package com.ss.android.ugc.aweme.homepage;

import android.view.View;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.base.ui.g;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.MainBottomTabView;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.main.TabAlphaController;
import com.ss.android.ugc.aweme.main.TabChangeManager;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public FragmentTabHost f99157a;

    /* renamed from: b  reason: collision with root package name */
    public TabChangeManager f99158b;

    /* renamed from: c  reason: collision with root package name */
    public ScrollSwitchStateManager f99159c;

    static {
        Covode.recordClassIndex(63171);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.b$b  reason: collision with other inner class name */
    public static final class C2422b extends t<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f99161a;

        static {
            Covode.recordClassIndex(63173);
        }

        @Override // androidx.lifecycle.LiveData
        public final /* synthetic */ Object getValue() {
            TabChangeManager tabChangeManager = this.f99161a.f99158b;
            if (tabChangeManager != null) {
                return tabChangeManager.b();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C2422b(b bVar) {
            this.f99161a = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.uikit.a.b f99163a;

        static {
            Covode.recordClassIndex(63175);
        }

        d(com.bytedance.ies.uikit.a.b bVar) {
            this.f99163a = bVar;
        }

        public final void run() {
            HomePageUIFrameServiceImpl.e().runInTabHostRunnable(this.f99163a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainBottomTabView f99160a;

        static {
            Covode.recordClassIndex(63172);
        }

        a(MainBottomTabView mainBottomTabView) {
            this.f99160a = mainBottomTabView;
        }

        @Override // com.ss.android.ugc.aweme.adaptation.c.d
        public final void a() {
            MainBottomTabView mainBottomTabView = this.f99160a;
            if (mainBottomTabView != null) {
                l.b(c.b.f66221a, "");
                if (!com.ss.android.ugc.aweme.adaptation.c.f66194d) {
                    return;
                }
                if (com.ss.android.ugc.aweme.adaptation.c.f66193c == com.ss.android.ugc.aweme.adaptation.c.f66192b) {
                    mainBottomTabView.a((int) n.b(mainBottomTabView.getContext(), 0.0f), (int) n.b(mainBottomTabView.getContext(), 1.5f));
                } else {
                    mainBottomTabView.a((int) n.b(mainBottomTabView.getContext(), 4.0f), (int) n.b(mainBottomTabView.getContext(), 6.0f));
                }
            }
        }
    }

    public static final class c implements TabChangeManager.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f99162a;

        static {
            Covode.recordClassIndex(63174);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f99162a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.main.TabChangeManager.b
        public final void a(String str) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f99162a.f99159c;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f99148j = str;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ com.bytedance.ies.uikit.a.b $this_apply;

        static {
            Covode.recordClassIndex(63176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(com.bytedance.ies.uikit.a.b bVar) {
            super(1);
            this.$this_apply = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.b(this.$this_apply, AnonymousClass1.f99164a);
            return z.f158842a;
        }
    }

    public final void a(com.bytedance.ies.uikit.a.b bVar, View view) {
        MainBottomTabView mainBottomTabView;
        TabWidget tabWidget;
        l.d(bVar, "");
        bVar.getLifecycle().a(TabAlphaController.a());
        FragmentTabHost fragmentTabHost = this.f99157a;
        if (fragmentTabHost != null) {
            fragmentTabHost.a(bVar.getActivity(), bVar.getChildFragmentManager());
        }
        FragmentTabHost fragmentTabHost2 = this.f99157a;
        if (!(fragmentTabHost2 == null || (tabWidget = fragmentTabHost2.getTabWidget()) == null)) {
            tabWidget.setVisibility(8);
        }
        FragmentTabHost fragmentTabHost3 = this.f99157a;
        if (fragmentTabHost3 != null) {
            fragmentTabHost3.setOnTabSwitchListener((FragmentTabHost.b) bVar);
        }
        TabChangeManager a2 = TabChangeManager.a.a(bVar.getActivity());
        this.f99158b = a2;
        if (a2 != null) {
            FragmentTabHost fragmentTabHost4 = this.f99157a;
            a2.f109108e = true;
            a2.f109104a = fragmentTabHost4;
        }
        TabChangeManager tabChangeManager = this.f99158b;
        if (tabChangeManager != null) {
            tabChangeManager.f109109f = bVar.getChildFragmentManager();
        }
        ScrollSwitchStateManager scrollSwitchStateManager = this.f99159c;
        if (scrollSwitchStateManager != null) {
            C2422b bVar2 = new C2422b(this);
            l.d(bVar2, "");
            scrollSwitchStateManager.f99147i = bVar2;
        }
        TabChangeManager tabChangeManager2 = this.f99158b;
        if (tabChangeManager2 != null) {
            tabChangeManager2.f109110g = new c(this);
        }
        TabChangeManager tabChangeManager3 = this.f99158b;
        if (tabChangeManager3 != null) {
            tabChangeManager3.a((g) bVar);
        }
        a.b.f109011a.a("method_main_page_add_tab_duration", false);
        a.b.f109011a.b("method_main_page_add_tab_duration", false);
        FragmentTabHost fragmentTabHost5 = this.f99157a;
        if (fragmentTabHost5 != null) {
            fragmentTabHost5.post(new d(bVar));
        }
        View view2 = null;
        if (view != null) {
            mainBottomTabView = (MainBottomTabView) view.findViewById(R.id.ck7);
            view2 = view.findViewById(R.id.w_);
        } else {
            mainBottomTabView = null;
        }
        if (bVar.ab_()) {
            com.ss.android.ugc.aweme.adaptation.c.a(1, mainBottomTabView, view2, null, true, new a(mainBottomTabView));
        }
        if (Keva.getRepo("repo_story_cold_start").getInt("key_setting", 0) > 0) {
            com.bytedance.assem.arch.extensions.d.a(bVar, new e(bVar));
        }
    }
}

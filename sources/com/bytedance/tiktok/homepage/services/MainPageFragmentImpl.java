package com.bytedance.tiktok.homepage.services;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.service.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.c;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.video.k;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Objects;

public final class MainPageFragmentImpl implements IMainPageFragment {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<MainPageFragment> f44398a;

    static {
        Covode.recordClassIndex(27194);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPageFragment f44399a;

        static {
            Covode.recordClassIndex(27195);
        }

        a(MainPageFragment mainPageFragment) {
            this.f44399a = mainPageFragment;
        }

        public final void run() {
            FissionPopupWindowHelp fissionPopupWindowHelp = this.f44399a.u;
            if (fissionPopupWindowHelp != null) {
                fissionPopupWindowHelp.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final boolean b() {
        MainPageFragment mainPageFragment;
        com.bytedance.tux.tooltip.a aVar;
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || (aVar = mainPageFragment.B) == null || !aVar.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void c() {
        MainPageFragment mainPageFragment;
        com.bytedance.tiktok.homepage.mainpagefragment.dialog.a aVar;
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (aVar = mainPageFragment.s) != null) {
            aVar.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final String d() {
        MainPageFragment mainPageFragment;
        MainPageDataViewModel mainPageDataViewModel;
        String str;
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || (mainPageDataViewModel = mainPageFragment.f109072l) == null || (str = mainPageDataViewModel.f99135b) == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final String e() {
        MainPageFragment mainPageFragment;
        String g2;
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || (g2 = mainPageFragment.g()) == null) {
            return "";
        }
        return g2;
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void g() {
        MainPageFragment mainPageFragment;
        c cVar;
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (cVar = mainPageFragment.A) != null) {
            cVar.a(false);
        }
    }

    public static IMainPageFragment i() {
        MethodCollector.i(3622);
        Object a2 = b.a(IMainPageFragment.class, false);
        if (a2 != null) {
            IMainPageFragment iMainPageFragment = (IMainPageFragment) a2;
            MethodCollector.o(3622);
            return iMainPageFragment;
        }
        if (b.f145533h == null) {
            synchronized (IMainPageFragment.class) {
                try {
                    if (b.f145533h == null) {
                        b.f145533h = new MainPageFragmentImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3622);
                    throw th;
                }
            }
        }
        MainPageFragmentImpl mainPageFragmentImpl = (MainPageFragmentImpl) b.f145533h;
        MethodCollector.o(3622);
        return mainPageFragmentImpl;
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void a() {
        MainPageFragment mainPageFragment;
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null) {
            com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar = mainPageFragment.t;
            if (cVar == null) {
                l.b();
            }
            if (cVar.f44315j) {
                com.bytedance.tiktok.homepage.mainpagefragment.dialog.c cVar2 = mainPageFragment.t;
                if (cVar2 == null) {
                    l.b();
                }
                cVar2.a();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void f() {
        MainPageFragment mainPageFragment;
        c cVar;
        Handler handler;
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (cVar = mainPageFragment.A) != null && cVar.f44372f != null) {
            c cVar2 = mainPageFragment.A;
            if (!(cVar2 == null || (handler = cVar2.f44372f) == null)) {
                handler.removeCallbacks(new a(mainPageFragment));
            }
            FissionPopupWindowHelp fissionPopupWindowHelp = mainPageFragment.u;
            if (fissionPopupWindowHelp != null) {
                fissionPopupWindowHelp.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final boolean h() {
        MainPageFragment mainPageFragment;
        e activity;
        com.ss.android.ugc.aweme.homepage.story.sidebar.c cVar;
        StorySidebarFeedVM v;
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        if (weakReference == null || (mainPageFragment = weakReference.get()) == null || (activity = mainPageFragment.getActivity()) == null || (cVar = (com.ss.android.ugc.aweme.homepage.story.sidebar.c) d.a(activity, ab.a(com.ss.android.ugc.aweme.homepage.story.sidebar.c.class))) == null || (v = cVar.v()) == null) {
            return false;
        }
        return v.f99374k;
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void a(Fragment fragment) {
        this.f44398a = new WeakReference<>(fragment);
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void a(e eVar) {
        l.d(eVar, "");
        com.ss.android.ugc.aweme.main.h.a.b(eVar);
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void b(e eVar) {
        l.d(eVar, "");
        com.ss.android.ugc.aweme.main.h.a.a(eVar);
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void a(Context context) {
        l.d(context, "");
        if (!(context instanceof MainActivity)) {
            context = null;
        }
        MainActivity mainActivity = (MainActivity) context;
        if (mainActivity != null) {
            mainActivity.refreshSlideSwitchCanScrollRight();
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void a(androidx.lifecycle.l lVar) {
        i lifecycle;
        l.d(lVar, "");
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        MainPageFragment mainPageFragment = null;
        if (weakReference != null) {
            mainPageFragment = weakReference.get();
        }
        if ((mainPageFragment instanceof m) && mainPageFragment != null && (lifecycle = mainPageFragment.getLifecycle()) != null) {
            lifecycle.a(lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void a(ScrollSwitchStateManager scrollSwitchStateManager) {
        MainPageFragment mainPageFragment;
        c cVar;
        l.d(scrollSwitchStateManager, "");
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (cVar = mainPageFragment.A) != null) {
            l.d(scrollSwitchStateManager, "");
            if (!l.a((Object) "NOTIFICATION", (Object) cVar.f44370d.f109107d)) {
                cVar.f44370d.a("NOTIFICATION", false);
                v.O().B();
                k.a().b();
                cVar.h();
                scrollSwitchStateManager.a(false);
                com.bytedance.ies.uikit.a.b bVar = cVar.f44368b;
                Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainPageFragment");
                ((MainPageFragment) bVar).b(true);
                s.a(af.NOTICE);
            }
            cVar.f44369c.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void a(String str) {
        MainPageFragment mainPageFragment;
        e activity;
        com.ss.android.ugc.aweme.homepage.story.sidebar.c cVar;
        StorySidebarFeedVM v;
        l.d(str, "");
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (activity = mainPageFragment.getActivity()) != null && (cVar = (com.ss.android.ugc.aweme.homepage.story.sidebar.c) d.a(activity, ab.a(com.ss.android.ugc.aweme.homepage.story.sidebar.c.class))) != null && (v = cVar.v()) != null) {
            v.a("through SPI: ".concat(String.valueOf(str)));
        }
    }

    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    public final void a(boolean z) {
        MainPageFragment mainPageFragment;
        Context context;
        Resources resources;
        View view;
        int i2;
        String.valueOf(z);
        WeakReference<MainPageFragment> weakReference = this.f44398a;
        if (weakReference != null && (mainPageFragment = weakReference.get()) != null && (context = mainPageFragment.getContext()) != null && (resources = context.getResources()) != null && mainPageFragment != null && (view = mainPageFragment.f109066b) != null) {
            if (!z) {
                i2 = R.color.lr;
            } else {
                i2 = R.color.b2;
            }
            view.setBackgroundColor(resources.getColor(i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fd, code lost:
        if ((r8 - r1.longValue()) <= java.util.concurrent.TimeUnit.DAYS.toMillis(30)) goto L_0x00ff;
     */
    @Override // com.ss.android.ugc.aweme.main.IMainPageFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.services.MainPageFragmentImpl.a(java.lang.String, java.lang.String):void");
    }
}

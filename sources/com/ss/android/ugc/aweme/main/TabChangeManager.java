package com.ss.android.ugc.aweme.main;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Space;
import android.widget.TabHost;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.ss.android.ugc.aweme.base.ui.g;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class TabChangeManager extends ac {

    /* renamed from: h  reason: collision with root package name */
    public static final a f109103h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public FragmentTabHost f109104a;

    /* renamed from: b  reason: collision with root package name */
    String f109105b;

    /* renamed from: c  reason: collision with root package name */
    public final List<g> f109106c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public String f109107d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f109108e;

    /* renamed from: f  reason: collision with root package name */
    public i f109109f;

    /* renamed from: g  reason: collision with root package name */
    public b f109110g;

    /* renamed from: i  reason: collision with root package name */
    private int f109111i;

    public static final class a {
        static {
            Covode.recordClassIndex(69872);
        }

        /* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager$a$a  reason: collision with other inner class name */
        public static final class C2796a implements ad.b {
            static {
                Covode.recordClassIndex(69873);
            }

            C2796a() {
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                l.d(cls, "");
                return new TabChangeManager();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static TabChangeManager a(e eVar) {
            if (eVar == null) {
                l.b();
            }
            ac a2 = ae.a(eVar, new C2796a()).a(TabChangeManager.class);
            l.b(a2, "");
            return (TabChangeManager) a2;
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(69875);
        }

        void a(String str);
    }

    static {
        Covode.recordClassIndex(69871);
    }

    public final boolean a() {
        if (this.f109104a != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TabChangeManager f109114a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f109115b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f109116c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Bundle f109117d;

        static {
            Covode.recordClassIndex(69876);
        }

        c(TabChangeManager tabChangeManager, Class cls, String str, Bundle bundle) {
            this.f109114a = tabChangeManager;
            this.f109115b = cls;
            this.f109116c = str;
            this.f109117d = bundle;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f109114a.a(this.f109115b, this.f109116c, this.f109117d);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TabChangeManager f109118a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f109119b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f109120c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f109121d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f109122e;

        static {
            Covode.recordClassIndex(69877);
        }

        d(TabChangeManager tabChangeManager, String str, boolean z, int i2, boolean z2) {
            this.f109118a = tabChangeManager;
            this.f109119b = str;
            this.f109120c = z;
            this.f109121d = i2;
            this.f109122e = z2;
        }

        public final void run() {
            this.f109118a.a(this.f109119b, this.f109120c, this.f109121d, this.f109122e);
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        this.f109104a = null;
        this.f109106c.clear();
    }

    public final Fragment b() {
        if (!a()) {
            return null;
        }
        FragmentTabHost fragmentTabHost = this.f109104a;
        if (fragmentTabHost == null) {
            l.b();
        }
        return fragmentTabHost.getCurrentFragment();
    }

    public final Fragment a(String str) {
        i iVar = this.f109109f;
        if (iVar == null) {
            return null;
        }
        return iVar.a(str);
    }

    public final void b(g gVar) {
        if (this.f109106c.contains(gVar)) {
            this.f109106c.remove(gVar);
        }
    }

    public final TabChangeManager a(g gVar) {
        l.d(gVar, "");
        this.f109106c.add(gVar);
        if (gVar instanceof m) {
            ((m) gVar).getLifecycle().a(new TabChangeManager$addListener$1(this, gVar));
        }
        return this;
    }

    public final void a(String str, boolean z) {
        if (str != null) {
            int i2 = this.f109111i + 1;
            this.f109111i = i2;
            a(str, z, i2, false);
        }
    }

    public final void a(Class<?> cls, String str, Bundle bundle) {
        MethodCollector.i(1541);
        if (!a()) {
            b.i.b(new c(this, cls, str, bundle), b.i.f4826c);
            MethodCollector.o(1541);
            return;
        }
        FragmentTabHost fragmentTabHost = this.f109104a;
        if (fragmentTabHost == null) {
            l.b();
        }
        if (str == null) {
            l.b();
        }
        TabHost.TabSpec newTabSpec = fragmentTabHost.newTabSpec(str);
        l.b(newTabSpec, "");
        FragmentTabHost fragmentTabHost2 = this.f109104a;
        if (fragmentTabHost2 == null) {
            l.b();
        }
        Space space = new Space(fragmentTabHost2.getContext());
        space.setMinimumHeight(0);
        space.setMinimumWidth(0);
        newTabSpec.setIndicator(space);
        try {
            FragmentTabHost fragmentTabHost3 = this.f109104a;
            if (fragmentTabHost3 == null) {
                l.b();
            }
            fragmentTabHost3.a(newTabSpec, cls, bundle);
            MethodCollector.o(1541);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
            MethodCollector.o(1541);
        }
    }

    public final void a(String str, boolean z, int i2, boolean z2) {
        String str2;
        if (!TextUtils.equals("HOME", str)) {
            a.b.f109011a.f109002c = false;
            a.b.f109011a.f109006g = false;
        }
        if (!a() && TextUtils.equals("HOME", str) && (str2 = this.f109107d) == null) {
            this.f109105b = str2;
            this.f109107d = str;
        }
        if (!a()) {
            com.ss.android.b.a.a.a.b(new d(this, str, z, i2, z2));
        } else if (this.f109111i <= i2) {
            HomePageUIFrameService e2 = HomePageUIFrameServiceImpl.e();
            FragmentTabHost fragmentTabHost = this.f109104a;
            if (fragmentTabHost == null) {
                l.b();
            }
            String tagForCurrentTabInMainPageFragment = e2.getTagForCurrentTabInMainPageFragment(this, fragmentTabHost.getCurrentTabTag(), str);
            FragmentTabHost fragmentTabHost2 = this.f109104a;
            if (fragmentTabHost2 == null) {
                l.b();
            }
            fragmentTabHost2.setCurrentTabByTag(tagForCurrentTabInMainPageFragment);
            this.f109105b = this.f109107d;
            this.f109107d = str;
            b bVar = this.f109110g;
            if (bVar != null) {
                bVar.a(this.f109107d);
            }
            for (g gVar : this.f109106c) {
                gVar.a(this.f109107d, this.f109105b, z, z2);
            }
            HomePageUIFrameServiceImpl.e().a(str);
        }
    }
}

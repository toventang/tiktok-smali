package com.ss.android.ugc.aweme.homepage.ui;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.be;
import com.ss.android.ugc.aweme.by;
import com.ss.android.ugc.aweme.feed.i.h;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.FlippableViewPagerExt;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.HomeTabViewModel;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.d;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.e;
import h.f.b.l;
import h.u;
import java.lang.ref.WeakReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public d f99490a;

    /* renamed from: b  reason: collision with root package name */
    public b f99491b;

    /* renamed from: c  reason: collision with root package name */
    public FlippableViewPagerExt f99492c;

    /* renamed from: d  reason: collision with root package name */
    public ScrollSwitchStateManager f99493d;

    /* renamed from: e  reason: collision with root package name */
    public Hox f99494e;

    static {
        Covode.recordClassIndex(63458);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.a$a  reason: collision with other inner class name */
    public static final class C2434a implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99495a;

        static {
            Covode.recordClassIndex(63459);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C2434a(a aVar) {
            this.f99495a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f99495a.f99493d;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f99151m.setValue(Integer.valueOf(i2));
            }
            d dVar = this.f99495a.f99490a;
            if (dVar != null) {
                dVar.f99707b.onPageScrollStateChanged(i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            Object obj;
            by a2;
            e eVar;
            ScrollSwitchStateManager scrollSwitchStateManager = this.f99495a.f99493d;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f99150l.setValue(Integer.valueOf(i2));
            }
            Bundle bundle = new Bundle();
            bundle.putString(be.f68530b, be.f68533e);
            Hox hox = this.f99495a.f99494e;
            if (hox != null) {
                hox.a("HOME", i2, bundle);
            }
            d dVar = this.f99495a.f99490a;
            if (dVar != null) {
                dVar.f99707b.onPageSelected(i2);
                a.f a3 = dVar.f99706a.a(i2);
                String str = null;
                if (a3 != null) {
                    obj = a3.f99690e;
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = obj;
                }
                String str2 = str;
                if ((!l.a((Object) str2, (Object) "Following")) && (eVar = (e) HomeTabViewModel.a.a(dVar.f99712g).b(str2)) != null) {
                    eVar.a();
                }
                if (!(str2 == null || (a2 = HomeTabViewModel.a.a(dVar.f99712g).a(str2)) == null)) {
                    a2.i();
                }
            }
            com.ss.android.ugc.d.a.c.a(new h());
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f99495a.f99493d;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.n.setValue(new u<>(Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)));
            }
            d dVar = this.f99495a.f99490a;
            if (dVar != null) {
                dVar.f99707b.onPageScrolled(i2, f2, i3);
            }
        }
    }

    public static final class c implements com.ss.android.ugc.aweme.homepage.ui.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99501a;

        static {
            Covode.recordClassIndex(63461);
        }

        @Override // com.ss.android.ugc.aweme.homepage.ui.a.a
        public final void a(SparseArray<Fragment> sparseArray) {
            l.d(sparseArray, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c(a aVar) {
            this.f99501a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.homepage.ui.a.a
        public final void a(WeakReference<Fragment> weakReference) {
            ScrollSwitchStateManager scrollSwitchStateManager = this.f99501a.f99493d;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.f99149k = weakReference;
            }
        }
    }

    public static final class b<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99498a;

        static {
            Covode.recordClassIndex(63460);
        }

        public b(a aVar) {
            this.f99498a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            FlippableViewPagerExt flippableViewPagerExt = this.f99498a.f99492c;
            if (flippableViewPagerExt != null) {
                if (bool == null) {
                    l.b();
                }
                flippableViewPagerExt.f99523a = bool.booleanValue();
            }
        }
    }
}

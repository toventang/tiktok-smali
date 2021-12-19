package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.infosticker.view.internal.b;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import f.a.l.c;
import f.a.t;
import h.f.b.l;

public final class b implements com.ss.android.ugc.tools.infosticker.view.internal.b {

    /* renamed from: a  reason: collision with root package name */
    public final c<b.a> f149679a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewPagerBottomSheetBehavior<View> f149680b;

    static {
        Covode.recordClassIndex(98558);
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.b
    public final t<b.a> a() {
        t<b.a> c2 = this.f149679a.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.infosticker.view.internal.b
    public final void a(boolean z) {
        int i2;
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.f149680b;
        if (viewPagerBottomSheetBehavior != null) {
            if (z) {
                i2 = 3;
            } else {
                i2 = 5;
            }
            viewPagerBottomSheetBehavior.c(i2);
        }
    }

    public b(View view, ViewPager viewPager, boolean z) {
        l.d(view, "");
        l.d(viewPager, "");
        c<b.a> cVar = new c<>();
        l.b(cVar, "");
        this.f149679a = cVar;
        CoordinatorLayout.e eVar = null;
        if (z) {
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = new ViewPagerBottomSheetBehavior<>(view.getContext());
            this.f149680b = viewPagerBottomSheetBehavior;
            viewPagerBottomSheetBehavior.b(0);
            viewPagerBottomSheetBehavior.f150304f = true;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            CoordinatorLayout.e eVar2 = layoutParams instanceof CoordinatorLayout.e ? layoutParams : eVar;
            if (eVar2 != null) {
                eVar2.a(viewPagerBottomSheetBehavior);
            }
            viewPagerBottomSheetBehavior.a(viewPager);
            viewPagerBottomSheetBehavior.f150311m = new ViewPagerBottomSheetBehavior.a(this) {
                /* class com.ss.android.ugc.tools.infosticker.view.internal.main.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f149681a;

                static {
                    Covode.recordClassIndex(98559);
                }

                @Override // com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.a
                public final void a(View view) {
                    l.d(view, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f149681a = r1;
                }

                @Override // com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior.a
                public final void a(View view, int i2) {
                    l.d(view, "");
                    if (i2 == 4) {
                        this.f149681a.f149679a.onNext(b.a.CLOSE);
                    } else if (i2 == 1) {
                        this.f149681a.f149679a.onNext(b.a.DRAGGING);
                    }
                }
            };
            return;
        }
        this.f149680b = null;
    }
}

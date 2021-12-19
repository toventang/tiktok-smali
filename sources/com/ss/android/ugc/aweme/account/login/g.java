package com.ss.android.ugc.aweme.account.login;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

public final class g {
    static {
        Covode.recordClassIndex(39097);
    }

    static class a extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f63451a;

        /* renamed from: b  reason: collision with root package name */
        private final ViewPagerBottomSheetBehavior<View> f63452b;

        static {
            Covode.recordClassIndex(39098);
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            ViewPager viewPager = this.f63451a;
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.f63452b;
            viewPagerBottomSheetBehavior.getClass();
            viewPager.post(new h(viewPagerBottomSheetBehavior));
        }

        private a(ViewPager viewPager, View view) {
            this.f63451a = viewPager;
            this.f63452b = ViewPagerBottomSheetBehavior.b(view);
        }

        /* synthetic */ a(ViewPager viewPager, View view, byte b2) {
            this(viewPager, view);
        }
    }

    public static void a(ViewPager viewPager) {
        View view = viewPager;
        while (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.e) || !(((CoordinatorLayout.e) layoutParams).f2100a instanceof ViewPagerBottomSheetBehavior)) {
                ViewParent parent = view.getParent();
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return;
                }
            } else {
                viewPager.addOnPageChangeListener(new a(viewPager, view, (byte) 0));
                return;
            }
        }
    }
}

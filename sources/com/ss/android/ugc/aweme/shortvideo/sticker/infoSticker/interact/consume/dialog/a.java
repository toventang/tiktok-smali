package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(85498);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.a$a  reason: collision with other inner class name */
    public static class C3400a extends ViewPager.h {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f130374a;

        /* renamed from: b  reason: collision with root package name */
        private final ViewPagerBottomSheetBehavior<View> f130375b;

        static {
            Covode.recordClassIndex(85499);
        }

        @Override // androidx.viewpager.widget.ViewPager.h, androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            ViewPager viewPager = this.f130374a;
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.f130375b;
            viewPagerBottomSheetBehavior.getClass();
            viewPager.post(new b(viewPagerBottomSheetBehavior));
        }

        private C3400a(ViewPager viewPager, View view) {
            this.f130374a = viewPager;
            this.f130375b = ViewPagerBottomSheetBehavior.b(view);
        }

        public /* synthetic */ C3400a(ViewPager viewPager, View view, byte b2) {
            this(viewPager, view);
        }
    }
}

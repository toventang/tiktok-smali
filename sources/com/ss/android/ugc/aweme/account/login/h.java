package com.ss.android.ugc.aweme.account.login;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ViewPagerBottomSheetBehavior f63461a;

    static {
        Covode.recordClassIndex(39108);
    }

    h(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
        this.f63461a = viewPagerBottomSheetBehavior;
    }

    public final void run() {
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f63461a;
        if (viewPagerBottomSheetBehavior.f63233j != null) {
            viewPagerBottomSheetBehavior.f63234k = new WeakReference<>(viewPagerBottomSheetBehavior.a(viewPagerBottomSheetBehavior.f63233j.get()));
        }
    }
}

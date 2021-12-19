package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ViewPagerBottomSheetBehavior f130376a;

    static {
        Covode.recordClassIndex(85500);
    }

    b(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
        this.f130376a = viewPagerBottomSheetBehavior;
    }

    public final void run() {
        ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f130376a;
        viewPagerBottomSheetBehavior.f130362j = new WeakReference<>(viewPagerBottomSheetBehavior.a(viewPagerBottomSheetBehavior.f130361i.get()));
    }
}

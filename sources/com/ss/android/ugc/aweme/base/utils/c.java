package com.ss.android.ugc.aweme.base.utils;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    private final KeyboardUtils.AndroidBug5497Workaround f68428a;

    static {
        Covode.recordClassIndex(42128);
    }

    c(KeyboardUtils.AndroidBug5497Workaround androidBug5497Workaround) {
        this.f68428a = androidBug5497Workaround;
    }

    public final void onGlobalLayout() {
        KeyboardUtils.AndroidBug5497Workaround androidBug5497Workaround = this.f68428a;
        if (androidBug5497Workaround.f68420a != null && androidBug5497Workaround.f68421b != null) {
            Rect rect = new Rect();
            androidBug5497Workaround.f68420a.getWindowVisibleDisplayFrame(rect);
            double d2 = (double) rect.bottom;
            double height = (double) androidBug5497Workaround.f68420a.getHeight();
            Double.isNaN(height);
            if (d2 < height * 0.75d) {
                androidBug5497Workaround.f68421b.b();
            } else {
                androidBug5497Workaround.f68421b.c();
            }
        }
    }
}

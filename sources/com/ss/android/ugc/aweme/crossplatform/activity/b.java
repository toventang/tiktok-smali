package com.ss.android.ugc.aweme.crossplatform.activity;

import android.graphics.Rect;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f78534a;

    static {
        Covode.recordClassIndex(48771);
    }

    b(a aVar) {
        this.f78534a = aVar;
    }

    public final void onGlobalLayout() {
        a aVar = this.f78534a;
        if (aVar.f78532e) {
            aVar.f78531d = aVar.f78528a.getHeight();
            aVar.f78532e = false;
        }
        Rect rect = new Rect();
        aVar.f78528a.getWindowVisibleDisplayFrame(rect);
        int i2 = rect.bottom - rect.top;
        if (i2 != aVar.f78529b) {
            int height = aVar.f78528a.getRootView().getHeight();
            int i3 = height - i2;
            if (i3 > height / 4) {
                int i4 = Build.VERSION.SDK_INT;
                aVar.f78530c.height = (height - i3) + aVar.f78533f;
            } else {
                aVar.f78530c.height = aVar.f78531d;
            }
            aVar.f78528a.requestLayout();
            aVar.f78529b = i2;
        }
    }
}

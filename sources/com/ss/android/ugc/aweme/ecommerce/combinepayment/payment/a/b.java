package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.a;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f85233a;

    static {
        Covode.recordClassIndex(53342);
    }

    b(a aVar) {
        this.f85233a = aVar;
    }

    public final void onGlobalLayout() {
        a aVar = this.f85233a;
        if (aVar.f85232h) {
            aVar.f85231g = aVar.f85225a.getHeight();
            aVar.f85232h = false;
        }
        Rect rect = new Rect();
        aVar.f85225a.getWindowVisibleDisplayFrame(rect);
        int i2 = rect.bottom - rect.top;
        if (i2 != aVar.f85229e) {
            int height = aVar.f85225a.getRootView().getHeight();
            int i3 = height - i2;
            if (i3 > height / 4) {
                aVar.f85230f.height = (aVar.f85231g - i3) + aVar.f85227c + aVar.f85228d;
            } else {
                aVar.f85230f.height = aVar.f85231g;
                if (aVar.f85227c == 0) {
                    aVar.f85227c = aVar.f85226b.getPaddingBottom();
                }
                if (aVar.f85228d == 0) {
                    aVar.f85228d = aVar.f85226b.getPaddingTop();
                }
            }
            aVar.f85225a.requestLayout();
            aVar.f85229e = i2;
        }
    }
}

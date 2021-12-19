package com.ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c;
import com.ss.android.ugc.aweme.utils.hh;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    protected e f86041a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f86042b;

    static {
        Covode.recordClassIndex(53854);
    }

    public abstract c a(int i2);

    public abstract void a(c cVar, int i2);

    public abstract void b(int i2);

    public abstract c c(int i2);

    f(e eVar) {
        this.f86041a = eVar;
        this.f86042b = eVar.getContext();
    }

    /* access modifiers changed from: protected */
    public final c a(ImageView imageView) {
        d transConfig = this.f86041a.getTransConfig();
        int[] iArr = {0, 0};
        if (!transConfig.p && imageView != null) {
            iArr = new int[2];
            imageView.getLocationInWindow(iArr);
        }
        c cVar = new c(this.f86042b);
        cVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (transConfig.p || imageView == null) {
            cVar.a(iArr[0], iArr[1] - hh.b(), 0, 0);
        } else {
            cVar.a(iArr[0], iArr[1] - hh.b(), imageView.getWidth(), imageView.getHeight());
        }
        cVar.setDuration(transConfig.f85998d);
        cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        cVar.setOnTransferListener(this.f86041a.getTransListener());
        return cVar;
    }

    /* access modifiers changed from: protected */
    public final void a(String str, c cVar, boolean z) {
        d transConfig = this.f86041a.getTransConfig();
        if (transConfig.b().b(str)) {
            d transConfig2 = this.f86041a.getTransConfig();
            Drawable a2 = transConfig2.b().a(str);
            if (a2 == null) {
                cVar.setImageDrawable(transConfig2.a(this.f86042b));
            } else {
                cVar.setImageDrawable(a2);
            }
            if (z) {
                cVar.d();
            } else {
                cVar.e();
            }
        } else {
            cVar.setImageDrawable(transConfig.a(this.f86042b));
            if (z) {
                cVar.d();
            } else {
                cVar.e();
            }
        }
    }
}

package com.ss.android.ugc.aweme.commercialize.views;

import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class m extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    private float f76190a;

    /* renamed from: b  reason: collision with root package name */
    private int f76191b;

    /* renamed from: c  reason: collision with root package name */
    private int f76192c;

    static {
        Covode.recordClassIndex(46985);
    }

    public final void getOutline(View view, Outline outline) {
        if (Build.VERSION.SDK_INT >= 21) {
            outline.setRoundRect(new Rect(0, 0, this.f76191b, this.f76192c), this.f76190a);
        }
    }

    m(float f2, int i2, int i3) {
        this.f76190a = f2;
        this.f76191b = i2;
        this.f76192c = i3;
    }
}

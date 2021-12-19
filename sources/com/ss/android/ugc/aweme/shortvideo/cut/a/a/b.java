package com.ss.android.ugc.aweme.shortvideo.cut.a.a;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

public final class b extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    private int f125427a;

    static {
        Covode.recordClassIndex(82321);
    }

    public b(int i2) {
        this.f125427a = i2;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f125427a);
    }
}

package com.ss.android.ugc.aweme.views;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

public final class t extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    private int f144710a;

    static {
        Covode.recordClassIndex(94661);
    }

    public t(int i2) {
        this.f144710a = i2;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f144710a);
    }
}

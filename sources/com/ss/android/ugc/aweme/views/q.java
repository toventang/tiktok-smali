package com.ss.android.ugc.aweme.views;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

public final class q extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    private float f144705a;

    /* renamed from: b  reason: collision with root package name */
    private int f144706b;

    /* renamed from: c  reason: collision with root package name */
    private int f144707c;

    static {
        Covode.recordClassIndex(94658);
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(new Rect(0, 0, this.f144706b, this.f144707c), this.f144705a);
    }

    public q(float f2, int i2, int i3) {
        this.f144705a = f2;
        this.f144706b = i2;
        this.f144707c = i3;
    }
}

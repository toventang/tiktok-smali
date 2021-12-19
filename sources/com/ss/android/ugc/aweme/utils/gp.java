package com.ss.android.ugc.aweme.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

public final class gp extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    private int f143022a;

    static {
        Covode.recordClassIndex(93603);
    }

    public gp(int i2) {
        this.f143022a = i2;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f143022a);
    }
}

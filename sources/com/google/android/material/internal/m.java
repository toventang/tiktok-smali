package com.google.android.material.internal;

import android.widget.ImageButton;
import com.bytedance.covode.number.Covode;

public class m extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    private int f52568a;

    static {
        Covode.recordClassIndex(32567);
    }

    public final int getUserSetVisibility() {
        return this.f52568a;
    }

    public void setVisibility(int i2) {
        a(i2, true);
    }

    public final void a(int i2, boolean z) {
        super.setVisibility(i2);
        if (z) {
            this.f52568a = i2;
        }
    }
}

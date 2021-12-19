package com.bytedance.android.live.wallet;

import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class y implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f13247a;

    static {
        Covode.recordClassIndex(7351);
    }

    y(a aVar) {
        this.f13247a = aVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f13247a.a(Boolean.valueOf(z));
    }
}

package com.bytedance.android.live.publicscreen.impl.widget;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final PublicScreenWidget f12576a;

    static {
        Covode.recordClassIndex(6918);
    }

    h(PublicScreenWidget publicScreenWidget) {
        this.f12576a = publicScreenWidget;
    }

    public final void run() {
        this.f12576a.m();
    }
}

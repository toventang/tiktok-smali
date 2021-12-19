package com.ss.android.ugc.aweme.editSticker.text.view;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f88651a;

    /* renamed from: b  reason: collision with root package name */
    private final View f88652b;

    static {
        Covode.recordClassIndex(55783);
    }

    d(c cVar, View view) {
        this.f88651a = cVar;
        this.f88652b = view;
    }

    public final void run() {
        c cVar = this.f88651a;
        View view = this.f88652b;
        cVar.smoothScrollTo(((view.getLeft() + view.getRight()) / 2) - (cVar.getWidth() / 2), 0);
    }
}

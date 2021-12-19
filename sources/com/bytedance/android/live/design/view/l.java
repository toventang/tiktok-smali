package com.bytedance.android.live.design.view;

import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.live.design.view.e;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f9487a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f9488b;

    /* renamed from: c  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f9489c;

    /* renamed from: d  reason: collision with root package name */
    private final e.b f9490d;

    /* renamed from: e  reason: collision with root package name */
    private final d f9491e;

    static {
        Covode.recordClassIndex(4823);
    }

    l(h hVar, Runnable runnable, View.OnAttachStateChangeListener onAttachStateChangeListener, e.b bVar, d dVar) {
        this.f9487a = hVar;
        this.f9488b = runnable;
        this.f9489c = onAttachStateChangeListener;
        this.f9490d = bVar;
        this.f9491e = dVar;
    }

    public final void onDismiss() {
        j.a(this.f9487a, this.f9488b, this.f9489c, this.f9490d, this.f9491e);
    }
}

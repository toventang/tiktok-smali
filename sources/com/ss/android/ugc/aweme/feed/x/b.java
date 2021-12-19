package com.ss.android.ugc.aweme.feed.x;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityManager f95306a;

    /* renamed from: b  reason: collision with root package name */
    private final AccessibilityEvent f95307b;

    static {
        Covode.recordClassIndex(60368);
    }

    b(AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
        this.f95306a = accessibilityManager;
        this.f95307b = accessibilityEvent;
    }

    public final void run() {
        this.f95306a.sendAccessibilityEvent(this.f95307b);
    }
}

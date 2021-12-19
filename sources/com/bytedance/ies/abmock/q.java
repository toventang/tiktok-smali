package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final SettingsManager f31871a;

    static {
        Covode.recordClassIndex(18637);
    }

    q(SettingsManager settingsManager) {
        this.f31871a = settingsManager;
    }

    public final void run() {
        Object[] b2 = this.f31871a.b();
        if (b2 != null) {
            for (Object obj : b2) {
                ((i) obj).a();
            }
        }
    }
}

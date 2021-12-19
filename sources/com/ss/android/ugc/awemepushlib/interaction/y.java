package com.ss.android.ugc.awemepushlib.interaction;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f145475a;

    static {
        Covode.recordClassIndex(95128);
    }

    y(Runnable runnable) {
        this.f145475a = runnable;
    }

    public final void run() {
        Runnable runnable = this.f145475a;
        if (x.f145473c) {
            runnable.run();
        } else {
            x.f145472b.add(runnable);
        }
    }
}

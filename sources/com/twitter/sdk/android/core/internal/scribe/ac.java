package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.internal.g;

public final class ac implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f156052a;

    /* renamed from: b  reason: collision with root package name */
    private final p f156053b;

    static {
        Covode.recordClassIndex(103673);
    }

    public final void run() {
        try {
            g.a(this.f156052a, "Performing time based file roll over.");
            if (!this.f156053b.c()) {
                this.f156053b.b();
            }
        } catch (Exception unused) {
            g.b(this.f156052a, "Failed to roll over file");
        }
    }

    public ac(Context context, p pVar) {
        this.f156052a = context;
        this.f156053b = pVar;
    }
}

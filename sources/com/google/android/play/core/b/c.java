package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.m;

public abstract class c implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    public final m<?> f53146g;

    static {
        Covode.recordClassIndex(32835);
    }

    c() {
    }

    public c(m<?> mVar) {
        this.f53146g = mVar;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        try {
            a();
        } catch (Exception e2) {
            m<?> mVar = this.f53146g;
            if (mVar != null) {
                mVar.b(e2);
            }
        }
    }
}

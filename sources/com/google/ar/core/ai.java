package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* access modifiers changed from: package-private */
public final class ai {

    /* renamed from: a  reason: collision with root package name */
    boolean f53408a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InstallActivity f53409b;

    static {
        Covode.recordClassIndex(33059);
    }

    ai(InstallActivity installActivity) {
        this.f53409b = installActivity;
    }

    public final void a(Exception exc) {
        MethodCollector.i(11489);
        synchronized (this.f53409b) {
            try {
                if (!this.f53408a) {
                    this.f53408a = true;
                    InstallActivity.access$402(this.f53409b, aj.CANCELLED);
                    this.f53409b.finishWithFailure(exc);
                    MethodCollector.o(11489);
                }
            } finally {
                MethodCollector.o(11489);
            }
        }
    }

    public final void a(aj ajVar) {
        MethodCollector.i(11332);
        synchronized (this.f53409b) {
            try {
                if (!this.f53408a) {
                    InstallActivity.access$402(this.f53409b, ajVar);
                    int ordinal = ajVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            this.f53409b.finishWithFailure(new UnavailableUserDeclinedInstallationException());
                        } else if (ordinal == 2) {
                            if (!this.f53409b.waitingForCompletion && z.f53484a.f53486c) {
                                this.f53409b.closeInstaller();
                            }
                            this.f53409b.finishWithFailure(null);
                        }
                        this.f53408a = true;
                        MethodCollector.o(11332);
                        return;
                    }
                    MethodCollector.o(11332);
                }
            } finally {
                MethodCollector.o(11332);
            }
        }
    }
}

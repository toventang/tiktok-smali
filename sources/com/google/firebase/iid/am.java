package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final /* synthetic */ class am implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final i f54414a;

    static {
        Covode.recordClassIndex(33782);
    }

    am(i iVar) {
        this.f54414a = iVar;
    }

    public final void run() {
        this.f54414a.b((Exception) new IOException("TIMEOUT"));
    }
}

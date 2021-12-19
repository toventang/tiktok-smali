package com.google.firebase.iid;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.c;
import com.google.android.gms.c.h;
import java.util.concurrent.ScheduledFuture;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ax implements c {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledFuture f54449a;

    static {
        Covode.recordClassIndex(33797);
    }

    ax(ScheduledFuture scheduledFuture) {
        this.f54449a = scheduledFuture;
    }

    @Override // com.google.android.gms.c.c
    public final void a(h hVar) {
        this.f54449a.cancel(false);
    }
}

package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
public final class d extends c<v> {

    /* renamed from: f  reason: collision with root package name */
    private final q f156060f;

    static {
        Covode.recordClassIndex(103677);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.o
    public final q d() {
        return this.f156060f;
    }

    d(Context context, ScheduledExecutorService scheduledExecutorService, x xVar, u uVar, ScribeFilesSender scribeFilesSender) {
        super(context, scheduledExecutorService, xVar);
        this.f156060f = scribeFilesSender;
        a(uVar.f156128h);
    }
}
